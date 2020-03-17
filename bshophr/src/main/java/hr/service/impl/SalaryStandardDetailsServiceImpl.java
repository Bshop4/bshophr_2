package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.SalaryStandardDetailsMapper;
import hr.pojo.SalaryStandardDetails;
import hr.service.SalaryStandardDetailsService;

@Service
public class SalaryStandardDetailsServiceImpl implements SalaryStandardDetailsService {

	@Autowired
	private SalaryStandardDetailsMapper salaryStandardDetailsMapper = null;

	@Override
	public List<SalaryStandardDetails> findSalaryStandardDetailsAll() {
		// TODO Auto-generated method stub
		List<SalaryStandardDetails> list = salaryStandardDetailsMapper.selectSalaryStandardDetailsAll();
		return list;
	}

	@Override
	public List<SalaryStandardDetails> findSalaryStandardDetailsById(int id) {
		List<SalaryStandardDetails> list = salaryStandardDetailsMapper.selectSalaryStandardDetailsById(id);
		return list;
	}

	@Override
	public boolean removeSalaryStandardDetailsById(int id) {
		// TODO Auto-generated method stub
		boolean flag = salaryStandardDetailsMapper.deleteSalaryStandardDetailsById(id);
		return flag;
	}

	@Override
	public boolean saveSalaryStandardDetails(SalaryStandardDetails salaryStandardDetails) {
		// TODO Auto-generated method stub
		boolean flag = salaryStandardDetailsMapper.insertSalaryStandardDetails(salaryStandardDetails);
		return flag;
	}

	@Override
	public boolean updateSalaryStandardDetails(SalaryStandardDetails salaryStandardDetails) {
		// TODO Auto-generated method stub
		boolean flag = salaryStandardDetailsMapper.updateSalaryStandardDetails(salaryStandardDetails);
		return flag;
	}

	@Override
	public SalaryStandardDetails findSalaryStandardDetailsByItName(SalaryStandardDetails ssd) {
		SalaryStandardDetails sd = salaryStandardDetailsMapper.selectSalaryStandardDetailsByItName(ssd);
		return sd;
	}

}
