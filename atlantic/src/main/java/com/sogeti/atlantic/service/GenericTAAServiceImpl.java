package com.sogeti.atlantic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sogeti.atlantic.dao.GenericTAADao;
import com.sogeti.atlantic.model.GenericTAA;

@Service
public class GenericTAAServiceImpl implements GenericTAAService {
	
	@Autowired
	private GenericTAADao genericTAADao;

	@Transactional
	public void save(GenericTAA genericTAA) {
		genericTAADao.save(genericTAA);
	}

	@Transactional
	public void update(GenericTAA genericTAA) {
		genericTAADao.update(genericTAA);
	}

	@Transactional
	public void delete(GenericTAA genericTAA) {
		genericTAADao.delete(genericTAA);
	}

	@Transactional
	public GenericTAA findGenericTAAById(int id) {
		return genericTAADao.findGenericTAAById(id);
	}

	@Transactional
	public List<GenericTAA> findAllGenericTAA() {
		return genericTAADao.findAllGenericTAA();
	}

	public GenericTAADao getGenericTAADao() {
		return genericTAADao;
	}

	public void setGenericTAADao(GenericTAADao genericTAADao) {
		this.genericTAADao = genericTAADao;
	}

}
