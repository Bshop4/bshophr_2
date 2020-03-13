package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.SalaryStandardMapper;
import hr.pojo.SalaryStandard;
import hr.service.SalaryStandardService;

@Service
public class SalaryStandardServiceImpl implements SalaryStandardService {

	@Autowired
	private SalaryStandardMapper salaryStandardMapper = null;

	@Override
	public List<SalaryStandard> findSalaryStandardAll() {
		// TODO Auto-generated method stub
		List<SalaryStandard> list = salaryStandardMapper.selectSalaryStandardAll();
		return list;
	}

	@Override
	public SalaryStandard findSalaryStandardById(int id) {
		// TODO Auto-generated method stub
		SalaryStandard SalaryStandard = salaryStandardMapper.selectSalaryStandardById(id);
		return SalaryStandard;
	}

	@Override
	public boolean removeSalaryStandardById(int id) {
		// TODO Auto-generated method stub
		boolean flag = salaryStandardMapper.deleteSalaryStandardById(id);

		return flag;
	}

	@Override
	public boolean saveSalaryStandard(SalaryStandard salaryStandard) {
		// TODO Auto-generated method stub
		boolean flag = salaryStandardMapper.insertSalaryStandard(salaryStandard);
		return flag;
	}

	@Override
	public boolean updateSalaryStandard(SalaryStandard salaryStandard) {
		// TODO Auto-generated method stub
		boolean flag = salaryStandardMapper.updateSalaryStandard(salaryStandard);
		return flag;
	}

	@Override
	public boolean updateSalaryStandardByfh(SalaryStandard ss) {
		boolean flag = salaryStandardMapper.updateSalaryStandardByfh(ss);
		return flag;
	}

}
