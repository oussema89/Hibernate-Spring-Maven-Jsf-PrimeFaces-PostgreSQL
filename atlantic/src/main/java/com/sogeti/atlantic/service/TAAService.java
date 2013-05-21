package com.sogeti.atlantic.service;

import java.util.List;

import com.sogeti.atlantic.model.TAA;

public interface TAAService {
	
	void delete(TAA taa);

	TAA findTAAById(int id);

	List<TAA> findAllTAA();
}
