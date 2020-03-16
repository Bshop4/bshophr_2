package hr.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import hr.pojo.EngageMajorRelease;
import hr.pojo.EngageResume;

public interface EngageResumeService {
	
	public boolean saveEngageResume(EngageResume emr);
	
	public boolean removeEngageResumeById(int id);
	
	public boolean updateEngageResume(EngageResume emr);
	
	public EngageResume findEngageResumeById(int id);
	
	public List<EngageResume> findEngageResumeAll();

	public List<EngageResume> findAllByCondition(String humanMajorKindName,String humanMajorName,String keyWord);

	public int findCnt(Map<String,Object> map);
	
	public List<EngageMajorRelease> findSplit(Map<String,Object> map);
	
}
