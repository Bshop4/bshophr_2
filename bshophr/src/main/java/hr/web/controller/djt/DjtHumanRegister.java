package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigFileThirdKind;
import hr.pojo.ConfigMajor;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;
import hr.service.EngageResumeService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/humanRegister")
public class DjtHumanRegister {
	@Autowired
	private ConfigFileThirdKindService configFileThirdKindService=null;
	
	@Autowired
	private ConfigMajorService configMajorService=null;
	
	@Autowired
	private EngageResumeService engageResumeService=null;
	
	//页面跳转
	@RequestMapping("/jump.do")
	public String pageJump(Model model){
		Map<String, Object> myselect=new HashMap<String, Object>();
		List<ConfigFileThirdKind> listCftk=configFileThirdKindService.findConfigFileThirdKindAll(new HashMap<String, Object>());
		myselect.put("listCftk", listCftk);
		
		List<ConfigMajor> listCm=configMajorService.findConfigMajorAll();
		myselect.put("listCm", listCm);
		model.addAttribute("map", myselect);
		
		return "forward:/human_register.jsp";
	}
	
	//获取3级选择框的值
	@ResponseBody
	@RequestMapping("/thereJump.do")
	public String selectOptions(){
		Map<String, Object> myselect=new HashMap<String, Object>();
		List<ConfigFileThirdKind> listCftk=configFileThirdKindService.findConfigFileThirdKindAll(new HashMap<String, Object>());
		myselect.put("listCftk", listCftk);
		
		List<ConfigMajor> listCm=configMajorService.findConfigMajorAll();
		myselect.put("listCm", listCm);
		
		JSONObject json=JSONObject.fromObject(myselect);
		
		return json.toString();
	}
}
