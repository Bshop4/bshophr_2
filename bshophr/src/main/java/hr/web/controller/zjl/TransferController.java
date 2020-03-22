package hr.web.controller.zjl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.pojo.HumanFile;
import hr.service.HumanFileService;
import hr.service.MajorChangeService;

@Controller
@RequestMapping("/zjlTransfer")
public class TransferController {

	@Autowired
	private HumanFileService hfs = null;
	
	@Autowired
	private MajorChangeService mcs = null;
	
	
	
	@RequestMapping("/queryToList.do")
	public String queryToList(Model model,HttpServletRequest request){
		int maxPage =0;
		int sumNumber = hfs.findtCnt(1);//总个数
		int pageSize =1;
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
		map.put("cs", 1);
		//分页查询
		List<HumanFile> list = hfs.findSplitByCS(map);
		
		System.out.println(sumNumber);
		System.out.println(list.size());
		
		model.addAttribute("list", list);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("sumNumber", sumNumber);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageNo", pageNo);
		
		
		return "forward:/transfer_regist_list.jsp";
	}
	
	
	@RequestMapping("/{hufId}/queryOneHF.do")
	public String queryOneHF(Model model,@PathVariable("hufId") int hufId){
		HumanFile hf = hfs.findHumanFileById(hufId);
		
		
		
		return "forward:/transfer_regist.jsp";
	}
	
	
	
}
