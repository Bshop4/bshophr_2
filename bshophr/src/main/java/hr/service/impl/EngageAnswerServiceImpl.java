package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageAnswerMapper;
import hr.pojo.EngageAnswer;
import hr.service.EngageAnswerService;

@Service
public class EngageAnswerServiceImpl implements EngageAnswerService{

	@Autowired
	private EngageAnswerMapper eam = null;
	
	
	@Override
	public boolean saveEngageAnswer(EngageAnswer ea) {
		// TODO Auto-generated method stub
		return eam.insertEngageAnswer(ea);
	}

	@Override
	public boolean removeEngageAnswerById(int id) {
		// TODO Auto-generated method stub
		return eam.deleteEngageAnswerById(id);
	}

	@Override
	public boolean updateEngageAnswer(EngageAnswer ea) {
		// TODO Auto-generated method stub
		return eam.updateEngageAnswer(ea);
	}

	@Override
	public EngageAnswer findEngageAnswerById(int id) {
		// TODO Auto-generated method stub
		return eam.selectEngageAnswerById(id);
	}

	@Override
	public List<EngageAnswer> findEngageAnswerAll() {
		// TODO Auto-generated method stub
		return eam.selectEngageAnswerAll();
	}

}
