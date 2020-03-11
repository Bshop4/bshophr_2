package hr.service;

import java.util.List;

import hr.pojo.EngageAnswerDetails;

public interface EngageAnswerDetailsService {

	public boolean saveEngageAnswerDetails(EngageAnswerDetails ead);

	public boolean removeEngageAnswerDetailsById(int id);

	public boolean updateEngageAnswerDetails(EngageAnswerDetails ead);

	public EngageAnswerDetails findEngageAnswerDetailsById(int id);

	public List<EngageAnswerDetails> findEngageAnswerDetailsAll();

}
