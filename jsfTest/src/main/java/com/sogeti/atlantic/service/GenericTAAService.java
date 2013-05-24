package com.sogeti.atlantic.service;

import java.util.List;

import com.sogeti.atlantic.model.GenericTAA;

public interface GenericTAAService {
	
	void save(GenericTAA genericTAA);

	void update(GenericTAA genericTAA);

	void delete(GenericTAA genericTAA);

	GenericTAA findGenericTAAById(int id);
	
	List<GenericTAA> findAllGenericTAA();
}
