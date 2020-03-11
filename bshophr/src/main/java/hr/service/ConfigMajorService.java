package hr.service;

import java.util.List;

import hr.pojo.ConfigMajor;

public interface ConfigMajorService {
	public List<ConfigMajor> findConfigMajorAll();
	public ConfigMajor findConfigMajorById(int id);
	public boolean removeConfigMajorById(int id);
	public boolean saveConfigMajor(ConfigMajor configMajor);
	public boolean updateConfigMajor(ConfigMajor configMajor);
}
