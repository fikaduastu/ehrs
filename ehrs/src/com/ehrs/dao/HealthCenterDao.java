package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.healthcenter;

@Repository
public class HealthCenterDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addHealthCenter(healthcenter healthCenter)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(healthCenter);
	}
	
	@Transactional
	public healthcenter getHealthCenter(String healthCenter)
	{
		healthcenter hc;
		Session session = sessionFactory.getCurrentSession();	
		List<?> lst = session.createQuery("FROM healthcenter").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
				 hc = (healthcenter) iterator.next(); 
				//System.out.println(ad);
        
				if(hc.getName().equals(healthCenter))
				{
				
					return hc;
					
				}
		}
		return new healthcenter();
	}
}
