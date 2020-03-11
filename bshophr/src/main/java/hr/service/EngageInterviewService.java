package hr.service;

import java.util.List;

import hr.pojo.EngageInterview;

public interface EngageInterviewService {
	
	public boolean saveEngageInterview(EngageInterview ei);
	
	public boolean removeEngageInterviewById(int id);
	
	public boolean updateEngageInterview(EngageInterview ei);
	
	public EngageInterview findEngageInterviewById(int id);
	
	public List<EngageInterview> findEngageInterviewAll();

	

}
