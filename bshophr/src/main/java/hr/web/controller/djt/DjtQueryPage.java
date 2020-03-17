package hr.web.controller.djt;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.HumanFile;
import hr.service.HumanFileService;

@Controller
@RequestMapping("/djtQueryPage")
public class DjtQueryPage {

	@Autowired
	private HumanFileService humanFileService=null;
	
	@RequestMapping("/djtSearch.do")
	public String queryNeedThing(@RequestParam String firstKindId,
			@RequestParam String secondKindId,@RequestParam String thirdKindId,
			@RequestParam String humanMajorKindId,@RequestParam String humanMajorId,
			@RequestParam Date dateStart,@RequestParam Date dateEnd,Model model
	)
	{	
		int pageSize=8;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("firstKindId", firstKindId);
		map.put("secondKindId", secondKindId);
		map.put("thirdKindId", thirdKindId);
		map.put("humanMajorKindId", humanMajorKindId);
		map.put("humanMajorId", humanMajorId);
		map.put("dateStart", dateStart);
		map.put("dateEnd", dateEnd);
		map.put("pageSize", pageSize);
		map.put("currentPage", 0);
		System.out.println(dateStart+"======"+dateEnd);
		List<HumanFile> list=humanFileService.findHumanFileAll(map);
		model.addAttribute("listPageNo", list);
		return "forward:/djtQueryPage.jsp";
	}
}
