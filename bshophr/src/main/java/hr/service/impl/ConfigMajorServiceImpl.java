package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigMajorKindMapper;
import hr.mapper.ConfigMajorMapper;
import hr.pojo.ConfigMajor;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigMajorService;

@Service
public class ConfigMajorServiceImpl implements ConfigMajorService{
	@Autowired
	private ConfigMajorMapper configMajorMapper=null;

	@Override
	public List<ConfigMajor> findConfigMajorAll() {
		// TODO Auto-generated method stub
		return configMajorMapper.selectConfigMajorAll();
	}

	@Override
	public ConfigMajor findConfigMajorById(int id) {
		// TODO Auto-generated method stub
		return configMajorMapper.selectConfigMajorById(id);
	}

	@Override
	public boolean removeConfigMajorById(int id) {
		// TODO Auto-generated method stub
		return configMajorMapper.deleteConfigMajorById(id);
	}

	@Override
	public boolean saveConfigMajor(ConfigMajor configMajor) {
		// TODO Auto-generated method stub
		return configMajorMapper.insertConfigMajor(configMajor);
	}

	@Override
	public boolean updateConfigMajor(ConfigMajor configMajor) {
		// TODO Auto-generated method stub
		return configMajorMapper.updateConfigMajor(configMajor);
	}
}
