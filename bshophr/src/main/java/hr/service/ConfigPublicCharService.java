package hr.service;

import java.util.List;

import hr.pojo.ConfigPublicChar;

public interface ConfigPublicCharService {
	public List<ConfigPublicChar> findConfigPublicCharAll();
	public ConfigPublicChar findConfigPublicCharById(int id);
	public boolean removeConfigPublicCharById(int id);
	public boolean saveConfigPublicChar(ConfigPublicChar configPublicChar);
	public boolean updateConfigPublicChar(ConfigPublicChar configPublicChar);
}
