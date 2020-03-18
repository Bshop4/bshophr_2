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

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigPublicChar;
import hr.pojo.EngageInterview;
import hr.pojo.EngageMajorRelease;
import hr.pojo.EngageResume;
import hr.service.ConfigMajorService;
import hr.service.ConfigPublicCharService;
import hr.service.EngageInterviewService;
import hr.service.EngageMajorReleaseService;
import hr.service.EngageResumeService;


@Controller
@RequestMapping("/zjlEngageResume")
public class EngageResumeController {
	
	
	@Autowired
	private EngageMajorReleaseService emrs = null;//找职位类型和职位 招聘类型
	
	@Autowired
	private ConfigPublicCharService cpcs = null;//公共字段
	
	@Autowired
	private EngageResumeService ers = null; //面试登记表
	
	@Autowired
	private EngageInterviewService eis = null; //面试记录表
	
	
	@RequestMapping("/querySomething.do")
	public String querySomething(Model model){
		
		//职位分类
		List<EngageMajorRelease> List1 = emrs.findEngageMajorReleaseAll();
		Set<String> set1 = new HashSet<String>();
		for (EngageMajorRelease e : List1) {
			set1.add(e.getMajorKindName());
		}
		List<String> emrList = new ArrayList<String>(set1);
		model.addAttribute("emrList", emrList);
		
		//国籍
		List<ConfigPublicChar> list2 = cpcs.findConfigPublicCharAllByCondition("国籍");
		Set<String> set2 = new HashSet<String>();
		for (ConfigPublicChar c : list2) {
			set2.add(c.getAttributeName());
		}
		List<String> guoList = new ArrayList<String>(set2);
		model.addAttribute("guoList", guoList);
		
		//民族
		List<ConfigPublicChar> list3 = cpcs.findConfigPublicCharAllByCondition("民族");
		Set<String> set3 = new HashSet<String>();
		for (ConfigPublicChar c : list3) {
			set3.add(c.getAttributeName());
		}
		List<String> minList = new ArrayList<String>(set3);
		model.addAttribute("minList", minList);
		
		//宗教信仰
		List<ConfigPublicChar> list4 = cpcs.findConfigPublicCharAllByCondition("宗教信仰");
		Set<String> set4 = new HashSet<String>();
		for (ConfigPublicChar c : list4) {
			set4.add(c.getAttributeName());
		}
		List<String> zongList = new ArrayList<String>(set4);
		model.addAttribute("zongList", zongList);
		
		//政治面貌
		List<ConfigPublicChar> list5 = cpcs.findConfigPublicCharAllByCondition("政治面貌");
		Set<String> set5 = new HashSet<String>();
		for (ConfigPublicChar c : list5) {
			set5.add(c.getAttributeName());
		}
		List<String> zhengList = new ArrayList<String>(set5);
		model.addAttribute("zhengList", zhengList);
		
		//学历
		List<ConfigPublicChar> list6 = cpcs.findConfigPublicCharAllByCondition("学历");
		Set<String> set6 = new HashSet<String>();
		for (ConfigPublicChar c : list6) {
			set6.add(c.getAttributeName());
		}
		List<String> xueList = new ArrayList<String>(set6);
		model.addAttribute("xueList", xueList);
		
		//教育年限
		List<ConfigPublicChar> list7 = cpcs.findConfigPublicCharAllByCondition("教育年限");
		Set<String> set7 = new HashSet<String>();
		for (ConfigPublicChar c : list7) {
			set7.add(c.getAttributeName());
		}
		List<String> jiaoList = new ArrayList<String>(set7);
		model.addAttribute("jiaoList", jiaoList);
		
		//专业
		List<ConfigPublicChar> list8 = cpcs.findConfigPublicCharAllByCondition("专业");
		Set<String> set8 = new HashSet<String>();
		for (ConfigPublicChar c : list8) {
			set8.add(c.getAttributeName());
		}
		List<String> zhuanList = new ArrayList<String>(set8);
		model.addAttribute("zhuanList", zhuanList);
		
		//特长
		List<ConfigPublicChar> list9 = cpcs.findConfigPublicCharAllByCondition("特长");
		Set<String> set9 = new HashSet<String>();
		for (ConfigPublicChar c : list9) {
			set9.add(c.getAttributeName());
		}
		List<String> teList = new ArrayList<String>(set9);
		model.addAttribute("teList", teList);
		
		//爱好
		List<ConfigPublicChar> list10 = cpcs.findConfigPublicCharAllByCondition("特长");
		Set<String> set10 = new HashSet<String>();
		for (ConfigPublicChar c : list10) {
			set10.add(c.getAttributeName());
		}
		List<String> aiList = new ArrayList<String>(set10);
		model.addAttribute("aiList", aiList);
		
		//当前时间
		Timestamp t = new Timestamp(System.currentTimeMillis());
		model.addAttribute("t", t);
		
		return "forward:/engage_resume.jsp";
	}
	
	@RequestMapping("/queryHumanMajorName.do")
	@ResponseBody
	public List<String> queryHumanMajorName(String humanMajorKindName){
		
		List<EngageMajorRelease> list = emrs.findEngageMajorReleaseAllByMajorKindName(humanMajorKindName);
		Set<String> set = new HashSet<String>();
		for (EngageMajorRelease e : list) {
			set.add(e.getMajorName());
		}
		List<String> mnList = new ArrayList<String>(set);
		return mnList;
	}
	
	
	@RequestMapping("/queryEngageType.do")
	@ResponseBody
	public List<String> queryEngageType(@Param("majorKindName") String humanMajorKindName,@Param("majorName") String humanMajorName){
		
		List<EngageMajorRelease> list = emrs.findEngageMajorReleaseAllByMajorKindNameAndMajorName(humanMajorKindName, humanMajorName);
		Set<String> set = new HashSet<String>();
		for (EngageMajorRelease e : list) {
			set.add(e.getEngageType());
		}
		List<String> etList = new ArrayList<String>(set);
		return etList;
	}
	
	
	@RequestMapping("/saveEngageResume.do")
	@ResponseBody
	public List<String> saveEngageResume(EngageResume er){

		String engageType = er.getEngageType();
		String majorKindName = er.getHumanMajorKindName();
		String majorName = er.getHumanMajorName();
		
		EngageMajorRelease emr = emrs.findEngageMajorReleaseAllByMajorKindNameAndMajorNameAndEngageType(majorKindName, majorName, engageType);
		
		er.setHumanMajorKindId(emr.getMajorKindId());
		er.setHumanMajorId(emr.getMajorId());
		er.setCheckStatus(0);
		er.setInterviewStatus(0);
		er.setTestAmount(0);
		
		boolean f = ers.saveEngageResume(er);
		List<String> list = new ArrayList<String>();
		if(f){
			list.add("简历提交成功！");
		}
		
		return list;
	}
	
	
	@RequestMapping("/queryMajorKindNameToChoose.do")
	public String queryMajorKindNameToChoose(Model model){
		
		List<EngageMajorRelease> emr = emrs.findEngageMajorReleaseAll();
		Set<String> set = new HashSet<String>();
		for (EngageMajorRelease e : emr) {
			set.add(e.getMajorKindName());
		}
		List<String> list = new ArrayList<String>(set);
		model.addAttribute("list", list);
		
		return "forward:/engage_resume_choose.jsp";
	}
	
	
	
	@RequestMapping("/{hiddenMajorKindName}/{humanMajorName}/{keyWord}/{startdate}/{enddate}/queryChoose.do")
	public String queryChoose(@PathVariable("hiddenMajorKindName") String majorKindName,
			@PathVariable("humanMajorName") String majorName,
			@PathVariable("keyWord") String keyWord,
			@PathVariable("startdate") Timestamp sd,
			@PathVariable("enddate") Timestamp ed,
			Model model,
			HttpServletRequest request){
		
		Timestamp start = null;
		Timestamp end = null;
		
		String strsd = sd+"";
		String stred = ed+"";
		
		if(strsd.compareTo(stred) > 0){
			start = ed;
			end = sd;
		}else{
			start = sd;
			end = ed;
		}
		
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("majorKindName", majorKindName);
		map.put("majorName", majorName);
		map.put("keyWord", keyWord);
		map.put("start", start);
		map.put("end", end);
		
		List<EngageResume> list = ers.findAllByCondition(map);
		
		for (EngageResume e : list) {
			System.out.println(e);
		}
		
		return null;*/
		
		
		List<EngageResume> list = ers.findAllByCondition(majorKindName, majorName, keyWord);
		
		List<EngageResume> erList = new ArrayList<EngageResume>();
		if(list.size()>0){
			for (EngageResume e : list) {
				String time = e.getRegistTime()+"";
				String strStart = start+"";
				String strEnd = end + "";
				
				if(strStart.compareTo(time) < 0 && strEnd.compareTo(time) > 0){
					erList.add(e);
				}
				model.addAttribute("erList", erList);
			}
		}else {
			model.addAttribute("erList", "0");
		}
		
	/*	int maxPage =0;
		int sumNumber =erList.size();//总个数
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
		
		List<EngageResume> list1 = new ArrayList<EngageResume>();
		if(erList.size() >0){
			for (int i = currentPage; i < currentPage+pageSize; i++) {
				list1.add(erList.get(i));
			}
			model.addAttribute("list1", list1);
			model.addAttribute("maxPage", maxPage);
			model.addAttribute("sumNumber", sumNumber);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("pageNo", pageNo);
			
			
			model.addAttribute("hiddenMajorKindName", majorKindName);
			model.addAttribute("humanMajorName", majorName);
			model.addAttribute("keyWord", keyWord);
			model.addAttribute("startdate", sd);
			model.addAttribute("enddate", ed);
				
		}else {
			model.addAttribute("list1", "0");
		}*/
		
		return "forward:/engage_resume_list.jsp";
	}
	
	
	@RequestMapping("/{id}/check.do")
	public String check(Model model,@PathVariable("id") int id){
		
		EngageResume er = ers.findEngageResumeById(id);
		
		model.addAttribute("obj", er);
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		model.addAttribute("t", t);
		
		model.addAttribute("user", "admin");
		
		return "forward:/engage_resume_list_detail.jsp";
	}
	
	
	@RequestMapping("/updateResume.do")
	@ResponseBody
	public List<String> updateResume(EngageResume er){
		
		er.setCheckStatus(1);
		er.setInterviewStatus(1);
		boolean f = ers.updateEngageResume(er);
		List<String> list = new ArrayList<String>();
		if(f){
			list.add("推荐成功！");
		}
		return list;
	}
	
	
	
	@RequestMapping("/queryValidChoose.do")
	public String queryValidChoose(Model model){
		
		List<EngageMajorRelease> emr = emrs.findEngageMajorReleaseAll();
		Set<String> set = new HashSet<String>();
		for (EngageMajorRelease e : emr) {
			set.add(e.getMajorKindName());
		}
		List<String> list = new ArrayList<String>(set);
		model.addAttribute("list", list);
		
		return "forward:/engage_resume_valid_choose.jsp";
	}
	
	
	@RequestMapping("/{hiddenMajorKindName}/{humanMajorName}/{keyWord}/{startdate}/{enddate}/queryChooseValid.do")
	public String queryChooseValid(@PathVariable("hiddenMajorKindName") String majorKindName,
			@PathVariable("humanMajorName") String majorName,
			@PathVariable("keyWord") String keyWord,
			@PathVariable("startdate") Timestamp sd,
			@PathVariable("enddate") Timestamp ed,
			Model model,
			HttpServletRequest request){
		
		Timestamp start = null;
		Timestamp end = null;
		
		String strsd = sd+"";
		String stred = ed+"";
		
		if(strsd.compareTo(stred) > 0){
			start = ed;
			end = sd;
		}else{
			start = sd;
			end = ed;
		}	
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("majorKindName", majorKindName);
		map.put("majorName", majorName);
		map.put("keyWord", keyWord);
		map.put("checkStatus", 1);
		
		
		List<EngageResume> list = ers.findAllByConditionTow(map);
		
		List<EngageResume> erList = new ArrayList<EngageResume>();
		if(list.size()>0){
			for (EngageResume e : list) {
				String time = e.getRegistTime()+"";
				String strStart = start+"";
				String strEnd = end + "";
				
				if(strStart.compareTo(time) < 0 && strEnd.compareTo(time) > 0){
					erList.add(e);
				}
				model.addAttribute("erList", erList);
			}
		}else {
			model.addAttribute("erList", "0");
		}
		
		return "forward:/engage_resume_Valid_list.jsp";
	}
	
	
	@RequestMapping("/queryInterviewChoose.do")
	public String queryInterviewChoose(Model model){
		List<EngageMajorRelease> emr = emrs.findEngageMajorReleaseAll();
		Set<String> set = new HashSet<String>();
		for (EngageMajorRelease e : emr) {
			set.add(e.getMajorKindName());
		}
		List<String> list = new ArrayList<String>(set);
		model.addAttribute("list", list);
		
		
		return "forward:/interview_choose.jsp";
	}
	
	
	@RequestMapping("/{hiddenMajorKindName}/{humanMajorName}/{keyWord}/{startdate}/{enddate}/queryChooseInterviewList.do")
	public String queryChooseInterviewList(@PathVariable("hiddenMajorKindName") String majorKindName,
			@PathVariable("humanMajorName") String majorName,
			@PathVariable("keyWord") String keyWord,
			@PathVariable("startdate") Timestamp sd,
			@PathVariable("enddate") Timestamp ed,
			Model model,
			HttpServletRequest request){
		
		Timestamp start = null;
		Timestamp end = null;
		
		String strsd = sd+"";
		String stred = ed+"";
		
		if(strsd.compareTo(stred) > 0){
			start = ed;
			end = sd;
		}else{
			start = sd;
			end = ed;
		}	
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("majorKindName", majorKindName);
		map.put("majorName", majorName);
		map.put("checkStatus", 1);
		//map.put("is", 1);
		map.put("start", start);
		map.put("end", end);
		map.put("keyWord", keyWord);
		
		
		int maxPage =0;
		int sumNumber =ers.findCntByCondition(map);//总个数
		System.out.println(sumNumber+"个");
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
		//Map<String, Object> map=new HashMap<String, Object>();
		map.put("pageSize", pageSize);
		map.put("currentPage", currentPage);
		//分页查询
		List<EngageResume> erList = ers.findAllByConditionTow(map);
		System.out.println(erList.size());
		model.addAttribute("erList", erList);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
		
		//model.addAttribute("erList", erList);
		return "forward:/interview_choose_list.jsp";
	}
	
	
	@RequestMapping("/{id}/interviewRegist.do")
	public String interviewRegist(Model model,@PathVariable("id") int id){
		
		EngageResume er = ers.findEngageResumeById(id);
		model.addAttribute("re", er);
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		model.addAttribute("t", t);
		
		model.addAttribute("user", "adm");
		return "forward:/interview_regist.jsp";
	}
	
	@RequestMapping("/saveInterview.do")
	@ResponseBody
	public List<String> saveInterview(EngageInterview ei){
		
		EngageResume er = ers.findEngageResumeById(ei.getResumeId());
		int amount = er.getTestAmount();
		amount += 1;
		er.setTestAmount(amount);
		er.setInterviewStatus(2);
		ers.updateEngageResume(er);
		
		short s = 1;
		ei.setInterviewStatus(s);
		
		boolean f = eis.saveEngageInterview(ei);
		List<String> list = new ArrayList<String>();
		if(f){
			list.add("简历结果登记成功！");
		}
		return list;
	}
	
	
	
	@RequestMapping("/queryInterviewValidList.do")
	public String queryInterviewValidList(Model model,HttpServletRequest request){
		
		short is = 1;
		int maxPage =0;
		int sumNumber =eis.findCntByIS(is);//总个数
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
		map.put("is", is);
		//分页查询
		List<EngageInterview> list = eis.finSplit(map);
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
		return "forward:/interview_valid_list.jsp";
	}
	
	
	@RequestMapping("/{einId}/{resumeId}/queryToValidResume.do")
	public String queryToValidResume(Model model,
			@PathVariable("einId") short einId,
			@PathVariable("resumeId") short resumeId){
		
		EngageInterview ei = eis.findEngageInterviewById(einId);
		
		EngageResume er = ers.findEngageResumeById(resumeId);
		
		model.addAttribute("re", er);
		model.addAttribute("ei", ei);
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		model.addAttribute("passRegistTime", t);
		
		model.addAttribute("passRegister", "ad");
		
		
		return "forward:/interview_valid_resume.jsp";
	}
	
	
	@RequestMapping("/updateInterviewResume.do")
	@ResponseBody
	public List<String> updateInterviewResume(@Param("passRegistTime") Timestamp passRegistTime,
			@Param("passRegister") String passRegister,
			@Param("resumeId") short resumeId,
			@Param("einId") short einId,
			@Param("passCheckcomment") String passCheckcomment){
		
		List<String> list = new ArrayList<String>();
		
		if("删除简历".equals(passCheckcomment)){
			
			boolean f = eis.removeEngageInterviewById(einId);
			boolean f1 = ers.removeEngageResumeById(resumeId);
			//boolean f = true;
			if(f == true && f1 == true){
				list.add("删除简历");
			}
		}
		
		if("建议面试".equals(passCheckcomment)){
			
			boolean f1 = eis.removeEngageInterviewById(einId);
			EngageResume er = ers.findEngageResumeById(resumeId);
			er.setInterviewStatus(1);
			er.setPassChecker(passRegister);
			er.setPassCheckTime(passRegistTime);
			er.setPassCheckcomment(passCheckcomment);
			boolean f2 = ers.updateEngageResume(er);
			if(f1 == true && f2 == true){
				list.add("建议面试");
			}
		}
		
		if("建议笔试".equals(passCheckcomment)){
			
			EngageInterview ei = eis.findEngageInterviewById(einId);
			short s = 2;
			ei.setInterviewStatus(s);
			ei.setCheckComment(passCheckcomment);
			ei.setChecker(passRegister);
			ei.setCheckTime(passRegistTime);
			boolean f1 = eis.updateEngageInterview(ei);
			EngageResume er = ers.findEngageResumeById(resumeId);
			er.setInterviewStatus(2);//已面试
			er.setPassChecker(passRegister);
			er.setPassCheckTime(passRegistTime);
			er.setPassCheckcomment(passCheckcomment);
			boolean f2 = ers.updateEngageResume(er);
			if(f1 == true && f2 == true){
				list.add("建议笔试");
			}
			
		}
		
		if("建议录用".equals(passCheckcomment)){
			
			EngageInterview ei = eis.findEngageInterviewById(einId);
			short s = 3;
			ei.setInterviewStatus(s);
			ei.setCheckComment(passCheckcomment);
			ei.setChecker(passRegister);
			ei.setCheckTime(passRegistTime);
			boolean f1 = eis.updateEngageInterview(ei);
			EngageResume er = ers.findEngageResumeById(resumeId);
			er.setInterviewStatus(2);//已面试
			er.setPassChecker(passRegister);
			er.setPassCheckTime(passRegistTime);
			er.setPassCheckcomment(passCheckcomment);
			boolean f2 = ers.updateEngageResume(er);
			if(f1 == true && f2 == true){
				list.add("建议录用");
			}
			
		}
		
		return list;
	}
	
	
	
	
	
	
	
/*	
	@RequestMapping("/{hiddenMajorKindName}/{humanMajorName}/{keyWord}/{startdate}/{enddate}/queryChooseSplit.do")
	public String queryChooseSplit(@PathVariable("hiddenMajorKindName") String majorKindName,
			@PathVariable("humanMajorName") String majorName,
			@PathVariable("keyWord") String keyWord,
			@PathVariable("startdate") Timestamp sd,
			@PathVariable("enddate") Timestamp ed,
			Model model,
			HttpServletRequest request){
		
		Timestamp start = null;
		Timestamp end = null;
		
		String strsd = sd+"";
		String stred = ed+"";
		
		if(strsd.compareTo(stred) > 0){
			start = ed;
			end = sd;
		}else{
			start = sd;
			end = ed;
		}
		
		System.out.println(majorKindName);
		System.out.println(majorName);
		System.out.println(keyWord);
		System.out.println(start);
		System.out.println(end);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("majorKindName", majorKindName);
		map.put("majorName", majorName);
		map.put("keyWord", keyWord);
		map.put("start", start);
		map.put("end", end);
		
		List<EngageResume> list = ers.findAllByCondition(map);
		for (EngageResume engageResume : list) {
			System.out.println(engageResume);
		}
		
		return null;
	}
	*/
	
}
