package hr.web.controller.zjl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	

	@RequestMapping("/query.do")
	public String tes(){
		
		System.out.println("123");
		return null;
	}
	
}
