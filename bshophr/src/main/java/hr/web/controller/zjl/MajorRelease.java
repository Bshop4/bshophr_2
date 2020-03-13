package hr.web.controller.zjl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.ConfigMajor;
import hr.pojo.EngageMajorRelease;
import hr.service.ConfigFileThirdKindService;
import hr.service.ConfigMajorService;
import hr.service.EngageMajorReleaseService;

@Repository
@RequestMapping("/zjlMajorRelease")
public class MajorRelease {
	
	@Autowired
	private ConfigMajorService cms = null;//职位类型和职位
	
	@Autowired
	private ConfigFileThirdKindService cftks = null;//三级机构表
	
	@Autowired
	private EngageMajorReleaseService emrs = null;//职位发布表
	
	@RequestMapping("/query.do")
	public String query(Model model){
		
		List<ConfigMajor> listConfigMajor = cms.findConfigMajorAll();
		
		for (ConfigMajor configMajor : listConfigMajor) {
			System.out.println(configMajor);
		}
		
		return "forward:/major_release.jsp";
	}
	
	@RequestMapping("/queryAll.do")
	public String queryAll(Model model){
		
		List<EngageMajorRelease> list = emrs.findEngageMajorReleaseAll();
		if(list.size() == 0){
			
			model.addAttribute("list", "0");
		}else{
			model.addAttribute("list", list);
		}
		
		return "forward:/major_list.jsp";
	}
	
	@RequestMapping("/{id}/delete.do")
	public String delete(@PathVariable("id") int id){
		
		emrs.removeEngageMajorReleaseById(id);
		
		return "redirect:/zjlMajorRelease/queryAll.do";
		
	}
	
	
}
