package hr.service;

import java.util.List;

import hr.pojo.ConfigFileSecondKind;

public interface ConfigFileSecondKindService {
	public List<ConfigFileSecondKind> findConfigFileSecondKindAll();
	public ConfigFileSecondKind findConfigFileSecondKindById(int id);
	public boolean removeConfigFileSecondKindById(int id);
	public boolean saveConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	public boolean updateConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
}
