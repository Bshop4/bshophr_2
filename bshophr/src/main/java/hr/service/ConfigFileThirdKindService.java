package hr.service;

import java.util.List;

import hr.pojo.ConfigFileThirdKind;

public interface ConfigFileThirdKindService {
	public List<ConfigFileThirdKind> findConfigFileThirdKindAll();
	public ConfigFileThirdKind findConfigFileThirdKindById(int id);
	public boolean removeConfigFileThirdKindById(int id);
	public boolean saveConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	public boolean updateConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
}
