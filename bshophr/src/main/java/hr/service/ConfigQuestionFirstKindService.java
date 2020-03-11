package hr.service;

import java.util.List;

import hr.pojo.ConfigQuestionFirstKind;

public interface ConfigQuestionFirstKindService {
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindAll();
	public ConfigQuestionFirstKind findConfigQuestionFirstKindById(int id);
	public boolean removeConfigQuestionFirstKindById(int id);
	public boolean saveConfigQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
	public boolean updateConfigQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
}
