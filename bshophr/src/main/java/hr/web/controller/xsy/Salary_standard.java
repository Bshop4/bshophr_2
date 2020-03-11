package hr.web.controller.xsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.SalaryStandard;
import hr.service.SalaryStandardService;

@Controller
@RequestMapping("/hr")
public class Salary_standard {
	@Autowired
	private SalaryStandardService service = null;

	@RequestMapping("/salarystandard.do")
	public String saveSalaryStandard(@ModelAttribute SalaryStandard ss) {
		service.saveSalaryStandard(ss);
		System.out.println("xsy345");
		return "";
	}

}
