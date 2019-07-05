package com.ehrs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ehrs.dao.AdminDao;
import com.ehrs.entity.admin;
import com.ehrs.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {
			
		   	@Autowired
			private AdminService adminService;
		   	
		   	@Autowired
			private admin adm;
		   	
		   	@Autowired
		   	private AdminDao adminDao;
		   	
		   	
		   	@RequestMapping("/showAdminLoginForm")
		   	public String showLoginForm()
		   	{
		   		return "login";
		   	}
		   	
		   	@RequestMapping(value="/adminLogin", method=RequestMethod.POST)
		   	public String adminLogin(HttpServletRequest request,HttpServletResponse response,HttpSession session)
		   	{	
		   		//HttpSession session = (HttpSession) request.getSession();
		   		String email = request.getParameter("email");
		   		String password = request.getParameter("password");
		   		adm = adminService.adminLogin(email,password);

		   		//System.out.println(adm);
		   		if (adm == null) {
		   			session.setAttribute("ErrorMessage", "UserName/Password does not exist");
					return "login";
		   		}
		   		
		   		else if(adm.getType().equals("federal system admin")){
		   			addAdminInSession(adm, session);
		   			//System.out.println("federal system admin");
		   			return "federalAdminIndex";
		   		}
		   		
		   		else if(adm.getType().equals("regional system admin")){
		   			addAdminInSession(adm, session);
		   			return "regionalAdminIndex";
		   		}
		   		
		   		else {
		   			return "view/login";
		   		}
		   		
		   	}
		   	
		   	@RequestMapping("/federalAdminIndex")
		   	public String adminIndex()
		   	{
		   		return "federalAdminIndex";
		   	}
		   	
		   	@RequestMapping("/adminAddForm")
			public String adminAddForm(Model theModel)
			{
		   		theModel.addAttribute("admin",adm);
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
		   	
				
			@RequestMapping(value="/addAdmin", method=RequestMethod.GET)
			public String addAdmin(HttpServletRequest request,HttpServletResponse response)
			{	
				//String type = request.getParameter("type");
				adm.setType(request.getParameter("type"));
				adm.setUserName(request.getParameter("userName"));
				adm.setEmail(request.getParameter("email"));
				adm.setPassword(request.getParameter("password"));
				adm.setRegion(request.getParameter("region"));
				//System.out.println(type);
				adminService.addAdmin(adm);
				return "redirect:/admin/listadmin";
				
				// FINISHED
			}
			
			@RequestMapping(value="/updateAdmin", method=RequestMethod.GET)
			public String updateAdmin(HttpServletRequest request,HttpServletResponse response,HttpSession session)
			{
				adm.setId(Integer.parseInt(request.getParameter("id")));
				//int id =  (int) session.getAttribute("id");
				adm.setType(request.getParameter("type"));;
				adm.setUserName(request.getParameter("userName"));
				adm.setEmail(request.getParameter("email"));
				adm.setPassword(request.getParameter("password"));
				adm.setRegion(request.getParameter("region"));
				
				adminService.updateAdmin(adm);
				//return "redirect:/admin/listadmin";
				return null;
				
				//finished
			}
			
			@RequestMapping("/deleteAdmin")
			public String deleteAdmin(HttpServletRequest request,HttpServletResponse response)
			{
				adm.setId(Integer.parseInt(request.getParameter("id")));
				
				adminService.deleteAdmin(adm);
				//return "adminIndex";
				return null;
				// finished
			}
			
			
			@RequestMapping("/showRegionalAdmins")
			public String showRegionalAdmins(Model theModel)
			{
				List<admin> ad = adminDao.showRegionalAdmins();
				theModel.addAttribute("admins", ad);
				return "showRegionalAdmins";
				// finished
				// this is for national admin
				
			}
			
			public String showFederalAdmins(Model theModel)
			{
				List<admin> ad = adminDao.showFederalAdmins();
				theModel.addAttribute("admins", ad);
				return "showFederalAdmins";
				// finished
			}
			public void addAdminInSession(admin ad,HttpSession session) {
				
				session.setAttribute("admin", ad);
				session.setAttribute("id", ad.getId());
				session.setAttribute("email", ad.getEmail());
				session.setAttribute("password", ad.getPassword());
				session.setAttribute("type", ad.getType());
				session.setAttribute("region", ad.getRegion());
			}
}
