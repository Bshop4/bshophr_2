package hr.service;

import java.util.List;

import hr.pojo.EngageResume;

public interface EngageResumeService {
	
	public boolean saveEngageResume(EngageResume emr);
	
	public boolean removeEngageResumeById(int id);
	
	public boolean updateEngageResume(EngageResume emr);
	
	public EngageResume findEngageResumeById(int id);
	
	public List<EngageResume> findEngageResumeAll();

	

}
