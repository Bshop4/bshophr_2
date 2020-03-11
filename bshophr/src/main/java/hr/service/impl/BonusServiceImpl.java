package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.BonusMapper;
import hr.pojo.Bonus;
import hr.service.BonusService;

@Service
public class BonusServiceImpl implements BonusService{
	@Autowired
	private BonusMapper bonusMapper=null;

	@Override
	public List<Bonus> findBonusAll() {
		// TODO Auto-generated method stub
		return bonusMapper.selectBonusAll();
	}

	@Override
	public Bonus findBonusById(int id) {
		// TODO Auto-generated method stub
		return bonusMapper.selectBonusById(id);
	}

	@Override
	public boolean removeBonusById(int id) {
		// TODO Auto-generated method stub
		return bonusMapper.deleteBonusById(id);
	}

	@Override
	public boolean saveBonus(Bonus bonus) {
		// TODO Auto-generated method stub
		return bonusMapper.insertBonus(bonus);
	}

	@Override
	public boolean updateBonus(Bonus bonus) {
		// TODO Auto-generated method stub
		return bonusMapper.updateBonus(bonus);
	}
	
}
