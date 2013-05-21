package com.sogeti.atlantic.service;

import java.util.List;

import com.sogeti.atlantic.model.SpecificTAA;

public interface SpecificTAAService {
	
	void save(SpecificTAA specificTAA);

	void update(SpecificTAA specificTAA);

	void delete(SpecificTAA specificTAA);

	SpecificTAA findSpecificTAAById(int id);
	
	List<SpecificTAA> findAllSpecificTAA();
}
