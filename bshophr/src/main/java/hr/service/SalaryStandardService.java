package hr.service;

import java.util.List;

import hr.pojo.SalaryStandard;

public interface SalaryStandardService {
	public List<SalaryStandard> findSalaryStandardAll();

	public SalaryStandard findSalaryStandardById(int id);

	public boolean removeSalaryStandardById(int id);

	public boolean saveSalaryStandard(SalaryStandard salaryStandard);

	public boolean updateSalaryStandard(SalaryStandard salaryStandard);

	// 向思宇加的
	public boolean updateSalaryStandardByfh(SalaryStandard ss);
}
