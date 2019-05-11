package com.dbteam.service;

import java.util.List;

import com.dbteam.beans.Swb;

public interface SwbService {
	List<Swb> list();
	
	void add(Swb c);
	
	void delete(int c);
	
	void update(Swb c);
	
	List<Swb> get(int hostelId);
	
	
	
	
}
