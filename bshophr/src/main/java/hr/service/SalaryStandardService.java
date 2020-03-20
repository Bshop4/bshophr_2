package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.SalaryStandard;

public interface SalaryStandardService {
	public List<SalaryStandard> findSalaryStandardAll();

	// 根据条件参数查询数据列表
	public List<SalaryStandard> findSalaryStandardAllByConditionPlus(Map<String, Object> map);

	public SalaryStandard findSalaryStandardById(int id);

	// 向思宇加的ID模糊查询
	public List<SalaryStandard> findSalaryStandardByIdDim(int id);

	// 向思宇加的条件模糊查询
	public List<SalaryStandard> findSalaryStandardByCondition(Map<String, Object> map);

	public boolean removeSalaryStandardById(int id);

	public boolean saveSalaryStandard(SalaryStandard salaryStandard);

	public boolean updateSalaryStandard(SalaryStandard salaryStandard);

	// 向思宇加的
	public boolean updateSalaryStandardfh(SalaryStandard ss);
}
