package hr.web.controller.xsy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.ConfigPublicChar;
import hr.pojo.SalaryStandard;
import hr.pojo.SalaryStandardDetails;
import hr.service.ConfigPublicCharService;
import hr.service.SalaryStandardDetailsService;
import hr.service.SalaryStandardService;

@Controller
@RequestMapping("/hr")
public class Salarystandard {
	@Autowired
	private SalaryStandardService service1 = null;
	@Autowired
	private SalaryStandardDetailsService service2 = null;
	@Autowired
	private ConfigPublicCharService service3 = null;

	@RequestMapping("/salarystandard.do")
	public String saveSalaryStandard(@ModelAttribute SalaryStandard sspojo) {// SalaryStandard对象
		service1.saveSalaryStandard(sspojo);
		// SalaryStandardDetails对象
		SalaryStandardDetails ssdpojo = new SalaryStandardDetails();
		List<ConfigPublicChar> list = service3.findConfigPublicCharByAk("薪酬设置");
		short i = 0;
		for (ConfigPublicChar c : list) {
			ssdpojo.setStandardId(sspojo.getStandardId());
			ssdpojo.setStandardName(sspojo.getStandardName());
//			ssdpojo.setSalary(Double.parseDouble(salary[i]));
			ssdpojo.setItemId(++i);
			ssdpojo.setItemName(c.getAttributeName());
			// 保存
			service2.saveSalaryStandardDetails(ssdpojo);
		}
		return "forward:/WEB-INF/jsp/salarystandard_register_success.jsp";
	}
}
