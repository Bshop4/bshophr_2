package hr.web.controller.xsy;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.SalaryGrant;
import hr.service.SalaryGrantService;

@Controller
public class SalarygrantController {
	@Autowired
	private SalaryGrantService sgservice = null;

	// 跳转到薪酬发放管理登记
	@RequestMapping("/togrant.do")
	public String togrant() {
		return "forward:/salarygrant_register_locate.jsp";
	}

	// 根据发放方式查询
	@RequestMapping("/queryBysalaryid.do")
	public String queryBysalaryid(int submitType, Map map) {
		int humanAmount = 0;
		Double salaryStandardSum = 0.0;
		Double salaryPaidSum = 0.0;
		List<SalaryGrant> sglist = sgservice.findSalaryGrantAll();
		for (SalaryGrant s : sglist) {
			humanAmount += s.getHumanAmount();
			salaryStandardSum += s.getSalaryStandardSum();
			salaryPaidSum += s.getSalaryPaidSum();
		}
		map.put("submitType", submitType);
		map.put("sglist", sglist);
		map.put("count", sglist.size());
		map.put("humanAmount", humanAmount);
		map.put("salaryStandardSum", salaryStandardSum);
		map.put("salaryPaidSum", salaryPaidSum);
		return "forward:/salarygrant_register_list.jsp";
	}

	@RequestMapping("/toSalarygrantAll.do")
	public String toSalarygrantAll() {
		return "redirect:/SalarygrantAll.do";
	}

	@RequestMapping("/SalarygrantAll.do")
	public String SalarygrantAll(Map map) {
		System.out.println(555);
		SalaryGrant sgpojo = new SalaryGrant();
		List<SalaryGrant> list = sgservice.findSalaryGrantAll();
		map.put("sglist", list);
		return "forward:/salarygrant_check_list.jsp";
	}

	@RequestMapping("toqueryBySalary.do")
	public String toqueryBySalary() {
		return "forward:/salarygrant_query_locate.jsp";
	}

	// 模糊查询。
	@RequestMapping("queryBySgrant.do")
	public String queryBySgrant(String salary_grant_id, String register, Map map) {
		System.out.println(salary_grant_id);
		System.out.println(register);
		SalaryGrant sgpojo = new SalaryGrant();
		sgpojo.setSalaryGrantId(salary_grant_id);
		sgpojo.setRegister(register);
		List<SalaryGrant> slist = sgservice.findSalaryGrantAllByCondition(sgpojo);
		map.put("slist", slist);
		map.put("count", slist.size());
		return "forward:/salarygrant_query_list.jsp";
	}
}
