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

}
