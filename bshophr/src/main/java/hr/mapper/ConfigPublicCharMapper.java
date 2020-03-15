package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigPublicChar;

@Repository
public interface ConfigPublicCharMapper {
	public List<ConfigPublicChar> selectConfigPublicCharAll();
	
	public List<ConfigPublicChar> selectConfigPublicCharAllByCondition(String attributeKind);

	public ConfigPublicChar selectConfigPublicCharById(int id);
	
	

	// 向思宇写的
	public List<ConfigPublicChar> selectConfigPublicCharByAk(String ak);

	public boolean deleteConfigPublicCharById(int id);

	public boolean insertConfigPublicChar(ConfigPublicChar configPublicChar);

	public boolean updateConfigPublicChar(ConfigPublicChar configPublicChar);
}
