package hr.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileThirdKind;

@Repository
public interface ConfigFileThirdKindMapper {
	public List<ConfigFileThirdKind> selectConfigFileThirdKindAll();
	public ConfigFileThirdKind selectConfigFileThirdKindById(int id);
	public boolean deleteConfigFileThirdKindById(int id);
	public boolean insertConfigFileThirdKind(ConfigFileThirdKind bonus);
}
