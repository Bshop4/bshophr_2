package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.EngageAnswerDetails;

@Repository
public interface EngageAnswerDetailsMapper {

	public boolean insertEngageAnswerDetails(EngageAnswerDetails ead);

	public boolean deleteEngageAnswerDetailsById(int id);

	public boolean updateEngageAnswerDetails(EngageAnswerDetails ead);

	public EngageAnswerDetails selectEngageAnswerDetailsById(int id);

	public List<EngageAnswerDetails> selectEngageAnswerDetailsAll();

}
