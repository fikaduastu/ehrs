package com.ehrs.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ehrs.entity.physicalexamination;


@Repository
public class PhysicalExaminationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public physicalexamination addPhysicalExamination(physicalexamination physicalExamination) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(physicalExamination);
		physicalexamination ad = null;
		List<?> lst = session.createQuery("FROM physicalexamination").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(physicalexamination)iterator.next();
			if (ad.getBp().equals("normal"))
				return ad;
		}
		ad = null;
		return ad;
	}
	
	@Transactional
	public void addPhysicalExamination1(physicalexamination physicalExamination) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(physicalExamination);

	}

	@Transactional
	public physicalexamination getPhysicalExamination(int idnum) {
		Session session = sessionFactory.getCurrentSession();
		physicalexamination ad = null;
		List<?> lst = session.createQuery("FROM physicalexamination").list(); 
		for (Iterator<?> iterator = lst.iterator(); iterator.hasNext();)
		{
			ad =(physicalexamination)iterator.next();
			if (ad.getId() == idnum)
				return ad;
		}
		ad = null;
		return ad;
	}
}
