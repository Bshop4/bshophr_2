package hr.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import hr.pojo.EngageMajorRelease;

public interface EngageMajorReleaseService {
	
	public boolean saveEngageMajorRelease(EngageMajorRelease emr);
	
	public boolean removeEngageMajorReleaseById(int id);
	
	public boolean updateEngageMajorRelease(EngageMajorRelease emr);
	
	public EngageMajorRelease findEngageMajorReleaseById(int id);
	
	public List<EngageMajorRelease> findEngageMajorReleaseAll();

	public int findCnt();
	
	public List<EngageMajorRelease> findSplit(Map<String,Object> map);
	
	public List<EngageMajorRelease> findEngageMajorReleaseAllByMajorKindName(String majorKindName);
	
	public List<EngageMajorRelease> findEngageMajorReleaseAllByMajorKindNameAndMajorName(String majorKindName,String majorName);

	public EngageMajorRelease findEngageMajorReleaseAllByMajorKindNameAndMajorNameAndEngageType(String majorKindName,String majorName,String engageType);
}
