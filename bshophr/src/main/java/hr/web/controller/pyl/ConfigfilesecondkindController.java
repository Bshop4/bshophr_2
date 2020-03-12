package hr.web.controller.pyl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigFileSecondKind;
import hr.service.ConfigFileSecondKindService;

@Controller
@RequestMapping("/pyl")
public class ConfigfilesecondkindController {
	@Autowired
	private ConfigFileSecondKindService  cfsks=null;
	
	@RequestMapping("/configfilesecondkind.do")
	public String selectSecondKind(@RequestParam String operate,Model model){
		switch(operate){
			case "list":List<ConfigFileSecondKind>secondlist=cfsks.findConfigFileSecondKindAll();
				int maxPage =0;
				int pageSize =1;
				int pageNo =1;
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("pageSize", pageSize);
				map.put("pageNo", pageNo);
				if(!secondlist.isEmpty()){
					maxPage=secondlist.size()%pageSize!=0?secondlist.size()/pageSize+1:secondlist.size()/pageSize;
				}
				secondlist=cfsks.findConfigFileSecondKindPage(map);
				model.addAttribute("list", secondlist);
				model.addAttribute("maxPage", maxPage);
				model.addAttribute("pageSize", pageSize);
				model.addAttribute("pageNo", pageNo);
				break;
			default:
				break;
		}
		
		return "forward:/second_kind.jsp";
	}
	
}
