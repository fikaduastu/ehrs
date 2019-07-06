package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.healthcenter;
import com.ehrs.service.HealthCenterService;

@Controller
@RequestMapping("/healthCenter")
public class HealthCenterController {

	@Autowired
	private healthcenter healthCenter;
	
	@Autowired
	private HealthCenterService healthCenterService;
	
	@RequestMapping("/addHealthCenter")
	public void addHealthCenter(healthcenter healthCenter)
	{
		healthCenterService.addHealthCenter(healthCenter);
	}
	
	@RequestMapping("/showHealthCenter")
	public void showHealthCenter(HttpServletRequest request, HttpServletResponse response)
	{
		healthCenter.setId(Integer.parseInt(request.getParameter("name")));	
		
		healthCenterService.showHealthCenter(healthCenter);
	}
	
	@RequestMapping("/updateHealthCenter")
	public void updateHealthCenter(HttpServletRequest request, HttpServletResponse response)
	{
		healthCenter.setId(Integer.parseInt(request.getParameter("name")));
		healthCenter.setName(request.getParameter("name"));
		healthCenter.setType(request.getParameter("type"));
		healthCenter.setPhoneNumber(request.getParameter("phoneNumber"));
		healthCenter.setEmail(request.getParameter("email"));
		healthCenter.setWebsite(request.getParameter("website"));
		
		healthCenterService.updateHealthCenter(healthCenter);
	}
	
	@RequestMapping("/deleteHealthCenter")
	public void deleteHealthCenter(HttpServletRequest request, HttpServletResponse response)
	{
		healthCenter.setId(Integer.parseInt(request.getParameter("name")));	
		
		healthCenterService.deleteHealthCenter(healthCenter);
	}
}
