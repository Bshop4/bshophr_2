package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigPublicCharMapper;
import hr.pojo.ConfigPublicChar;
import hr.service.ConfigPublicCharService;

@Service
public class ConfigPublicCharServiceImpl implements ConfigPublicCharService {
	@Autowired
	private ConfigPublicCharMapper configPublicCharMapper = null;

	@Override
	public List<ConfigPublicChar> findConfigPublicCharAll() {
		// TODO Auto-generated method stub
		return configPublicCharMapper.selectConfigPublicCharAll();
	}

	@Override
	public ConfigPublicChar findConfigPublicCharById(int id) {
		// TODO Auto-generated method stub
		return configPublicCharMapper.selectConfigPublicCharById(id);
	}

	@Override
	public boolean removeConfigPublicCharById(int id) {
		// TODO Auto-generated method stub
		return configPublicCharMapper.deleteConfigPublicCharById(id);
	}

	@Override
	public boolean saveConfigPublicChar(ConfigPublicChar configPublicChar) {
		// TODO Auto-generated method stub
		return configPublicCharMapper.insertConfigPublicChar(configPublicChar);
	}

	@Override
	public boolean updateConfigPublicChar(ConfigPublicChar configPublicChar) {
		// TODO Auto-generated method stub
		return configPublicCharMapper.updateConfigPublicChar(configPublicChar);
	}

	// 向思宇+
	@Override
	public List<ConfigPublicChar> findConfigPublicCharByAk(String ak) {
		return configPublicCharMapper.selectConfigPublicCharByAk(ak);
	}

	@Override
	public List<ConfigPublicChar> findConfigPublicCharAllByCondition(String attributeKind) {
		// TODO Auto-generated method stub
		return configPublicCharMapper.selectConfigPublicCharAllByCondition(attributeKind);
	}
}
