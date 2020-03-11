package hr.service;

import java.util.List;
import hr.pojo.EngageExamDetails;

public interface EngageExamDetailsService {
	
	public boolean saveEngageExamDetails(EngageExamDetails eed);
	
	public boolean removeEngageExamDetailsById(int id);
	
	public boolean updateEngageExamDetails(EngageExamDetails eed);
	
	public EngageExamDetails findEngageExamDetailsById(int id);
	
	public List<EngageExamDetails> findEngageExamDetailsAll();

	

}
