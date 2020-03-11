package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.SalaryStandard;
@Repository
public interface SalaryStandardMapper {
	public List<SalaryStandard> selectSalaryStandardAll();
	public SalaryStandard selectSalaryStandardById(int id);
	public boolean deleteSalaryStandardById(int id);
	public boolean insertSalaryStandard(SalaryStandard ss);
	public boolean updateSalaryStandard(SalaryStandard ss);
	
}
