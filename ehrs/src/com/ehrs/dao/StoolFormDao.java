package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.stoolform;

@Repository
public class StoolFormDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public stoolform addStoolForm(stoolform stoolForm) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(stoolForm);
		stoolform ad = null;
		List<?> lst = session.createQuery("FROM stoolform").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(stoolform)iterator.next();
			if (ad.getDirectToolExam().equals("normal"))
				return ad;
		}
		ad = null;
		return ad;
	}

	@Transactional
	public void addStoolForm1(stoolform stoolForm) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(stoolForm);
	}

}
