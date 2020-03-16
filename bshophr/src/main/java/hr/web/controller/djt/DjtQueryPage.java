package hr.web.controller.djt;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigFileFirstKind;
import hr.service.HumanFileService;

@Controller
@RequestMapping("/djtQueryPage")
public class DjtQueryPage {

	@Autowired
	private HumanFileService humanFileService=null;
	
	@RequestMapping("/djtSearch.do")
	public String queryNeedThing(@RequestParam int djtJobClassSelect,
			@RequestParam int firstSelect,@RequestParam int secondSelect,
			@RequestParam int thirdSelect,@RequestParam int djtJobSelect,
			@RequestParam String dateStart,@RequestParam String dateEnd
	)
	{
		
		return "forward:/djtQueryPage.jsp";
	}
}
