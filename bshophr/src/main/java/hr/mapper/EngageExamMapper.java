package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageExam;

@Repository
public interface EngageExamMapper {
	
	public boolean insertEngageExam(EngageExam ee);
	
	public boolean deleteEngageExamById(int id);
	
	public boolean updateEngageExam(EngageExam ee);
	
	public EngageExam selectEngageExamById(int id);
	
	public List<EngageExam> selectEngageExamAll();

	

}
