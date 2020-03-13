package hr.web.controller.xsy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigPublicChar;
import hr.pojo.SalaryStandard;
import hr.pojo.SalaryStandardDetails;
import hr.service.ConfigPublicCharService;
import hr.service.SalaryStandardDetailsService;
import hr.service.SalaryStandardService;

@Controller
public class SalarystandardController {
	@Autowired
	private SalaryStandardService service1 = null;
	@Autowired
	private SalaryStandardDetailsService service2 = null;
	@Autowired
	private ConfigPublicCharService service3 = null;

	@RequestMapping("/hr/salarystandard.do")
	public String saveSalaryStandard(@RequestParam("str") String s) {// SalaryStandard对象
		System.out.println(s);
		String[] ss = s.split(",");
		SalaryStandard sspojo = new SalaryStandard();
		sspojo.setStandardId(ss[0]);
		sspojo.setStandardName(ss[1]);
		sspojo.setDesigner(ss[2]);
		sspojo.setRegister(ss[3]);
		sspojo.setRemark(ss[4]);
		service1.saveSalaryStandard(sspojo);

		SalaryStandardDetails ssdpojo = new SalaryStandardDetails();
		List<ConfigPublicChar> list = service3.findConfigPublicCharByAk("薪酬设置");
		short i = 0;
		for (ConfigPublicChar c : list) {
			ssdpojo.setStandardId(ss[0]);
			ssdpojo.setStandardName(ss[1]);
			ssdpojo.setItemId(++i);
			ssdpojo.setItemName(c.getAttributeName());
			ssdpojo.setSalary(Double.parseDouble(ss[i + 4]));
			// 保存a?
			service2.saveSalaryStandardDetails(ssdpojo);
		}
		return "forward:/WEB-INF/jsp/salarystandard_register_success.jsp";
//		return "forward:salarystandard_register_success.jsp";
	}

//	@RequestMapping("/salarystandard.do")
//	public String saveSalaryStandard(@ModelAttribute SalaryStandard sspojo) {// SalaryStandard对象
//		service1.saveSalaryStandard(sspojo);
//		// SalaryStandardDetails对
//		SalaryStandardDetails ssdpojo = new SalaryStandardDetails();
//		List<ConfigPublicChar> list = service3.findConfigPublicCharByAk("薪酬设置");
//		short i = 0;
//		for (ConfigPublicChar c : list) {
//			ssdpojo.setStandardId(sspojo.getStandardId());
//			ssdpojo.setStandardName(sspojo.getStandardName());
////			ssdpojo.setSalary(Double.parseDouble(salary[i]));
//			ssdpojo.setItemId(++i);
//			ssdpojo.setItemName(c.getAttributeName());
//			// 保存a
//			service2.saveSalaryStandardDetails(ssdpojo);
//		}
//		return "forward:/WEB-INF/jsp/salarystandard_register_success.jsp";
//	}
}
