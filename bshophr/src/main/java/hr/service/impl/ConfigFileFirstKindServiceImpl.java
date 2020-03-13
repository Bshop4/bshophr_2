package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigFileFirstKindMapper;
import hr.pojo.ConfigFileFirstKind;
import hr.service.ConfigFileFirstKindService;

@Service
public class ConfigFileFirstKindServiceImpl implements ConfigFileFirstKindService{
	@Autowired
	private ConfigFileFirstKindMapper configFileFirstKindMapper=null;

	@Override
	public List<ConfigFileFirstKind> findConfigFileFirstKindAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return configFileFirstKindMapper.selectConfigFileFirstKindAll(map);
	}

	@Override
	public ConfigFileFirstKind findConfigFileFirstKindById(int id) {
		// TODO Auto-generated method stub
		return configFileFirstKindMapper.selectConfigFileFirstKindById(id);
	}

	@Override
	public boolean removeConfigFileFirstKindById(int id) {
		// TODO Auto-generated method stub
		return configFileFirstKindMapper.deleteConfigFileFirstKindById(id);
	}

	@Override
	public boolean saveConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind) {
		// TODO Auto-generated method stub
		return configFileFirstKindMapper.insertConfigFileFirstKind(configFileFirstKind);
	}

	@Override
	public boolean updateConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind) {
		// TODO Auto-generated method stub
		return configFileFirstKindMapper.updateConfigFileFirstKind(configFileFirstKind);
	}
}
