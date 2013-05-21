package com.sogeti.atlantic.dao;

import java.util.List;

import com.sogeti.atlantic.model.TAA;

public interface TAADao {
	void delete(TAA taa);

	TAA findTAAById(int id);
	
	List<TAA> findAllTAA();
}
