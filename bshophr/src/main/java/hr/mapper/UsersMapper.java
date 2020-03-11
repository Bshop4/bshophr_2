package hr.mapper;

import java.util.List;

import hr.pojo.Users;
 
public interface UsersMapper {
	public List<Users> selectUsersAll();
	public Users selectUsersById(int id);
	public boolean deleteUsersById(int id);
	public boolean insertUsers(Users user);
	public boolean updateUsers(Users user);
	
}
