package com.sogeti.atlantic.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sogeti.atlantic.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	public User findUserById(int id) {
		return (User) sessionFactory.getCurrentSession().load(
				User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		return (List<User>) sessionFactory.getCurrentSession()
				.createQuery("from User").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
