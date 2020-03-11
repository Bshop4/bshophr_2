package hr.service;

import java.util.List;

import hr.pojo.Training;

public interface TrainingService {
	public List<Training> findTrainingAll();
	public Training findTrainingById(int id);
	public boolean removeTrainingById(int id);
	public boolean saveTraining(Training training);
	public boolean updateTraining(Training training);
}
