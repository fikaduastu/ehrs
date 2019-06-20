package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.urineform;
import com.ehrs.service.UrineFormService;


@Controller
@RequestMapping("/urineForm")
public class UrineFormController {
	
	private urineform urineForm;
	@Autowired
	private UrineFormService urineFormService;

	@RequestMapping("/addUrineForm")
	public void addUrineForm(HttpServletRequest request,HttpServletResponse response)
	{
		urineForm.setWbc(request.getParameter("wbc"));
		urineForm.setRbc(request.getParameter("rbc"));
		urineForm.setCast(request.getParameter("cast"));
		urineForm.setGramStein(request.getParameter("gramStein"));
		urineForm.setWetSweat(request.getParameter("wetSweat"));
		urineForm.setGlucose(request.getParameter("glucose"));
		urineForm.setPh(request.getParameter("ph"));
		urineForm.setUricAcid(request.getParameter("uricAcid"));
		
		urineFormService.addUrineForm(urineForm);
	}
	
	@RequestMapping("/showUrineForm")
	public void showUrineForm(HttpServletRequest request,HttpServletResponse response)
	{
		urineForm.setId(Integer.parseInt(request.getParameter("id")));
		
		urineFormService.showUrineForm(urineForm);	
	}
	
	@RequestMapping("/updateUrineForm")
	public void updateUrineForm(HttpServletRequest request,HttpServletResponse response)
	{
		urineForm.setId(Integer.parseInt(request.getParameter("id")));
		urineForm.setWbc(request.getParameter("wbc"));
		urineForm.setRbc(request.getParameter("rbc"));
		urineForm.setCast(request.getParameter("cast"));
		urineForm.setGramStein(request.getParameter("gramStein"));
		urineForm.setWetSweat(request.getParameter("wetSweat"));
		urineForm.setGlucose(request.getParameter("glucose"));
		urineForm.setPh(request.getParameter("ph"));
		urineForm.setUricAcid(request.getParameter("uricAcid"));
		
		urineFormService.updateUrineForm(urineForm);	
	}
	
	@RequestMapping("/deleteUrineForm")
	public void deleteUrineForm(HttpServletRequest request,HttpServletResponse response)
	{
		urineForm.setId(Integer.parseInt(request.getParameter("id")));
		
		urineFormService.deleteUrineForm(urineForm);	
	}
}
