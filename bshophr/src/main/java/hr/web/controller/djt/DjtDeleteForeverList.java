package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.HumanFile;
import hr.service.HumanFileService;

@Controller
@RequestMapping("/deleteForeverList")
public class DjtDeleteForeverList {
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@RequestMapping("/jumpPage.do")
	public String queryPageLocate(Model model){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("humanFileStatus", 0);
		map.put("pageSize", 8);
		map.put("currentPage", 0);
		List<HumanFile> list=humanFileService.findHumanFileAll(map);
		model.addAttribute("listPageNo", list);
		return "forward:/delete_forever_list.jsp";
	}
	
	@RequestMapping("/foreverDeleteById.do")
	@ResponseBody
	public boolean deleteToId(@RequestParam int hufId, Model model){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("hufId", hufId);
		map.put("humanFileStatus", 3);
		boolean flag=humanFileService.updateHumanFileStatus(map);
		return flag;
	}
	
}
