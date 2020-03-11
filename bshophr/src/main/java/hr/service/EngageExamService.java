package hr.service;

import java.util.List;
import hr.pojo.EngageExam;

public interface EngageExamService {
	
	public boolean saveEngageExam(EngageExam ee);
	
	public boolean removeEngageExamById(int id);
	
	public boolean updateEngageExam(EngageExam ee);
	
	public EngageExam findEngageExamById(int id);
	
	public List<EngageExam> findEngageExamAll();

	

}
