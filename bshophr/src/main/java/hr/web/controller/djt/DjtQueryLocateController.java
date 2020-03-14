package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.ConfigFileThirdKind;
import hr.pojo.ConfigMajor;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;
import hr.service.EngageResumeService;
import hr.service.HumanFileService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/queryLocate")
public class DjtQueryLocateController {
	
	@Autowired
	private ConfigFileThirdKindService configFileThirdKindService=null;
	
	@Autowired
	private ConfigMajorService configMajorService=null;
	
	@Autowired
	private EngageResumeService engageResumeService=null;
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@RequestMapping("/pageJump.do")
	public String queryPageLocate(Model model){
		Map<String, Object> myselect=new HashMap<String, Object>();
		List<ConfigFileThirdKind> listCftk=configFileThirdKindService.findConfigFileThirdKindAll();
		myselect.put("listCftk", listCftk);
		
		List<ConfigMajor> listCm=configMajorService.findConfigMajorAll();
		myselect.put("listCm", listCm);
		
		model.addAttribute("myselectmap", myselect);
		
		return "forward:/query_locate.jsp";
	}
	
}
