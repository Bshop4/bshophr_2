package hr.web.controller.xsy;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.service.SalaryGrantDetailsService;
import hr.service.SalaryGrantService;
import hr.service.SalaryStandardDetailsService;

@Controller
public class SalarygrantdetailsController {
	@Autowired
	private SalaryGrantDetailsService sgdservice = null;
	@Autowired
	private SalaryGrantService sgservice = null;
	@Autowired
	private SalaryStandardDetailsService ssdservice = null;

	// 登记
	@RequestMapping("/toquery.do")
	public String toquery(int sid, Map map) {
		System.out.println(333);
		ssdservice.findSalaryStandardDetailsAll();
		return "forward:/salarygrant_register_commit.jsp";
	}
}
