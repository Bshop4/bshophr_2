package hr.mapper;

import java.util.List;

import hr.pojo.HumanFile;
import hr.pojo.MajorChange;

public interface MajorChangeMapper {
	public List<MajorChange> selectMajorChangeAll();
	public MajorChange selectMajorChangeById(int id);
	public boolean deleteMajorChangeById(int id);
	public boolean insertMajorChange(MajorChange hf);
	public boolean updateMajorChange(MajorChange hf);
	
}
