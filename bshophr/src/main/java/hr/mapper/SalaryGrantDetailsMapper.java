package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.SalaryGrantDetails;
@Repository
public interface SalaryGrantDetailsMapper {
	public List<SalaryGrantDetails> selectSalaryGrantDetailsAll();
	public SalaryGrantDetails selectSalaryGrantDetailsById(int id);
	public boolean deleteSalaryGrantDetailsById(int id);
	public boolean insertSalaryGrantDetails(SalaryGrantDetails sgd);
	public boolean updateSalaryGrantDetails(SalaryGrantDetails sgd);
	
}
