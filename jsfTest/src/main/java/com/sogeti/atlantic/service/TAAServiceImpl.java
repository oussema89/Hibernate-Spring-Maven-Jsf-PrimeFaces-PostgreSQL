package com.sogeti.atlantic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sogeti.atlantic.dao.TAADao;
import com.sogeti.atlantic.model.TAA;

@Service
public class TAAServiceImpl implements TAAService {

	@Autowired
	private TAADao taaDao;

	@Transactional
	public void delete(TAA taa) {
		taaDao.delete(taa);
	}

	@Transactional
	public TAA findTAAById(int id) {
		return taaDao.findTAAById(id);
	}

	@Transactional
	public List<TAA> findAllTAA() {
		return taaDao.findAllTAA();
	}

	public TAADao getTaaDao() {
		return taaDao;
	}

	public void setTaaDao(TAADao taaDao) {
		this.taaDao = taaDao;
	}

}
