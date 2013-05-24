package com.sogeti.atlantic.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sogeti.atlantic.model.TAA;

@Repository
public class TAADaoImpl implements TAADao {

	@Autowired
	private SessionFactory sessionFactory;

	public void delete(TAA taa) {
		sessionFactory.getCurrentSession().delete(taa);
	}

	public TAA findTAAById(int id) {
		return (TAA) sessionFactory.getCurrentSession().load(TAA.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<TAA> findAllTAA() {
		return (List<TAA>) sessionFactory.getCurrentSession()
				.createQuery("from TAA").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
