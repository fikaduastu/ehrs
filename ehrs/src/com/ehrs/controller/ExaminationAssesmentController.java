package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.examinationassesment;
import com.ehrs.service.ExaminationAssesmentService;

@Component
@Controller
@RequestMapping("/examinationAssesment")
public class ExaminationAssesmentController {

	@Autowired
	private examinationassesment examinationAssesment;
	
	@Autowired
	private ExaminationAssesmentService examinationAssesmentService;
	
	
	@RequestMapping("/addExaminationAssesment")
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
	
	@RequestMapping("/showExaminationAssesment")
	public void showExaminationAssesment(HttpServletRequest request, HttpServletResponse response)
	{
		examinationAssesment.setId(Integer.parseInt(request.getParameter("id")));
		
		examinationAssesmentService.showExaminationAssesment(examinationAssesment);
	}
	
	@RequestMapping("/updateExaminationAssesment")
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
	
	@RequestMapping("/deleteExaminationAssesment")
	public void deleteExaminationAssesment(HttpServletRequest request, HttpServletResponse response)
	{
		examinationAssesment.setId(Integer.parseInt(request.getParameter("id")));
		
		examinationAssesmentService.deleteExaminationAssesment(examinationAssesment);
	}

	public void addExaminationAssesment(examinationassesment examinationAssesment2) {
		
		examinationAssesmentService.addExaminationAssesment(examinationAssesment);
	}

}
