package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.HumanFile;

public interface HumanFileService {
	public List<HumanFile> findHumanFileAll(Map<String, Object> map);
	public HumanFile findHumanFileById(int id);
	public boolean removeHumanFileById(int id);
	public boolean saveHumanFile(HumanFile hf);
	public boolean updateHumanFile(HumanFile hf);
}
