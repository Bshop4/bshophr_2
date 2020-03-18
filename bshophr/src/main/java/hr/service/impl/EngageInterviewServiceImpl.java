package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageInterviewMapper;
import hr.pojo.EngageInterview;
import hr.service.EngageInterviewService;

@Service
public class EngageInterviewServiceImpl implements EngageInterviewService{
	
	@Autowired
	private EngageInterviewMapper eim = null;

	@Override
	public boolean saveEngageInterview(EngageInterview ei) {
		// TODO Auto-generated method stub
		return eim.insertEngageInterview(ei);
	}

	@Override
	public boolean removeEngageInterviewById(int id) {
		// TODO Auto-generated method stub
		return eim.deleteEngageInterviewById(id);
	}

	@Override
	public boolean updateEngageInterview(EngageInterview ei) {
		// TODO Auto-generated method stub
		return eim.updateEngageInterview(ei);
	}

	@Override
	public EngageInterview findEngageInterviewById(int id) {
		// TODO Auto-generated method stub
		return eim.selectEngageInterviewById(id);
	}

	@Override
	public List<EngageInterview> findEngageInterviewAll() {
		// TODO Auto-generated method stub
		return eim.selectEngageInterviewAll();
	}

	@Override
	public List<EngageInterview> findEngageInterviewAllByInterviewStatus(short is) {
		// TODO Auto-generated method stub
		return eim.selectEngageInterviewAllByInterviewStatus(is);
	}
	
	
	
	

}
