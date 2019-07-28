package com.ssm.service;

import java.util.List;

import com.ssm.utitle.User;

public interface UserService {
	void saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserById(int id);

    List<User> findAll();

}
