package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigQuestionSecondKind;
import hr.pojo.EngageAnswer;

@Repository
public interface EngageAnswerMapper {
	
	public boolean insertEngageAnswer(EngageAnswer ea);
	
	public boolean deleteEngageAnswerById(int id);
	
	public boolean updateEngageAnswer(EngageAnswer ea);
	
	public EngageAnswer selectEngageAnswerById(int id);
	
	public List<EngageAnswer> selectEngageAnswerAll();

}
