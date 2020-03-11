package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigQuestionSecondKindMapper;
import hr.pojo.ConfigQuestionSecondKind;
import hr.service.ConfigQuestionSecondKindService;

@Service
public class ConfigQuestionSecondKindServiceImpl implements ConfigQuestionSecondKindService{
	@Autowired
	private ConfigQuestionSecondKindMapper configQuestionSecondKindMapper=null;

	@Override
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindAll() {
		// TODO Auto-generated method stub
		return configQuestionSecondKindMapper.selectConfigQuestionSecondkindAll();
	}

	@Override
	public ConfigQuestionSecondKind findConfigQuestionSecondKindById(int id) {
		// TODO Auto-generated method stub
		return configQuestionSecondKindMapper.selectConfigQuestionSecondKindById(id);
	}

	@Override
	public boolean removeConfigQuestionSecondKindById(int id) {
		// TODO Auto-generated method stub
		return configQuestionSecondKindMapper.deleteConfigQuestionSecondKindById(id);
	}

	@Override
	public boolean saveConfigQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind) {
		// TODO Auto-generated method stub
		return configQuestionSecondKindMapper.insertConfigQuestionSecondKind(configQuestionSecondKind);
	}

	@Override
	public boolean updateConfigQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind) {
		// TODO Auto-generated method stub
		return configQuestionSecondKindMapper.updateConfigQuestionSecondKind(configQuestionSecondKind);
	}
}
