package com.ehrs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.Admin;
import com.ehrs.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
	
	@Autowired
	private AdminService adminService;
	
	private Admin admin;
	
	@RequestMapping("/addAdmin")
	public void addAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		admin.setType(request.getParameter("type"));;
		admin.setUserName(request.getParameter("userName"));
		admin.setEmail(request.getParameter("email"));
		admin.setPassword(request.getParameter("password"));
		admin.setRegion(request.getParameter("region"));
		adminService.addAdmin(admin);
	}
	
	@RequestMapping("/updateAdmin")
	public void updateAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		admin.setType(request.getParameter("type"));;
		admin.setUserName(request.getParameter("userName"));
		admin.setEmail(request.getParameter("email"));
		admin.setPassword(request.getParameter("password"));
		admin.setRegion(request.getParameter("region"));
		adminService.updateAdmin(admin);
	}
	
	@RequestMapping("/deleteAdmin")
	public void deleteAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		admin.setId(Integer.parseInt(request.getParameter("id")));
		adminService.deleteAdmin(admin);
	}
	
	@RequestMapping("/showAdmin")
	public void showAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		admin.setId(Integer.parseInt(request.getParameter("id")));
		adminService.showAdmin(admin);
	}
	
	@RequestMapping("/showAllAdmin")
	public List<Admin> showAllAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		return null;
		
	}
	
}
