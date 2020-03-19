package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigFileThirdKind;
import hr.pojo.ConfigMajor;
import hr.pojo.ConfigMajorKind;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileSecondKindService;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorKindService;
import hr.service.ConfigMajorService;
import hr.service.EngageResumeService;
import hr.service.HumanFileService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/changeLocate")
public class DjtChangeLocation {
	
	@Autowired
	private ConfigFileFirstKindService configFileFirstKindService=null;
	
	@Autowired
	private ConfigFileSecondKindService configFileSecondKindService=null;
	
	@Autowired
	private ConfigFileThirdKindService configFileThirdKindService=null;
	
	@Autowired
	private ConfigMajorService configMajorService=null;
	
	@Autowired
	private ConfigMajorKindService configMajorKindService=null;
	
	@Autowired
	private EngageResumeService engageResumeService=null;
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@RequestMapping("/jumpPage.do")
	public String queryPageLocate(Model model){
		List<ConfigFileFirstKind> list1=configFileFirstKindService.findConfigFileFirstKindAll(new ConcurrentHashMap<String, Object>());
		model.addAttribute("firstSelect", list1);
		return "forward:/change_locate.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/secondSelect.do")
	public String selectOptions(@RequestParam int firstSelect){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("firstKindId", firstSelect);
		List<ConfigFileSecondKind> list2=configFileSecondKindService.findConfigFileSecondKindAll(map);
		
		JSONArray json=JSONArray.fromObject(list2);
		
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/thirdSelect.do")
	public String selectThirdOptions(@RequestParam int secondSelect){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("secondKindId", secondSelect);
		List<ConfigFileThirdKind> list2=configFileThirdKindService.findConfigFileThirdKindAll(map);
		
		JSONArray json=JSONArray.fromObject(list2);
		
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/djtJobClassSelect.do")
	public String selectdjtJobClassSelect(){
		Map<String, Object> map=new HashMap<String, Object>();
		List<ConfigMajorKind> list2=configMajorKindService.findConfigMajorKindAll();
		
		JSONArray json=JSONArray.fromObject(list2);
		
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/djtJobSelect.do")
	public String selectdjtJobSelect(@RequestParam int majorKindId){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("majorKindId", majorKindId);
		List<ConfigMajor> list2=configMajorService.findConfigMajorSelect(map);
		
		JSONArray json=JSONArray.fromObject(list2);
		
		return json.toString();
	}
	
	
}
