package com.dbteam.serviceIml;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbteam.beans.UserSecond;
import com.dbteam.mapper.UserSecondMapper;
import com.dbteam.service.UserSecondService;

public class UserSecondIml  implements UserSecondService{

	@Autowired
	UserSecondMapper userSecondMapper;
	
	
	
	public void addUser(UserSecond userSecond) {
		userSecondMapper.addUser(userSecond);
	}
	
	
	
	@Override
	public Boolean selectName(String userSecond) {
		
		return null;
	}

	
	
	
	
}
