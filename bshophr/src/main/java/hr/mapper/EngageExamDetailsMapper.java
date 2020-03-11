package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageExamDetails;

@Repository
public interface EngageExamDetailsMapper {
	
	public boolean insertEngageExamDetails(EngageExamDetails eed);
	
	public boolean deleteEngageExamDetailsById(int id);
	
	public boolean updateEngageExamDetails(EngageExamDetails eed);
	
	public EngageExamDetails selectEngageExamDetailsById(int id);
	
	public List<EngageExamDetails> selectEngageExamDetailsAll();

	

}
