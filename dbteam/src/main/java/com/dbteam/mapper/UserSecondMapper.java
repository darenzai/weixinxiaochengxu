package com.dbteam.mapper;

import com.dbteam.beans.UserSecond;

public interface UserSecondMapper {

	void addUser(UserSecond userSecond);
	
	
	Boolean selectName(String userName);
}
