package hr.web.controller.xsy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Salary_standard {
	@RequestMapping("/aaa.do")
	public String aaa() {
		System.out.println(000);
		return "";
	}

}
