package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ehrs.dao.AdminDao;
import com.ehrs.entity.admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;

	public void addAdmin(admin admin) {
		
	adminDao.addAdmin(admin);
		
	}

	public void deleteAdmin(admin admin) {
		adminDao.deleteAdmin(admin);
		
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public admin showAdmin(admin admin) {
		return admin;
		// TODO Auto-generated method stub
		
	}

	public void updateAdmin(admin admin) {
		adminDao.adminUpdate(admin);
		
	}

	public admin adminLogin(String email, String password) {
		// TODO Auto-generated method stub
		return adminDao.adminLogin(email, password);
	}

}
