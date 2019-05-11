package com.dbteam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dbteam.beans.Swb;
import com.dbteam.mapper.SwbMapper;

@Controller
@RequestMapping("")
public class SwbController {
	@Autowired
	SwbMapper swbMapper;
	@ResponseBody
	@RequestMapping("list")
	public Object listSwb(HttpServletRequest req,HttpServletResponse resp) {
		System.out.println("我被访问了");
		List<Swb> cs=swbMapper.list();
		//mav.addObject("cs",cs);
		//mav.setViewName("list");
		//return mav;
		//HashMap map=new HashMap();
		//map.put("data",cs);
		return cs;
		
		
	}
	@ResponseBody
	@RequestMapping(value="/listSwb",method=RequestMethod.GET)
	public Map<String,Object> listSwb(){
		
		Map<String,Object> modelMap =new HashMap<String, Object>();
		List<Swb> list=swbMapper.list();
		modelMap.put("swblist",list);
		
		
		return modelMap;
		
	}
	//@RequestParam(value="hostelId",required=false,defaultValue="1")
	@ResponseBody
	@RequestMapping(value="/getSwb",method=RequestMethod.GET)
	public Map<String,Object> getSwb(Integer hostelId){
		
		Map<String,Object> modelMap =new HashMap<String, Object>();
		List<Swb> list=swbMapper.get(hostelId);
		modelMap.put("gethostel",list);
		//System.out.println("1112");
		System.out.println(hostelId);
		
		return modelMap;
		
	}
	@ResponseBody
	@RequestMapping(value="/deleteSwb",method=RequestMethod.GET)
	public void deleteSwb(Integer id) {
		
		swbMapper.delete(id);
		
		
	}
	
	@ResponseBody
	@RequestMapping(value="/test")
	public Map<String,Object> UserInfo(@RequestParam(value="UserInfo",required=false,defaultValue="1")String UserInfo){
		
		System.out.println(UserInfo);
		
		Map<String,Object> test=new HashMap<String, Object>();
		
		test.put("success",true);
		
		
		
		return test;
		
		
	}
	
	
	
	
}
