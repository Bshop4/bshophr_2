package hr.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigMajorKind;
import hr.pojo.ConfigProfessionDesign;
import hr.pojo.ConfigMajorKind;

@Repository
public interface ConfigMajorKindMapper {
	public List<ConfigMajorKind> selectConfigMajorKindAll();
	public ConfigMajorKind selectConfigMajorKindById(int id);
	public boolean deleteConfigMajorKindById(int id);
	public boolean insertConfigMajorKind(ConfigMajorKind configMajorKind);
	public boolean updateConfigMajorKind(ConfigMajorKind configMajorKind);
	
	//查询所有根据name
	public List<ConfigMajorKind> selectConfigMajorKindSelect(Map<String, Object> map);
	
	// <!-- 根据条件参数查询数据列表 -->
	public List<ConfigMajorKind> selectConfigMajorKindByCondition(Map<String,Object> map);
	
	//查询总数据个数
	public int selectConfigMajorKindMaxNum();
	
	//查询I级 的MAX(major_kind_id) 
	public String selectConfigMajorKindIdMax();
}