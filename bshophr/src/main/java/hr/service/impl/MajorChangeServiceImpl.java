package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.MajorChangeMapper;
import hr.pojo.MajorChange;
import hr.service.MajorChangeService;

@Service
public class MajorChangeServiceImpl implements MajorChangeService{
	
	@Autowired
	private MajorChangeMapper majorChangeMapper=null;
	
	@Override
	public List<MajorChange> findMajorChangeAll() {
		// TODO Auto-generated method stub
		List<MajorChange> list=majorChangeMapper.selectMajorChangeAll();
		return list;
	}

	@Override
	public MajorChange findMajorChangeById(int id) {
		// TODO Auto-generated method stub
		MajorChange majorchange=majorChangeMapper.selectMajorChangeById(id);
		return majorchange;
	}

	@Override
	public boolean removeMajorChangeById(int id) {
		// TODO Auto-generated method stub
		boolean flag=majorChangeMapper.deleteMajorChangeById(id);
		
		return flag;
	}

	@Override
	public boolean saveMajorChange(MajorChange majorchange) {
		// TODO Auto-generated method stub
		boolean flag=majorChangeMapper.insertMajorChange(majorchange);
		return flag;
	}

	@Override
	public boolean updateMajorChange(MajorChange majorchange) {
		// TODO Auto-generated method stub
		boolean flag=majorChangeMapper.updateMajorChange(majorchange);
		return flag;
	}

	@Override
	public List<MajorChange> findSplit(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return majorChangeMapper.selectSplit(map);
	}

	@Override
	public int findtCnt(short cs) {
		// TODO Auto-generated method stub
		return majorChangeMapper.selectCnt(cs);
	}
	
	@Override
	public int findCntTwo() {
		// TODO Auto-generated method stub
		return majorChangeMapper.selectCntTwo();
	}
	
	@Override
	public List<MajorChange> findSplitTwo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return majorChangeMapper.selectSplitTwo(map);
	}

}
