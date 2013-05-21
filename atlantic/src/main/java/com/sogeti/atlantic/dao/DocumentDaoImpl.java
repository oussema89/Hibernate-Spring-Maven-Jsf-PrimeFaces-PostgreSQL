package com.sogeti.atlantic.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sogeti.atlantic.model.Document;

@Repository
public class DocumentDaoImpl implements DocumentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(Document document) {
		sessionFactory.getCurrentSession().save(document);
	}
	
	public void update(Document document) {
		sessionFactory.getCurrentSession().update(document);
	}
	
	public void delete(Document document) {
		sessionFactory.getCurrentSession().delete(document);
	}
	
	public Document findDocumentById(int id) {
		return (Document) sessionFactory.getCurrentSession().load(
				Document.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Document> findAllDocuments() {
		return (List<Document>) sessionFactory.getCurrentSession()
				.createQuery("from Document").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
