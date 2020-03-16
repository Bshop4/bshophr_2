package hr.service;

import java.util.List;
import java.util.Map;

import hr.pojo.ConfigProfessionDesign;

public interface ConfigProfessionDesignService {
	// <!-- 查询所有数据 -->
		public List<ConfigProfessionDesign> findConfigProfessionDesignAll();
		
		// <!-- 根据条件参数查询数据列表 -->
		public List<ConfigProfessionDesign> findConfigProfessionDesignByCondition(Map<String,Object> map);
		
		// <!-- 根据主键查询数据 -->
		public ConfigProfessionDesign findConfigProfessionDesignById(int id);
		
		public  List<ConfigProfessionDesign>  findConfigProfessionDesignByIds(List<Object> list);
		 //<!-- 插入数据 -->
		public void saveConfigProfessionDesign(ConfigProfessionDesign cpfd);
		
		//<!-- 修改数据 -->
		public void updateConfigProfessionDesign(Map<String,Object> map);
		
		// <!-- 根据主键删除数据 -->
		public void removeConfigProfessionDesignById(int id);
		
		//查询总数据个数
		public int findConfigProfessionDesignMaxNum();
}
