package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.AdminDao;
import com.ehrs.entity.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;

	public void addAdmin(Admin admin) {
		
		adminDao.addAdmin(admin);
		
	}

	public void deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	public void showAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

}
