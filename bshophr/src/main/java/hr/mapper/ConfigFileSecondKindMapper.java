package hr.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigFileSecondKind;

@Repository
public interface ConfigFileSecondKindMapper {
	public List<ConfigFileSecondKind> selectConfigFileSecondKindAll();
	public ConfigFileSecondKind selectConfigFileSecondKindById(int id);
	public boolean deleteConfigFileSecondKindById(int id);
	public boolean insertConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	public boolean updateConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	
	//分页查询
	public List<ConfigFileSecondKind> selectConfigFileSecondKindPage(Map<String, Object> map);
	
}
