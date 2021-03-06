package hr.web.controller.zjl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigFileThirdKind;
import hr.pojo.ConfigMajor;
import hr.pojo.HumanFile;
import hr.pojo.MajorChange;
import hr.pojo.SalaryStandard;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;
import hr.service.HumanFileService;
import hr.service.MajorChangeService;
import hr.service.SalaryStandardService;

@Controller
@RequestMapping("/zjlTransfer")
public class TransferController {

	@Autowired
	private HumanFileService hfs = null;
	
	@Autowired
	private MajorChangeService mcs = null;
	
	@Autowired
	private ConfigFileThirdKindService cftks = null;//三级机构表
	
	@Autowired
	private ConfigMajorService cms = null;//职位类型和职位
	
	@Autowired
	private SalaryStandardService sss = null;//薪酬标准
	
	
	@RequestMapping("/queryToList.do")
	public String queryToList(Model model,HttpServletRequest request){
		int maxPage =0;
		int sumNumber = hfs.findtCnt(1);//总个数
		int pageSize =1;
		int pageNo =1;
		//最大页数
		maxPage=sumNumber%pageSize!=0?sumNumber/pageSize+1:sumNumber/pageSize;
		
		String page=request.getParameter("page");
		if(page!=null && !"".equals(page)){
			try{
				pageNo=Integer.parseInt(page);
			}catch(NumberFormatException e){
				pageNo=1;
			}
			if(pageNo>maxPage){
				pageNo=maxPage;
			}else if(pageNo<1){
				pageNo=1;
			}
		}
		
		int currentPage=(pageNo-1)*pageSize;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pageSize", pageSize);
		map.put("currentPage", currentPage);
		map.put("cs", 1);
		//分页查询
		List<HumanFile> list = hfs.findSplitByCS(map);
		
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
		
		return "forward:/transfer_regist_list.jsp";
	}
	
	
	@RequestMapping("/{hufId}/queryOneHF.do")
	public String queryOneHF(Model model,@PathVariable("hufId") int hufId){
		HumanFile hf = hfs.findHumanFileById(hufId);
		model.addAttribute("obj", hf);

		List<ConfigFileThirdKind> list = cftks.findConfigFileThirdKindAll(new HashMap<String, Object>());
		Set<String> set = new HashSet<String>();
		for (ConfigFileThirdKind c : list) {
			set.add(c.getFirstKindName());
		}
		List<String> firstList = new ArrayList<String>(set);
		
		
		List<ConfigMajor> listCm = cms.findConfigMajorAll();
		Set<String> set1 = new HashSet<String>();
		for (ConfigMajor c : listCm) {
			set1.add(c.getMajorKindName());
		}
		List<String> majorKindNameList = new ArrayList<String>(set1);
		
		model.addAttribute("firstList", firstList);
		model.addAttribute("majorKindNameList", majorKindNameList);
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		model.addAttribute("registTime", t);
		
		model.addAttribute("register", "admin");
		
		List<SalaryStandard> listss = sss.findSalaryStandardAllByCS("1");
		model.addAttribute("listss", listss);
		
		
		return "forward:/transfer_regist.jsp";
	}
	
	@RequestMapping("/querySecondKindName.do")
	@ResponseBody
	public List<String> querySecondKindName(String firstKindName){
		
		List<ConfigFileThirdKind> list = cftks.findConfigFileThirdKindAllByFirstKindName(firstKindName);
		
		Set<String> set = new HashSet<String>();
		for (ConfigFileThirdKind c : list) {
			set.add(c.getSecondKindName());
		}
		List<String> secondList = new ArrayList<String>(set);
		return secondList;
	}
	
	@RequestMapping("/queryThirdKindName.do")
	@ResponseBody
	public List<String> queryThirdKindName(String secondKindName){
		
		List<ConfigFileThirdKind> list = cftks.findConfigFileThirdKindAllBySecondKindName(secondKindName);
		
		Set<String> set = new HashSet<String>();
		for (ConfigFileThirdKind c : list) {
			set.add(c.getThirdKindName());
		}
		List<String> thirdList = new ArrayList<String>(set);
		return thirdList;
	}
	
	@RequestMapping("/queryMajorKindName.do")
	@ResponseBody
	public List<String> queryMajorKindName(String majorName){
		
		List<ConfigMajor> list = cms.findConfigMajorAllByMajorKindName(majorName);
		Set<String> set = new HashSet<String>();
		for (ConfigMajor c : list) {
			set.add(c.getMajorName());
		}
		List<String> majorNameList = new ArrayList<String>(set);
		
		return majorNameList;
	}
	
	
	@RequestMapping("/saveMajorChange.do")
	public String saveMajorChange(Model model,MajorChange mc){
		
		ConfigFileThirdKind c = cftks.findConfigFileThirdKindByFirstSecondThirdKindName(mc.getFirstKindName(), mc.getSecondKindName(), mc.getThirdKindName());
		String firstKindId = c.getFirstKindId();
		String secondKindId = c.getSecondKindId();
		String thirdKindId = c.getThirdKindId();
		
		ConfigMajor cm = cms.findConfigMajorByMajorKindNameAndMajorName(mc.getMajorKindName(), mc.getMajorName());
		String majorKindId = cm.getMajorKindId();
		String majorId = cm.getMajorId();
		
		mc.setNewFirstKindId(firstKindId);
		mc.setNewSecondKindId(secondKindId);
		mc.setNewThirdKindId(thirdKindId);
		mc.setNewMajorKindId(majorKindId);
		mc.setNewMajorId(majorId);
		  
		short s = 0;
		mc.setCheckStatus(s);
		
		SalaryStandard ss = sss.findBySalaryStandardName(mc.getNewSalaryStandardName());
		
		mc.setNewSalaryStandardId(ss.getStandardId());
		
		String humanName = mc.getHumanName();
		HumanFile hf = hfs.findByHumanName(humanName);
		System.out.println(hf);
		short s1 = 3;
		hf.setCheckStatus(s1);//待调动
		boolean ff = hfs.updateHumanFileTwo(hf);
		
		boolean f = mcs.saveMajorChange(mc);
		if(f==true && ff==true){
			return "forward:/transter_regist_success.jsp";
		}
		
		return null;
	}
	
	
	
	@RequestMapping("/queryCheckList.do")
	public String queryCheckList(Model model,HttpServletRequest request){
		
		short cs = 0;
		int maxPage =0;
		int sumNumber = mcs.findtCnt(cs);//总个数
		int pageSize =1;
		int pageNo =1;
		//最大页数
		maxPage=sumNumber%pageSize!=0?sumNumber/pageSize+1:sumNumber/pageSize;
		
		String page=request.getParameter("page");
		if(page!=null && !"".equals(page)){
			try{
				pageNo=Integer.parseInt(page);
			}catch(NumberFormatException e){
				pageNo=1;
			}
			if(pageNo>maxPage){
				pageNo=maxPage;
			}else if(pageNo<1){
				pageNo=1;
			}
		}
		
		int currentPage=(pageNo-1)*pageSize;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pageSize", pageSize);
		map.put("currentPage", currentPage);
		map.put("cs", 0);
		//分页查询
		List<MajorChange> list = mcs.findSplit(map);
		
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
		
		return "forward:/transfer_check_list.jsp";
	}
	
	
	@RequestMapping("/{mchId}/queryOneMC.do")
	public String queryOneMC(Model model,@PathVariable("mchId") int mchId){
		
		MajorChange mc = mcs.findMajorChangeById(mchId);
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		
		model.addAttribute("obj", mc);
		model.addAttribute("checkTime", t);
		model.addAttribute("checker", "adm");
		
		
		return "forward:/transfer_check.jsp";
	}
	
	
	@RequestMapping("/updateMajorChange.do")
	public String updateMajorChange(Model model,@Param("isPass") String isPass,MajorChange mc){
		
		if("不通过".equals(isPass)){
			
			String humanId = mc.getHumanId();
			HumanFile hf = hfs.findByHumanId(humanId);
			short s = 1;
			hf.setCheckStatus(s);//正常状态
			boolean f = hfs.updateHumanFile(hf);
			
			short s1 = 1;
			mc.setCheckStatus(s1);//1审核不通过
			boolean f1 = mcs.updateMajorChange(mc);
			if(f==true && f1 == true){
				model.addAttribute("msg", "审核不通过！");
			}
		}
		
		if("通过".equals(isPass)){
			String humanId = mc.getHumanId();
			HumanFile hf = hfs.findByHumanId(humanId);
			short s = 1;
			hf.setCheckStatus(s);//正常状态
			hf.setFirstKindId(mc.getNewFirstKindId());
			hf.setFirstKindName(mc.getNewFirstKindName());
			hf.setSecondKindId(mc.getNewSecondKindId());
			hf.setSecondKindName(mc.getNewSecondKindName());
			hf.setThirdKindId(mc.getNewThirdKindId());
			hf.setThirdKindName(mc.getNewThirdKindName());
			hf.setHumanMajorKindId(mc.getNewMajorKindId());
			hf.setHumanMajorKindName(mc.getNewMajorKindName());
			hf.setHumanMajorId(mc.getNewMajorId());
			hf.setHunmaMajorName(mc.getNewMajorName());
			hf.setSalaryStandardName(mc.getNewSalaryStandardName());
			hf.setSalaryStandardId(mc.getNewSalaryStandardId());
			boolean f = hfs.updateHumanFileTwo(hf);
			
			short s1 = 2;//
			mc.setCheckStatus(s1);//2审核通过
			boolean f1 = mcs.updateMajorChange(mc);
			if(f==true && f1 == true){
				model.addAttribute("msg", "审核通过！");
			}
		}
		return "forward:/transter_check_success.jsp";
	}
	
	
	@RequestMapping("/queryList.do")
	public String queryList(Model model,HttpServletRequest request){
		
		int sumNumber = mcs.findCntTwo();//总个数
		int pageSize =1;
		int pageNo =1;
		//最大页数
		int maxPage=sumNumber%pageSize!=0?sumNumber/pageSize+1:sumNumber/pageSize;
		
		String page=request.getParameter("page");
		if(page!=null && !"".equals(page)){
			try{
				pageNo=Integer.parseInt(page);
			}catch(NumberFormatException e){
				pageNo=1;
			}
			if(pageNo>maxPage){
				pageNo=maxPage;
			}else if(pageNo<1){
				pageNo=1;
			}
		}
		
		int currentPage=(pageNo-1)*pageSize;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pageSize", pageSize);
		map.put("currentPage", currentPage);
		//分页查询
		List<MajorChange> list = mcs.findSplitTwo(map);
		
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
		return "forward:/transfer_query_list.jsp";
	}
	
	
	@RequestMapping("/{mchId}/queryById.do")
	public String queryById(@PathVariable("mchId") short mchId,Model model){
		
		MajorChange mc = mcs.findMajorChangeById(mchId);
		System.out.println(mc);
		model.addAttribute("obj", mc);
		return "forward:/transfer_query.jsp";
	}
	
}
