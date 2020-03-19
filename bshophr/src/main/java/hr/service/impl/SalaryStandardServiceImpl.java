package hr.service.impl;

import java.util.List;
import java.util.Map;

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
	public boolean updateSalaryStandardfh(SalaryStandard ss) {
		boolean flag = salaryStandardMapper.updateSalaryStandardfh(ss);
		return flag;
	}

	@Override
	public List<SalaryStandard> findSalaryStandardByIdDim(int id) {
		List<SalaryStandard> list = salaryStandardMapper.selectSalaryStandardByIdDim(id);
		return list;
	}

	@Override
	public List<SalaryStandard> findSalaryStandardByCondition(Map<String, Object> map) {
		List<SalaryStandard> list = salaryStandardMapper.selectSalaryStandardByCondition(map);
		return list;
	}

	@Override
	public List<SalaryStandard> findSalaryStandardAllByConditionPlus(Map<String, Object> map) {
		return salaryStandardMapper.selectSalaryStandardAllByConditionPlus(map);
	}

}
