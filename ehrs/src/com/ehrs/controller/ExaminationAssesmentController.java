package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ehrs.entity.ExaminationAssesment;
import com.ehrs.service.ExaminationAssesmentService;

@Controller
public class ExaminationAssesmentController {

	
	private ExaminationAssesment examinationAssesment;
	
	@Autowired
	private ExaminationAssesmentService examinationAssesmentService;
	
	public void addExaminationAssesment(HttpServletRequest request, HttpServletResponse response)
	{
		examinationAssesment.setMrn(request.getParameter("mrn"));
		examinationAssesment.setDate(request.getParameter("date"));
		examinationAssesment.setPresentingCompliant(request.getParameter("presentingCompliant"));
		examinationAssesment.setHistoryOfPresentingCompliant(request.getParameter("historyOfPresentingCompliant"));
		examinationAssesment.setPastMedicalHistory(request.getParameter("pastMedicalHistory"));
		examinationAssesment.setDrugHistory(request.getParameter("drugHistory"));
		examinationAssesment.setFamilyHistory(request.getParameter("familyHistory"));
		examinationAssesment.setPersonalSocialHistory(request.getParameter("personalSocialHistory"));
		
		examinationAssesmentService.addExaminationAssesment(examinationAssesment);

	}
	public void showExaminationAssesment(HttpServletRequest request, HttpServletResponse response)
	{
		examinationAssesment.setId(Integer.parseInt(request.getParameter("id")));
		
		examinationAssesmentService.showExaminationAssesment(examinationAssesment);
	}
	public void updateExaminationAssesment(HttpServletRequest request, HttpServletResponse response)
	{
		examinationAssesment.setId(Integer.parseInt(request.getParameter("id")));
		examinationAssesment.setMrn(request.getParameter("mrn"));
		examinationAssesment.setDate(request.getParameter("date"));
		examinationAssesment.setPresentingCompliant(request.getParameter("presentingCompliant"));
		examinationAssesment.setHistoryOfPresentingCompliant(request.getParameter("historyOfPresentingCompliant"));
		examinationAssesment.setPastMedicalHistory(request.getParameter("pastMedicalHistory"));
		examinationAssesment.setDrugHistory(request.getParameter("drugHistory"));
		examinationAssesment.setFamilyHistory(request.getParameter("familyHistory"));
		examinationAssesment.setPersonalSocialHistory(request.getParameter("personalSocialHistory"));
		
		examinationAssesmentService.updateExaminationAssesment(examinationAssesment);
	}
	public void deleteExaminationAssesment(HttpServletRequest request, HttpServletResponse response)
	{
		examinationAssesment.setId(Integer.parseInt(request.getParameter("id")));
		
		examinationAssesmentService.deleteExaminationAssesment(examinationAssesment);
	}

}
