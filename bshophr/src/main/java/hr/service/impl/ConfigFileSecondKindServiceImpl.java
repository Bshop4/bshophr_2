package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigFileSecondKindMapper;
import hr.pojo.ConfigFileSecondKind;
import hr.service.ConfigFileSecondKindService;

@Service
public class ConfigFileSecondKindServiceImpl implements ConfigFileSecondKindService{
	@Autowired
	private ConfigFileSecondKindMapper configFileSecondKindMapper=null;

	@Override
	public List<ConfigFileSecondKind> findConfigFileSecondKindAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.selectConfigFileSecondKindAll(map);
	}

	@Override
	public ConfigFileSecondKind findConfigFileSecondKindById(int id) {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.selectConfigFileSecondKindById(id);
	}

	@Override
	public boolean removeConfigFileSecondKindById(int id) {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.deleteConfigFileSecondKindById(id);
	}

	@Override
	public boolean saveConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind) {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.insertConfigFileSecondKind(configFileSecondKind);
	}

	@Override
	public boolean updateConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind) {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.updateConfigFileSecondKind(configFileSecondKind);
	}

	
	//查询的数据总数
	@Override
	public int findConfigFileSecondKindMaxNum() {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.selectConfigFileSecondKindMaxNum();
	}

}
