package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.HumanFile;
import hr.pojo.HumanFileDto;

@Repository
public interface HumanFileDtoMapper{
	public List<HumanFileDto> selectHumanFile(HumanFileDto humanFileDto);
}
