package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.HumanFile;

public interface HumanFileService {

	public List<HumanFile> findHumanFileAll(Map<String, Object> map);

	public List<HumanFile> findHumanFileAll();

	public HumanFile findHumanFileById(int id);

	// 向思宇加的查humanName
	public HumanFile findHumanNameFileById(int id);

	public boolean removeHumanFileById(int id);

	public int saveHumanFile(HumanFile hf);

	public boolean updateHumanFile(HumanFile hf);
}
