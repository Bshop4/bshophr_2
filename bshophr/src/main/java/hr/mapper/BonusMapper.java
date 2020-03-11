package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.Bonus;

@Repository
public interface BonusMapper {
	public List<Bonus> selectBonusAll();
	public Bonus selectBonusById(int id);
	public boolean deleteBonusById(int id);
	public boolean insertBonus(Bonus bonus);
	public boolean updateBonus(Bonus bonus);
}
