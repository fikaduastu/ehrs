package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.woreda;

@Repository
public class WoredaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public woreda getWoreda(String woreda) {
	woreda wor;	
	Session session = sessionFactory.getCurrentSession();
	List<?> lst = session.createQuery("FROM woreda").list();
	for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
	{
			 wor= (woreda) iterator.next(); 
			//System.out.println(ad);
    
			if(wor.getName().equals(woreda))
			{
				return wor;
				
			}
	}
		
		return new woreda();
	}
}
