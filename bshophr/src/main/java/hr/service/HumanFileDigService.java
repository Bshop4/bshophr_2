package hr.service;

import java.util.List;

import hr.pojo.HumanFileDig;


public interface HumanFileDigService {
	public List<HumanFileDig> findHumanFileDigAll();
	public HumanFileDig findHumanFileDigById(int id);
	public boolean removeHumanFileDigById(int id);
	public boolean saveHumanFileDig(HumanFileDig hf);
	public boolean updateHumanFileDig(HumanFileDig hf);
}
