package hr.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigMajor;
import hr.pojo.ConfigMajor;

@Repository
public interface ConfigMajorMapper {
	public List<ConfigMajor> selectConfigMajorAll();
	public ConfigMajor selectConfigMajorById(int id);
	public boolean deleteConfigMajorById(int id);
	public boolean insertConfigMajor(ConfigMajor configMajor);
	public boolean updateConfigMajor(ConfigMajor configMajor);
}
