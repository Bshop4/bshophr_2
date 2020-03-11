package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.TrainingMapper;
import hr.pojo.Training;
import hr.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService{
	
	@Autowired
	private TrainingMapper trainingMapper=null;
	
	@Override
	public List<Training> findTrainingAll() {
		// TODO Auto-generated method stub
		List<Training> list=trainingMapper.selectTrainingAll();
		return list;
	}

	@Override
	public Training findTrainingById(int id) {
		// TODO Auto-generated method stub
		Training Training=trainingMapper.selectTrainingById(id);
		return Training;
	}

	@Override
	public boolean removeTrainingById(int id) {
		// TODO Auto-generated method stub
		boolean flag=trainingMapper.deleteTrainingById(id);
		
		return flag;
	}

	@Override
	public boolean saveTraining(Training training) {
		// TODO Auto-generated method stub
		boolean flag=trainingMapper.insertTraining(training);
		return flag;
	}

	@Override
	public boolean updateTraining(Training training) {
		// TODO Auto-generated method stub
		boolean flag=trainingMapper.updateTraining(training);
		return flag;
	}

}
