package hr.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageResumeMapper;
import hr.pojo.EngageMajorRelease;
import hr.pojo.EngageResume;
import hr.service.EngageResumeService;

@Service
public class EngageResumeServiceImpl implements EngageResumeService{
	
	@Autowired
	private EngageResumeMapper erm = null;

	@Override
	public boolean saveEngageResume(EngageResume emr) {
		// TODO Auto-generated method stub
		return erm.insertEngageResume(emr);
	}

	@Override
	public boolean removeEngageResumeById(int id) {
		// TODO Auto-generated method stub
		return erm.deleteEngageResumeById(id);
	}

	@Override
	public boolean updateEngageResume(EngageResume emr) {
		// TODO Auto-generated method stub
		return erm.updateEngageResume(emr);
	}

	@Override
	public EngageResume findEngageResumeById(int id) {
		// TODO Auto-generated method stub
		return erm.selectEngageResumeById(id);
	}

	@Override
	public List<EngageResume> findEngageResumeAll() {
		// TODO Auto-generated method stub
		return erm.selectEngageResumeAll();
	}

	

	@Override
	public int findCnt(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return erm.selectCnt(map);
	}

	@Override
	public List<EngageMajorRelease> findSplit(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return erm.selectSplit(map);
	}

	@Override
	public List<EngageResume> findAllByCondition(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return erm.selectAllByCondition(map);
	}

	

	@Override
	public List<EngageResume> findAllByConditionTow(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return erm.selectAllByConditionTow(map);
	}
	
	@Override
	public List<EngageResume> findAllByConditionThree(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return erm.selectAllByConditionThree(map);
	}
	
	@Override
	public int findCntByCondition(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return erm.selectCntByCondition(map);
	}
	
	
	@Override
	public int findAllByConditionCnt(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return erm.selectAllByConditionCnt(map);
	}
	
	
}
