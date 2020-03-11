package hr.service;

import java.util.List;

import hr.pojo.ConfigFileFirstKind;



public interface ConfigFileFirstKindService {
	public List<ConfigFileFirstKind> findConfigFileFirstKindAll();
	public ConfigFileFirstKind findConfigFileFirstKindById(int id);
	public boolean removeConfigFileFirstKindById(int id);
	public boolean saveConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
	public boolean updateConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
}
