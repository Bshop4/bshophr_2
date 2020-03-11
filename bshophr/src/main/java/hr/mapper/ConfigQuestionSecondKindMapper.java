package hr.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigQuestionSecondKind;
import hr.pojo.ConfigQuestionSecondKind;

@Repository
public interface ConfigQuestionSecondKindMapper {
	public List<ConfigQuestionSecondKind> selectConfigQuestionSecondkindAll();
	public ConfigQuestionSecondKind selectConfigQuestionSecondKindById(int id);
	public boolean deleteConfigQuestionSecondKindById(int id);
	public boolean insertConfigQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
	public boolean updateConfigQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
}
