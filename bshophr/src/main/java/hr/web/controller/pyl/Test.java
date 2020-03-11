package hr.web.controller.pyl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.Users;
import hr.service.EngageSubjectsService;
import hr.service.UsersService;

@Controller
public class Test {
	@Autowired
	private UsersService ess=null;
	
	@RequestMapping("/test.do")
	public String select(){
		Users u=ess.findUsersById(1);
		System.out.println(u.getUTrueName());
		return null;
	}
	
}
