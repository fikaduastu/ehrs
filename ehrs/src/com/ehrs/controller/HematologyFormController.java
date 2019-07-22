package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.hematologyform;
import com.ehrs.service.HematologyFormService;

@Controller
@RequestMapping("/hematologyForm")
public class HematologyFormController {
	
	@Autowired
	private hematologyform hematologyForm;
	
	@Autowired
	private HematologyFormService hematologyFormService;
	
	@RequestMapping("/addHematologyForm")
	public void addHematologyForm(HttpServletRequest request,HttpServletResponse response)
	{
		hematologyForm.setBloodGroup(request.getParameter("bloodGroup"));
		hematologyForm.setRbc(request.getParameter("rbc"));
		hematologyForm.setCbc(request.getParameter("cbc"));
		hematologyForm.setMcv(request.getParameter("mcv"));
		hematologyForm.setMov(request.getParameter("mov"));
		hematologyForm.setEsr(request.getParameter("esr"));
		hematologyForm.setPlatletCount(request.getParameter("platletCount"));
		
		hematologyFormService.addHematologyForm(hematologyForm);
	}
	
	public void addHematologyForm(hematologyform hematologyForm)
	{

		
		hematologyFormService.addHematologyForm(hematologyForm);
	}
	
	@RequestMapping("/showHematologyForm")
	public void showHematologyForm(HttpServletRequest request,HttpServletResponse response)
	{
		hematologyForm.setId(Integer.parseInt(request.getParameter("id")));
		
		hematologyFormService.showHematologyForm(hematologyForm);
	}
	
	@RequestMapping("/updateHematologyForm")
	public void updateHematologyForm(HttpServletRequest request,HttpServletResponse response)
	{
		hematologyForm.setId(Integer.parseInt(request.getParameter("id")));
		hematologyForm.setBloodGroup(request.getParameter("bloodGroup"));
		hematologyForm.setRbc(request.getParameter("rbc"));
		hematologyForm.setCbc(request.getParameter("cbc"));
		hematologyForm.setMcv(request.getParameter("mcv"));
		hematologyForm.setMov(request.getParameter("mov"));
		hematologyForm.setEsr(request.getParameter("esr"));
		hematologyForm.setPlatletCount(request.getParameter("platletCount"));
		
		hematologyFormService.updateHematologyForm(hematologyForm);
	}
	
	@RequestMapping("/deleteHematologyForm")
	public void deleteHematologyForm(HttpServletRequest request,HttpServletResponse response)
	{
		hematologyForm.setId(Integer.parseInt(request.getParameter("id")));
		
		hematologyFormService.deleteHematologyForm(hematologyForm);
	}
}
