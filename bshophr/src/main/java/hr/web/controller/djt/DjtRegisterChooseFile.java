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
@RequestMapping("/registerChooseFile")
public class DjtRegisterChooseFile {
	
	@Autowired
	private HumanFileService humanFileService=null;
	
	@Autowired
	private HumanFileDigService humanFileDigService=null;
	
	@ResponseBody
	@RequestMapping("/addHumanFile.do")
	public boolean fileUplod(@RequestParam int djtZhujian,@RequestParam MultipartFile djtFile,HttpSession session){

		//获取文件的扩展名
		String fileName=djtFile.getOriginalFilename();
		String ext = FilenameUtils.getExtension(djtFile.getOriginalFilename());
		String path=session.getServletContext().getRealPath("/registerFile");
		System.out.println("文件类型:"+ext);
		path=path+"\\"+fileName+djtZhujian+"File."+ext;
		System.out.println(path);
		
		File dirFile = new File(path);
		try {
			djtFile.transferTo(dirFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//插入到数据库中
		HumanFile hf=humanFileService.findHumanFileById(djtZhujian);
		String savePath="registerFile/"+fileName+djtZhujian+"File."+ext;
		hf.setAttachmentName(savePath);
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
		boolean m=humanFileService.updateHumanFile(hf);
		return m;
	}
	
}
