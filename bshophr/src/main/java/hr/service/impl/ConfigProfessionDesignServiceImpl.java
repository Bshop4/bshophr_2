package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigProfessionDesignMapper;
import hr.pojo.ConfigProfessionDesign;
import hr.service.ConfigProfessionDesignService;

@Service
public class ConfigProfessionDesignServiceImpl implements ConfigProfessionDesignService{
	@Autowired
	private ConfigProfessionDesignMapper cpfdm=null;
	
	@Override
	public List<ConfigProfessionDesign> findConfigProfessionDesignAll() {
		// TODO Auto-generated method stub
		return cpfdm.selectConfigProfessionDesignAll();
	}

	@Override
	public List<ConfigProfessionDesign> findConfigProfessionDesignByCondition(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return cpfdm.selectConfigProfessionDesignByCondition(map);
	}

	@Override
	public ConfigProfessionDesign findConfigProfessionDesignById(int id) {
		// TODO Auto-generated method stub
		return cpfdm.selectConfigProfessionDesignById(id);
	}

	@Override
	public List<ConfigProfessionDesign> findConfigProfessionDesignByIds(List<Object> list) {
		// TODO Auto-generated method stub
		return cpfdm.selectConfigProfessionDesignByIds(list);
	}

	@Override
	public void saveConfigProfessionDesign(ConfigProfessionDesign cpfd) {
		// TODO Auto-generated method stub
		cpfdm.insertConfigProfessionDesign(cpfd);
	}

	@Override
	public void updateConfigProfessionDesign(Map<String, Object> map) {
		// TODO Auto-generated method stub
		cpfdm.updateConfigProfessionDesign(map);
	}

	@Override
	public void removeConfigProfessionDesignById(int id) {
		// TODO Auto-generated method stub
		cpfdm.deleteConfigProfessionDesignById(id);
	}

	@Override
	public int findConfigProfessionDesignMaxNum() {
		// TODO Auto-generated method stub
		return cpfdm.selectConfigProfessionDesignMaxNum();
	}

}
