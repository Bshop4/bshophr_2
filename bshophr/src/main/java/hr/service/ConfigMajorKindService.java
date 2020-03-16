package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigMajorKind;

public interface ConfigMajorKindService {
	public List<ConfigMajorKind> findConfigMajorKindAll();
	public ConfigMajorKind findConfigMajorKindById(int id);
	public boolean removeConfigMajorKindById(int id);
	public boolean saveConfigMajorKind(ConfigMajorKind configMajorKind);
	public boolean updateConfigMajorKind(ConfigMajorKind configMajorKind);
	
	// <!-- 根据条件参数查询数据列表 -->
	public List<ConfigMajorKind> findConfigMajorKindByCondition(Map<String,Object> map);
	
	//查询总数据个数
	public int findConfigMajorKindMaxNum();
	
	//查询I级 的MAX(major_kind_id) 
	public String findConfigMajorKindIdMax();
}
