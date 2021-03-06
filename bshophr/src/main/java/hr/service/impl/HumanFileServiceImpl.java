package hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.HumanFileMapper;
import hr.pojo.HumanFile;
import hr.service.HumanFileService;

@Service
public class HumanFileServiceImpl implements HumanFileService {

	@Autowired
	private HumanFileMapper hfm = null;

	@Override
	public List<HumanFile> findHumanFileAll(Map<String, Object> map) {
		// TODO Auto-generated method stub

		List<HumanFile> list=hfm.selectHumanFileAll(map);

		return list;
	}

	@Override
	public HumanFile findHumanFileById(int id) {
		// TODO Auto-generated method stub
		HumanFile hf = hfm.selectHumanFileById(id);
		return hf;
	}

	@Override
	public boolean removeHumanFileById(int id) {
		// TODO Auto-generated method stub
		boolean flag = hfm.deleteHumanFileById(id);

		return flag;
	}

	@Override
	public int saveHumanFile(HumanFile hf) {
		// TODO Auto-generated method stub
		int hufId = hfm.insertHumanFile(hf);
		return hufId;
	}

	@Override
	public boolean updateHumanFile(HumanFile hf) {
		// TODO Auto-generated method stub
		boolean flag = hfm.updateHumanFile(hf);
		return flag;
	}

	@Override
	public HumanFile findHumanNameFileById(int id) {
		HumanFile hf = hfm.selectHumanNameFileById(id);
		return hf;
	}

	@Override
	public List<HumanFile> findHumanFileAll() {
		// TODO Auto-generated method stub
		List<HumanFile> list=hfm.selectHumanFileAll();
		return list;
	}

	@Override
	public boolean updateHumanFileStatus(Map<String, Object> map) {
		boolean flag=hfm.updateHumanFileStatus(map);
		return flag;
	}

	@Override
	public List<HumanFile> findSplitByCS(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hfm.selectSplitByCS(map);
	}

	@Override
	public int findtCnt(int cs) {
		// TODO Auto-generated method stub
		return hfm.selectCnt(cs);
	}
	public int findCount(Map<String, Object> map) {
		int count=hfm.selectCount(map);
		return count;
	}

	@Override
	public HumanFile findByHumanName(String humanName) {
		// TODO Auto-generated method stub
		return hfm.selectByHumanName(humanName);
	}
	@Override
	public boolean updateHumanFileTwo(HumanFile hf) {
		// TODO Auto-generated method stub
		return hfm.updateHumanFileTwo(hf);
	}

	@Override
	public HumanFile findByHumanId(String humanId) {
		// TODO Auto-generated method stub
		return hfm.selectByHumanId(humanId);
	}

}
