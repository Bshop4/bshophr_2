package hr.web.controller.djt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.HumanFile;
import hr.service.HumanFileService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/registerChoosePicture")
public class DjtRegisterChoosePicture {
	@Autowired
	private HumanFileService humanFileService=null;
	
	@ResponseBody
	@RequestMapping("/pageJump.do")
	public String pageJump(@ModelAttribute HumanFile humanFile){
		boolean flag=humanFileService.saveHumanFile(humanFile);
		JSONObject json=JSONObject.fromObject(flag);
		return json.toString();
	}
	
	
}
