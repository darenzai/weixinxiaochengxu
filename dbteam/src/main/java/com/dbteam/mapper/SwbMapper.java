package com.dbteam.mapper;

import java.util.List;

import com.dbteam.beans.Swb;

public interface SwbMapper {
	 public int add(Swb swb);
	
	 public void delete(int id);
	 
	 public  List<Swb> get(int hostelId);
	
	 public int update(Swb swb);
	 
	 public List<Swb> list();
}
