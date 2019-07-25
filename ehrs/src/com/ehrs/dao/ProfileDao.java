package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ehrs.entity.profile;

@Repository
public class ProfileDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	@Transactional
	public void addProfile(profile profile)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(profile);
		
	}
	
	@Transactional	
	public void updateProfile(profile profile)
	{
		Session session = sessionFactory.getCurrentSession();
		session.update(profile);
	}
	@Transactional	
	public void deleteProfile(profile pro)
	{
		Integer id = pro.getId();
		Session session = sessionFactory.getCurrentSession();
		profile profile = (profile) session.get(profile.class, id);
		session.delete(profile);
	}
	
	@Transactional
	public profile getProfile(int id)
	{
		
		profile pro;
		Session session = sessionFactory.getCurrentSession();	
		List<?> lst = session.createQuery("FROM profile").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
				 pro = (profile) iterator.next(); 
				if(pro.getId() == id)
				{
				
					//System.out.println("profile dao");
					return pro;
					
				}
		}
		return new profile();
	}

	@Transactional
	public profile getProfile(String parameter) {
		profile pro;
		Session session = sessionFactory.getCurrentSession();	
		List<?> lst = session.createQuery("FROM profile").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
				 pro = (profile) iterator.next(); 
				if(pro.getFirstName().equals(parameter))
				{
				
					
					return pro;
					
				}
		}
		return new profile();
	}
}
