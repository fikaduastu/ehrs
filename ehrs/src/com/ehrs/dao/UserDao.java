package com.ehrs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.user;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public user login(String email, String password) {
		Session session = sessionFactory.getCurrentSession();
		Query<user> theQuery = session.createQuery("from admin where email='email' & password='password' ",user.class);
		user ad = (user)theQuery.uniqueResult();
		return ad;
	}

}
