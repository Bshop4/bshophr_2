package hr.service;

import java.util.List;
import hr.pojo.EngageMajorRelease;

public interface EngageMajorReleaseService {
	
	public boolean saveEngageMajorRelease(EngageMajorRelease emr);
	
	public boolean removeEngageMajorReleaseById(int id);
	
	public boolean updateEngageMajorRelease(EngageMajorRelease emr);
	
	public EngageMajorRelease findEngageMajorReleaseById(int id);
	
	public List<EngageMajorRelease> findEngageMajorReleaseAll();

	

}
