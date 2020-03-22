package hr.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.pojo.HumanFile;

@Repository
public interface HumanFileMapper {

	public List<HumanFile> selectHumanFileAll(Map<String, Object> map);

	public List<HumanFile> selectHumanFileAll();

	public HumanFile selectHumanFileById(int id);

	// 向思宇加的用salary_standard_id查名字
	public HumanFile selectHumanNameFileById(int id);

	public boolean deleteHumanFileById(int id);

	public int insertHumanFile(HumanFile hf);

	public boolean updateHumanFile(HumanFile hf);
	
	public boolean updateHumanFileStatus(Map<String, Object> map);
	
	
	//
	public List<HumanFile> selectSplitByCS(Map<String, Object> map);
	public int selectCnt(int cs);
	public int selectCount(Map<String, Object> map);

	public HumanFile selectByHumanName(String humanName);
	
	public boolean updateHumanFileTwo(HumanFile hf);
}
