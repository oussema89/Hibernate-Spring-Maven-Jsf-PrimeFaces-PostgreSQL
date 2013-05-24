package com.sogeti.atlantic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sogeti.atlantic.dao.SpecificTAADao;
import com.sogeti.atlantic.model.SpecificTAA;

@Service
public class SpecificTAAServiceImpl implements SpecificTAAService {

	@Autowired
	private SpecificTAADao specificTAADao;

	@Transactional
	public void save(SpecificTAA specificTAA) {
		specificTAADao.save(specificTAA);
	}

	@Transactional
	public void update(SpecificTAA specificTAA) {
		specificTAADao.update(specificTAA);
	}

	@Transactional
	public void delete(SpecificTAA specificTAA) {
		specificTAADao.delete(specificTAA);
	}

	@Transactional
	public SpecificTAA findSpecificTAAById(int id) {
		return specificTAADao.findSpecificTAAById(id);
	}

	@Transactional
	public List<SpecificTAA> findAllSpecificTAA() {
		return specificTAADao.findAllSpecificTAA();
	}

	public SpecificTAADao getSpecificTAADao() {
		return specificTAADao;
	}

	public void setSpecificTAADao(SpecificTAADao specificTAADao) {
		this.specificTAADao = specificTAADao;
	}

}
