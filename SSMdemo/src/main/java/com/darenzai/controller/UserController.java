package com.darenzai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darenzai.pojo.User;
import com.darenzai.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("add")
	private String add(Model model,User user) {
		if(user	!=null)
			userService.addUser(user);
		return "list";
	}
	
	@RequestMapping("update")
	public String Update(Model model,User user) {
		userService.updateUser(user);
		
		return "list";
	}
	@RequestMapping("list")
	public String allUser(Model model) {
		
		List<User> user=userService.findAll();
		model.addAttribute("all",user);
		
		return "list";
		
	}
	@RequestMapping("getuser")
	public String getUser(int id,Model model) {
		model.addAttribute("user",userService.findUser(id));
		return "getuser";
	}
	
	@RequestMapping("delete")
	public String deleteUser(Model model,int id) {
		model.addAttribute("user",userService.deleteUser(id));
		return "list";
	}
	
	
	
	
}
