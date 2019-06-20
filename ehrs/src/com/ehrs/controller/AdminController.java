package com.ehrs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ehrs.entity.admin;
import com.ehrs.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
   	@Autowired
	 private AdminService adminService;
   	
   	@Autowired
	private admin admin;
   	
   
   	
   	@RequestMapping("/showAdminLoginForm")
   	public String showLoginForm()
   	{
   		return "adminLoginForm";
   	}
   	@RequestMapping("/adminLogin")
   	public String adminLogin(HttpServletRequest request,HttpServletResponse response)
   	{	
   		HttpSession session = (HttpSession) request.getSession();
   		String email = request.getParameter("email");
   		String password = request.getParameter("password");
   		admin = adminService.adminLogin(email,password);
   		
   		if (admin.equals(null)) {
   			session.setAttribute("ErrorMessage", "UserName/Password does not exist");
			return "loginForm";
   		}
   		
   		else if(admin.getType().equals("federal system admin")){
   			session.setAttribute("admin", admin);
   			return "/admin/federalAdminIndex";
   		}
   		
   		else if(admin.getType().equals("regional system admin")){
   			session.setAttribute("admin", admin);
   			return "/admin/regionalAdminIndex";
   		}
   		
   		else if(admin.getType().equals("health center system admin")){
   			session.setAttribute("admin", admin);
   			return "/admin/healthCenterAdminIndex";
   		}
   		
   		else {
   			return "admin/adminLoginForm";
   		}
   		
   	}
   	@RequestMapping("/index")
   	public String adminIndex()
   	{
   		return "adminIndex";
   	}
   	@RequestMapping("/adminAddForm")
	public String adminAddForm()
	{
		return "adminAddForm";
	}
   	
   	@RequestMapping("/adminUpdateForm")
	public String adminUpdateForm()
	{
		return "adminUpdateForm";
	}
   	
   	@RequestMapping("/adminShowForm")
	public String adminShowForm()
	{
		return "adminShowForm";
	}   	
   	
   	@RequestMapping("/adminDeleteForm")
	public String adminDeleteForm()
	{
		return "adminDeleteForm";
	}  
   	
   	public String adminShowAllForm()
   	{
   		return "adminShowAllForm";
   	}
		
	@RequestMapping("/addAdmin")
	public String addAdmin(HttpServletRequest request,HttpServletResponse response)
	{	
		admin.setType(request.getParameter("type"));;
		admin.setUserName(request.getParameter("userName"));
		admin.setEmail(request.getParameter("email"));
		admin.setPassword(request.getParameter("password"));
		admin.setRegion(request.getParameter("region"));
		adminService.addAdmin(admin);
		return "show-admins";
	}
	
	@RequestMapping("/updateAdmin")
	public ModelAndView updateAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		admin.setType(request.getParameter("type"));;
		admin.setUserName(request.getParameter("userName"));
		admin.setEmail(request.getParameter("email"));
		admin.setPassword(request.getParameter("password"));
		admin.setRegion(request.getParameter("region"));
		
		adminService.updateAdmin(admin);
		return new ModelAndView("adminIndex");
	}
	
	@RequestMapping("/deleteAdmin")
	public ModelAndView deleteAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		admin.setId(Integer.parseInt(request.getParameter("id")));
		
		adminService.deleteAdmin(admin);
		return new ModelAndView("adminIndex");
	}
	
	@RequestMapping("/showAdmin")
	public ModelAndView showAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		admin.setId(Integer.parseInt(request.getParameter("id")));
		
		admin ad = adminService.showAdmin(admin);
		return new ModelAndView("showAdmin", "Admin", ad);
	}
	
	@RequestMapping("/showAllAdmin")
	public List<admin> showAllAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		return null;
		
	}
	
}
