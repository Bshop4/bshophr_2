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
import hr.service.ConfigMajorKindService;
import hr.service.ConfigMajorService;

@Controller
@RequestMapping("/pyl")
public class ConfigmajorController {
	@Autowired
	private ConfigMajorService cms=null;
	
	@Autowired
	private ConfigMajorKindService cmks=null;
	
	@RequestMapping("/configmajor.do")
	public String configmajorcontroller(@RequestParam String operate,HttpServletRequest request,Model model){
		switch(operate){
			case "toAdd":
				//查询所有的职位分类
				List<ConfigMajorKind> mklist= cmks.findConfigMajorKindAll();
				model.addAttribute("mklist",mklist);
				return "forward:/major_register.jsp";
				
			case "doDelete":
				cms.removeConfigMajorById(Integer.parseInt(request.getParameter("id")));
				String dpage=request.getParameter("pageNo");
				return "redirect:/pyl/configmajor.do?operate=list&page="+dpage;
				
			case "list":
				selectPage(request, model, cms);
				return "forward:/major.jsp";
		
			default:
				break;
		}
		return "redirect:/pyl/configmajor.do?operate=list";
	}
	
	
	@RequestMapping("/configmajor/save.do")
	public String saveSecondKind(@RequestParam String majorKindNameAndId,@RequestParam String majorName){
		if(majorKindNameAndId!=null && !"".equals(majorKindNameAndId)&&majorName!=null &&!"".equals(majorName)){
			String[] mkni=majorKindNameAndId.split(",");
			ConfigMajor cm=new ConfigMajor();
			cm.setMajorKindId(mkni[1]);
			cm.setMajorKindName(mkni[0]);
			cm.setMajorName(majorName);
			cm.setTestAmount((short)0);
			//查询最大id
			String kindmax=cms.findConfigMajorIdMax(mkni[1]);
			if(kindmax!=null && !"".equals(kindmax)){
				cm.setMajorId("0"+String.valueOf(Integer.parseInt(kindmax)+1));
			}else{
				cm.setMajorId("01");
			}
			cms.saveConfigMajor(cm);
			
		}else{
			return "redirect:/pyl/configmajor.do?operate=list";
		}
		
		return "redirect:/major_register_success.jsp";
	}







	private void selectPage(HttpServletRequest request,Model model,ConfigMajorService service){
		int maxPage =0;
		int sumNumber =service.findConfigMajorMaxNum();//总个数
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
		List<ConfigMajor> list = 
				service.findConfigMajorSelect(map);
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
	}
	
}
