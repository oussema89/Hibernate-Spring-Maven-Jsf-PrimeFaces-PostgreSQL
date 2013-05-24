package com.sogeti.atlantic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sogeti.atlantic.dao.UserDao;
import com.sogeti.atlantic.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Transactional
	public void save(User user) {
		userDao.save(user);
	}

	@Transactional
	public void update(User user) {
		userDao.update(user);
	}

	@Transactional
	public void delete(User user) {
		userDao.delete(user);
	}

	@Transactional
	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

	@Transactional
	public List<User> findAllUsers() {
		return userDao.findAllUser();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
