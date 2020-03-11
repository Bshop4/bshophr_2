package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageMajorRelease;

@Repository
public interface EngageMajorReleaseMapper {
	
	public boolean insertEngageMajorRelease(EngageMajorRelease emr);
	
	public boolean deleteEngageMajorReleaseById(int id);
	
	public boolean updateEngageMajorRelease(EngageMajorRelease emr);
	
	public EngageMajorRelease selectEngageMajorReleaseById(int id);
	
	public List<EngageMajorRelease> selectEngageMajorReleaseAll();

	

}