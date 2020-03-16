package hr.mapper;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigProfessionDesign;

public interface ConfigProfessionDesignMapper {
	// <!-- 查询所有数据 -->
	public List<ConfigProfessionDesign> selectConfigProfessionDesignAll();
	
	// <!-- 根据条件参数查询数据列表 -->
	public List<ConfigProfessionDesign> selectConfigProfessionDesignByCondition(Map<String,Object> map);
	
	
	// <!-- 根据主键查询数据 -->
	public ConfigProfessionDesign selectConfigProfessionDesignById(int id);
	
	public  List<ConfigProfessionDesign>  selectConfigProfessionDesignByIds(List<Object> list);
	 //<!-- 插入数据 -->
	public void insertConfigProfessionDesign(ConfigProfessionDesign cpfd);
	
	//<!-- 修改数据 -->
	public void updateConfigProfessionDesign(Map<String,Object> map);
	
	// <!-- 根据主键删除数据 -->
	public void deleteConfigProfessionDesignById(int id);
	
	//查询总数据
	public int selectConfigProfessionDesignMaxNum();
}
