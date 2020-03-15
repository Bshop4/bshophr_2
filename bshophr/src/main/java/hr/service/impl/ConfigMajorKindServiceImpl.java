package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigMajorKindMapper;
import hr.pojo.ConfigMajorKind;
import hr.service.ConfigMajorKindService;

@Service
public class ConfigMajorKindServiceImpl implements ConfigMajorKindService{
	@Autowired
	private ConfigMajorKindMapper configMajorKindMapper=null;

	@Override
	public List<ConfigMajorKind> findConfigMajorKindAll() {
		// TODO Auto-generated method stub
		return configMajorKindMapper.selectConfigMajorKindAll();
	}

	@Override
	public ConfigMajorKind findConfigMajorKindById(int id) {
		// TODO Auto-generated method stub
		return configMajorKindMapper.selectConfigMajorKindById(id);
	}

	@Override
	public boolean removeConfigMajorKindById(int id) {
		// TODO Auto-generated method stub
		return configMajorKindMapper.deleteConfigMajorKindById(id);
	}

	@Override
	public boolean saveConfigMajorKind(ConfigMajorKind configMajorKind) {
		// TODO Auto-generated method stub
		return configMajorKindMapper.insertConfigMajorKind(configMajorKind);
	}

	@Override
	public boolean updateConfigMajorKind(ConfigMajorKind configMajorKind) {
		// TODO Auto-generated method stub
		return configMajorKindMapper.updateConfigMajorKind(configMajorKind);
	}

	@Override
	public List<ConfigMajorKind> findConfigMajorKindByCondition(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return configMajorKindMapper.selectConfigMajorKindByCondition(map);
	}

	@Override
	public int findConfigMajorKindMaxNum() {
		// TODO Auto-generated method stub
		return configMajorKindMapper.selectConfigMajorKindMaxNum();
	}

	@Override
	public String findConfigMajorKindIdMax() {
		// TODO Auto-generated method stub
		return configMajorKindMapper.selectConfigMajorKindIdMax();
	}
}
