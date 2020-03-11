package hr.service;

import java.util.List;
import hr.pojo.EngageAnswer;


public interface EngageAnswerService {
	
	public boolean saveEngageAnswer(EngageAnswer ea);
	
	public boolean removeEngageAnswerById(int id);
	
	public boolean updateEngageAnswer(EngageAnswer ea);
	
	public EngageAnswer findEngageAnswerById(int id);
	
	public List<EngageAnswer> findEngageAnswerAll();

	

}
