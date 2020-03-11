package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageMajorRelease;
import hr.pojo.EngageResume;

@Repository
public interface EngageResumeMapper {
	
	public boolean insertEngageResume(EngageResume emr);
	
	public boolean deleteEngageResumeById(int id);
	
	public boolean updateEngageResume(EngageResume emr);
	
	public EngageResume selectEngageResumeById(int id);
	
	public List<EngageResume> selectEngageResumeAll();

	

}
