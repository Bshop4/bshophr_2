package hr.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.pojo.HumanFile;
@Repository
public interface HumanFileMapper {
	public List<HumanFile> selectHumanFileAll(Map<String, Object> map);
	public HumanFile selectHumanFileById(int id);
	public boolean deleteHumanFileById(int id);
	public boolean insertHumanFile(HumanFile hf);
	public boolean updateHumanFile(HumanFile hf);
	
}
