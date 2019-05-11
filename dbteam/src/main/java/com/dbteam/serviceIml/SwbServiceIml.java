package com.dbteam.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbteam.beans.Swb;
import com.dbteam.mapper.SwbMapper;
import com.dbteam.service.SwbService;

@Service
public class SwbServiceIml implements SwbService {
	@Autowired
	SwbMapper swbMapper;

	public List<Swb> list() {
		return swbMapper.list();

	}

	public void add(Swb c) {
		swbMapper.add(c);
	}

	public void update(Swb c) {
		swbMapper.update(c);
	}

	public void delete(int id) {

		swbMapper.delete(id);
	}

	public List<Swb> get(int hostelId) {

		return swbMapper.get(hostelId);
	}
}
