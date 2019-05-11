package com.darenzai.mapper;



import java.util.List;

import com.darenzai.pojo.User;

public interface UserMapper {
	//添加用户
	void addUser(User user);
	//更新用户
	boolean updateUser(User user);
	//删除用户
	boolean deleteUser(int id);
	//查找用户
	User findUser(int id);
	//列出所有用户
	List<User> findAll();
}
