package hr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import hr.pojo.EngageMajorRelease;
import hr.pojo.EngageResume;

@Repository
public interface EngageResumeMapper {
	
	public boolean insertEngageResume(EngageResume emr);
	
	public boolean deleteEngageResumeById(int id);
	
	public boolean updateEngageResume(EngageResume emr);
	
	public EngageResume selectEngageResumeById(int id);
	
	public List<EngageResume> selectEngageResumeAll();

	public List<EngageResume> selectAllByCondition(@Param("humanMajorKindName") String humanMajorKindName,
			@Param("humanMajorName") String humanMajorName,
			@Param("keyWord") String keyWord);
	
	
	public int selectCnt(Map<String,Object> map);
	
	public List<EngageMajorRelease> selectSplit(Map<String,Object> map);
	
	

}
