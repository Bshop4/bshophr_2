package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.SalaryGrant;
@Repository
public interface SalaryGrantMapper {
	public List<SalaryGrant> selectSalaryGrantAll();
	public SalaryGrant selectSalaryGrantById(int id);
	public boolean deleteSalaryGrantById(int id);
	public boolean insertSalaryGrant(SalaryGrant sg);
	public boolean updateSalaryGrant(SalaryGrant sg);
	
}