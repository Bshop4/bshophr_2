package hr.web.controller.pyl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.service.EngageSubjectsService;

@Controller
public class Test {
	@Autowired
	private EngageSubjectsService ess=null;
	
	@RequestMapping("/test.do")
	public String select(){
		System.out.println(123123);
		return null;
	}
	
}
