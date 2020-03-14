package hr.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigFileThirdKind;
import hr.pojo.ConfigFileThirdKind;

@Repository
public interface ConfigFileThirdKindMapper {
//	public List<ConfigFileThirdKind> selectConfigFileThirdKindAll();
	public List<ConfigFileThirdKind> selectConfigFileThirdKindAll(Map<String,Object> map);
	public ConfigFileThirdKind selectConfigFileThirdKindById(int id);
	public boolean deleteConfigFileThirdKindById(int id);
	public boolean insertConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	public boolean updateConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind);
	

	public List<ConfigFileThirdKind> selectConfigFileThirdKindAllByFirstKindName(String name);
	public List<ConfigFileThirdKind> selectConfigFileThirdKindAllBySecondKindName(String name);
	
	public ConfigFileThirdKind selectConfigFileThirdKindByFirstSecondThirdKindName(@Param("firstKindName") String firstKindName,@Param("secondKindName") String secondKindName,@Param("thirdKindName") String thirdKindName);

	public boolean updateConfigFileThirdKindPlus(Map<String,Object> map);
	
	//查询最大总数
	public int selectConfigFileThirdKindMaxNum();
	
	//查询I级    II级下的    IIIMAX(Third_kind_id) 
	public String selectConfigFileThirdKindIdMax(Map<String,Object> map);
	

}
