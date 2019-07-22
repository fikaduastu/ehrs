package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.urineform;


@Repository
public class UrineFormDao {


	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public urineform addUrineForm(urineform urineForm) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(urineForm);
		urineform ad = null;
		List<?> lst = session.createQuery("FROM urineform").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(urineform)iterator.next();
			if (ad.getPh().equals("7"))
				return ad;
		}
		ad = null;
		return ad;
	}
	
	@Transactional
	public void addUrineForm1(urineform urineForm)
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(urineForm);
	}
}
