package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.PhysicalExaminationDao;
import com.ehrs.entity.physicalexamination;

@Service
public class PhysicalExaminationService {

	@Autowired
	private PhysicalExaminationDao physicalExaminationDao;
	
	public void addPhysicalExamination(physicalexamination physicalExamination) {
		
		physicalExaminationDao.addPhysicalExamination1(physicalExamination);
	}

	public void showPhysicalExamination(physicalexamination physicalExamination) {
		// TODO Auto-generated method stub
		
	}

	public void updatePhysicalExamination(physicalexamination physicalExamination) {
		// TODO Auto-generated method stub
		
	}

	public void deletePhysicalExamination(physicalexamination physicalExamination) {
		// TODO Auto-generated method stub
		
	}
	

}
