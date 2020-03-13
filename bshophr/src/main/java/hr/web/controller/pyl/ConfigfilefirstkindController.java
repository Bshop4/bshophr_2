package hr.web.controller.pyl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.ConfigFileFirstKind;
import hr.service.ConfigFileFirstKindService;

@Controller
@RequestMapping("/pyl")
public class ConfigfilefirstkindController {
		@Autowired
		private ConfigFileFirstKindService cffks=null;
		
		
		//查询所有的I级机构给II添加的时候提供选择，如果没有则跳到I机构添加
		@RequestMapping("/configfilefirstkind/alltosecond.do")
		public String findFirstKindAll(Model model){
			List<ConfigFileFirstKind> list =cffks.findConfigFileFirstKindAll();
			if(list.isEmpty()){
				return "redirect:/first_kind.jsp";
			}
			
			model.addAttribute("fklist", list);
			return "forward:/second_kind_register.jsp";
		}
}
