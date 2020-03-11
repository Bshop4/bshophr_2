package hr.service;

import java.util.List;

import hr.pojo.ConfigQuestionSecondKind;

public interface ConfigQuestionSecondKindService {
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindAll();
	public ConfigQuestionSecondKind findConfigQuestionSecondKindById(int id);
	public boolean removeConfigQuestionSecondKindById(int id);
	public boolean saveConfigQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
	public boolean updateConfigQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
}
