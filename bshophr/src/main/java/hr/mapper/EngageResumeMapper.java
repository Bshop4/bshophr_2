package hr.mapper;

import java.sql.Timestamp;
import java.util.HashMap;
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

	public List<EngageResume> selectAllByCondition(Map<String, Object> map);
	
	public List<EngageResume> selectAllByConditionTow(Map<String, Object> map);
	public List<EngageResume> selectAllByConditionThree(Map<String, Object> map);
	
	
	
	/*public List<EngageResume> selectAllByCondition(@Param("humanMajorKindName") String humanMajorKindName,
			@Param("humanMajorName") String humanMajorName,
			@Param("keyWord") String keyWord,
			@Param("start") Timestamp start,
			@Param("end") Timestamp end);*/
	
	//public List<EngageResume> selectAllByCondition(Map<String, Object> map);
	
	public int selectCnt(Map<String,Object> map);
	
	public int selectCntByCondition(Map<String,Object> map);//
	public int selectAllByConditionCnt(Map<String,Object> map);//
	
	public List<EngageMajorRelease> selectSplit(Map<String,Object> map);
	
	
	
	

}
