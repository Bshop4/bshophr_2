package hr.service;

import java.util.List;

import hr.pojo.SalaryGrant;

public interface SalaryGrantService {
	public List<SalaryGrant> findSalaryGrantAll();

	public SalaryGrant findSalaryGrantById(int id);

	public List<SalaryGrant> findSalaryGrantByStatus(short id);

	// 向思宇加的查询基本薪酬和派发的薪酬
	public SalaryGrant findSalaryGrantSalarySumById(int id);

	public boolean removeSalaryGrantById(int id);

	public boolean saveSalaryGrant(SalaryGrant salaryGrant);

	public boolean updateSalaryGrant(SalaryGrant salaryGrant);

	public boolean updateSalaryGrantStatus(SalaryGrant salaryGrant);
}
