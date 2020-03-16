package hr.web.controller.pyl;

import java.util.ArrayList;
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
import hr.pojo.ConfigFileThirdKind;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileSecondKindService;
import hr.service.ConfigFileThirdKindService;

@Controller
@RequestMapping("/pyl")
public class ConfigfilethirdkindController {
	
	@Autowired
	private ConfigFileThirdKindService cftks=null;
	
	@Autowired
	private ConfigFileSecondKindService  cfsks=null;
	
	@Autowired
	private ConfigFileFirstKindService cffks=null;
	
	
	@RequestMapping("/configfilethirdkind.do")
	public String findThirdKindPage(@RequestParam String operate,HttpServletRequest request,Model model){
		switch(operate){
			case "doDelete":
				cftks.removeConfigFileThirdKindById(Integer.parseInt(request.getParameter("id")));
				String dpage=request.getParameter("pageNo");
				return "redirect:/pyl/configfilethirdkind.do?operate=list&page="+dpage;
			case "toAdd":
				//查询所有的II级机构给III添加的时候提供选择，如果没有则跳到II机构添加
				List<ConfigFileSecondKind> list =cfsks.findConfigFileSecondKindAll(new HashMap<String, Object>());
				List<ConfigFileFirstKind> flist=cffks.findConfigFileFirstKindAll(new HashMap<String, Object>());
				if(list.isEmpty()){
					return "redirect:/second_kind.jsp";
				}
				
				
				
				model.addAttribute("fklist", list);
				model.addAttribute("falist", flist);
				return "forward:/third_kind_register.jsp";
				
				
			case "list":
				int maxPage =0;
				int sumNumber =cftks.findConfigFileThirdKindMaxNum();//总个数
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
				List<ConfigFileThirdKind> secondlist = 
						cftks.findConfigFileThirdKindAll(map);
				
				model.addAttribute("list", secondlist);
				model.addAttribute("maxPage", maxPage);
				model.addAttribute("sumNumber", sumNumber);
				model.addAttribute("pageSize", pageSize);
				model.addAttribute("pageNo", pageNo);
				return "forward:/third_kind.jsp";
				
			//取值一个	
			case "one":
				ConfigFileThirdKind cftk=cftks.findConfigFileThirdKindById(Integer.parseInt(request.getParameter("id")));
				model.addAttribute("obj", cftk);
				return "forward:/third_kind_change.jsp";
				
			case "update"://修改
				Map<String, Object> map1=new HashMap<String, Object>();
				map1.put("ftkId", Integer.parseInt(request.getParameter("id")));
				map1.put("thirdKindIsRetail", request.getParameter("thirdKindIsRetail"));
				map1.put("thirdKindSaleId", request.getParameter("thirdKindSaleId"));
				
				cftks.updateConfigFileThirdKindPlus(map1);
				return "redirect:/third_kind_change_success.jsp";
			default:
				break;
		}
		return "forward:/third_kind.jsp";
	}
	
	
	@RequestMapping("/configfilethirdkind/save.do")
	public String saveThirdKind(@RequestParam String firstKindNameAndId,@RequestParam String secondKindNameAndId,@RequestParam String thirdKindName,@RequestParam String thirdKindIsRetail,@RequestParam String thirdKindSaleId){
//		I级的名称 和 id
		String[] fni=firstKindNameAndId.split(",");
//		II级的名称 和 id
		String[] sni=secondKindNameAndId.split(",");
		
		ConfigFileThirdKind cftk = new ConfigFileThirdKind();
		cftk.setFirstKindName(fni[0]);
		cftk.setFirstKindId(fni[1]);
		cftk.setSecondKindName(sni[0]);
		cftk.setSecondKindId(sni[1]);
		cftk.setThirdKindName(thirdKindName);
		cftk.setThirdKindIsRetail(thirdKindIsRetail);
		cftk.setThirdKindSaleId(thirdKindSaleId);
		
		//查询I级  II级的  下的 IIIMAX(second_kind_id) 
		Map<String, Object> map2=new HashMap<String, Object>();
		map2.put("firstKindId", fni[1]);
		map2.put("secondKindId", sni[1]);
		
		//查询出thirdid数据库里的最大值
		String thirdmax=cftks.findConfigFileThirdKindIdMax(map2);
		
		if(thirdmax!=null && !"".equals(thirdmax)){
			cftk.setThirdKindId("0"+String.valueOf(Integer.parseInt(thirdmax)+1));
		}else{
			cftk.setThirdKindId("01");
		}
		if(thirdKindSaleId!=null && !"".equals(thirdKindSaleId)){
			cftks.saveConfigFileThirdKind(cftk);
		}else{
			return "redirect:/pyl/configfilesecondkind.do?operate=list";
		}
		
		return "redirect:/third_kind_register_success.jsp";
	}
	
}
