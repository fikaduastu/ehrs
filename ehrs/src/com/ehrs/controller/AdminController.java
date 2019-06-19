package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.service.AdminService;

@Controller
public class AdminController {
	
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/addAdmin")
	public void addAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		String type = request.getParameter("type");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String region = request.getParameter("region");
		
		adminService.addAdmin(type,userName,email,password,region);
	}
}
