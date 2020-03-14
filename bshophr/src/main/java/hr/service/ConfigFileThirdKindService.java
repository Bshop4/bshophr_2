package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigFileThirdKind;

public interface ConfigFileThirdKindService {
//	public List<ConfigFileThirdKind> findConfigFileThirdKindAll();
	public List<ConfigFileThirdKind> findConfigFileThirdKindAll(Map<String,Object> map);
	public ConfigFileThirdKind findConfigFileThirdKindById(int id);
	public boolean removeConfigFileThirdKindById(int id);
	public boolean saveConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	public boolean updateConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	

	public List<ConfigFileThirdKind> findConfigFileThirdKindAllByFirstKindName(String name);
	
	public List<ConfigFileThirdKind> findConfigFileThirdKindAllBySecondKindName(String name);

	public ConfigFileThirdKind findConfigFileThirdKindByFirstSecondThirdKindName(String firstKindName,String secondKindName,String thirdKindName);
	
	public boolean updateConfigFileThirdKindPlus(Map<String,Object> map);
	
	//查询最大总数
	public int findConfigFileThirdKindMaxNum();
		
	//查询I级    II级下的    IIIMAX(Third_kind_id) 
	public String findConfigFileThirdKindIdMax(Map<String,Object> map);

}
