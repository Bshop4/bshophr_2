package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigFileFirstKind;



public interface ConfigFileFirstKindService {
//	public List<ConfigFileFirstKind> findConfigFileFirstKindAll();
	public List<ConfigFileFirstKind> findConfigFileFirstKindAll(Map<String,Object> map);
	public ConfigFileFirstKind findConfigFileFirstKindById(int id);
	public boolean removeConfigFileFirstKindById(int id);
	public boolean saveConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
//	public boolean updateConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
	public boolean updateConfigFileFirstKind(Map<String, Object> map);
	
	//查询最大总数
	public int findConfigFileFirstKindMaxNum();
	
	//查询I级 的MAX(first_kind_id) 
	public String findConfigFileFirstKindIdMax();
}
