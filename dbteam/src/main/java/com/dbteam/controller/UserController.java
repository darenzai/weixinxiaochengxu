package com.dbteam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dbteam.beans.User;
import com.dbteam.mapper.UserMapper;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserMapper userMapper;
 
	
	
	
	@ResponseBody
	@RequestMapping("getUser")
	public Map<String, Object> getUser(String userName) {
		

		User user = userMapper.getUser(userName);

		Map<String, Object> map = new HashMap<String, Object>();
		
		
		System.out.println(userName);
		
		
		if(user!=null) {
			
			map.put("userGrade", user.userGrade);
			
			
		}else {
			map.put("userGrade",0);
		}
		
		
		
		
		
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping("saveUser")
	public Map<String,Object> saveUser(String userName) {
		Map<String, Object> map=new HashMap<String,Object>();

		userMapper.saveUser(userName);
		
		
		 
		return map;
		
		
		
		
		
		
		
		
		

	}
	
}
