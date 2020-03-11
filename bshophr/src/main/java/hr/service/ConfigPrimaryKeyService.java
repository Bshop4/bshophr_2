package hr.service;

import java.util.List;

import hr.pojo.ConfigPrimaryKey;

public interface ConfigPrimaryKeyService {
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAll();
	public ConfigPrimaryKey findConfigPrimaryKeyById(int id);
	public boolean removeConfigPrimaryKeyById(int id);
	public boolean saveConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey);
	public boolean updateConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey);
}
