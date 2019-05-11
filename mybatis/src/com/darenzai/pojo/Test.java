package com.darenzai.pojo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
 
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	
	
	public static void main(String[] args) throws IOException {
		
	String resource="mybatis.xml";
	
	InputStream inputStream= Resources.getResourceAsStream(resource);
	
	
	 SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	
	SqlSession session=sqlSessionFactory.openSession();
	
	List<Person> cs=session.selectList("listPerson");
	
	for(Person c:cs) {
		System.out.println(c.getName());
		System.out.println(c.getSay());
	}
	
		
		
		
	}
	
	
}
