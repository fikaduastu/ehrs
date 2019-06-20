package com.ehrs.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ehrs.entity.admin;


@Repository
public class AdminDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addAdmin(admin admin) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(admin);
		
	}
	@Transactional
	public admin adminLogin(String email,String password) {
	
		Session session = sessionFactory.getCurrentSession();
		Query<admin> theQuery = session.createQuery("from admin where email='email' & password='password' ",admin.class);
		admin ad = (admin)theQuery.uniqueResult();
		return ad;

	}

}
