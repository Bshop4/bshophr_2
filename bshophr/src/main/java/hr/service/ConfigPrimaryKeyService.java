package hr.service;

import java.util.List;
import java.util.Map;

import hr.dto.PrimaryKeyTable;
import hr.pojo.ConfigPrimaryKey;

public interface ConfigPrimaryKeyService {
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAll();
	public ConfigPrimaryKey findConfigPrimaryKeyById(int id);
	public boolean removeConfigPrimaryKeyById(int id);
	public boolean saveConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey);
	public boolean updateConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey);
	
	//查询所有的表
//	public List<PrimaryKeyTable> findConfigPrimaryKeyOfTable();
	
	//修改关键字的状态是否开启
	public void updateConfigPrimaryKeyStatus(List<Integer> list);
	
	//条件查询所有
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAllPlus(Map<String, Object> map);
}
