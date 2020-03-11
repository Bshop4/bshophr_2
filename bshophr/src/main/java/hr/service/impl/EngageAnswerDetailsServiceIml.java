package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.EngageAnswerDetailsMapper;
import hr.pojo.EngageAnswerDetails;
import hr.service.EngageAnswerDetailsService;

@Service
public class EngageAnswerDetailsServiceIml implements EngageAnswerDetailsService{

	@Autowired
	private EngageAnswerDetailsMapper eadm = null;
	
	
	@Override
	public boolean saveEngageAnswerDetails(EngageAnswerDetails ead) {
		// TODO Auto-generated method stub
		return eadm.insertEngageAnswerDetails(ead);
	}

	@Override
	public boolean removeEngageAnswerDetailsById(int id) {
		// TODO Auto-generated method stub
		return eadm.deleteEngageAnswerDetailsById(id);
	}

	@Override
	public boolean updateEngageAnswerDetails(EngageAnswerDetails ead) {
		// TODO Auto-generated method stub
		return eadm.updateEngageAnswerDetails(ead);
	}

	@Override
	public EngageAnswerDetails findEngageAnswerDetailsById(int id) {
		// TODO Auto-generated method stub
		return eadm.selectEngageAnswerDetailsById(id);
	}

	@Override
	public List<EngageAnswerDetails> findEngageAnswerDetailsAll() {
		// TODO Auto-generated method stub
		return eadm.selectEngageAnswerDetailsAll();
	}

}
