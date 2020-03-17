package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.SalaryGrantMapper;
import hr.pojo.SalaryGrant;
import hr.service.SalaryGrantService;

@Service
public class SalaryGrantServiceImpl implements SalaryGrantService {

	@Autowired
	private SalaryGrantMapper salaryGrantMapper = null;

	@Override
	public List<SalaryGrant> findSalaryGrantAll() {
		// TODO Auto-generated method stub
		List<SalaryGrant> list = salaryGrantMapper.selectSalaryGrantAll();
		return list;
	}

	@Override
	public SalaryGrant findSalaryGrantById(int id) {
		// TODO Auto-generated method stub
		SalaryGrant SalaryGrant = salaryGrantMapper.selectSalaryGrantById(id);
		return SalaryGrant;
	}

	@Override
	public boolean removeSalaryGrantById(int id) {
		// TODO Auto-generated method stub
		boolean flag = salaryGrantMapper.deleteSalaryGrantById(id);

		return flag;
	}

	@Override
	public boolean saveSalaryGrant(SalaryGrant salaryGrant) {
		// TODO Auto-generated method stub
		boolean flag = salaryGrantMapper.insertSalaryGrant(salaryGrant);
		return flag;
	}

	@Override
	public boolean updateSalaryGrant(SalaryGrant salaryGrant) {
		// TODO Auto-generated method stub
		boolean flag = salaryGrantMapper.updateSalaryGrant(salaryGrant);
		return flag;
	}

	@Override
	public SalaryGrant findSalaryGrantSalarySumById(int id) {
		SalaryGrant SalaryGrant = salaryGrantMapper.selectSalaryGrantSalarySumById(id);
		return SalaryGrant;
	}

	@Override
	public boolean updateSalaryGrantStatus(SalaryGrant salaryGrant) {
		boolean flag = salaryGrantMapper.updateSalaryGrantStatus(salaryGrant);
		return flag;
	}

	@Override
	public List<SalaryGrant> findSalaryGrantByStatus(short id) {
		List<SalaryGrant> SalaryGrant = salaryGrantMapper.selectSalaryGrantByStatus(id);
		return SalaryGrant;
	}

}
