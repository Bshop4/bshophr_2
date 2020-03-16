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

import hr.pojo.ConfigMajorKind;
import hr.pojo.ConfigProfessionDesign;
import hr.service.ConfigMajorKindService;
import hr.service.ConfigProfessionDesignService;

@Controller
@RequestMapping("/pyl")
public class ConfigmajorkindController {
	@Autowired
	private ConfigMajorKindService cmks=null;
	
	@RequestMapping("/configmajorkind.do")
	public String configmajorkindController(@RequestParam String operate,HttpServletRequest request,Model model){
		switch(operate){
			case "toAdd":
				return "forward:/major_kind_register.jsp";
			case "doDelete":
				cmks.removeConfigMajorKindById(Integer.parseInt(request.getParameter("id")));
				String dpage=request.getParameter("pageNo");
				return "redirect:/pyl/configmajorkind.do?operate=list&page="+dpage;
			case "list":
				selectPage(request, model, cmks);
				return "forward:/major_kind.jsp";
		
			default:
				break;
		}
	
		return "redirect:/pyl/configmajorkind.do?operate=list";
	}


	@RequestMapping("/configmajorkind/save.do")
	public String saveSecondKind(@RequestParam String majorKindName){
		ConfigMajorKind cmk=new ConfigMajorKind();
		if(majorKindName!=null && !"".equals(majorKindName)){
			cmk.setMajorKindName(majorKindName);
			
			//查询最大id
			String kindmax=cmks.findConfigMajorKindIdMax();
			if(kindmax!=null && !"".equals(kindmax)){
				cmk.setMajorKindId("0"+String.valueOf(Integer.parseInt(kindmax)+1));
			}else{
				cmk.setMajorKindId("01");
			}
			cmks.saveConfigMajorKind(cmk);
			
		}else{
			return "redirect:/pyl/configmajorkind.do?operate=list";
		}
		
		return "redirect:/major_kind_register_success.jsp";
	}







	private void selectPage(HttpServletRequest request,Model model,ConfigMajorKindService service){
		int maxPage =0;
		int sumNumber =service.findConfigMajorKindMaxNum();//总个数
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
		List<ConfigMajorKind> list = 
				service.findConfigMajorKindByCondition(map);
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
	}
}
