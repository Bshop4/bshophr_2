package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.UsersMapper;
import hr.pojo.Users;
import hr.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersMapper usersMapper=null;
	
	@Override
	public List<Users> findUsersAll() {
		// TODO Auto-generated method stub
		List<Users> list=usersMapper.selectUsersAll();
		return list;
	}

	@Override
	public Users findUsersById(int id) {
		// TODO Auto-generated method stub
		Users Users=usersMapper.selectUsersById(id);
		return Users;
	}

	@Override
	public boolean removeUsersById(int id) {
		// TODO Auto-generated method stub
		boolean flag=usersMapper.deleteUsersById(id);
		
		return flag;
	}

	@Override
	public boolean saveUsers(Users users) {
		// TODO Auto-generated method stub
		boolean flag=usersMapper.insertUsers(users);
		return flag;
	}

	@Override
	public boolean updateUsers(Users users) {
		// TODO Auto-generated method stub
		boolean flag=usersMapper.updateUsers(users);
		return flag;
	}

}
