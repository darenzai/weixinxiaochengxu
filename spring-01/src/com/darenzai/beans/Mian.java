package com.darenzai.beans;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
	
	
	public static void main(String[] args) {
		/**
		//创建HelloWorld对象
		HelloWorld helloWorld=new HelloWorld();
		//为name赋值
		helloWorld.setName("darenzai");
		
		**/
		//1创建spring ioc的容器
		ApplicationContext hello=new ClassPathXmlApplicationContext("applicatoncontext.xml");
		HelloWorld helloWorld= (HelloWorld)hello.getBean("helloworld");
		helloWorld.hello();
		//helloWorld.hello();
		
		Car car=(Car)hello.getBean(Car.class);
		System.out.println(car);
		Person person =(Person) hello.getBean("person");
		System.out.println(person);
	}
}
