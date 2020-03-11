package hr.web.controller.zjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.ConfigMajorKind;
import hr.service.ConfigMajorKindService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private ConfigMajorKindService cmks = null;
	

	@RequestMapping("/query.do")
	public String tes(){
		List<ConfigMajorKind> s = cmks.findConfigMajorKindAll();
		System.out.println("123");
		System.out.println(s.size());
		return null;
	}
	
}
