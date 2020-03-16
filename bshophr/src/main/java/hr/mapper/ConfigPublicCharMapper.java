package hr.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigMajorKind;
import hr.pojo.ConfigPublicChar;

@Repository
public interface ConfigPublicCharMapper {
	public List<ConfigPublicChar> selectConfigPublicCharAll();
	
	public List<ConfigPublicChar> selectConfigPublicCharAllByCondition(String attributeKind);

	public ConfigPublicChar selectConfigPublicCharById(int id);
	
	

	// 向思宇写的
	public List<ConfigPublicChar> selectConfigPublicCharByAk(String ak);

	public boolean deleteConfigPublicCharById(int id);

	public boolean insertConfigPublicChar(ConfigPublicChar configPublicChar);

	public boolean updateConfigPublicChar(ConfigPublicChar configPublicChar);
	
	
	//查询总数据个数
	public int selectConfigPublicCharMaxNum();
	// <!-- 根据条件参数查询数据列表 -->
	public List<ConfigPublicChar> selectConfigPublicCharByConditionPlus(Map<String,Object> map);
}
