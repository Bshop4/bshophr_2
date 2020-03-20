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
import hr.service.ConfigPrimaryKeyService;

@Controller
@RequestMapping("/queryKeywords")
public class DjtQueryKeywords {
	@Autowired
	private ConfigPrimaryKeyService configPrimaryKeyService=null;
	
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
		return "forward:/query_keywords.jsp";
	}
}
