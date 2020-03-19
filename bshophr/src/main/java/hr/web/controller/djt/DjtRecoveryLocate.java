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

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.HumanFile;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileSecondKindService;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorKindService;
import hr.service.ConfigMajorService;
import hr.service.HumanFileService;

@Controller
@RequestMapping("/recoveryLocate")
public class DjtRecoveryLocate {
	
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
	private HumanFileService humanFileService=null;
	
	
	@RequestMapping("/jumpPage.do")
	public String queryPageLocate(Model model){
		List<ConfigFileFirstKind> list1=configFileFirstKindService.findConfigFileFirstKindAll(new ConcurrentHashMap<String, Object>());
		model.addAttribute("firstSelect", list1);
		return "forward:/recovery_locate.jsp";
	}
	
	@RequestMapping("/djtSearch.do")
	public String queryNeedThing(@RequestParam String firstKindId,
			@RequestParam String secondKindId,@RequestParam String thirdKindId,
			@RequestParam String humanMajorKindId,@RequestParam String humanMajorId,
			@RequestParam String dateStart,@RequestParam String dateEnd,Model model
	)
	{	
		int pageSize=8;
		Map<String, Object> map=new HashMap<String, Object>();
		if(firstKindId.equals("undefined")||firstKindId==""){
			firstKindId=null;
		}
		if(secondKindId.equals("undefined")||secondKindId==""){
			secondKindId=null;
		}
		if(thirdKindId.equals("undefined")||thirdKindId==""){
			thirdKindId=null;
		}
		if(humanMajorKindId.equals("undefined")||humanMajorKindId==""){
			humanMajorKindId=null;
		}
		if(humanMajorId.equals("undefined")||humanMajorId==""){
			humanMajorId=null;
		}
		if(dateStart==""){
			dateStart=null;
		}
		if(dateEnd==""){
			dateEnd=null;
		}
		//查看已经复核的人的信息
		map.put("humanFileStatus", 0);
		
		map.put("firstKindId", firstKindId);
		map.put("secondKindId", secondKindId);
		map.put("thirdKindId", thirdKindId);
		map.put("humanMajorKindId", humanMajorKindId);
		map.put("humanMajorId", humanMajorId);
		map.put("dateStart", dateStart);
		map.put("dateEnd", dateEnd);
		map.put("pageSize", pageSize);
		map.put("currentPage", 0);
		System.out.println(dateStart+"======"+dateEnd);
		List<HumanFile> list=humanFileService.findHumanFileAll(map);
		model.addAttribute("listPageNo", list);
		model.addAttribute("condition", map);
		return "forward:/djtRecoveryPage.jsp";
	}
}
