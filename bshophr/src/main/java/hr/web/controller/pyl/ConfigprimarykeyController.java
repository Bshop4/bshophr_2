package hr.web.controller.pyl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PUT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigPrimaryKey;
import hr.pojo.ConfigPublicChar;
import hr.service.ConfigPrimaryKeyService;
import hr.service.ConfigPublicCharService;

@Controller
@RequestMapping("/pyl")
public class ConfigprimarykeyController {
	@Autowired
	private ConfigPrimaryKeyService cpks=null;
	
	@RequestMapping("/configprimarykey.do")
	public String configprimarykeyController(@RequestParam String operate,HttpServletRequest request,Model model){
		switch(operate){
//		case "toAdd":
//			return "forward:/public_char_register.jsp";
			
//		case "doDelete":
//			cpcs.removeConfigPublicCharById(Integer.parseInt(request.getParameter("id")));
//			String dpage=request.getParameter("pageNo");
//			return "redirect:/pyl/configpublicchar.do?operate=list&page="+dpage;
		case "doRegister":
			String strid=request.getParameter("lists");
			String[] strarrid=strid.split(",");
			List<Integer> listid=new ArrayList<Integer>();
			for (int i = 0; i < strarrid.length; i++) {
				listid.add(Integer.valueOf(strarrid[i]));
			}
			Map<String,Object> map1=new HashMap<String, Object>();
			map1.put("primaryKeyTable", request.getParameter("primaryKeyTable"));
			cpks.updateConfigPrimaryKeyPlus(map1);
			cpks.updateConfigPrimaryKeyStatus(listid);
			return "redirect:/register_success.jsp";
		case "list":
			selectPage(request, model, cpks);
			return "forward:/primary_key_register.jsp";
	
		default:
			break;
	}
	return "redirect:/pyl/configpublicchar.do?operate=list";
}

	
//	@RequestMapping("/configpublicchar/save.do")
//	public String saveSecondKind(@RequestParam String attributeKind,@RequestParam String attributeName){
//		if(attributeKind!=null && !"".equals(attributeKind)&&attributeName!=null &&!"".equals(attributeName)){
//			ConfigPublicChar cpc=new ConfigPublicChar();
//			cpc.setAttributeKind(attributeKind);
//			cpc.setAttributeName(attributeName);
//			cpcs.saveConfigPublicChar(cpc);
//			
//		}else{
//			return "redirect:/pyl/configpublicchar.do?operate=list";
//		}
//		
//		return "redirect:/public_char_register_success.jsp";
//	}






	
	private void selectPage(HttpServletRequest request,Model model,ConfigPrimaryKeyService service){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("primaryKeyTable",request.getParameter("primaryKeyTable"));
		List<ConfigPrimaryKey> list=service.findConfigPrimaryKeyAllPlus(map);
		model.addAttribute("list",list);
	}
		
	
	
}
