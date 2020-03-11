package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigQuestionFirstKindMapper;
import hr.pojo.ConfigQuestionFirstKind;
import hr.service.ConfigQuestionFirstKindService;

@Service
public class ConfigQuestionFirstKindServiceImpl implements ConfigQuestionFirstKindService
{
	@Autowired
	private ConfigQuestionFirstKindMapper configQuestionFirstKindMapper=null;

	@Override
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindAll() {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.selectConfigQuestionFirstkindAll();
	}

	@Override
	public ConfigQuestionFirstKind findConfigQuestionFirstKindById(int id) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.selectConfigQuestionFirstKindById(id);
	}

	@Override
	public boolean removeConfigQuestionFirstKindById(int id) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.deleteConfigQuestionFirstKindById(id);
	}

	@Override
	public boolean saveConfigQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.insertConfigQuestionFirstKind(configQuestionFirstKind);
	}

	@Override
	public boolean updateConfigQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.updateConfigQuestionFirstKind(configQuestionFirstKind);
	}

}
