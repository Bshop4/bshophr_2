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

@Controller
@RequestMapping("/pyl")
public class ConfigfilefirstkindController {
		@Autowired
		private ConfigFileFirstKindService cffks=null;
		
		@RequestMapping("/configfilefirstkind.do")
		public String findSecondKindPage(@RequestParam String operate,HttpServletRequest request,Model model){
			switch(operate){
				case "doDelete":
					cffks.removeConfigFileFirstKindById(Integer.parseInt(request.getParameter("id")));
					String dpage=request.getParameter("pageNo");
					return "redirect:/pyl/configfilefirstkind.do?operate=list&page="+dpage;
				case "toAdd":
					//查询所有的I级机构给II添加的时候提供选择，如果没有则跳到I机构添加
//					List<ConfigFileFirstKind> list =cffks.findConfigFileFirstKindAll(new HashMap<String, Object>());
//					if(list.isEmpty()){
//						return "redirect:/first_kind.jsp";
//					}
//					
//					model.addAttribute("fklist", list);
					return "forward:/first_kind_register.jsp";
					
					
				case "list":
					int maxPage =0;
					int sumNumber =cffks.findConfigFileFirstKindMaxNum();//总个数
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
					List<ConfigFileFirstKind> list = 
							cffks.findConfigFileFirstKindAll(map);
					
					model.addAttribute("list", list);
					model.addAttribute("maxPage", maxPage);
					model.addAttribute("sumNumber", sumNumber);
					model.addAttribute("pageSize", pageSize);
					model.addAttribute("pageNo", pageNo);
					return "forward:/first_kind.jsp";
					
					
				case "one":
					ConfigFileFirstKind cffk=cffks.findConfigFileFirstKindById(Integer.parseInt(request.getParameter("id")));
					model.addAttribute("obj", cffk);
					return "forward:/first_kind_change.jsp";
					
				case "update"://修改
					Map<String, Object> map1=new HashMap<String, Object>();
					map1.put("ffkId", Integer.parseInt(request.getParameter("id")));
					map1.put("firstKindSalaryId", request.getParameter("firstKindSalaryId"));
					map1.put("firstKindSaleId", request.getParameter("firstKindSaleId"));
					
					cffks.updateConfigFileFirstKind(map1);
					return "redirect:/first_kind_change_success.jsp";
				default:
					break;
			}
			return "forward:/first_kind.jsp";
		}
		
		
		@RequestMapping("/configfilefirstkind/save.do")
		public String saveFirstKind(@RequestParam String firstKindName,@RequestParam String firstKindSalaryId,@RequestParam String firstKindSaleId){
			
			ConfigFileFirstKind cffk = new ConfigFileFirstKind();
			cffk.setFirstKindName(firstKindName);
			cffk.setFirstKindSalaryId(firstKindSalaryId);
			cffk.setFirstKindSaleId(firstKindSaleId);
			//查询I级   下的  II级的MAX(second_kind_id) 
			String firstmax=cffks.findConfigFileFirstKindIdMax();
			if(firstmax!=null && !"".equals(firstmax)){
				cffk.setFirstKindId("0"+String.valueOf(Integer.parseInt(firstmax)+1));
			}else{
				cffk.setFirstKindId("01");
			}
			if(firstKindSaleId!=null && !"".equals(firstKindSaleId)){
				cffks.saveConfigFileFirstKind(cffk);
			}else{
				return "redirect:/pyl/configfilefirstkind.do?operate=list";
			}
			
			return "redirect:/first_kind_register_success.jsp";
		}
}
