package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.biologicaldetail;

@Repository
public class BiologicalDetailDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public biologicaldetail addBiologicalDetail(biologicaldetail biologicalDetail) {
		Session session = sessionFactory.getCurrentSession();
		biologicaldetail ad = null;
		session.saveOrUpdate(biologicalDetail);
		List<?> lst = session.createQuery("FROM biologicaldetail").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(biologicaldetail)iterator.next();
			if (ad.getBloodType().equals("A"))
				return ad;
		}
		ad = null;
		return ad;
	}

}
