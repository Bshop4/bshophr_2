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

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigProfessionDesign;
import hr.service.ConfigProfessionDesignService;

@Controller
@RequestMapping("/pyl")
public class ConfigprofessiondesignController {
	@Autowired
	private ConfigProfessionDesignService cpds=null;
	
	@RequestMapping("/configprofessiondesign.do")
	public String professionDesigncontroller(@RequestParam String operate,HttpServletRequest request,Model model){
		switch(operate){
			case "toAdd":
				return "forward:/profession_design_register.jsp";
			case "doDelete":
				cpds.removeConfigProfessionDesignById(Integer.parseInt(request.getParameter("id")));
				return "redirect:/pyl/configprofessiondesign.do?operate=list";
			case "list":
				selectPage(request, model, cpds);
				return "forward:/profession_design.jsp";
			
			default:
				break;
		}
		
		return "redirect:/pyl/configprofessiondesign.do?operate=list";
	}
	
	
	@RequestMapping("/configprofessiondesign/save.do")
	public String saveSecondKind(@RequestParam String professionDesignName){
		ConfigProfessionDesign cpd = new ConfigProfessionDesign();
		if(professionDesignName!=null && !"".equals(professionDesignName)){
			cpd.setProfessionDesignName(professionDesignName);
			cpds.saveConfigProfessionDesign(cpd);
		}else{
			return "redirect:/pyl/configprofessiondesign.do?operate=list";
		}
		
		return "redirect:/profession_design_register_success.jsp";
	}
	
	
	
	
	
	
	
	private void selectPage(HttpServletRequest request,Model model,ConfigProfessionDesignService service){
		int maxPage =0;
		int sumNumber =service.findConfigProfessionDesignMaxNum();//总个数
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
		List<ConfigProfessionDesign> list = 
				service.findConfigProfessionDesignByCondition(map);
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
	}
}
