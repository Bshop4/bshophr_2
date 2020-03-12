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
	public boolean updateConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	
	//查询最大总条数
	public int findConfigFileSecondKindMaxNum();	
}
