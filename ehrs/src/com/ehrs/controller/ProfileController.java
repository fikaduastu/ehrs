package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.profile;
import com.ehrs.service.ProfileService;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	
	
	private profile profile;
	
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/addProfile")
	public void addProfile(HttpServletRequest request,HttpServletResponse response)
	{
		profile.setFirstName(request.getParameter("firstName"));
		profile.setLastName(request.getParameter("lastName"));
		profile.setMiddleName(request.getParameter("middleName"));
		profile.setGender(request.getParameter("gender"));
		profile.setOccupation(request.getParameter("occupation"));
		profile.setHouseNumber(request.getParameter("houseNumber"));
		profile.setMobileNumber(request.getParameter("mobileNumber"));
		profile.setEmmergencyContactName(request.getParameter("emmergencyContactName"));
		profile.setEmmergencyContactPhone(request.getParameter("emmergencyContactPhone"));
		profile.setStatus(request.getParameter("status"));
		
		profileService.addProfile(profile);

	}
	
	@RequestMapping("/showProfile")
	public void showProfile(HttpServletRequest request,HttpServletResponse response)
	{
		profile.setId(Integer.parseInt(request.getParameter("id")));
		
		profileService.showProfile(profile);
	}
	
	@RequestMapping("/updateProfile")
	public void updateProfile(HttpServletRequest request,HttpServletResponse response)
	{
		profile.setId(Integer.parseInt(request.getParameter("id")));
		profile.setFirstName(request.getParameter("firstName"));
		profile.setLastName(request.getParameter("lastName"));
		profile.setMiddleName(request.getParameter("middleName"));
		profile.setGender(request.getParameter("gender"));
		profile.setOccupation(request.getParameter("occupation"));
		profile.setHouseNumber(request.getParameter("houseNumber"));
		profile.setMobileNumber(request.getParameter("mobileNumber"));
		profile.setEmmergencyContactName(request.getParameter("emmergencyContactName"));
		profile.setEmmergencyContactPhone(request.getParameter("emmergencyContactPhone"));
		profile.setStatus(request.getParameter("status"));
		
		profileService.updateProfile(profile);
	}
	
	@RequestMapping("/deleteProfile")
	public void deleteProfile(HttpServletRequest request,HttpServletResponse response)
	{
		profile.setId(Integer.parseInt(request.getParameter("id")));
		
		profileService.deleteProfile(profile);
	}
}
