package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageMajorReleaseMapper;
import hr.pojo.EngageMajorRelease;
import hr.service.EngageMajorReleaseService;

@Service
public class EngageMajorReleaseServiceImpl implements EngageMajorReleaseService{

	
	@Autowired
	private EngageMajorReleaseMapper emm = null;

	@Override
	public boolean saveEngageMajorRelease(EngageMajorRelease emr) {
		// TODO Auto-generated method stub
		return emm.insertEngageMajorRelease(emr);
	}

	@Override
	public boolean removeEngageMajorReleaseById(int id) {
		// TODO Auto-generated method stub
		return emm.deleteEngageMajorReleaseById(id);
	}

	@Override
	public boolean updateEngageMajorRelease(EngageMajorRelease emr) {
		// TODO Auto-generated method stub
		return emm.updateEngageMajorRelease(emr);
	}

	@Override
	public EngageMajorRelease findEngageMajorReleaseById(int id) {
		// TODO Auto-generated method stub
		return emm.selectEngageMajorReleaseById(id);
	}

	@Override
	public List<EngageMajorRelease> findEngageMajorReleaseAll() {
		// TODO Auto-generated method stub
		return emm.selectEngageMajorReleaseAll();
	}

	@Override
	public int findCnt() {
		// TODO Auto-generated method stub
		return emm.selectCnt();
	}

	@Override
	public List<EngageMajorRelease> findSplit(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return emm.selectSplit(map);
	}

	@Override
	public List<EngageMajorRelease> findEngageMajorReleaseAllByMajorKindName(String majorKindName) {
		// TODO Auto-generated method stub
		return emm.selectEngageMajorReleaseAllByMajorKindName(majorKindName);
	}

	@Override
	public List<EngageMajorRelease> findEngageMajorReleaseAllByMajorKindNameAndMajorName(String majorKindName,
			String majorName) {
		// TODO Auto-generated method stub
		return emm.selectEngageMajorReleaseAllByMajorKindNameAndMajorName(majorKindName, majorName);
	}
	
	@Override
	public EngageMajorRelease findEngageMajorReleaseAllByMajorKindNameAndMajorNameAndEngageType(
			String majorKindName, String majorName, String engageType) {
		// TODO Auto-generated method stub
		return emm.selectEngageMajorReleaseAllByMajorKindNameAndMajorNameAndEngageType(majorKindName, majorName, engageType);
	}
	
	
}
