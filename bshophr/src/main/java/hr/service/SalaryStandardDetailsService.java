package hr.service;

import java.util.List;

import hr.pojo.SalaryStandardDetails;

public interface SalaryStandardDetailsService {
	public List<SalaryStandardDetails> findSalaryStandardDetailsAll();

	// 向思宇改的
	public List<SalaryStandardDetails> findSalaryStandardDetailsById(int id);

	public SalaryStandardDetails findSalaryStandardDetailsByItName(SalaryStandardDetails ssd);

	public boolean removeSalaryStandardDetailsById(int id);

	public boolean saveSalaryStandardDetails(SalaryStandardDetails salaryStandardDetails);

	public boolean updateSalaryStandardDetails(SalaryStandardDetails salaryStandardDetails);

	public boolean updateSalaryStandardDetailsbg(SalaryStandardDetails salaryStandardDetails);
}
