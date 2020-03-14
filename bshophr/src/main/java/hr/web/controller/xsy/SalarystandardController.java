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
import net.sf.json.JSONArray;

@Controller
public class SalarystandardController {
	private List<SalaryStandard> slist;
	@Autowired
	private SalaryStandardService ssservice = null;
	@Autowired
	private SalaryStandardDetailsService ssdservice = null;
	@Autowired
	private ConfigPublicCharService cfservice = null;

	@RequestMapping("/ssregister.do")
	public String tossregister(Map map) {
		// 时间
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String date = formatter.format(new Date(System.currentTimeMillis()));
		map.put("cdate", date);
		return "forward:/salarystandard_register.jsp";
	}

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
		sspojo.setSalarySum(Double.parseDouble(ss[11]));
		ssservice.saveSalaryStandard(sspojo);

		SalaryStandardDetails ssdpojo = new SalaryStandardDetails();
		List<ConfigPublicChar> list = cfservice.findConfigPublicCharByAk("薪酬设置");
		short i = 0;
		for (ConfigPublicChar c : list) {
			ssdpojo.setStandardId(ss[0]);
			ssdpojo.setStandardName(ss[1]);
			ssdpojo.setItemId(++i);
			ssdpojo.setItemName(c.getAttributeName());
			ssdpojo.setSalary(Double.parseDouble(ss[i + 4]));
			// 保
			ssdservice.saveSalaryStandardDetails(ssdpojo);
		}
		JSONArray json = JSONArray.fromObject(list);
		return json.toString();
	}

	// 薪酬标准复核登记
	@RequestMapping("/toqueryfh")
	public String toqueryfh(Map map) {
		slist = ssservice.findSalaryStandardAll();
		map.put("sslist", slist);
		map.put("count", slist.size());
		return "forward:/salarystandard_check_list.jsp";
	}

	// 复核
	@RequestMapping("/queryfh")
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
	public String recheckout(@RequestParam("str") String s) {
		System.out.println(s);
		String[] ss = s.split(",");
		SalaryStandard sspojo = new SalaryStandard();
		SalaryStandard usspojo = ssservice.findSalaryStandardById(Integer.parseInt(ss[3]));
		System.out.println(usspojo);
//		usspojo.setChecker(ss[0]);
//		usspojo.setCheckTime(ss[1]);
//		usspojo.setCheckStatus("1");
//		usspojo.setCheckComment(ss[2]);
////		usspojo.setStandardId(ss[3]);// 这是where standard_id=#{standard_id}
//		ssservice.updateSalaryStandardfh(usspojo);
		return "forward:/salarystandard_check_success.jsp";
	}

	@RequestMapping("/queryBySalaryto.do")
	public String queryBySalaryto() {
		return "forward:/salarystandard_query_locate.jsp";// 这个可以跳转
	}

	@RequestMapping("/queryBySalary.do")
	public String queryBySalary(@RequestParam("str") String s) {
		System.out.println(s);
		List<SalaryStandard> sslist = ssservice.findSalaryStandardByIdDim(Integer.parseInt(s));
		for (SalaryStandard sd : sslist) {
			System.out.println(sd.getStandardId());
			System.out.println(sd.getStandardName());
		}
//		map.put("sslist", sslist);
//		map.put("count", sslist.size());

		return "forward:/salarystandard_query_list.jsp";

	}
}
