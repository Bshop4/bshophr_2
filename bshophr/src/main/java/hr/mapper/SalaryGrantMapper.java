package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.SalaryGrant;

@Repository
public interface SalaryGrantMapper {
	public List<SalaryGrant> selectSalaryGrantAll();

	// 条件查询
	public List<SalaryGrant> selectSalaryGrantAllByCondition(SalaryGrant sg);

	public SalaryGrant selectSalaryGrantById(int id);

	public List<SalaryGrant> selectSalaryGrantByStatus(short id);

	public SalaryGrant selectSalaryGrantByStatus2222(short id);

	// 向思宇加的查询基本薪酬和派发的薪酬
	public SalaryGrant selectSalaryGrantSalarySumById(int id);

	public boolean deleteSalaryGrantById(int id);

	public boolean insertSalaryGrant(SalaryGrant sg);

	public boolean updateSalaryGrant(SalaryGrant sg);

	public boolean updateSalaryGrantStatus(SalaryGrant sg);

}
