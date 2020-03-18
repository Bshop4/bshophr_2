package hr.web.controller.xsy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExaminationDatabase {
	//
	@RequestMapping("/engagesubjects.do")
	public String engagesubjects() {
		return "forward:/engage_subject_register.jsp";
	}
}
