package com.ehrs.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ehrs.entity.examinationassesment;
import com.ehrs.entity.profile;

@Repository
public class ExaminationAssesmentDao {


	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addExaminationAssesment(examinationassesment examinationAssesment) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(examinationAssesment);
	}

	@Transactional
	public List<examinationassesment> showAllExaminationAssesment(profile pro) {
		System.out.println("examination dao "+pro);
		int id = pro.getId();
		
		Session session = sessionFactory.getCurrentSession();
		
		//List<examinationassesment> ea = (List<examinationassesment>)session.createSQLQuery("from examinationassesment exam where exam.profileId =:ids").setParameter("ids", id).addEntity(examinationassesment.class).list();
		List<examinationassesment> ea = (List<examinationassesment>) session.createQuery("from examinationassesment where profileId = :isActive")
        .setParameter("isActive", id)
        .list();
		System.out.println(ea.get(0));
		return ea;


	}

	@Transactional
	public examinationassesment getExaminationAssesment(int id) {
		Session session = sessionFactory.getCurrentSession();
		List<examinationassesment> ea = (List<examinationassesment>)session.createSQLQuery("from examinationassesment exam where exam.profileId ='" + id +"'").addEntity(examinationassesment.class).list();
		int i = ea.lastIndexOf(ea);
		return ea.get(i+1);
	}

}
