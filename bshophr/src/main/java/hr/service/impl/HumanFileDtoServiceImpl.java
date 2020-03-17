package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.HumanFileDtoMapper;
import hr.pojo.HumanFile;
import hr.pojo.HumanFileDto;
import hr.service.HumanFileDtoService;
import hr.service.HumanFileService;

@Service
public class HumanFileDtoServiceImpl implements HumanFileDtoService{
	
	@Autowired
	private HumanFileDtoMapper humanFileDtoMapper=null;

	@Override
	public List<HumanFileDto> findHumanFileDtoAll(HumanFileDto humanFileDto) {
		// TODO Auto-generated method stub
		return humanFileDtoMapper.selectHumanFile(humanFileDto);
	}
	
	

}
