package com.ehrs.dao;

import java.util.List;

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
		//finished
	}

	@Transactional
	public  List<user> showHealthCenterAdmins() {
		Session session = sessionFactory.getCurrentSession();
		Query<user> theQuery = session.createQuery("from user where position='health center admin' ",user.class);
		List<user> us = theQuery.getResultList();
		return us;
		// finished
	}

	@Transactional
	public void deleteUser(user user) {
		int id = user.getId();
		Session session = sessionFactory.getCurrentSession();
		user us = (user)session.get(user.class, id);
		session.delete(us);
		//finished
	}
	@Transactional
	public void updateUser(user user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
		//finished
	}

	@Transactional
	public void addUser(user user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		
	}

}
