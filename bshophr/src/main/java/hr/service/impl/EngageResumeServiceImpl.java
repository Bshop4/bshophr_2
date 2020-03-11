package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageResumeMapper;
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
	
	
	
}
