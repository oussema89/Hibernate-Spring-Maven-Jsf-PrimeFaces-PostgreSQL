package com.sogeti.atlantic.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sogeti.atlantic.model.SpecificTAA;

@Repository
public class SpecificTAADaoImpl implements
		SpecificTAADao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(SpecificTAA specificTAA) {
		sessionFactory.getCurrentSession().save(specificTAA);
	}

	public void update(SpecificTAA specificTAA) {
		sessionFactory.getCurrentSession().update(specificTAA);
	}

	public void delete(SpecificTAA specificTAA) {
		sessionFactory.getCurrentSession().delete(specificTAA);
	}

	public SpecificTAA findSpecificTAAById(int id) {
		return (SpecificTAA) sessionFactory.getCurrentSession().load(
				SpecificTAA.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<SpecificTAA> findAllSpecificTAA() {
		return (List<SpecificTAA>) sessionFactory.getCurrentSession()
				.createQuery("from SpecificTAA").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
