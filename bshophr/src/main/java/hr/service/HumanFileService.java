package hr.service;

import java.util.List;

import hr.pojo.HumanFile;

public interface HumanFileService {
	public List<HumanFile> findHumanFileAll();
	public HumanFile findHumanFileById(int id);
	public boolean removeHumanFileById(int id);
	public boolean saveHumanFile(HumanFile hf);
	public boolean updateHumanFile(HumanFile hf);
}
