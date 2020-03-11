package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.Training;
@Repository
public interface TrainingMapper {
	public List<Training> selectTrainingAll();
	public Training selectTrainingById(int id);
	public boolean deleteTrainingById(int id);
	public boolean insertTraining(Training training);
	public boolean updateTraining(Training training);
	
}
