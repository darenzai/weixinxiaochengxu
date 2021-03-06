package com.atguigu.crud.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.portlet.MockRenderRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.atguigu.crud.bean.Employee;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.xdevapi.Result;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {
	@Autowired
	WebApplicationContext context;
	
	MockMvc mockmvc;
	@Before
	public void initMokcMvc() {
		mockmvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void testPage() throws Exception {
		MvcResult result=mockmvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "5")).andReturn();
		MockHttpServletRequest request=result.getRequest();
		PageInfo pi=(PageInfo) request.getAttribute("pageInfo");
		System.out.println("当前页码："+pi.getPageNum());
		System.out.println("总页码："+pi.getPages());
		System.out.println("总记录数"+pi.getTotal());
		
		List<Employee> list=pi.getList();
		for(Employee employee:list) {
			System.out.println("ID" +employee.getEmpId()+"==>NAME"+employee.getEmpName());
		}
		
	}
	
}
