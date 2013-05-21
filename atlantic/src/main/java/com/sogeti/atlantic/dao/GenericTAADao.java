package com.sogeti.atlantic.dao;

import java.util.List;

import com.sogeti.atlantic.model.GenericTAA;

public interface GenericTAADao {
	void save(GenericTAA genericTAA);

	void update(GenericTAA genericTAA);

	void delete(GenericTAA genericTAA);

	GenericTAA findGenericTAAById(int id);
	
	List<GenericTAA> findAllGenericTAA();
}
