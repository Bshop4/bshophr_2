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
import hr.pojo.HumanFile;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;
import hr.service.EngageResumeService;
import hr.service.HumanFileService;
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

	
	//页面跳转
	@RequestMapping("/jump.do")
	public String pageJump(Model model){
		List<ConfigFileFirstKind> list1=configFileFirstKindService.findConfigFileFirstKindAll(new ConcurrentHashMap<String, Object>());
		model.addAttribute("firstSelect", list1);
		
		return "forward:/human_register.jsp";
	}
	
	@RequestMapping("/jumpToId.do")
	public String pageJumpToId(@RequestParam int hufId, Model model){
		List<ConfigFileFirstKind> list1=configFileFirstKindService.findConfigFileFirstKindAll(new ConcurrentHashMap<String, Object>());
		hufId=1;
		HumanFile humanFile=humanFileService.findHumanFileById(hufId);
		
		model.addAttribute("firstSelect", list1);
		model.addAttribute("humanFile", humanFile);
		
		return "forward:/human_register.jsp";
	}
}
