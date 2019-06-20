package com.ehrs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ehrs.entity.Admin;

@Repository
public class AdminDao {
	
	private SessionFactory sessionFactory;

	public void addAdmin(Admin admin) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(admin);
	}

}
