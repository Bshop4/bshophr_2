package hr.service;

import java.util.List;

import hr.pojo.ConfigPublicChar;

public interface ConfigPublicCharService {
	public List<ConfigPublicChar> findConfigPublicCharAll();
	
	public List<ConfigPublicChar> findConfigPublicCharAllByCondition(String attributeKind);

	public ConfigPublicChar findConfigPublicCharById(int id);

	// 向思宇+
	public List<ConfigPublicChar> findConfigPublicCharByAk(String ak);

	public boolean removeConfigPublicCharById(int id);

	public boolean saveConfigPublicChar(ConfigPublicChar configPublicChar);

	public boolean updateConfigPublicChar(ConfigPublicChar configPublicChar);
}
