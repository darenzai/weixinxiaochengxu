package com.ssm.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;
import com.ssm.utitle.User;
public class UserServiceImpl implements UserService{  
	
	@Autowired
	private UserMapper usermapper;
	
	public void saveUser(User user) {
		usermapper.saveUser(user);
	}
	
	public boolean deleteUser(int id) {
        return usermapper.deleteUser(id);
    }
	public boolean updateUser(User user) {
        return usermapper.updateUser(user);
    }
	public User findUserById(int id) {
        User user = usermapper.findUserById(id);
        return user;
    }
	
	public List<User> findAll() {
        List<User> allUser = usermapper.findAll();
        return allUser;
    }
}
