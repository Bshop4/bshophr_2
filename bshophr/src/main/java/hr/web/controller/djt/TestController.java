package hr.web.controller.djt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.ConfigFileFirstKind;
import hr.service.ConfigFileFirstKindService;

@Controller
public class TestController{
	@Autowired
	private ConfigFileFirstKindService c=null;
	
	@RequestMapping("/test.do")
	public String test(){
		List<ConfigFileFirstKind> list=c.findConfigFileFirstKindAll();
		for (ConfigFileFirstKind con : list) {
			System.out.println(con);
		}
		return null;
	}
}
