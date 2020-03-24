package hr.web.controller.djt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.mapper.ConfigPrimaryKeyMapper;
import hr.pojo.ConfigPrimaryKey;
import hr.pojo.HumanFile;
import hr.service.ConfigPrimaryKeyService;
import hr.service.HumanFileService;

@Controller
@RequestMapping("/recoveryKeywords")
public class DjtRecoveryKeywords {
	@Autowired
	private ConfigPrimaryKeyService configPrimaryKeyService=null;
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@RequestMapping("/djtSearch.do")
	public String queryNeedThing(@RequestParam String firstKindId,
			@RequestParam String secondKindId,@RequestParam String thirdKindId,
			@RequestParam String humanMajorKindId,@RequestParam String humanMajorId,
			@RequestParam String dateStart,@RequestParam String dateEnd,Model model
	){
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("primaryKeyTable", "HumanFile");
		map.put("primaryKeyStatus", 1);
		List<ConfigPrimaryKey> list=configPrimaryKeyService.findConfigPrimaryKeyAllPlus(map);
		model.addAttribute("keywordsList", list);
		
		Map<String, Object> map1=new HashMap<String, Object>();
		if(firstKindId.equals("undefined")||firstKindId==""){
			firstKindId=null;
		}
		if(secondKindId.equals("undefined")||secondKindId==""){
			secondKindId=null;
		}
		if(thirdKindId.equals("undefined")||thirdKindId==""){
			thirdKindId=null;
		}
		if(humanMajorKindId.equals("undefined")||humanMajorKindId==""){
			humanMajorKindId=null;
		}
		if(humanMajorId.equals("undefined")||humanMajorId==""){
			humanMajorId=null;
		}
		if(dateStart==""){
			dateStart=null;
		}
		if(dateEnd==""){
			dateEnd=null;
		}
		
		model.addAttribute("condition", map1);
		
		return "forward:/djtRecoverykeywords.jsp";
	}
	
	@RequestMapping("/queryByConditions.do")
	public String queryByConditions(@RequestParam String firstKindId,
			@RequestParam String secondKindId,@RequestParam String thirdKindId,
			@RequestParam String humanMajorKindId,@RequestParam String humanMajorId,
			@RequestParam String dateStart,@RequestParam String dateEnd,
			@RequestParam String selectKey,@RequestParam String selectValue,Model model
	)
	{	
		int currentPage=1;
		int pageSize=2;
		Map<String, Object> map=new HashMap<String, Object>();
		if(firstKindId.equals("undefined")||firstKindId==""){
			firstKindId=null;
		}
		if(secondKindId.equals("undefined")||secondKindId==""){
			secondKindId=null;
		}
		if(thirdKindId.equals("undefined")||thirdKindId==""){
			thirdKindId=null;
		}
		if(humanMajorKindId.equals("undefined")||humanMajorKindId==""){
			humanMajorKindId=null;
		}
		if(humanMajorId.equals("undefined")||humanMajorId==""){
			humanMajorId=null;
		}
		if(dateStart==""){
			dateStart=null;
		}
		if(dateEnd==""){
			dateEnd=null;
		}
		
		map.put("humanFileStatus", 0);
		map.put(selectKey, selectValue);
		map.put("firstKindId", firstKindId);
		map.put("secondKindId", secondKindId);
		map.put("thirdKindId", thirdKindId);
		map.put("humanMajorKindId", humanMajorKindId);
		map.put("humanMajorId", humanMajorId);
		map.put("dateStart", dateStart);
		map.put("dateEnd", dateEnd);
		map.put("pageSize", pageSize);
		map.put("currentPage", 0);
		System.out.println(dateStart+"======"+dateEnd+"======"+selectKey+"====="+selectValue);
		List<HumanFile> list=humanFileService.findHumanFileAll(map);
		
		int count=humanFileService.findCount(map);
		
		//最大页数
		int maxPage=0;
		if(count%pageSize==0){
			maxPage=count/pageSize;
		}else{
			maxPage=count/pageSize+1;
		}
		
		model.addAttribute("listPageNo", list);
		
		model.addAttribute("count", count);
		model.addAttribute("condition", map);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("selectKey", selectKey);
		model.addAttribute("selectValue", selectValue);
		
		return "forward:/djtRecoveryPage.jsp";
	}
}
