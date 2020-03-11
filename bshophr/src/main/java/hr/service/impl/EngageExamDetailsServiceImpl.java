package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageExamDetailsMapper;
import hr.pojo.EngageExamDetails;
import hr.service.EngageExamDetailsService;

@Service
public class EngageExamDetailsServiceImpl implements EngageExamDetailsService{
	
	@Autowired
	private EngageExamDetailsMapper eedm = null;

	@Override
	public boolean saveEngageExamDetails(EngageExamDetails eed) {
		// TODO Auto-generated method stub
		return eedm.insertEngageExamDetails(eed);
	}

	@Override
	public boolean removeEngageExamDetailsById(int id) {
		// TODO Auto-generated method stub
		return eedm.deleteEngageExamDetailsById(id);
	}

	@Override
	public boolean updateEngageExamDetails(EngageExamDetails eed) {
		// TODO Auto-generated method stub
		return eedm.updateEngageExamDetails(eed);
	}

	@Override
	public EngageExamDetails findEngageExamDetailsById(int id) {
		// TODO Auto-generated method stub
		return eedm.selectEngageExamDetailsById(id);
	}

	@Override
	public List<EngageExamDetails> findEngageExamDetailsAll() {
		// TODO Auto-generated method stub
		return eedm.selectEngageExamDetailsAll();
	}
	
	

}
