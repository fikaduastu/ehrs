package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ehrs.entity.hematologyform;

@Repository
public class HematologyFormDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public hematologyform addHematologyForm(hematologyform hematologyForm) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(hematologyForm);
		hematologyform ad = null;
		List<?> lst = session.createQuery("FROM hematologyform").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(hematologyform)iterator.next();
			if (ad.getBloodGroup().equals("A"))
				return ad;
		}
		ad = null;
		return ad;
	}

	@Transactional
	public void addHematologyForm1(hematologyform hematologyForm) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(hematologyForm);
	}
}
