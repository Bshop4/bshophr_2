package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigFileSecondKind;

public interface ConfigFileSecondKindService {
//	public List<ConfigFileSecondKind> findConfigFileSecondKindAll();
	public List<ConfigFileSecondKind> findConfigFileSecondKindAll(Map<String,Object> map);
	public ConfigFileSecondKind findConfigFileSecondKindById(int id);
	public boolean removeConfigFileSecondKindById(int id);
	public boolean saveConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
//	public boolean updateConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	public boolean updateConfigFileSecondKind(Map<String, Object> map);
	
	//查询最大总条数
	public int findConfigFileSecondKindMaxNum();
	
	//查询I级   下的  II级的MAX(second_kind_id) 
	public String findConfigFileSecondKindIdMax(String i);
}
