package hr.web.controller.pyl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.mapper.ConfigPrimaryKeyMapper;
import hr.pojo.ConfigPrimaryKey;
import hr.service.ConfigPrimaryKeyService;

@Controller
public class PylController {
	@Autowired
	private ConfigPrimaryKeyService cp=null;
	 
	@RequestMapping("/pyltest.do")
	public String find(){
		ConfigPrimaryKey vp=cp.findConfigPrimaryKeyById(1);
		System.out.println(vp.getKeyName());
		return null;
	}
}
