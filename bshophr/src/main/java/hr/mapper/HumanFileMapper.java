package hr.mapper;

import java.util.List;

import hr.pojo.HumanFile;

public interface HumanFileMapper {
	public List<HumanFile> selectHumanFileAll();
	public HumanFile selectHumanFileById(int id);
	public boolean deleteHumanFileById(int id);
	public boolean insertHumanFile(HumanFile hf);
	public boolean updateHumanFile(HumanFile hf);
	
}
