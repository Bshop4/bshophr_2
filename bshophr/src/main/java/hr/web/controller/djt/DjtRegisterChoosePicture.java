package hr.web.controller.djt;

import java.io.File;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
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
		humanFile.setHumanFileStatus((short)1);
		humanFileService.saveHumanFile(humanFile);
//		System.out.println("返回的主键=="+humanFile.getHufId());
		return humanFile.getHufId();
	}
	
	@ResponseBody
	@RequestMapping("/pageJumpToId.do")
	public String pageJumpToId(@ModelAttribute HumanFile humanFile){
		humanFile.setCheckStatus((short)1);
		humanFile.setHumanFileStatus((short)1);
		boolean flag=humanFileService.updateHumanFile(humanFile);
		//主键
		int hufId=humanFile.getHufId();

		JSONObject json=JSONObject.fromObject(hufId);
		
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/updateToId.do")
	public boolean updateToId(@ModelAttribute HumanFile humanFile){
		humanFile.setCheckStatus((short)1);
		humanFile.setHumanFileStatus((short)1);
		boolean flag=humanFileService.updateHumanFile(humanFile);
		
		return flag;
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
	public boolean fileUplod(@RequestParam("djtZhujian") int djtZhujian,@RequestParam("djtFile") MultipartFile humanPhoto,HttpSession session){

		//获取文件的扩展名
		String ext = FilenameUtils.getExtension(humanPhoto.getOriginalFilename());
		String path=session.getServletContext().getRealPath("/registerPhoto");
		System.out.println("文件类型:"+ext);
		path=path+"\\"+djtZhujian+"."+ext;
		System.out.println(path);
		
		File dirFile = new File(path);
		try {
			humanPhoto.transferTo(dirFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//插入到数据库中
		HumanFile hf=humanFileService.findHumanFileById(djtZhujian);
		String savePath="registerPhoto/"+djtZhujian+"."+ext;
		hf.setHumanPicture(savePath);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date=df.format(new Date());
		Date d=null;
		try {
			d=df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hf.setRegistTime(new java.sql.Date(d.getTime()));
		if(hf.getHumanId()==null){
			hf.setHumanId(String.valueOf(djtZhujian));
		}
		
		boolean m=humanFileService.updateHumanFile(hf);
		return m;
	}
	
}
