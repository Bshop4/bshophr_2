package hr.web.controller.djt;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import hr.pojo.HumanFile;
import hr.pojo.HumanFileDig;
import hr.service.HumanFileDigService;
import hr.service.HumanFileService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/registerChoosePicture")
public class DjtRegisterChoosePicture {
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@Autowired
	private HumanFileDigService humanFileDigService=null;
	
	@ResponseBody
	@RequestMapping("/pageJump.do")
	public int pageJump(@ModelAttribute HumanFile humanFile){
		humanFile.setCheckStatus((short)0);
		humanFileService.saveHumanFile(humanFile);
//		System.out.println("返回的主键=="+humanFile.getHufId());
		return humanFile.getHufId();
	}
	
	@ResponseBody
	@RequestMapping("/pageJumpToId.do")
	public String pageJumpToId(@ModelAttribute HumanFile humanFile){
		humanFile.setCheckStatus((short)1);
		boolean flag=humanFileService.updateHumanFile(humanFile);
		//主键
		int hufId=humanFile.getHufId();

		JSONObject json=JSONObject.fromObject(hufId);
		
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/pageJumpDigToId.do")
	public String pageJumpDigToId(@ModelAttribute HumanFileDig humanFileDig){
		boolean flag=humanFileDigService.saveHumanFileDig(humanFileDig);
		
		JSONObject json=JSONObject.fromObject(flag);
		return json.toString();
	}

	@ResponseBody
	@RequestMapping("/addHumanFilePhoto.do")
	public String fileUplod(@RequestParam String hufId,@RequestParam("djtFile") MultipartFile humanPhoto,HttpSession session){
		System.out.println("进来了");
		String path=session.getServletContext().getRealPath("/");
		System.out.println("文件类型:"+humanPhoto.getContentType());
		path="/registerPhoto/"+hufId+"."+humanPhoto.getContentType();
		String fileName=humanPhoto.getOriginalFilename();
		System.out.println(path);
		
		File dirFile = new File(path,fileName);
		try {
			humanPhoto.transferTo(dirFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
