package com.sogeti.atlantic.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sogeti.atlantic.model.GenericTAA;

@Repository
public class GenericTAADaoImpl implements GenericTAADao {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(GenericTAA genericTAA) {
		sessionFactory.getCurrentSession().save(genericTAA);
	}

	public void update(GenericTAA genericTAA) {
		sessionFactory.getCurrentSession().update(genericTAA);
	}

	public void delete(GenericTAA genericTAA) {
		sessionFactory.getCurrentSession().delete(genericTAA);
	}

	public GenericTAA findGenericTAAById(int id) {
		return (GenericTAA) sessionFactory.getCurrentSession().load(
				GenericTAA.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<GenericTAA> findAllGenericTAA() {
		return (List<GenericTAA>) sessionFactory.getCurrentSession()
				.createQuery("from GenericTAA").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
