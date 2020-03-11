package hr.mapper;

import java.util.List;

import hr.pojo.SalaryStandardDetails;

public interface SalaryStandardDetailsMapper {
	public List<SalaryStandardDetails> selectSalaryStandardDetailsAll();
	public SalaryStandardDetails selectSalaryStandardDetailsById(int id);
	public boolean deleteSalaryStandardDetailsById(int id);
	public boolean insertSalaryStandardDetails(SalaryStandardDetails ssd);
	public boolean updateSalaryStandardDetails(SalaryStandardDetails ssd);
	
}
