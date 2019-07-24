package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
				if(hc.getName().equals(healthCenter))
				{
				
					return hc;
					
				}
		}
		return new healthcenter();
	}
	
	@Transactional
	public healthcenter getHealthCenters(int id)
	{
		
		Session session = sessionFactory.getCurrentSession();	
		healthcenter hc=null;
		List<?> lst = session.createQuery("FROM healthcenter").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
				 hc = (healthcenter) iterator.next(); 
				
				 	if (hc.getId() == id)
				 		return hc;
					
				
		}
		hc = null;
		return hc;
	}
	@Transactional
	public List<healthcenter> getHealthCenters(String string) {
		
		
		Session session = sessionFactory.getCurrentSession();	
		Query<healthcenter> theQuery = session.createQuery("FROM healthcenter",healthcenter.class);
		
		List<healthcenter> hc= theQuery.getResultList();
		return hc;
	}
}
