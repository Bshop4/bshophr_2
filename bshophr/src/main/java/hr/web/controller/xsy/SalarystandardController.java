package hr.web.controller.xsy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
	private List<SalaryStandard> slist;
	@Autowired
	private SalaryStandardService ssservice = null;
	@Autowired
	private SalaryStandardDetailsService ssdservice = null;
	@Autowired
	private ConfigPublicCharService cfservice = null;

	// 从左边的薪酬标准登记进来到这里
	@RequestMapping("/ssregister.do")
	public String tossregister(Map map) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");// 时间格式化
		String date = formatter.format(new Date(System.currentTimeMillis()));// 时间
		map.put("cdate", date);
		return "forward:/salarystandard_register.jsp";// 跳转
	}

	// 薪酬标准登记提交
	@RequestMapping("/hr/salarystandard.do")
	public String saveSalaryStandard(@RequestParam("standardId") String standardId,
			@RequestParam("standardName") String standardName, @RequestParam("designer") String designer,
			@RequestParam("register") String register, @RequestParam("remark") String remark,
			@RequestParam("list[0].itemId") short itemId0, // 1
			@RequestParam("list[0].itemName") String itemName0, // 出差补助
			@RequestParam("list[0].salary") double salary0, // salary
			@RequestParam("list[1].itemId") short itemId1, @RequestParam("list[1].itemName") String itemName1,
			@RequestParam("list[1].salary") double salary1, @RequestParam("list[2].itemId") short itemId2,
			@RequestParam("list[2].itemName") String itemName2, @RequestParam("list[2].salary") double salary2,
			@RequestParam("list[3].itemId") short itemId3, @RequestParam("list[3].itemName") String itemName3,
			@RequestParam("list[3].salary") double salary3, @RequestParam("list[4].itemId") short itemId4,
			@RequestParam("list[4].itemName") String itemName4, @RequestParam("list[4].salary") double salary4,
			@RequestParam("list[5].itemId") short itemId5, @RequestParam("list[5].itemName") String itemName5,
			@RequestParam("list[5].salary") double salary5) {
		// SalaryStandard的对象
		SalaryStandard sspojo = new SalaryStandard();
		sspojo.setStandardId(standardId);
		sspojo.setStandardName(standardName);
		sspojo.setDesigner(designer);
		sspojo.setRegister(register);
		sspojo.setRemark(remark);
		sspojo.setSalarySum(salary0 + salary1 + salary2 + salary3 + salary4 + salary5);
		// 保存到SalaryStandard表
		ssservice.saveSalaryStandard(sspojo);

		// SalaryStandardDetails的六个对象
		SalaryStandardDetails ssdpojo1 = new SalaryStandardDetails();
		ssdpojo1.setStandardId(standardId);
		ssdpojo1.setStandardName(standardName);
		ssdpojo1.setItemId(itemId0);
		ssdpojo1.setItemName(itemName0);
		ssdpojo1.setSalary(salary0);

		SalaryStandardDetails ssdpojo2 = new SalaryStandardDetails();
		ssdpojo2.setStandardId(standardId);
		ssdpojo2.setStandardName(standardName);
		ssdpojo2.setItemId(itemId1);
		ssdpojo2.setItemName(itemName1);
		ssdpojo2.setSalary(salary1);

		SalaryStandardDetails ssdpojo3 = new SalaryStandardDetails();
		ssdpojo3.setStandardId(standardId);
		ssdpojo3.setStandardName(standardName);
		ssdpojo3.setItemId(itemId2);
		ssdpojo3.setItemName(itemName2);
		ssdpojo3.setSalary(salary2);

		SalaryStandardDetails ssdpojo4 = new SalaryStandardDetails();
		ssdpojo4.setStandardId(standardId);
		ssdpojo4.setStandardName(standardName);
		ssdpojo4.setItemId(itemId3);
		ssdpojo4.setItemName(itemName3);
		ssdpojo4.setSalary(salary3);

		SalaryStandardDetails ssdpojo5 = new SalaryStandardDetails();
		ssdpojo5.setStandardId(standardId);
		ssdpojo5.setStandardName(standardName);
		ssdpojo5.setItemId(itemId4);
		ssdpojo5.setItemName(itemName4);
		ssdpojo5.setSalary(salary4);

		SalaryStandardDetails ssdpojo6 = new SalaryStandardDetails();
		ssdpojo6.setStandardId(standardId);
		ssdpojo6.setStandardName(standardName);
		ssdpojo6.setItemId(itemId5);
		ssdpojo6.setItemName(itemName5);
		ssdpojo6.setSalary(salary5);

		// 保存到SalaryStandardDetails表
		ssdservice.saveSalaryStandardDetails(ssdpojo1);
		ssdservice.saveSalaryStandardDetails(ssdpojo2);
		ssdservice.saveSalaryStandardDetails(ssdpojo3);
		ssdservice.saveSalaryStandardDetails(ssdpojo4);
		ssdservice.saveSalaryStandardDetails(ssdpojo5);
		ssdservice.saveSalaryStandardDetails(ssdpojo6);

		return "forward:/salarystandard_register_success.jsp";// 转发到成功页面
	}

	// 薪酬标准复核登记
	@RequestMapping("/toqueryfh.do")
	public String toqueryfh(Map map) {
		slist = ssservice.findSalaryStandardAll();// 查询
		map.put("sslist", slist);// 设值
		map.put("count", slist.size());// 设值
		return "forward:/salarystandard_check_list.jsp";// 跳转
	}

	// 点击复核
	@RequestMapping("/queryfh.do")
	public String queryfh(Map map, String standardId, SalaryStandard cstandardId, SalaryStandard cstandardName,
			SalaryStandard cSalarySum, SalaryStandard cdesigner) {
		// 查出薪酬总额
		SalaryStandard ss = ssservice.findSalaryStandardById(Integer.parseInt(standardId));
		map.put("cstandardId", ss.getStandardId());
		map.put("cstandardName", ss.getStandardName());
		map.put("csalarySum", ss.getSalarySum());
		map.put("cdesigner", ss.getDesigner());

		// 查出薪酬设置的名字
		List<ConfigPublicChar> cflist = cfservice.findConfigPublicCharByAk("薪酬设置");
		map.put("cflist", cflist);

		// 查出SalaryStandardDetails中的salary
		List<SalaryStandardDetails> ssdlist = ssdservice.findSalaryStandardDetailsById(Integer.parseInt(standardId));
		map.put("ssdlist", ssdlist);

		// 时间
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String date = formatter.format(new Date(System.currentTimeMillis()));
		map.put("cdate", date);
		return "forward:/salarystandard_check.jsp";
	}

	// 复核通过
	@RequestMapping("/recheckout.do")
	public String recheckout(@RequestParam("stid") String stid, @RequestParam("item.checker") String checker,
			@RequestParam("sctime") String sctime, @RequestParam("sfgcomment") String scomment) {
		SalaryStandard sspojo = new SalaryStandard();
		SalaryStandard ss = ssservice.findSalaryStandardById(Integer.parseInt(stid));
		sspojo.setStandardId(stid);
		sspojo.setChecker(checker);
		sspojo.setCheckTime(sctime);
		sspojo.setCheckStatus("1");
		sspojo.setCheckComment(scomment);
		ssservice.updateSalaryStandardfh(sspojo);
		return "forward:/salarystandard_check_success.jsp";
	}

	// 薪酬标准查询
	@RequestMapping("/queryBySalaryto.do")
	public String queryBySalaryto() {
		return "forward:/salarystandard_query_locate.jsp";// 跳转
	}

	// 查询（没有实现多字段匹配）
	@RequestMapping("/queryBySalary.do")
	public String queryBySalary(@RequestParam("item.standardId") String sid, @RequestParam("textfield3") String keyword,
			Map map) {
		System.out.println(sid);
		System.out.println(keyword);
		List<SalaryStandard> sslist = ssservice.findSalaryStandardByIdDim(Integer.parseInt(sid));// ID的模糊查询
		map.put("sslist", sslist);
		map.put("count", sslist.size());
		System.out.println(sslist.size());
		// 构建薪酬标准编号和关键字支持模糊查询
		// 关键字查询条件将在薪酬标准名称、制定人、变更人和复核人字段进行匹配
//		SalaryStandard ss = new SalaryStandard();
//		ss.setStandardId(sid);
//		ss.setStandardName(keyword);
//		ss.setDesigner(keyword);
//		ss.setChanger(keyword);
//		ss.setChecker(keyword);
//		List<SalaryStandard> list = ssservice.findSalaryStandardByCondition(ss);
//		for (SalaryStandard s : list) {
//			System.out.println(s.getStandardId());
//			System.out.println(s.getStandardName());
//			System.out.println(s.getDesigner());
//			System.out.println(s.getRegistTime());
//			System.out.println(s.getSalarySum());
//		}
//		map.put("sslist", list);
//		map.put("count", list.size());
//		System.out.println(list.size());
		return "forward:/salarystandard_query_list.jsp";
	}
}
