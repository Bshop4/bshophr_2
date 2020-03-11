package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigMajorKind;
import hr.pojo.ConfigMajorKind;

@Repository
public interface ConfigMajorKindMapper {
	public List<ConfigMajorKind> selectConfigMajorKindAll();
	public ConfigMajorKind selectConfigMajorKindById(int id);
	public boolean deleteConfigMajorKindById(int id);
	public boolean insertConfigMajorKind(ConfigMajorKind configMajorKind);
	public boolean updateConfigMajorKind(ConfigMajorKind configMajorKind);
}