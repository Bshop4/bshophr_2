package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.Users;

 @Repository
public interface UsersMapper {
	public List<Users> selectUsersAll();
	public Users selectUsersById(int id);
	public boolean deleteUsersById(int id);
	public boolean insertUsers(Users user);
	public boolean updateUsers(Users user);
	
}
