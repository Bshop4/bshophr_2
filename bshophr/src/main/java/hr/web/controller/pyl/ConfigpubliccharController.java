package hr.web.controller.pyl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigMajor;
import hr.pojo.ConfigMajorKind;
import hr.pojo.ConfigPublicChar;
import hr.service.ConfigMajorService;
import hr.service.ConfigPublicCharService;

@Controller
@RequestMapping("/pyl")
public class ConfigpubliccharController {
	
	@Autowired
	private ConfigPublicCharService cpcs=null; 
	
	@RequestMapping("/configpublicchar.do")
	public String configpubliccharController(@RequestParam String operate,HttpServletRequest request,Model model){
		switch(operate){
			case "toAdd":
				return "forward:/public_char_register.jsp";
				
			case "doDelete":
				cpcs.removeConfigPublicCharById(Integer.parseInt(request.getParameter("id")));
				String dpage=request.getParameter("pageNo");
				return "redirect:/pyl/configpublicchar.do?operate=list&page="+dpage;
				
			case "list":
				selectPage(request, model, cpcs);
				return "forward:/public_char.jsp";
		
			default:
				break;
		}
		return "redirect:/pyl/configpublicchar.do?operate=list";
	}
	
	
	@RequestMapping("/configpublicchar/save.do")
	public String saveSecondKind(@RequestParam String attributeKind,@RequestParam String attributeName){
		if(attributeKind!=null && !"".equals(attributeKind)&&attributeName!=null &&!"".equals(attributeName)){
			ConfigPublicChar cpc=new ConfigPublicChar();
			cpc.setAttributeKind(attributeKind);
			cpc.setAttributeName(attributeName);
			cpcs.saveConfigPublicChar(cpc);
			
		}else{
			return "redirect:/pyl/configpublicchar.do?operate=list";
		}
		
		return "redirect:/public_char_register_success.jsp";
	}
	
	
	
	
	
	
	
	private void selectPage(HttpServletRequest request,Model model,ConfigPublicCharService service){
		int maxPage =0;
		int sumNumber =service.findConfigPublicCharMaxNum();//总个数
		int pageSize =5;
		int pageNo =1;
		//最大页数
		maxPage=sumNumber%pageSize!=0?sumNumber/pageSize+1:sumNumber/pageSize;
		
		String page=request.getParameter("page");
		if(page!=null && !"".equals(page)){
			try{
				pageNo=Integer.parseInt(page);
			}catch(NumberFormatException e){
				pageNo=1;
			}
			if(pageNo>maxPage){
				pageNo=maxPage;
			}else if(pageNo<1){
				pageNo=1;
			}
		}
		
		int currentPage=(pageNo-1)*pageSize;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pageSize", pageSize);
		map.put("currentPage", currentPage);
		//分页查询
		List<ConfigPublicChar> list = 
				service.findConfigPublicCharByConditionPlus(map);
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
	}
	
}
