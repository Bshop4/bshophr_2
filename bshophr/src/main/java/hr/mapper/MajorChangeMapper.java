package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.HumanFile;
import hr.pojo.MajorChange;
@Repository
public interface MajorChangeMapper {
	public List<MajorChange> selectMajorChangeAll();
	public MajorChange selectMajorChangeById(int id);
	public boolean deleteMajorChangeById(int id);
	public boolean insertMajorChange(MajorChange mc);
	public boolean updateMajorChange(MajorChange mc);
	
}
