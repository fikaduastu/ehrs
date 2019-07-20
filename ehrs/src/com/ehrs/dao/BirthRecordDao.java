package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ehrs.entity.birthrecord;


@Repository
public class BirthRecordDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public birthrecord addBirthRecord(birthrecord birthRecord) {
		Session session = sessionFactory.getCurrentSession();
		birthrecord ad = null;
		session.saveOrUpdate(birthRecord);
		List<?> lst = session.createQuery("FROM birthrecord").list();
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(birthrecord)iterator.next();
			if (ad.getChildName().equals("mama"))
				return ad;
		}
		ad = null;
		return ad;
	}
	
}
