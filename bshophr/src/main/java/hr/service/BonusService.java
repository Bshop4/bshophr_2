package hr.service;

import java.util.List;

import hr.pojo.Bonus;

public interface BonusService {
	public List<Bonus> findBonusAll();
	public Bonus findBonusById(int id);
	public boolean removeBonusById(int id);
	public boolean saveBonus(Bonus bonus);
	public boolean updateBonus(Bonus bonus);
}
