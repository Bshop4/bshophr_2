package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.HumanFile;
import hr.pojo.HumanFileDig;
@Repository
public interface HumanFileDigMapper {
	public List<HumanFileDig> selectHumanFileDigAll();
	public HumanFileDig selectHumanFileDigById(int id);
	public boolean deleteHumanFileDigById(int id);
	public boolean insertHumanFileDig(HumanFileDig hf);
	public boolean updateHumanFileDig(HumanFileDig hf);
}
