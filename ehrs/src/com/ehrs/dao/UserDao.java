package com.ehrs.dao;

import java.util.Iterator;
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
		user ad;
		Session session = sessionFactory.getCurrentSession();
		List<?> lst = session.createQuery("FROM user").list(); 
		
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
				 ad = (user) iterator.next(); 
				//System.out.println(ad);
        
				if(ad.getPassword().equals(password) && ad.getEmail().equals(email))
				{
				//System.out.println(ad);
					return ad;
					
				}
		}	
		ad = null;
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
	@Transactional
	public List<user> showAllUser() {
		Session session = sessionFactory.getCurrentSession();
		Query<user> theQuery = session.createQuery("from user where organizationId='1' ",user.class);
		List<user> us = theQuery.getResultList();
		return us;
	}

}
