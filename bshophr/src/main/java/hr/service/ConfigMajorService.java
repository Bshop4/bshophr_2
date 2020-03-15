package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigMajor;

public interface ConfigMajorService {
	public List<ConfigMajor> findConfigMajorAll();
	public ConfigMajor findConfigMajorById(int id);
	public boolean removeConfigMajorById(int id);
	public boolean saveConfigMajor(ConfigMajor configMajor);
	public boolean updateConfigMajor(ConfigMajor configMajor);
	
	public List<ConfigMajor> findConfigMajorSelect(Map<String, Object> map);
}
