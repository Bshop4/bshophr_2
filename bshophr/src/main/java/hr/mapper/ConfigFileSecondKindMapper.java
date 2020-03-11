package hr.mapper;

import java.util.List;

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
}
