package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageSubjectsMapper;
import hr.pojo.EngageSubjects;
import hr.service.EngageSubjectsService;

@Service
public class EngageSubjectsServiceImpl implements EngageSubjectsService{
	
	@Autowired
	private EngageSubjectsMapper esm = null;

	@Override
	public boolean saveEngageSubjects(EngageSubjects es) {
		// TODO Auto-generated method stub
		return esm.insertEngageSubjects(es);
	}

	@Override
	public boolean removeEngageSubjectsById(int id) {
		// TODO Auto-generated method stub
		return esm.deleteEngageSubjectsById(id);
	}

	@Override
	public boolean updateEngageSubjects(EngageSubjects es) {
		// TODO Auto-generated method stub
		return esm.updateEngageSubjects(es);
	}

	@Override
	public EngageSubjects findEngageSubjectsById(int id) {
		// TODO Auto-generated method stub
		return esm.selectEngageSubjectsById(id);
	}

	@Override
	public List<EngageSubjects> findEngageSubjectsAll() {
		// TODO Auto-generated method stub
		return esm.selectEngageSubjectsAll();
	}
	
	

}
