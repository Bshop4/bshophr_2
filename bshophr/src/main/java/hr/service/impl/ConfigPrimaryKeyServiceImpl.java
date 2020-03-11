package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigPrimaryKeyMapper;
import hr.pojo.ConfigPrimaryKey;
import hr.service.ConfigPrimaryKeyService;

@Service
public class ConfigPrimaryKeyServiceImpl implements ConfigPrimaryKeyService{
	@Autowired
	private ConfigPrimaryKeyMapper configPrimaryKeyMapper=null;

	@Override
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAll() {
		// TODO Auto-generated method stub
		return configPrimaryKeyMapper.selectConfigPrimaryKeyAll();
	}

	@Override
	public ConfigPrimaryKey findConfigPrimaryKeyById(int id) {
		// TODO Auto-generated method stub
		return configPrimaryKeyMapper.selectConfigPrimaryKeyById(id);
	}

	@Override
	public boolean removeConfigPrimaryKeyById(int id) {
		// TODO Auto-generated method stub
		return configPrimaryKeyMapper.deleteConfigPrimaryKeyById(id);
	}

	@Override
	public boolean saveConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey) {
		// TODO Auto-generated method stub
		return configPrimaryKeyMapper.insertConfigPrimaryKey(configPrimaryKey);
	}

	@Override
	public boolean updateConfigPrimaryKey(ConfigPrimaryKey configPrimaryKey) {
		// TODO Auto-generated method stub
		return configPrimaryKeyMapper.updateConfigPrimaryKey(configPrimaryKey);
	}
}
