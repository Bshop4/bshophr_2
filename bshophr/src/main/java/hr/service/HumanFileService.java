package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.HumanFile;

public interface HumanFileService {

	public List<HumanFile> findHumanFileAll(Map<String, Object> map);

	public List<HumanFile> findHumanFileAll();

	public HumanFile findHumanFileById(int id);
	
	public int findCount(Map<String, Object> map);

	// 向思宇加的查humanName
	public HumanFile findHumanNameFileById(int id);

	public boolean removeHumanFileById(int id);

	public int saveHumanFile(HumanFile hf);

	public boolean updateHumanFile(HumanFile hf);
	
	public boolean updateHumanFileStatus(Map<String, Object> map);
	
	
	
	//
	public List<HumanFile>  findSplitByCS(Map<String, Object> map);
	public int findtCnt(int cs);
	public HumanFile findByHumanName(String humanName);
	public boolean updateHumanFileTwo(HumanFile hf);
	public HumanFile findByHumanId(String humanId);
}
