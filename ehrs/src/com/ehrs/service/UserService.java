package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.UserDao;
import com.ehrs.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	

	
	public void createUser()
	{
		
	}
	public void readUser()
	{
		
	}
	public void updateUser()
	{
		
	}
	public void deleteUser()
	{
		
	}
	public User login(User user) {
		User dbUser = userDao.login(user);
		if(dbUser.getEmail().equals(user.getEmail()) && dbUser.getPassword().equals(user.getPassword()))
		return dbUser;
		else
			return user;
		
	}
}
