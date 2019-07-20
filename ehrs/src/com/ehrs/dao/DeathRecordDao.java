package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.deathrecord;

@Repository
public class DeathRecordDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public deathrecord addDeathRecord(deathrecord deathRecord) {
		Session session = sessionFactory.getCurrentSession();
		deathrecord ad = null;
		session.saveOrUpdate(deathRecord);
		List<?> lst = session.createQuery("FROM deathrecord").list();
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(deathrecord)iterator.next();
			if (ad.getFuneralPlace().equals("somewhere"))
				return ad;
		}
		ad = null;
		return ad;

	}
	@Transactional
	public void addDeathRecord1(deathrecord deathRecord) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(deathRecord);
		
	}
}
