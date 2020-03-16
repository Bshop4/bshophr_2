package hr.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import hr.pojo.ConfigMajor;

public interface ConfigMajorService {
	public List<ConfigMajor> findConfigMajorAll();
	public ConfigMajor findConfigMajorById(int id);
	public boolean removeConfigMajorById(int id);
	public boolean saveConfigMajor(ConfigMajor configMajor);
	public boolean updateConfigMajor(ConfigMajor configMajor);
	

	public List<ConfigMajor> findConfigMajorSelect(Map<String, Object> map);

	public List<ConfigMajor> findConfigMajorAllByMajorKindName(String name);
	
	public ConfigMajor findConfigMajorByMajorKindNameAndMajorName(String majorKindName,String majorName);
	
	//查询总数据个数
	public int findConfigMajorMaxNum();
	
	//查询major_kind_id 下的级 major_id最大值的MAX(major_id) 
	public String findConfigMajorIdMax(String mkid);

}
