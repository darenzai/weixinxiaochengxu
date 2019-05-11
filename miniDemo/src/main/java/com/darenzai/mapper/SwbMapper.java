package com.darenzai.mapper;

import java.util.List;

import com.darenzai.pojo.Swb;

public interface SwbMapper {
	
	public int add(Swb swb);
	
	public void delete(int id);
	
	public Swb get(Swb swb);
	
	public int updata(Swb swb);
	
	public List<Swb> list();
	
	public int count();
}
