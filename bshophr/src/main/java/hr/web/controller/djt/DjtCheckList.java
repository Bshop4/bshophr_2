package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.HumanFile;
import hr.service.HumanFileService;

@Controller
@RequestMapping("/checkList")
public class DjtCheckList {
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@RequestMapping("/pageJump.do")
	public String pageJump(Model model){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("checkStatus", 0);
		map.put("currentPage", 0);
		map.put("pageSize", 8);
		List<HumanFile> list=humanFileService.findHumanFileAll(map);
		model.addAttribute("list", list);
		return "forward:/check_list.jsp";
	}
}
