package com.darenzai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darenzai.mapper.SwbMapper;
import com.darenzai.pojo.Swb;
import com.darenzai.service.SwbService;
@Service
public class SwbServiceImpl implements SwbService{
	
	@Autowired
	SwbMapper swbMapper;
	public List<Swb> list() {
		// TODO Auto-generated method stub
		return swbMapper.list();
	}

}
