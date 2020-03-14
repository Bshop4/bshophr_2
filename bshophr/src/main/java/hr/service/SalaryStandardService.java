package hr.service;

import java.util.List;

import hr.pojo.SalaryStandard;

public interface SalaryStandardService {
	public List<SalaryStandard> findSalaryStandardAll();

	public SalaryStandard findSalaryStandardById(int id);

	// 向思宇加的ID模糊查询
	public List<SalaryStandard> findSalaryStandardByIdDim(int id);

	// 向思宇加的name模糊查询
	public List<SalaryStandard> findSalaryStandardByCondition(SalaryStandard s);

	public boolean removeSalaryStandardById(int id);

	public boolean saveSalaryStandard(SalaryStandard salaryStandard);

	public boolean updateSalaryStandard(SalaryStandard salaryStandard);

	// 向思宇加的
	public boolean updateSalaryStandardfh(SalaryStandard ss);
}
