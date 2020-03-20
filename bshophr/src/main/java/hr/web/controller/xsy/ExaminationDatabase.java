package hr.web.controller.xsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.EngageSubjects;
import hr.service.EngageSubjectsService;

@Controller
public class ExaminationDatabase {
	@Autowired
	private EngageSubjectsService esservice = null;

	//
	@RequestMapping("/engagesubjects.do")
	public String engagesubjects() {
		return "forward:/engage_subject_register.jsp";
	}

	@RequestMapping("/engagesubjectsuccess.do")
	public String engagesubjectsuccess(@RequestParam String firstKindName, @RequestParam String secondKindName,
			@RequestParam String humanName, @RequestParam String registTime, @RequestParam String tigan,
			@RequestParam String daana, @RequestParam String daanb, @RequestParam String daanc,
			@RequestParam String daand, @RequestParam String daane, @RequestParam String correctkey,
			@RequestParam String fromwhere) {
		System.out.println(registTime);
		EngageSubjects espojo = new EngageSubjects();
		espojo.setFirstKindName(firstKindName);
		espojo.setSecondKindName(secondKindName);
		espojo.setRegister(humanName);
		espojo.setRegistTime(registTime);
		espojo.setContent(tigan);
		espojo.setKeyA(daana);
		espojo.setKeyB(daanb);
		espojo.setKeyC(daanc);
		espojo.setKeyD(daand);
		espojo.setKeyE(daane);
		espojo.setCorrectKey(correctkey);
		espojo.setDerivation(fromwhere);
		esservice.saveEngageSubjects(espojo);
		System.out.println(333);
		return "forward:/engage_subject_success.jsp";
	}
}
