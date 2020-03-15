package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.SalaryStandard;

@Repository
public interface SalaryStandardMapper {
	public List<SalaryStandard> selectSalaryStandardAll();

	public SalaryStandard selectSalaryStandardById(int id);

	// 向思宇加的由ID进行的模糊查询
	public List<SalaryStandard> selectSalaryStandardByIdDim(int id);

	// 向思宇加的由ID和name进行的模糊查询
	public List<SalaryStandard> selectSalaryStandardByCondition(SalaryStandard s);

	public boolean deleteSalaryStandardById(int id);

	public boolean insertSalaryStandard(SalaryStandard ss);

	public boolean updateSalaryStandard(SalaryStandard ss);

	// 向思宇加的复核时候更新
	public boolean updateSalaryStandardfh(SalaryStandard ss);

}
