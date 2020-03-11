package hr.service;

import java.util.List;

import hr.pojo.SalaryGrant;

public interface SalaryGrantService {
	public List<SalaryGrant> findSalaryGrantAll();
	public SalaryGrant findSalaryGrantById(int id);
	public boolean removeSalaryGrantById(int id);
	public boolean saveSalaryGrant(SalaryGrant salaryGrant);
	public boolean updateSalaryGrant(SalaryGrant salaryGrant);
}
