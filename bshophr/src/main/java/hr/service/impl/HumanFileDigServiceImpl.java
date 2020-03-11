package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.HumanFileDigMapper;
import hr.pojo.HumanFileDig;
import hr.service.HumanFileDigService;

@Service
public class HumanFileDigServiceImpl implements HumanFileDigService{
	
	@Autowired
	private HumanFileDigMapper hfdm=null;
	
	@Override
	public List<HumanFileDig> findHumanFileDigAll() {
		// TODO Auto-generated method stub
		List<HumanFileDig> list=hfdm.selectHumanFileDigAll();
		return list;
	}

	@Override
	public HumanFileDig findHumanFileDigById(int id) {
		// TODO Auto-generated method stub
		HumanFileDig hfd=hfdm.selectHumanFileDigById(id);
		return hfd;
	}

	@Override
	public boolean removeHumanFileDigById(int id) {
		// TODO Auto-generated method stub
		boolean flag=hfdm.deleteHumanFileDigById(id);
		
		return flag;
	}

	@Override
	public boolean saveHumanFileDig(HumanFileDig hfd) {
		// TODO Auto-generated method stub
		boolean flag=hfdm.insertHumanFileDig(hfd);
		return flag;
	}

	@Override
	public boolean updateHumanFileDig(HumanFileDig hfd) {
		// TODO Auto-generated method stub
		boolean flag=hfdm.updateHumanFileDig(hfd);
		return flag;
	}

}
