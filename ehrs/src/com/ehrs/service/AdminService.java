package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.AdminDao;

@Service
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;

	public void addAdmin(String type, String userName, String email, String password, String region) {
		
		adminDao.addAdmin(type,userName,email,password,region);
		
	}

}
