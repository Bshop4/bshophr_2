package hr.web.controller.xsy;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.HumanFile;
import hr.pojo.SalaryGrant;
import hr.pojo.SalaryGrantDetails;
import hr.pojo.SalaryStandardDetails;
import hr.service.HumanFileService;
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
	@Autowired
	private HumanFileService hfservice = null;

	// 登记
	@RequestMapping("/toquery.do")
	public String toquery(int sid, String ssid, Map map) {
		map.put("sid", sid);
		map.put("ssid", ssid);
		// 各种补贴
		SalaryStandardDetails ssd1 = new SalaryStandardDetails();
		ssd1.setStandardId(ssid);
		ssd1.setItemName("出差补助");
		SalaryStandardDetails mission = ssdservice.findSalaryStandardDetailsByItName(ssd1);
		map.put("mission", mission.getSalary());

		SalaryStandardDetails ssd2 = new SalaryStandardDetails();
		ssd2.setStandardId(ssid);
		ssd2.setItemName("交通补贴");
		SalaryStandardDetails travel = ssdservice.findSalaryStandardDetailsByItName(ssd2);
		map.put("travel", travel.getSalary());

		SalaryStandardDetails ssd3 = new SalaryStandardDetails();
		ssd3.setStandardId(ssid);
		ssd3.setItemName("住房补贴");
		SalaryStandardDetails housing = ssdservice.findSalaryStandardDetailsByItName(ssd3);
		map.put("housing", housing.getSalary());
		System.out.println(housing.getSalary());// 800

		SalaryStandardDetails ssd4 = new SalaryStandardDetails();
		ssd4.setStandardId(ssid);
		ssd4.setItemName("基本工资");
		SalaryStandardDetails base = ssdservice.findSalaryStandardDetailsByItName(ssd4);
		map.put("base", base.getSalary());
		System.out.println(base.getSalary());// 6000

		SalaryStandardDetails ssd5 = new SalaryStandardDetails();
		ssd5.setStandardId(ssid);
		ssd5.setItemName("年终奖");
		SalaryStandardDetails bonus = ssdservice.findSalaryStandardDetailsByItName(ssd5);
		map.put("bonus", bonus.getSalary());
		System.out.println(bonus.getSalary());

		SalaryStandardDetails ssd6 = new SalaryStandardDetails();
		ssd6.setStandardId(ssid);
		ssd6.setItemName("误餐补助");
		SalaryStandardDetails meal = ssdservice.findSalaryStandardDetailsByItName(ssd6);
		map.put("meal", meal.getSalary());
		System.out.println(meal.getSalary());
//		List<SalaryStandardDetails> list = ssdservice.findSalaryStandardDetailsById(Integer.parseInt(ssid));
//		map.put("ssdlist", list);
//		map.put("count", list.size());
		HumanFile hf = hfservice.findHumanNameFileById(Integer.parseInt(ssid));// 档案编号和名字
		System.out.println(333);
		System.out.println(hf.getHumanName());
		map.put("humanName", hf.getHumanName());
		SalaryGrant s = sgservice.findSalaryGrantSalarySumById(Integer.parseInt(ssid));// 查询薪酬总额和薪酬派发总额
		map.put("salaryStandardSum", s.getSalaryStandardSum());
		map.put("salaryPaidSum", s.getSalaryPaidSum());
		map.put("register", s.getRegister());
		map.put("count", s.getHumanAmount());
		System.out.println(s.getHumanAmount());
		return "forward:/salarygrant_register_commit.jsp";
	}

	// 登记之后提交
	@RequestMapping("/updateSalary.do")
	public String updateSalary(String humanid, String humanname, Double bounsSum, Double saleSum, Double deductSum,
			Double salaryPaidSum, Double salarySum_sum) {
		SalaryGrantDetails sgd = new SalaryGrantDetails();
		sgd.setHumanId(humanid);
		sgd.setHumanName(humanname);
		sgd.setBounsSum(bounsSum);
		sgd.setSaleSum(saleSum);
		sgd.setDeductSum(deductSum);
		sgd.setSalaryStandardSum(salarySum_sum);
		sgd.setSalaryPaidSum(salaryPaidSum);
		sgdservice.saveSalaryGrantDetails(sgd);
		return "forward:/salarygrant_register_success.jsp";
	}

	// 发放复核
	@RequestMapping("/queryBysgidr.do")
	public String queryBysgidr(int sid, String ssid, Map map, HttpSession session) {
		map.put("ssid", ssid);
		SalaryGrant sgpojo = new SalaryGrant();
		sgpojo.setCheckStatus((short) sid);
		sgservice.updateSalaryGrantStatus(sgpojo);
//		List<SalaryGrant> list = sgservice.findSalaryGrantByStatus((short) sid);
//		map.put("sglist", list);
//		map.put("sid", sid);
//		map.put("count", list.size());

		// 各种补贴
		SalaryStandardDetails ssd1 = new SalaryStandardDetails();
		ssd1.setStandardId(ssid);
		ssd1.setItemName("出差补助");
		SalaryStandardDetails mission = ssdservice.findSalaryStandardDetailsByItName(ssd1);
		map.put("mission", mission.getSalary());

		SalaryStandardDetails ssd2 = new SalaryStandardDetails();
		ssd2.setStandardId(ssid);
		ssd2.setItemName("交通补贴");
		SalaryStandardDetails travel = ssdservice.findSalaryStandardDetailsByItName(ssd2);
		map.put("travel", travel.getSalary());

		SalaryStandardDetails ssd3 = new SalaryStandardDetails();
		ssd3.setStandardId(ssid);
		ssd3.setItemName("住房补贴");
		SalaryStandardDetails housing = ssdservice.findSalaryStandardDetailsByItName(ssd3);
		map.put("housing", housing.getSalary());
//		System.out.println(housing.getSalary());// 800

		SalaryStandardDetails ssd4 = new SalaryStandardDetails();
		ssd4.setStandardId(ssid);
		ssd4.setItemName("基本工资");
		SalaryStandardDetails base = ssdservice.findSalaryStandardDetailsByItName(ssd4);
		map.put("base", base.getSalary());
//		System.out.println(base.getSalary());// 6000

		SalaryStandardDetails ssd5 = new SalaryStandardDetails();
		ssd5.setStandardId(ssid);
		ssd5.setItemName("年终奖");
		SalaryStandardDetails bonus = ssdservice.findSalaryStandardDetailsByItName(ssd5);
		map.put("bonus", bonus.getSalary());
//		System.out.println(bonus.getSalary());

		SalaryStandardDetails ssd6 = new SalaryStandardDetails();
		ssd6.setStandardId(ssid);
		ssd6.setItemName("误餐补助");
		SalaryStandardDetails meal = ssdservice.findSalaryStandardDetailsByItName(ssd6);
		map.put("meal", meal.getSalary());
//		System.out.println(meal.getSalary());

		// 档案编号和名字
		HumanFile hf = hfservice.findHumanNameFileById(Integer.parseInt(ssid));
		map.put("humanName", hf.getHumanName());
		SalaryGrant s = sgservice.findSalaryGrantSalarySumById(Integer.parseInt(ssid));// 查询薪酬总额和薪酬派发总额
		map.put("salaryStandardSum", s.getSalaryStandardSum());
		map.put("salaryPaidSum", s.getSalaryPaidSum());
		map.put("checker", s.getChecker());
		map.put("count", s.getHumanAmount());
//		System.out.println(s.getHumanAmount());

		SalaryGrantDetails sgdpojo = new SalaryGrantDetails();
//		System.out.println(ssid + "xxxxxxxxxxx");
		SalaryGrantDetails sgd = sgdservice.findSalaryGrantDetailsByHumanid(Integer.parseInt(ssid));
		map.put("bounsSum", sgd.getBounsSum());
		map.put("saleSum", sgd.getSaleSum());
		map.put("deductSum", sgd.getDeductSum());
		map.put("sps", sgd.getSalaryPaidSum());
		return "forward:/salarygrant_check.jsp";
	}

	// 复核通过
	@RequestMapping("tocheck.do")
	public String tocheck(String humanid, String bounsSum, String saleSum, String deductSum, String salaryPaidSum) {
		SalaryGrantDetails sgdpojo = new SalaryGrantDetails();
		sgdpojo.setHumanId(humanid);
		sgdpojo.setBounsSum(Double.parseDouble(bounsSum));
		sgdpojo.setSaleSum(Double.parseDouble(saleSum));
		sgdpojo.setDeductSum(Double.parseDouble(deductSum));
		sgdpojo.setSalaryPaidSum(Double.parseDouble(salaryPaidSum));
		sgdservice.updateSalaryGrantDetailsSome(sgdpojo);
		return "forward:/salarygrant_check_success.jsp";
	}

	@RequestMapping("toqueryall.do")
	public String toqueryall(int sid, String ssid, Map map, HttpSession session) {
		System.out.println(sid);
		System.out.println(ssid);
		map.put("ssid", ssid);
		SalaryGrant sg = sgservice.findSalaryGrantByStatus2222((short) sid);
		map.put("sg", sg);
		// 各种补贴
		SalaryStandardDetails ssd1 = new SalaryStandardDetails();
		ssd1.setStandardId(ssid);
		ssd1.setItemName("出差补助");
		SalaryStandardDetails mission = ssdservice.findSalaryStandardDetailsByItName(ssd1);
		map.put("mission", mission.getSalary());

		SalaryStandardDetails ssd2 = new SalaryStandardDetails();
		ssd2.setStandardId(ssid);
		ssd2.setItemName("交通补贴");
		SalaryStandardDetails travel = ssdservice.findSalaryStandardDetailsByItName(ssd2);
		map.put("travel", travel.getSalary());

		SalaryStandardDetails ssd3 = new SalaryStandardDetails();
		ssd3.setStandardId(ssid);
		ssd3.setItemName("住房补贴");
		SalaryStandardDetails housing = ssdservice.findSalaryStandardDetailsByItName(ssd3);
		map.put("housing", housing.getSalary());
//				System.out.println(housing.getSalary());// 800

		SalaryStandardDetails ssd4 = new SalaryStandardDetails();
		ssd4.setStandardId(ssid);
		ssd4.setItemName("基本工资");
		SalaryStandardDetails base = ssdservice.findSalaryStandardDetailsByItName(ssd4);
		map.put("base", base.getSalary());
//				System.out.println(base.getSalary());// 6000

		SalaryStandardDetails ssd5 = new SalaryStandardDetails();
		ssd5.setStandardId(ssid);
		ssd5.setItemName("年终奖");
		SalaryStandardDetails bonus = ssdservice.findSalaryStandardDetailsByItName(ssd5);
		map.put("bonus", bonus.getSalary());

		SalaryStandardDetails ssd6 = new SalaryStandardDetails();
		ssd6.setStandardId(ssid);
		ssd6.setItemName("误餐补助");
		SalaryStandardDetails meal = ssdservice.findSalaryStandardDetailsByItName(ssd6);
		map.put("meal", meal.getSalary());
		System.out.println(meal.getSalary());

		// 档案编号和名字
		HumanFile hf = hfservice.findHumanNameFileById(Integer.parseInt(ssid));
		map.put("humanName", hf.getHumanName());
		System.out.println(hf.getHumanName());

		// 奖金，销售，应扣
		SalaryGrantDetails sgd = sgdservice.findSalaryGrantDetailsByHumanid(Integer.parseInt(ssid));
		map.put("bounsSum", sgd.getBounsSum());
		map.put("saleSum", sgd.getSaleSum());
		map.put("deductSum", sgd.getDeductSum());
		map.put("sps", sgd.getSalaryPaidSum());
		return "forward:/salarygrant_query.jsp";
	}
}
