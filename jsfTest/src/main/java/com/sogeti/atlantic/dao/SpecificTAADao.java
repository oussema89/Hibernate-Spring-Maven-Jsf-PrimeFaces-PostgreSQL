package com.sogeti.atlantic.dao;

import java.util.List;

import com.sogeti.atlantic.model.SpecificTAA;

public interface SpecificTAADao {
	void save(SpecificTAA specificTAA);

	void update(SpecificTAA specificTAA);

	void delete(SpecificTAA specificTAA);

	SpecificTAA findSpecificTAAById(int id);
	
	List<SpecificTAA> findAllSpecificTAA();
}
