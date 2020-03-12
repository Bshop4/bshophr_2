package hr.web.controller.xsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.SalaryStandard;
import hr.pojo.SalaryStandardDetails;
import hr.service.SalaryStandardDetailsService;
import hr.service.SalaryStandardService;

@Controller
@RequestMapping("/hr")
public class Salarystandard {
	@Autowired
	private SalaryStandardService service1 = null;
	private SalaryStandardDetailsService service2 = null;

	@RequestMapping("/salarystandard.do")
	public String saveSalaryStandard(@ModelAttribute SalaryStandard sspojo) {// SalaryStandard对象
		service1.saveSalaryStandard(sspojo);
		// SalaryStandardDetails对象
		SalaryStandardDetails ssdpojo = new SalaryStandardDetails();
		ssdpojo.setStandardId(sspojo.getStandardId());
		ssdpojo.setStandardName(sspojo.getStandardName());
		service2.saveSalaryStandardDetails(ssdpojo);
		return "forward:/WEB-INF/jsp/salarystandard_register_success.jsp";
	}

	// 这里是ajax请求
//	@RequestMapping("/salarystandard.do")
//	@ResponseBody
//	public SalaryStandardDetails testAjax(@RequestBody SalaryStandardDetails ssd) {
//		System.out.println(ssd.getItemId() + "===" + ssd.getItemName() + "====" + ssd.getSalary());
//		ssd.setItemId(ssd.getItemId());
//		ssd.setItemName(ssd.getItemName());
//		ssd.setSalary(ssd.getSalary());
//		service2.saveSalaryStandardDetails(ssd);
//		return ssd;
//	}

}
