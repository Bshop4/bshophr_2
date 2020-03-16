package hr.web.controller.zjl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigFileThirdKind;
import hr.pojo.ConfigMajor;
import hr.pojo.EngageMajorRelease;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;
import hr.service.EngageMajorReleaseService;
import hr.util.PatternUtil;
import net.sf.json.JSONObject;

@Repository
@RequestMapping("/zjlMajorRelease")
public class MajorReleaseController {
	
	@Autowired
	private ConfigMajorService cms = null;//职位类型和职位
	
	@Autowired
	private ConfigFileThirdKindService cftks = null;//三级机构表
	
	@Autowired
	private EngageMajorReleaseService emrs = null;//职位发布表
	
	@RequestMapping("/query.do")
	public String query(Model model){
		
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
		
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		
		model.addAttribute("now", t);
		model.addAttribute("firstList", firstList);
		model.addAttribute("majorKindNameList", majorKindNameList);
		
		return "forward:/major_release.jsp";
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
	
	
	
	@RequestMapping("/saveMajorRelease.do")
	@ResponseBody
	public List<String> saveMajorRelease(String firstKindName,
										 String secondKindName,
										 String thirdKindName,
										 String engageType,
										 String majorKindName,
										 String majorName,
										 short humanAmount,
										 Timestamp registTime,
										 String register,
										 Timestamp deadline,
										 String majorDescribe,
										 String engageRequired){
		
		ConfigFileThirdKind c = cftks.findConfigFileThirdKindByFirstSecondThirdKindName(firstKindName, secondKindName, thirdKindName);
		String firstKindId = c.getFirstKindId();
		System.out.println("f" + firstKindId);
		String secondKindId = c.getSecondKindId();
		String thirdKindId = c.getThirdKindId();
		
		ConfigMajor cm = cms.findConfigMajorByMajorKindNameAndMajorName(majorKindName, majorName);
		String majorKindId = cm.getMajorKindId();
		String majorId = cm.getMajorId();
		
		EngageMajorRelease e = new EngageMajorRelease();
		e.setFirstKindId(firstKindId);
		e.setFirstKindName(firstKindName);
		e.setSecondKindId(secondKindId);
		e.setSecondKindName(secondKindName);
		e.setThirdKindId(thirdKindId);
		e.setThirdKindName(thirdKindName);
		e.setMajorKindId(majorKindId);
		e.setMajorKindName(majorKindName);
		e.setMajorId(majorId);
		e.setMajorName(majorName);
		e.setHumanAmount(humanAmount);
		e.setEngageType(engageType);
		e.setDeadline(deadline);
		e.setRegister(register);
		e.setChanger(register);
		e.setRegistTime(registTime);
		e.setChangeTime(registTime);
		e.setMajorDescribe(majorDescribe);
		e.setEngageRequired(engageRequired);
		
		boolean f = emrs.saveEngageMajorRelease(e);
		List<String> list = new ArrayList<String>();
		if(f){
			list.add("发布职位成功！");
		}
		
		return list;
	}
	
	
	
	
	@RequestMapping("/queryAll.do")
	public String queryAll(Model model,HttpServletRequest request){
		
//		List<EngageMajorRelease> list = emrs.findEngageMajorReleaseAll();
//		if(list.size() == 0){
//			
//			model.addAttribute("list", "0");
//		}else{
//			model.addAttribute("list", list);
//		}
		
		int maxPage =0;
		int sumNumber =emrs.findCnt();//总个数
		int pageSize =2;
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
		//分页查询
		List<EngageMajorRelease> list = emrs.findSplit(map);
		
		if(list.size() == 0){
			model.addAttribute("list", "0");
		}else{
			model.addAttribute("list", list);
			model.addAttribute("maxPage", maxPage);
			model.addAttribute("sumNumber", sumNumber);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("pageNo", pageNo);
		}
		
		return "forward:/major_list.jsp";
	}
	
	@RequestMapping("/{id}/delete.do")
	public String delete(@PathVariable("id") int id){
		
		emrs.removeEngageMajorReleaseById(id);
		
		return "redirect:/zjlMajorRelease/queryAll.do";
		
	}
	
	
	@RequestMapping("/{id}/queryOne.do")
	public String queryOne(@PathVariable("id") int id, Model model){
		EngageMajorRelease emr = emrs.findEngageMajorReleaseById(id);
		Timestamp tt = new Timestamp(System.currentTimeMillis());
		emr.setChangeTime(tt);
		
		model.addAttribute("obj", emr);
		return "forward:/major_release_update.jsp";
	}
	
	
	@RequestMapping("/{id}/update.do")
	@ResponseBody
	public List<String> update(String engageType,
			short humanAmount,
			Timestamp registTime,
			String majorDescribe,
			String engageRequired,
			String changer,
			Timestamp changeTime,
			@PathVariable short id){
	
		EngageMajorRelease emr = new EngageMajorRelease();
		emr.setMreId(id);
		emr.setEngageType(engageType);
		emr.setHumanAmount(humanAmount);
		emr.setRegistTime(registTime);
		emr.setMajorDescribe(majorDescribe);
		emr.setEngageRequired(engageRequired);
		emr.setChanger(changer);
		emr.setChangeTime(changeTime);
		
		boolean f = emrs.updateEngageMajorRelease(emr);		
		
		List<String> list = new ArrayList<String>();
		if(f){
			list.add("恭喜修改成功！");
		}
		return list;
	}
	
	
	@RequestMapping("/queryAllSub.do")
	public String queryAllSub(Model model,HttpServletRequest request){
		
//		List<EngageMajorRelease> list = emrs.findEngageMajorReleaseAll();
//		if(list.size() == 0){
//			
//			model.addAttribute("list", "0");
//		}else{
//			model.addAttribute("list", list);
//		}
		int maxPage =0;
		int sumNumber =emrs.findCnt();//总个数
		int pageSize =2;
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
		//分页查询
		List<EngageMajorRelease> list = emrs.findSplit(map);
		
		if(list.size() == 0){
			model.addAttribute("list", "0");
		}else{
			model.addAttribute("list", list);
			model.addAttribute("maxPage", maxPage);
			model.addAttribute("sumNumber", sumNumber);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("pageNo", pageNo);
		}
		
		return "forward:/major_release_query.jsp";
	}
	
	
}
