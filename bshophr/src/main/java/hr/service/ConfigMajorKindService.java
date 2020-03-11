package hr.service;

import java.util.List;

import hr.pojo.ConfigMajorKind;

public interface ConfigMajorKindService {
	public List<ConfigMajorKind> findConfigMajorKindAll();
	public ConfigMajorKind findConfigMajorKindById(int id);
	public boolean removeConfigMajorKindById(int id);
	public boolean saveConfigMajorKind(ConfigMajorKind configMajorKind);
	public boolean updateConfigMajorKind(ConfigMajorKind configMajorKind);
}
