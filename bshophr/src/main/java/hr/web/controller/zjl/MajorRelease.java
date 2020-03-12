package hr.web.controller.zjl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;

@Repository
@RequestMapping("/zjlMajorRelease")
public class MajorRelease {
	
	@Autowired
	private ConfigMajorService cms = null;//职位类型和职位
	
	@Autowired
	private ConfigFileThirdKindService cftks = null;//三级机构表
	
//	@Autowired
//	private EngageMajorReleaseService emrs = null;//
	
	@RequestMapping("/query.do")
	public String query(Model model){
		
		
		
		
		
		return "forward:/major_release.jsp";
	}
	
	
	
}
