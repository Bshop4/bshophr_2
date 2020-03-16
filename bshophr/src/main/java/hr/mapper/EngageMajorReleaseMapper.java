package hr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import hr.pojo.EngageMajorRelease;

@Repository
public interface EngageMajorReleaseMapper {
	
	public boolean insertEngageMajorRelease(EngageMajorRelease emr);
	
	public boolean deleteEngageMajorReleaseById(int id);
	
	public boolean updateEngageMajorRelease(EngageMajorRelease emr);
	
	public EngageMajorRelease selectEngageMajorReleaseById(int id);
	
	public List<EngageMajorRelease> selectEngageMajorReleaseAll();

	public int selectCnt();
	
	public List<EngageMajorRelease> selectSplit(Map<String,Object> map);
	
	
	public List<EngageMajorRelease> selectEngageMajorReleaseAllByMajorKindName(String majorKindName);
	
	public List<EngageMajorRelease> selectEngageMajorReleaseAllByMajorKindNameAndMajorName(@Param("majorKindName")String majorKindName,
																						   @Param("majorName") String majorName);
	
	public EngageMajorRelease selectEngageMajorReleaseAllByMajorKindNameAndMajorNameAndEngageType(@Param("majorKindName")String majorKindName,
			@Param("majorName") String majorName,@Param("engageType") String engageType);
	

}
