package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		int pageSize=8;
		int currentPage=1;
		map.put("checkStatus", 0);
		map.put("humanFileStatus", 1);
		map.put("currentPage", 0);
		map.put("pageSize", pageSize);
		List<HumanFile> list=humanFileService.findHumanFileAll(map);
		//总共多少条数据
		int count=humanFileService.findCount(map);
		//最大页数
		int maxPage=0;
		if(count%pageSize==0){
			maxPage=count/pageSize;
		}else{
			maxPage=count/pageSize+1;
		}
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("maxPage", maxPage);
		return "forward:/check_list.jsp";
	}
	
	@RequestMapping("/jumpToPage.do")
	public String jumpToPage(@RequestParam String currentPage,Model model){
		Map<String, Object> map=new HashMap<String, Object>();
		int pageSize=8;
		
		int currentPage1= Integer.parseInt(currentPage);
		
		map.put("checkStatus", 0);
		map.put("humanFileStatus", 1);
		map.put("currentPage", (currentPage1-1)*pageSize);
		map.put("pageSize", pageSize);
		List<HumanFile> list=humanFileService.findHumanFileAll(map);
		//总共多少条数据
		int count=humanFileService.findCount(map);
		//最大页数
		int maxPage=0;
		if(count%pageSize==0){
			maxPage=count/pageSize;
		}else{
			maxPage=count/pageSize+1;
		}
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("maxPage", maxPage);
		return "forward:/check_list.jsp";
	}
}
