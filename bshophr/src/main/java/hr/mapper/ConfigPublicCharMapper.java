package hr.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigPublicChar;
import hr.pojo.ConfigPublicChar;

@Repository
public interface ConfigPublicCharMapper {
	public List<ConfigPublicChar> selectConfigPublicCharAll();
	public ConfigPublicChar selectConfigPublicCharById(int id);
	public boolean deleteConfigPublicCharById(int id);
	public boolean insertConfigPublicChar(ConfigPublicChar configPublicChar);
	public boolean updateConfigPublicChar(ConfigPublicChar configPublicChar);
}
