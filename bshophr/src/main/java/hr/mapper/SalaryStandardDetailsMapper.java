package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.SalaryStandardDetails;

@Repository
public interface SalaryStandardDetailsMapper {
	public List<SalaryStandardDetails> selectSalaryStandardDetailsAll();

	// 向思宇改的把返回SalaryStandardDetails改为List<SalaryStandardDetails>
	public List<SalaryStandardDetails> selectSalaryStandardDetailsById(int id);

	public boolean deleteSalaryStandardDetailsById(int id);

	public boolean insertSalaryStandardDetails(SalaryStandardDetails ssd);

	public boolean updateSalaryStandardDetails(SalaryStandardDetails ssd);

}
