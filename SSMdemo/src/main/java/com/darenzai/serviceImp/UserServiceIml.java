package com.darenzai.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.darenzai.mapper.UserMapper;
import com.darenzai.pojo.User;
import com.darenzai.service.UserService;

public class UserServiceIml implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	
	public void addUser(User user) {
			userMapper.addUser(user);
	}

	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.deleteUser(id);
	}

	public User findUser(int id) {
		User user=userMapper.findUser(id);
		return user;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

	public List<User> findAll() {
		List<User> All=userMapper.findAll();
		return All;
	}
	
}
