package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageInterview;

@Repository
public interface EngageInterviewMapper {
	
	public boolean insertEngageInterview(EngageInterview ei);
	
	public boolean deleteEngageInterviewById(int id);
	
	public boolean updateEngageInterview(EngageInterview ei);
	
	public EngageInterview selectEngageInterviewById(int id);
	
	public List<EngageInterview> selectEngageInterviewAll();

	

}
