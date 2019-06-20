package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.UserDao;
import com.ehrs.entity.user;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public void updateUser(user user)
	{
		
	}
	public void deleteUser(user user)
	{
		
	}
	public void addUser(user user) {
		// TODO Auto-generated method stub
		
	}
	public void showUser(user user) {
		// TODO Auto-generated method stub
		
	}
	public user login(String email, String password) {
	
		return userDao.login(email,password);
	}
}
