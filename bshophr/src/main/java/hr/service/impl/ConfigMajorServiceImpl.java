package hr.service.impl;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<ConfigMajor> findConfigMajorSelect(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return configMajorMapper.selectConfigMajorSelect(map);
	}

	public List<ConfigMajor> findConfigMajorAllByMajorKindName(String name) {
		// TODO Auto-generated method stub
		return configMajorMapper.selectConfigMajorAllByMajorKindName(name);
	}

	@Override
	public ConfigMajor findConfigMajorByMajorKindNameAndMajorName(String majorKindName, String majorName) {
		// TODO Auto-generated method stub
		return configMajorMapper.selectConfigMajorByMajorKindNameAndMajorName(majorKindName, majorName);
	}

	@Override
	public int findConfigMajorMaxNum() {
		// TODO Auto-generated method stub
		return configMajorMapper.selectConfigMajorMaxNum();
	}

	@Override
	public String findConfigMajorIdMax(String mkid) {
		// TODO Auto-generated method stub
		return configMajorMapper.selectConfigMajorIdMax(mkid);
	}
}
