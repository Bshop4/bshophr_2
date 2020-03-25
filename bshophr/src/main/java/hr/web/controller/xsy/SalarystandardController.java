package hr.web.controller.xsy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigPublicChar;
import hr.pojo.SalaryGrant;
import hr.pojo.SalaryStandard;
import hr.pojo.SalaryStandardDetails;
import hr.service.ConfigPublicCharService;
import hr.service.SalaryGrantService;
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
	@Autowired
	private SalaryGrantService sgservice = null;

	// 从左边的薪酬标准登记进来到这里。
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

		// Salarygrant对象
		SalaryGrant sgpojo = new SalaryGrant();
		sgpojo.setSalaryStandardId(standardId);
		sgpojo.setFirstKindId("1");
		sgpojo.setFirstKindName("集团");
		sgpojo.setSecondKindId("1");
		sgpojo.setSecondKindName("软件公司");
		sgpojo.setThirdKindId("1");
		sgpojo.setThirdKindName("外包组");
		sgpojo.setHumanAmount((short) 4);
		sgpojo.setSalaryStandardSum(salary0 + salary1 + salary2 + salary3 + salary4 + salary5);
		sgpojo.setSalaryPaidSum(salary0 + salary1 + salary2 + salary3 + salary4 + salary5);
		sgpojo.setRegister(register);
		// 保存到Salarygrant表
		sgservice.saveSalaryGrant(sgpojo);

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

	// 薪酬标准登记复核
	@RequestMapping("/toqueryfh.do")
	public String toqueryfh(Map map, @RequestParam String operate, HttpServletRequest request, Model model) {
		switch (operate) {
		case "list":
			selectPage(request, model, ssservice);
			return "forward:/salarystandard_check_list.jsp";
		default:
			break;
		}
		return "redirect:/toqueryfh.do?operate=list";// 重定向到原来的
	}

	private void selectPage(HttpServletRequest request, Model model, SalaryStandardService service) {
		int maxPage = 0;
		int sumNumber = service.findSalaryStandardAll().size();// 总个数
		int pageSize = 2;
		int pageNo = 1;
		// 最大页数
		maxPage = sumNumber % pageSize != 0 ? sumNumber / pageSize + 1 : sumNumber / pageSize;

		String page = request.getParameter("page");
		if (page != null && !"".equals(page)) {
			try {
				pageNo = Integer.parseInt(page);
			} catch (NumberFormatException e) {
				pageNo = 1;
			}
			if (pageNo > maxPage) {
				pageNo = maxPage;
			} else if (pageNo < 1) {
				pageNo = 1;
			}
		}

		int currentPage = (pageNo - 1) * pageSize;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("currentPage", currentPage);// 当前页
		map.put("pageSize", pageSize);// 每页多少条
		// 分页查询
		List<SalaryStandard> list = service.findSalaryStandardAllByConditionPlus(map);
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
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

	// 薪酬标准复核通过
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

	// 薪酬标准查询
	@RequestMapping("/queryBySalary.do")
	public String queryBySalary(@RequestParam String operate, HttpServletRequest request, Model model) {
		switch (operate) {
		case "list":
			selectPage2(request, model, ssservice);
			return "forward:/salarystandard_query_list.jsp";
		default:
			break;
		}
		return "redirect:/queryBySalary.do?operate=list";// 重定向到原来的
	}

	// 标准变更查询
	@RequestMapping("/querybzbgto.do")
	public String querybzbgto() {
		return "forward:/salarystandard_change_locate.jsp";
	}

	@RequestMapping("/querybzbg.do")
	public String querybzbg(@RequestParam String operate, HttpServletRequest request, Model model) {
		switch (operate) {
		case "list":
			selectPage3(request, model, ssservice);
			return "forward:/salarystandard_change_list.jsp";
		default:
			break;
		}
		return "redirect:/querybzbg.do?operate=list";// 重定向到原来的
	}

	// 点击变更
	@RequestMapping("/qyertbg.do")
	public String qyertbg(Map map, String standardId) {
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
		return "forward:/salarystandard_change.jsp";
	}

	// 变更重新提交
	@RequestMapping("/qyerybgto.do")
	public String qyerybgto(@RequestParam("stid") String stid, @RequestParam("bgr") String changer,
			@RequestParam("bgsj") String sctime, @RequestParam("bz") String scomment, @RequestParam("xh1") String xh1,
			@RequestParam("xh2") String xh2, @RequestParam("xh3") String xh3, @RequestParam("xh4") String xh4,
			@RequestParam("xh5") String xh5, @RequestParam("xh6") String xh6, @RequestParam("mc1") String mc1,
			@RequestParam("mc2") String mc2, @RequestParam("mc3") String mc3, @RequestParam("mc4") String mc4,
			@RequestParam("mc5") String mc5, @RequestParam("mc6") String mc6, @RequestParam("csum1") String csum1,
			@RequestParam("csum2") String csum2, @RequestParam("csum3") String csum3,
			@RequestParam("csum4") String csum4, @RequestParam("csum5") String csum5,
			@RequestParam("csum6") String csum6) {
		SalaryStandard sspojo = new SalaryStandard();
		sspojo.setStandardId(stid);
		sspojo.setChanger(changer);
		sspojo.setChangeTime(sctime);
		sspojo.setChangeStatus("1");
		sspojo.setRemark(scomment);
		ssservice.updateSalaryStandardbg(sspojo);

		// SalaryStandardDetails的六个对象
		SalaryStandardDetails ssdpojo1 = new SalaryStandardDetails();
		ssdpojo1.setStandardId(stid);
		ssdpojo1.setItemName(mc1);
		ssdpojo1.setSalary(Double.parseDouble(csum1));

		SalaryStandardDetails ssdpojo2 = new SalaryStandardDetails();
		ssdpojo2.setStandardId(stid);
		ssdpojo1.setItemName(mc2);
		ssdpojo1.setSalary(Double.parseDouble(csum2));

		SalaryStandardDetails ssdpojo3 = new SalaryStandardDetails();
		ssdpojo3.setStandardId(stid);
		ssdpojo1.setItemName(mc3);
		ssdpojo1.setSalary(Double.parseDouble(csum3));

		SalaryStandardDetails ssdpojo4 = new SalaryStandardDetails();
		ssdpojo4.setStandardId(stid);
		ssdpojo1.setItemName(mc4);
		ssdpojo1.setSalary(Double.parseDouble(csum4));

		SalaryStandardDetails ssdpojo5 = new SalaryStandardDetails();
		ssdpojo5.setStandardId(stid);
		ssdpojo1.setItemName(mc5);
		ssdpojo1.setSalary(Double.parseDouble(csum5));

		SalaryStandardDetails ssdpojo6 = new SalaryStandardDetails();
		ssdpojo6.setStandardId(stid);
		ssdpojo1.setItemName(mc6);
		ssdpojo1.setSalary(Double.parseDouble(csum6));

		// 保存到SalaryStandardDetails表
		ssdservice.updateSalaryStandardDetailsbg(ssdpojo1);
		ssdservice.updateSalaryStandardDetailsbg(ssdpojo2);
		ssdservice.updateSalaryStandardDetailsbg(ssdpojo3);
		ssdservice.updateSalaryStandardDetailsbg(ssdpojo4);
		ssdservice.updateSalaryStandardDetailsbg(ssdpojo5);
		ssdservice.updateSalaryStandardDetailsbg(ssdpojo6);

		return "forward:/salarystandard_change_success.jsp";
	}

	private void selectPage3(HttpServletRequest request, Model model, SalaryStandardService service) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");// 时间格式化
		String date = formatter.format(new Date(System.currentTimeMillis()));// 时间
		Map<String, Object> map = null;
		String sid = request.getParameter("sstid");
		String keyword = (request.getParameter("sdesigner")).equals("") ? "" : request.getParameter("sdesigner");
		String startTime = (request.getParameter("srtime1")).equals("") ? "2000-01-01"
				: request.getParameter("srtime1");
		String endTime = (request.getParameter("srtime2")).equals("") ? date : request.getParameter("srtime2");
		int maxPage = 0;
		int sumNumber = 0;// 总个数
		int pageSize = 10000;// 每页多少个
		int pageNo = 1;// 当前页
		map = new HashMap<String, Object>();
		map.put("standardId", sid);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		map.put("keyword", keyword);
		sumNumber = service.findSalaryStandardByCondition(map).size();// 总个数
		map.put("count", sumNumber);
		// 最大页数
		maxPage = sumNumber % pageSize != 0 ? sumNumber / pageSize + 1 : sumNumber / pageSize;
		String page = request.getParameter("page");
		if (page != null && !"".equals(page)) {
			try {
				pageNo = Integer.parseInt(page);
			} catch (NumberFormatException e) {
				pageNo = 1;
			}
			if (pageNo >= maxPage) {
				pageNo = maxPage;
			} else if (pageNo < 1) {
				pageNo = 1;
			}
		}
		int currentPage = (pageNo - 1) * pageSize;
		map.put("currentPage", currentPage);// 当前页
		map.put("pageSize", pageSize);// 每页多少条
		// 分页查询
		List<SalaryStandard> list = service.findSalaryStandardByCondition(map);
		model.addAttribute("sslist", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageNo", pageNo);
	}

	private void selectPage2(HttpServletRequest request, Model model, SalaryStandardService service) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");// 时间格式化
//		String date = formatter.format(new Date(System.currentTimeMillis()));// 时间
		String date = formatter.format(new Date().getTime() + 1 * 24 * 3600 * 1000);// 时间
		Map<String, Object> map = null;
		String sid = request.getParameter("standardId");
		String keyword = (request.getParameter("textfield3")).equals("") ? "" : request.getParameter("textfield3");
		String startTime = (request.getParameter("startTime")).equals("") ? "2000-01-01"
				: request.getParameter("startTime");
		String endTime = (request.getParameter("endTime")).equals("") ? date : request.getParameter("endTime");
		int maxPage = 0;
		int sumNumber = 0;// 总个数。
		int pageSize = 1;
		int pageNo = 1;
		if (sid != null) {
			map = new HashMap<String, Object>();
			map.put("standardId", sid);
			map.put("startTime", startTime);
			map.put("endTime", endTime);
			map.put("keyword", keyword);
			sumNumber = service.findSalaryStandardByCondition(map).size();// 总个数
			request.getSession().setAttribute("map", map);
			request.getSession().setAttribute("sumNumber", sumNumber);
		} else {
			map = (Map<String, Object>) request.getSession().getAttribute("map");
			sumNumber = (int) request.getSession().getAttribute("sumNumber");
		}
		// 最大页数
		maxPage = sumNumber % pageSize != 0 ? sumNumber / pageSize + 1 : sumNumber / pageSize;
		String page = request.getParameter("page");
		if (page != null && !"".equals(page)) {
			try {
				pageNo = Integer.parseInt(page);
			} catch (NumberFormatException e) {
				pageNo = 1;
			}
			if (pageNo >= maxPage) {
				pageNo = maxPage;
			} else if (pageNo < 1) {
				pageNo = 1;
			}
		}
		int currentPage = (pageNo - 1) * pageSize;
		map.put("currentPage", currentPage);// 当前页
		map.put("pageSize", pageSize);// 每页多少条
		// 分页查询
		List<SalaryStandard> list = service.findSalaryStandardByCondition(map);
		model.addAttribute("sslist", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageNo", pageNo);
	}
}
