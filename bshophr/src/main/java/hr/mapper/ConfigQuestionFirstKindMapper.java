package hr.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigQuestionFirstKind;
import hr.pojo.ConfigQuestionFirstKind;

@Repository
public interface ConfigQuestionFirstKindMapper {
	public List<ConfigQuestionFirstKind> selectConfigQuestionFirstkindAll();
	public ConfigQuestionFirstKind selectConfigQuestionFirstKindById(int id);
	public boolean deleteConfigQuestionFirstKindById(int id);
	public boolean insertConfigQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
	public boolean updateConfigQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind);
}
