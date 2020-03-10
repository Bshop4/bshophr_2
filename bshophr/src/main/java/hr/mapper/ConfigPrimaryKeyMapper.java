package hr.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigPrimaryKey;

@Repository
public interface ConfigPrimaryKeyMapper {
	public List<ConfigPrimaryKey> selectConfigPrimaryKeyAll();
	public ConfigPrimaryKey selectConfigPrimaryKeyById(int id);
	public boolean deleteConfigPrimaryKeyById(int id);
	public boolean insertConfigPrimaryKey(ConfigPrimaryKey bonus);
}
