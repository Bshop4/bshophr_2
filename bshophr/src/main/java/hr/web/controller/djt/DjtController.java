package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.ConfigFileFirstKind;
import hr.service.ConfigFileFirstKindService;

@Controller
public class DjtController {
	@Autowired
	private ConfigFileFirstKindService configFileFirstKindService=null;
	
	@RequestMapping("/djttest.do")
	public String testDjt(){
		List<ConfigFileFirstKind> list=configFileFirstKindService.findConfigFileFirstKindAll(new HashMap<String, Object>());
		for (ConfigFileFirstKind c : list) {
			System.out.println(c);
		}
		return null;
	}
}
