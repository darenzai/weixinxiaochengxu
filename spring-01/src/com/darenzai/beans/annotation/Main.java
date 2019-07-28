package com.darenzai.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.darenzai.beans.annotation.Service.UserController;
import com.darenzai.beans.annotation.Service.UserService;
import com.darenzai.beans.annotation.repository.UserRepository;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-annotation.xml");
		TestObject to=(TestObject) ctx.getBean("testObject");
		System.out.println(to);
		
		UserController userController=(UserController) ctx.getBean("userController");
		System.out.println(userController);
		UserService userservice=(UserService) ctx.getBean("userService");
		System.out.println("userservcie");
		
		UserRepository userRepository =(UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);
	
	}
	
	
	

}
