package hr.mapper;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.dto.PrimaryKeyTable;
import hr.pojo.ConfigPrimaryKey;
import hr.pojo.ConfigPrimaryKey;

@Repository
public interface ConfigPrimaryKeyMapper {
	public List<ConfigPrimaryKey> selectConfigPrimaryKeyAll();
	public ConfigPrimaryKey selectConfigPrimaryKeyById(int id);
	public boolean deleteConfigPrimaryKeyById(int id);
	public boolean insertConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey);
	public boolean updateConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey);
	
	
	//查询所有的表
//	public List<PrimaryKeyTable> selectConfigPrimaryKeyOfTable();
	
	//修改关键字的状态是否开启
	public void updateConfigPrimaryKeyStatus(List<Integer> list);
	//条件查询所有
	public List<ConfigPrimaryKey> selectConfigPrimaryKeyAllPlus(Map<String, Object> map);
	
	//条件查询所有
	public void updateConfigPrimaryKeyPlus(Map<String, Object> map);
}
