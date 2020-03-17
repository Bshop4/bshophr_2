package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.dto.PrimaryKeyTable;
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

//	@Override
//	public List<PrimaryKeyTable> findConfigPrimaryKeyOfTable() {
//		// TODO Auto-generated method stub
//		return configPrimaryKeyMapper.selectConfigPrimaryKeyOfTable();
//	}

	@Override
	public void updateConfigPrimaryKeyStatus(List<Integer> list) {
		// TODO Auto-generated method stub
		configPrimaryKeyMapper.updateConfigPrimaryKeyStatus(list);
	}

	@Override
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAllPlus(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return configPrimaryKeyMapper.selectConfigPrimaryKeyAllPlus(map);
	}

	@Override
	public void updateConfigPrimaryKeyPlus(Map<String, Object> map) {
		// TODO Auto-generated method stub
		configPrimaryKeyMapper.updateConfigPrimaryKeyPlus(map);
	}
}
