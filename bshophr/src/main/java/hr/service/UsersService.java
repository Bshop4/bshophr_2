package hr.service;

import java.util.List;

import hr.pojo.Users;

public interface UsersService {
	public List<Users> findUsersAll();
	public Users findUsersById(int id);
	public boolean removeUsersById(int id);
	public boolean saveUsers(Users users);
	public boolean updateUsers(Users users);
}
