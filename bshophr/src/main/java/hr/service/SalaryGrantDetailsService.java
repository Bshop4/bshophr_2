package hr.service;

import java.util.List;

import hr.pojo.SalaryGrantDetails;

public interface SalaryGrantDetailsService {
	public List<SalaryGrantDetails> findSalaryGrantDetailsAll();

	public SalaryGrantDetails findSalaryGrantDetailsById(int id);

	public SalaryGrantDetails findSalaryGrantDetailsByHumanid(int id);

	public boolean removeSalaryGrantDetailsById(int id);

	public boolean saveSalaryGrantDetails(SalaryGrantDetails salaryGrantDetails);

	public boolean updateSalaryGrantDetails(SalaryGrantDetails salaryGrantDetails);

	// 修改部分
	public boolean updateSalaryGrantDetailsSome(SalaryGrantDetails salaryGrantDetails);
}
