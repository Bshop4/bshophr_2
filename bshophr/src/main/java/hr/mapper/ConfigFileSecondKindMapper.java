package hr.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigFileSecondKind;

@Repository
public interface ConfigFileSecondKindMapper {
//	public List<ConfigFileSecondKind> selectConfigFileSecondKindAll();
	public List<ConfigFileSecondKind> selectConfigFileSecondKindAll(Map<String,Object> map);
	public ConfigFileSecondKind selectConfigFileSecondKindById(int id);
	public boolean deleteConfigFileSecondKindById(int id);
	public boolean insertConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind);
	public boolean updateConfigFileSecondKind(Map<String, Object> map);
	
	//查询最大总数
	public int selectConfigFileSecondKindMaxNum();
	
	//查询I级   下的  II级的MAX(second_kind_id) 
	public String selectConfigFileSecondKindIdMax(String i);
	
}
