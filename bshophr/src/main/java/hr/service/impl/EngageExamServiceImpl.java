package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageExamMapper;
import hr.pojo.EngageExam;
import hr.service.EngageExamService;

@Service
public class EngageExamServiceImpl implements EngageExamService{
	
	@Autowired
	private EngageExamMapper eem = null;

	@Override
	public boolean saveEngageExam(EngageExam ee) {
		// TODO Auto-generated method stub
		return eem.insertEngageExam(ee);
	}

	@Override
	public boolean removeEngageExamById(int id) {
		// TODO Auto-generated method stub
		return eem.deleteEngageExamById(id);
	}

	@Override
	public boolean updateEngageExam(EngageExam ee) {
		// TODO Auto-generated method stub
		return eem.updateEngageExam(ee);
	}

	@Override
	public EngageExam findEngageExamById(int id) {
		// TODO Auto-generated method stub
		return eem.selectEngageExamById(id);
	}

	@Override
	public List<EngageExam> findEngageExamAll() {
		// TODO Auto-generated method stub
		return eem.selectEngageExamAll();
	}
	
	
}
