package com.darenzai.service;

import java.util.List;

import com.darenzai.pojo.User;

public interface UserService {
	void addUser(User user);
	boolean deleteUser(int id);
	User findUser(int id);
	boolean updateUser(User user);
	List<User> findAll();
	
	
}
