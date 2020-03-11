package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileFirstKind;

@Repository
public interface ConfigFileFirstKindMapper {
	public List<ConfigFileFirstKind> selectConfigFileFirstKindAll();
	public ConfigFileFirstKind selectConfigFileFirstKindById(int id);
	public boolean deleteConfigFileFirstKindById(int id);
	public boolean insertConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
	public boolean updateConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind);
}
