package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigPublicChar;

public interface ConfigPublicCharService {
	public List<ConfigPublicChar> findConfigPublicCharAll();
	
	public List<ConfigPublicChar> findConfigPublicCharAllByCondition(String attributeKind);

	public ConfigPublicChar findConfigPublicCharById(int id);

	// 向思宇+
	public List<ConfigPublicChar> findConfigPublicCharByAk(String ak);

	public boolean removeConfigPublicCharById(int id);

	public boolean saveConfigPublicChar(ConfigPublicChar configPublicChar);

	public boolean updateConfigPublicChar(ConfigPublicChar configPublicChar);
	
	//查询总数据个数
	public int findConfigPublicCharMaxNum();
	// <!-- 根据条件参数查询数据列表 -->
	public List<ConfigPublicChar> findConfigPublicCharByConditionPlus(Map<String,Object> map);
}
