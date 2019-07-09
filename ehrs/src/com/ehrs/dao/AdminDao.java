package com.ehrs.dao;

import java.util.List;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ehrs.entity.admin;


@Repository
public class AdminDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void addAdmin(admin admin) {

		Session session = sessionFactory.getCurrentSession();
		 session.saveOrUpdate(admin);

	}

	@Transactional
	public admin adminLogin(String email, String password) throws NullPointerException {

			Session session = sessionFactory.getCurrentSession();
			admin ad;
			
			List<?> lst = session.createQuery("FROM admin").list(); 
			
			for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
			{
					 ad = (admin) iterator.next(); 
					//System.out.println(ad);
            
					if(ad.getPassword().equals(password) && ad.getEmail().equals(email))
					{
					//System.out.println(ad);
						return ad;
						
					}
			}
			ad=null;
			return ad;

	}

	@Transactional
	public void adminUpdate(admin ad) {
		Session session = sessionFactory.getCurrentSession();
		session.update(ad);
	}

	@Transactional
	public void deleteAdmin(admin ad) {
		Integer id = ad.getId();
		Session session = sessionFactory.getCurrentSession();
		admin admin = (admin) session.get(admin.class, id);
		session.delete(admin);

	}

	@Transactional
	public List<admin> showFederalAdmins() {
		Session session = sessionFactory.getCurrentSession();
		Query<admin> theQuery = session.createQuery("from admin where type='federal system admin'", admin.class);
		List<admin> admins = theQuery.getResultList();
		return admins;
	}

	@Transactional
	public List<admin> showRegionalAdmins() {
		Session session = sessionFactory.getCurrentSession();
		Query<admin> theQuery = session.createQuery("from admin where type='regional system admin'", admin.class);
		List<admin> admins = theQuery.getResultList();
		return admins;
	}

	@Transactional
	public admin getAdmin(int id) {
		Session session = sessionFactory.getCurrentSession();
		admin ad = null;
		List<?> lst = session.createQuery("FROM admin").list(); 
		
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(admin)iterator.next();
			if (ad.getId().equals(id))
				return ad;
		}
		ad = null;
		return ad;
	}
}
