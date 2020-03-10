package hr.mapper;

import java.util.List;

import hr.pojo.HumanFile;
import hr.pojo.HumanFileDig;

public interface HumanFileMapperDig {
	public List<HumanFileDig> selectHumanFileDigAll();
	public HumanFileDig selectHumanFileDigById(int id);
	public boolean deleteHumanFileDigById(int id);
	public boolean insertHumanFileDig(HumanFile hf);
	public boolean updateHumanFileDig(HumanFile hf);
}
