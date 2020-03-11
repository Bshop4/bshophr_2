package hr.service;

import java.util.List;

import hr.pojo.EngageSubjects;

public interface EngageSubjectsService {
	
	public boolean saveEngageSubjects(EngageSubjects es);
	
	public boolean removeEngageSubjectsById(int id);
	
	public boolean updateEngageSubjects(EngageSubjects es);
	
	public EngageSubjects findEngageSubjectsById(int id);
	
	public List<EngageSubjects> findEngageSubjectsAll();

	

}
