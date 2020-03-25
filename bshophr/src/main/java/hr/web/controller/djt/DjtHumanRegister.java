package hr.web.controller.djt;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileThirdKind;
import hr.pojo.ConfigMajor;
import hr.pojo.ConfigPublicChar;
import hr.pojo.HumanFile;
import hr.pojo.SalaryStandard;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;
import hr.service.ConfigPublicCharService;
import hr.service.EngageResumeService;
import hr.service.HumanFileService;
import hr.service.SalaryStandardService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/humanRegister")
public class DjtHumanRegister {
	
	@Autowired
	private ConfigFileFirstKindService configFileFirstKindService=null;
	
	@Autowired
	private ConfigFileThirdKindService configFileThirdKindService=null;
	
	@Autowired
	private ConfigMajorService configMajorService=null;
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@Autowired
	private ConfigPublicCharService configPublicCharService=null;
	
	@Autowired
	private SalaryStandardService salaryStandardService=null;

	
	//页面跳转
	@RequestMapping("/jump.do")
	public String pageJump(Model model){
		List<ConfigFileFirstKind> list1=configFileFirstKindService.findConfigFileFirstKindAll(new ConcurrentHashMap<String, Object>());
		
		List<ConfigPublicChar> gj= configPublicCharService.findConfigPublicCharByAk("国籍");
		List<ConfigPublicChar> mz= configPublicCharService.findConfigPublicCharByAk("民族");
		List<ConfigPublicChar> zjxy= configPublicCharService.findConfigPublicCharByAk("宗教信仰");
		List<ConfigPublicChar> zzmm= configPublicCharService.findConfigPublicCharByAk("政治面貌");
		List<ConfigPublicChar> jynx= configPublicCharService.findConfigPublicCharByAk("教育年限");
		List<ConfigPublicChar> xl= configPublicCharService.findConfigPublicCharByAk("学历");
		List<ConfigPublicChar> zy= configPublicCharService.findConfigPublicCharByAk("专业");
		List<ConfigPublicChar> tz= configPublicCharService.findConfigPublicCharByAk("特长");
		List<ConfigPublicChar> ah= configPublicCharService.findConfigPublicCharByAk("爱好");
		List<ConfigPublicChar> zc= configPublicCharService.findConfigPublicCharByAk("职称");
		List<SalaryStandard> xcbz=salaryStandardService.findSalaryStandardAllByCS("1");
		model.addAttribute("firstSelect", list1);
		
		model.addAttribute("gj", gj);
		model.addAttribute("mz", mz);
		model.addAttribute("zjxy", zjxy);
		model.addAttribute("zzmm", zzmm);
		model.addAttribute("jynx", jynx);
		model.addAttribute("xl", xl);
		model.addAttribute("zy", zy);
		model.addAttribute("tz", tz);
		model.addAttribute("ah", ah);
		model.addAttribute("zc", zc);
		model.addAttribute("xcbz", xcbz);
		
		return "forward:/human_register.jsp";
	}
	
	@RequestMapping("/jumpToId.do")
	public String pageJumpToId(@RequestParam int hufId, Model model){
		List<ConfigFileFirstKind> list1=configFileFirstKindService.findConfigFileFirstKindAll(new ConcurrentHashMap<String, Object>());
		HumanFile humanFile=humanFileService.findHumanFileById(hufId);
		
		System.out.println("获取的路径=="+humanFile.getHumanPicture());
		model.addAttribute("firstSelect", list1);
		model.addAttribute("humanFile", humanFile);
		
		List<ConfigPublicChar> gj= configPublicCharService.findConfigPublicCharByAk("国籍");
		List<ConfigPublicChar> mz= configPublicCharService.findConfigPublicCharByAk("民族");
		List<ConfigPublicChar> zjxy= configPublicCharService.findConfigPublicCharByAk("宗教信仰");
		List<ConfigPublicChar> zzmm= configPublicCharService.findConfigPublicCharByAk("政治面貌");
		List<ConfigPublicChar> jynx= configPublicCharService.findConfigPublicCharByAk("教育年限");
		List<ConfigPublicChar> xl= configPublicCharService.findConfigPublicCharByAk("学历");
		List<ConfigPublicChar> zy= configPublicCharService.findConfigPublicCharByAk("专业");
		List<ConfigPublicChar> tz= configPublicCharService.findConfigPublicCharByAk("特长");
		List<ConfigPublicChar> ah= configPublicCharService.findConfigPublicCharByAk("爱好");
		List<ConfigPublicChar> zc= configPublicCharService.findConfigPublicCharByAk("职称");
		List<SalaryStandard> xcbz=salaryStandardService.findSalaryStandardAllByCS("1");
		
		model.addAttribute("gj", gj);
		model.addAttribute("mz", mz);
		model.addAttribute("zjxy", zjxy);
		model.addAttribute("zzmm", zzmm);
		model.addAttribute("jynx", jynx);
		model.addAttribute("xl", xl);
		model.addAttribute("zy", zy);
		model.addAttribute("tz", tz);
		model.addAttribute("ah", ah);
		model.addAttribute("zc", zc);
		model.addAttribute("xcbz", xcbz);
		
		return "forward:/djtHumanView.jsp";
	}
	
	@RequestMapping("/jumpToChangeId.do")
	public String jumpToChangeId(@RequestParam int hufId, Model model){
		List<ConfigFileFirstKind> list1=configFileFirstKindService.findConfigFileFirstKindAll(new ConcurrentHashMap<String, Object>());
		HumanFile humanFile=humanFileService.findHumanFileById(hufId);
		
		System.out.println("获取的路径=="+humanFile.getHumanPicture());
		model.addAttribute("firstSelect", list1);
		model.addAttribute("humanFile", humanFile);
		
		List<ConfigPublicChar> gj= configPublicCharService.findConfigPublicCharByAk("国籍");
		List<ConfigPublicChar> mz= configPublicCharService.findConfigPublicCharByAk("民族");
		List<ConfigPublicChar> zjxy= configPublicCharService.findConfigPublicCharByAk("宗教信仰");
		List<ConfigPublicChar> zzmm= configPublicCharService.findConfigPublicCharByAk("政治面貌");
		List<ConfigPublicChar> jynx= configPublicCharService.findConfigPublicCharByAk("教育年限");
		List<ConfigPublicChar> xl= configPublicCharService.findConfigPublicCharByAk("学历");
		List<ConfigPublicChar> zy= configPublicCharService.findConfigPublicCharByAk("专业");
		List<ConfigPublicChar> tz= configPublicCharService.findConfigPublicCharByAk("特长");
		List<ConfigPublicChar> ah= configPublicCharService.findConfigPublicCharByAk("爱好");
		List<ConfigPublicChar> zc= configPublicCharService.findConfigPublicCharByAk("职称");
		List<SalaryStandard> xcbz=salaryStandardService.findSalaryStandardAllByCS("1");
		
		model.addAttribute("gj", gj);
		model.addAttribute("mz", mz);
		model.addAttribute("zjxy", zjxy);
		model.addAttribute("zzmm", zzmm);
		model.addAttribute("jynx", jynx);
		model.addAttribute("xl", xl);
		model.addAttribute("zy", zy);
		model.addAttribute("tz", tz);
		model.addAttribute("ah", ah);
		model.addAttribute("zc", zc);
		model.addAttribute("xcbz", xcbz);
		
		return "forward:/djtChangeHumanView.jsp";
	}
	
}
