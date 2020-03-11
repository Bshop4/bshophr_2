package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.SalaryGrantDetailsMapper;
import hr.pojo.SalaryGrantDetails;
import hr.service.SalaryGrantDetailsService;

@Service
public class SalaryGrantDetailsServiceImpl implements SalaryGrantDetailsService{
	
	@Autowired
	private SalaryGrantDetailsMapper salaryGrantDetailsMapper=null;
	
	@Override
	public List<SalaryGrantDetails> findSalaryGrantDetailsAll() {
		// TODO Auto-generated method stub
		List<SalaryGrantDetails> list=salaryGrantDetailsMapper.selectSalaryGrantDetailsAll();
		return list;
	}

	@Override
	public SalaryGrantDetails findSalaryGrantDetailsById(int id) {
		// TODO Auto-generated method stub
		SalaryGrantDetails SalaryGrantDetails=salaryGrantDetailsMapper.selectSalaryGrantDetailsById(id);
		return SalaryGrantDetails;
	}

	@Override
	public boolean removeSalaryGrantDetailsById(int id) {
		// TODO Auto-generated method stub
		boolean flag=salaryGrantDetailsMapper.deleteSalaryGrantDetailsById(id);
		
		return flag;
	}

	@Override
	public boolean saveSalaryGrantDetails(SalaryGrantDetails salaryGrantDetails) {
		// TODO Auto-generated method stub
		boolean flag=salaryGrantDetailsMapper.insertSalaryGrantDetails(salaryGrantDetails);
		return flag;
	}

	@Override
	public boolean updateSalaryGrantDetails(SalaryGrantDetails salaryGrantDetails) {
		// TODO Auto-generated method stub
		boolean flag=salaryGrantDetailsMapper.updateSalaryGrantDetails(salaryGrantDetails);
		return flag;
	}

}
