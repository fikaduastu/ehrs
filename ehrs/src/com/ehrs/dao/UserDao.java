package com.ehrs.dao;

import org.springframework.stereotype.Repository;

import com.ehrs.entity.User;

@Repository
public class UserDao {

	public User login(User user) {
		
		return new User();
	}

}
