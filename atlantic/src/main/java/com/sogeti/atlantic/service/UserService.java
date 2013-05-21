package com.sogeti.atlantic.service;

import java.util.List;

import com.sogeti.atlantic.model.User;

public interface UserService {
	
	void save(User user);

	void update(User user);

	void delete(User user);

	User findUserById(int id);
	
	List<User> findAllUsers();
}
