package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.HumanFile;

@Repository
public interface HumanFileMapper {
	public List<HumanFile> selectHumanFileAll();

	public HumanFile selectHumanFileById(int id);

	// 向思宇加的用salary_standard_id查名字
	public HumanFile selectHumanNameFileById(int id);

	public boolean deleteHumanFileById(int id);

	public boolean insertHumanFile(HumanFile hf);

	public boolean updateHumanFile(HumanFile hf);

}
