package com.dbteam.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dbteam.beans.UserSecond;
import com.dbteam.mapper.UserSecondMapper;

@Controller
@RequestMapping("/Usersecond")
public class UserSecondController {

	@Autowired
	UserSecondMapper userSecondMapper;

	@ResponseBody
	@RequestMapping(value="/addUser",method = RequestMethod.POST)
	public Map<String, Object> addUser(@RequestBody  UserSecond adminInfo) {
		
		Map<String, Object> map = new HashMap<String, Object>();

		
		if(adminInfo!=null) {
			
			String userName=adminInfo.userName;
			
			if(!userSecondMapper.selectName(userName)) {
				
			
				userSecondMapper.addUser(adminInfo);
			}else {
				map.put("Information","值重复");
				
			}
			
			
		}else {
			map.put("Information","传入信息为空");
		}


		map.put("Information","success");

		return map;
	}

}
