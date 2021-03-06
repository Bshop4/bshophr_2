package hr.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageInterview;

@Repository
public interface EngageInterviewMapper {
	
	public boolean insertEngageInterview(EngageInterview ei);
	
	public boolean deleteEngageInterviewById(int id);
	
	public boolean updateEngageInterview(EngageInterview ei);
	
	public EngageInterview selectEngageInterviewById(int id);
	
	public List<EngageInterview> selectEngageInterviewAll();
	
	public List<EngageInterview> selectEngageInterviewAllByInterviewStatus(short is);

	public int selectCntByIS(short is);
	public List<EngageInterview> selectSplit(Map<String, Object> map);
	
	public int selectCntByCS(short cs);
	public List<EngageInterview> selectSplitTwo(Map<String, Object> map);
	

}
