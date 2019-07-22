package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.ExaminationAssesmentDao;
import com.ehrs.entity.examinationassesment;

@Service
public class ExaminationAssesmentService {

	@Autowired
	private ExaminationAssesmentDao examinationAssesmentDao;

	public void updateExaminationAssesment(examinationassesment examinationAssesment)
	{
		
	}
	public void deleteExaminationAssesment(examinationassesment examinationAssesment)
	{
		
	}
	public void addExaminationAssesment(examinationassesment examinationAssesment) {
		
		examinationAssesmentDao.addExaminationAssesment(examinationAssesment);
	}

	public void showExaminationAssesment(examinationassesment examinationAssesment) {
		// TODO Auto-generated method stub
		
	}
}
