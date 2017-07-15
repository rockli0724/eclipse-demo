package com.lilin.service.impl;

import java.util.List;

import com.lilin.entity.User;

public interface UserDao {
	
	void addUser();
	
	List<User> findAll();
	
	User findByName(String name);
	
	User updateUser();
	
	void delete();
	

}
