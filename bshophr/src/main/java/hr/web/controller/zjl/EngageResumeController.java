package hr.web.controller.zjl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigPublicChar;
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
		
		boolean f = ers.saveEngageResume(er);
		List<String> list = new ArrayList<String>();
		if(f){
			list.add("简历提交成功！");
		}
		
		return list;
	}
	
	
	
	
}
