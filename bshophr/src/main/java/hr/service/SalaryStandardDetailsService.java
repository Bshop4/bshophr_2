package hr.service;

import java.util.List;

import hr.pojo.SalaryStandardDetails;

public interface SalaryStandardDetailsService {
	public List<SalaryStandardDetails> findSalaryStandardDetailsAll();
	public SalaryStandardDetails findSalaryStandardDetailsById(int id);
	public boolean removeSalaryStandardDetailsById(int id);
	public boolean saveSalaryStandardDetails(SalaryStandardDetails salaryStandardDetails);
	public boolean updateSalaryStandardDetails(SalaryStandardDetails salaryStandardDetails);
}
