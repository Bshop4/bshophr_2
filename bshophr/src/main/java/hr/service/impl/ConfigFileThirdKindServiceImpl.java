package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigFileThirdKindMapper;
import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileThirdKind;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileThirdKindService;

@Service
public class ConfigFileThirdKindServiceImpl implements ConfigFileThirdKindService{
	@Autowired
	private ConfigFileThirdKindMapper configFileThirdKindMapper=null;

	@Override
	public List<ConfigFileThirdKind> findConfigFileThirdKindAll() {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.selectConfigFileThirdKindAll();
	}

	@Override
	public ConfigFileThirdKind findConfigFileThirdKindById(int id) {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.selectConfigFileThirdKindById(id);
	}

	@Override
	public boolean removeConfigFileThirdKindById(int id) {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.deleteConfigFileThirdKindById(id);
	}

	@Override
	public boolean saveConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.insertConfigFileThirdKind(configFileThirdKind);
	}

	@Override
	public boolean updateConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.updateConfigFileThirdKind(configFileThirdKind);
	}

	@Override
	public List<ConfigFileThirdKind> findConfigFileThirdKindAllByFirstKindName(String name) {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.selectConfigFileThirdKindAllByFirstKindName(name);
	}

	@Override
	public List<ConfigFileThirdKind> findConfigFileThirdKindAllBySecondKindName(String name) {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.selectConfigFileThirdKindAllBySecondKindName(name);
	}

	
}
