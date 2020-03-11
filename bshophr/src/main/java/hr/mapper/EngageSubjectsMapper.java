package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageMajorRelease;
import hr.pojo.EngageResume;
import hr.pojo.EngageSubjects;

@Repository
public interface EngageSubjectsMapper {
	
	public boolean insertEngageSubjects(EngageSubjects es);
	
	public boolean deleteEngageSubjectsById(int id);
	
	public boolean updateEngageSubjects(EngageSubjects es);
	
	public EngageSubjects selectEngageSubjectsById(int id);
	
	public List<EngageSubjects> selectEngageSubjectsAll();

	

}
