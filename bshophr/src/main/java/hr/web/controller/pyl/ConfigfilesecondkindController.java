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
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileSecondKindService;

@Controller
@RequestMapping("/pyl")
public class ConfigfilesecondkindController {
	@Autowired
	private ConfigFileSecondKindService  cfsks=null;
	
	@Autowired
	private ConfigFileFirstKindService cffks=null;
	
	
	@RequestMapping("/configfilesecondkind.do")
	public String findSecondKindPage(@RequestParam String operate,HttpServletRequest request,Model model){
		switch(operate){
			case "doDelete":
				cfsks.removeConfigFileSecondKindById(Integer.parseInt(request.getParameter("id")));
				return "redirect:/pyl/configfilesecondkind.do?operate=list";
			case "toAdd":
				//查询所有的I级机构给II添加的时候提供选择，如果没有则跳到I机构添加
				List<ConfigFileFirstKind> list =cffks.findConfigFileFirstKindAll();
				if(list.isEmpty()){
					return "redirect:/first_kind.jsp";
				}
				
				model.addAttribute("fklist", list);
				return "forward:/second_kind_register.jsp";
				
				
			case "list":
				int maxPage =0;
				int sumNumber =cfsks.findConfigFileSecondKindMaxNum();//总个数
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
				List<ConfigFileSecondKind> secondlist = 
						cfsks.findConfigFileSecondKindAll(map);
				
				model.addAttribute("list", secondlist);
				model.addAttribute("maxPage", maxPage);
				model.addAttribute("sumNumber", sumNumber);
				model.addAttribute("pageSize", pageSize);
				model.addAttribute("pageNo", pageNo);
				return "forward:/second_kind.jsp";
			default:
				break;
		}
		return "forward:/second_kind.jsp";
	}
	
	
	@RequestMapping("/configfilesecondkind/save.do")
	public String saveSecondKind(@RequestParam String firstKindNameAndId,@RequestParam String secondKindName,@RequestParam String secondKindSalaryId,@RequestParam String secondKindSaleId){
		//I级的名称 和 id
		String[] sp=firstKindNameAndId.split(",");
		
		ConfigFileSecondKind cfsk = new ConfigFileSecondKind();
		cfsk.setFirstKindName(sp[0]);
		cfsk.setFirstKindId(sp[1]);
		cfsk.setSecondKindName(secondKindName);
		cfsk.setSecondSalaryId(secondKindSalaryId);
		cfsk.setSecondSaleId(secondKindSaleId);
		//查询I级   下的  II级的MAX(second_kind_id) 
		String secondmax=cfsks.findConfigFileSecondKindIdMax(sp[1]);
		if(secondmax!=null && !"".equals(secondmax)){
			cfsk.setSecondKindId("0"+String.valueOf(Integer.parseInt(secondmax)+1));
		}else{
			cfsk.setSecondKindId("01");
		}
		if(secondKindSalaryId!=null && !"".equals(secondKindSalaryId)&&secondKindSaleId!=null && !"".equals(secondKindSaleId)){
			cfsks.saveConfigFileSecondKind(cfsk);
		}else{
			return "redirect:/pyl/configfilesecondkind.do?operate=list";
		}
		
		return "redirect:/second_kind_register_success.jsp";
	}
	
	
	
	
	
	
	
}
