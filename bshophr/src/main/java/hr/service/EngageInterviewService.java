package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.EngageInterview;

public interface EngageInterviewService {
	
	public boolean saveEngageInterview(EngageInterview ei);
	
	public boolean removeEngageInterviewById(int id);
	
	public boolean updateEngageInterview(EngageInterview ei);
	
	public EngageInterview findEngageInterviewById(int id);
	
	public List<EngageInterview> findEngageInterviewAll();

	public List<EngageInterview> findEngageInterviewAllByInterviewStatus(short is);
	
	public int findCntByIS(short is);
	public List<EngageInterview> finSplit(Map<String, Object> map);
	
	public int findCntByCS(short cs);
	public List<EngageInterview> findSplitTwo(Map<String, Object> map);

}
