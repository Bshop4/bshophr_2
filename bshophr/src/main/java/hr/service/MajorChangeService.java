package hr.service;

import java.util.List;

import hr.pojo.MajorChange;

public interface MajorChangeService {
	public List<MajorChange> findMajorChangeAll();
	public MajorChange findMajorChangeById(int id);
	public boolean removeMajorChangeById(int id);
	public boolean saveMajorChange(MajorChange majorchange);
	public boolean updateMajorChange(MajorChange majorchange);
}
