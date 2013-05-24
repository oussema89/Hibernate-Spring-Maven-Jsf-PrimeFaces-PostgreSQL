package com.sogeti.atlantic.dao;

import java.util.List;

import com.sogeti.atlantic.model.User;

public interface UserDao {
	void save(User user);

	void update(User user);

	void delete(User user);

	User findUserById(int id);
	
	List<User> findAllUser();
}
