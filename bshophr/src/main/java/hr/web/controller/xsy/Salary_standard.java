package hr.web.controller.xsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.SalaryStandard;
import hr.service.SalaryStandardService;

@Controller
public class Salary_standard {
	@Autowired
	private SalaryStandardService service = null;

	@RequestMapping("/saveSalaryStandard.do")
	public String saveSalaryStandard(@ModelAttribute SalaryStandard salaryStandard) {
		service.saveSalaryStandard(salaryStandard);
		return "";
	}

}
