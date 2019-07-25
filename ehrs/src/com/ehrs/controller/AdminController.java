package com.ehrs.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ehrs.dao.AdminDao;
import com.ehrs.dao.HealthCenterDao;
import com.ehrs.dao.WoredaDao;
import com.ehrs.entity.admin;
import com.ehrs.entity.healthcenter;
import com.ehrs.entity.user;
import com.ehrs.entity.woreda;
import com.ehrs.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {
			
		   	@Autowired
			private AdminService adminService;
		   	
		   	@Autowired
		   	private UserController userController;
		   	
		   	@Autowired
			private admin adm;
		   	
		   	@Autowired
		   	private user user;
		   	
		   	@Autowired
		   	private AdminDao adminDao;
		   	
		   	@Autowired
		   	private healthcenter healthCenter;
		   	
		   	
		   	@Autowired
		   	private HealthCenterDao healthCenterDao;
		   	
		   	@Autowired
		   	private WoredaDao woredaDao;
		   	
		   	@Autowired
		   	private HealthCenterController healthCenterController;
		   	
		   	Date date = new Date();
		   	
		   	
		   	
		   	@RequestMapping("/showAdminLoginForm")
		   	public String showLoginForm()
		   	{
		   		return "login";
		   	}
		   	
		   	@RequestMapping("/showAllHospitals")
		   	public String showAllHospital(HttpServletRequest request,HttpServletResponse response,Model theModel)
		   	{
		   		HttpSession session = request.getSession();
		   		String region = (String) session.getAttribute("region");
		   		List<healthcenter> hc = healthCenterDao.getHealthCenters(region);
		   		theModel.addAttribute("healthcenter", hc);
		   		
		   		if(session.getAttribute("admin") != null)
		   		return "showAllHospitals";
		   		return "redirect:/";
		   			
		   	}
		   	
		   	@RequestMapping("/updateHealthCenter")
		   	public String healthCenterUpdate(@RequestParam("id") int id,Model theModel)
		   	{

		   		healthcenter hc = healthCenterDao.getHealthCenters(id);
		   		System.out.print(hc);
		   		theModel.addAttribute("healthCenter",hc );
		   		return "updateHealthCenter";
		   		
		   	}
		   	
		   	@RequestMapping("/adminUpdateForm")
			public String adminUpdateForm(@RequestParam("id") int id,Model theModel)
			{
		   		admin ad = adminDao.getAdmin(id);
		   		theModel.addAttribute("admins", ad);
				return "updateRegionalAdmin";
			}
		   	
		   	@RequestMapping("/createRegionalAdmin")
		   	public String showCreateRegionalAdmin(HttpServletRequest request,HttpServletResponse response,Model theModel)
		   	{
		   		
		   		HttpSession sess = (HttpSession) request.getSession();
		   		theModel.addAttribute("admins",adm);
		   		if(sess.getAttribute("admin") != null)
		   		{
		   			
		   			return "createRegionalAdmin";
		   		}
		   		return "redirect:/";
		   	}
		   	
		   	@RequestMapping(value="/adminLogin", method=RequestMethod.GET)
		   	public String adminLogin(HttpServletRequest request,HttpServletResponse response,HttpSession session)
		   	{	
		   		HttpSession sess = (HttpSession) request.getSession();
		   		String email = request.getParameter("email");
		   		String password = request.getParameter("password");
		   		adm = adminService.adminLogin(email,password);

		   		
		   		if (adm == null) {
		   			
		   			return "redirect:/";
		   		}
		   		
		   		else if(adm.getType().equals("federal system admin")){
		   			sess.setAttribute("admin",adm);
		   			addAdminInSession(adm, sess);
		   			return "federalAdminIndex";
		   		}
		   		
		   		else if(adm.getType().equals("regional system admin")){
		   			sess.setAttribute("admin",adm);
		   			addAdminInSession(adm, sess);
		   			return "regionalAdminIndex";
		   		}
		   		
		   		else {
		   			return "redirect:/";
		   		}
		   		
		   	}
		   	
		   	@RequestMapping("/showCreateHospitalAdmin")
		   	public String showCreateHospitalAdmin(HttpServletRequest request,HttpServletResponse response,Model theModel)
		   	{
		   		
		   		theModel.addAttribute("hospitalAdmin", user);
		   		HttpSession session = request.getSession();
		   		if (session.getAttribute("admin") != null)
		   		return 
		   				"createHospitalAdmin";
		   		else 
		   			return "redirect:/";
		   		
		   	}
		   	
		   	@RequestMapping("/showCreateHospital")
		   	public String showCreateHospital(HttpServletRequest request,HttpServletResponse response)
		   	{
		   		HttpSession session = request.getSession();
		   		if (session.getAttribute("admin") != null)
		   		return "createHospital";
		   		else 
		   			return "redirect:/";
		   	}
		   	@RequestMapping("/federalAdminIndex")
		   	public String adminIndex(HttpServletRequest request,HttpServletResponse response)
		   	{
		   		HttpSession sess = (HttpSession) request.getSession();
		   		if(sess.getAttribute("admin") != null)
		   		{
		   			
		   			return "federalAdminIndex";
		   		}
		   		else
		   		return "redirect:/";
		   		
		   	}
		   	
		   	@RequestMapping("/adminAddForm")
			public String adminAddForm(Model theModel)
			{
		   		theModel.addAttribute("admin",adm);
				return "adminAddForm";
			}
		   	
		   	@RequestMapping("/adminShowForm")
			public String adminShowForm()
			{
				return "adminShowForm";
			}   	
		   	@RequestMapping("/regionalAdminIndex")
		   	public String regionalAdminIndex(HttpServletRequest request,HttpServletResponse response)
		   	{
		   		HttpSession session = request.getSession();
		   		if(session.getAttribute("admin") != null)
		   		{
		   			return "regionalAdminIndex";
		   		}
		   		
		   		return "redirect:/";
		   	}
		   	
				
			@RequestMapping(value="/addAdmin", method=RequestMethod.GET)
			public String addAdmin(@ModelAttribute("admins") admin theAdmin)
			{	
				theAdmin.setType("regional system admin");
				adminService.addAdmin(theAdmin);
				return "redirect:/admin/showAllRegionalAdmins";
				
				// FINISHED
			}
			
			@RequestMapping(value="/updateAdmin", method=RequestMethod.GET)
			public String updateAdmin(HttpServletRequest request,HttpServletResponse response,HttpSession session)
			{
				adm.setId(Integer.parseInt(request.getParameter("id")));
				adm.setType(request.getParameter("type"));;
				adm.setUserName(request.getParameter("userName"));
				adm.setEmail(request.getParameter("email"));
				adm.setPassword(request.getParameter("password"));
				adm.setRegion(request.getParameter("region"));
				
				adminService.updateAdmin(adm);
				return null;
			}
			
			@RequestMapping("/deleteAdmin")
			public String deleteAdmin(@RequestParam("id") int id,Model theModel)
			{
				adm.setId(id);
				
				adminService.deleteAdmin(adm);
				return "redirect:/admin/showAllRegionalAdmins";
				
			}
			
			
			@RequestMapping("/showAllRegionalAdmins")
			public String showRegionalAdmins(HttpServletRequest request,HttpServletResponse response,Model theModel)
			{
				List<admin> ad = adminDao.showRegionalAdmins();
				theModel.addAttribute("admins", ad);
				
				
				
				
		   		HttpSession sess = (HttpSession) request.getSession();
		   		if(sess.getAttribute("admin") != null)
		   		{
		   			
		   			return "showAllRegionalAdmins";
		   		}
		   		else
		   		return "redirect:/";
				
				
			}
			
			@RequestMapping("/showAllFederalAdmins")
			public String showFederalAdmins(Model theModel)
			{
				List<admin> ad = adminDao.showFederalAdmins();
				theModel.addAttribute("admins", ad);

				
				return "showAllFederalAdmins";
				
			}
			public void addAdminInSession(admin ad,HttpSession session) {
				
				session.setAttribute("admin", ad);
				session.setAttribute("id", ad.getId());
				session.setAttribute("email", ad.getEmail());
				session.setAttribute("password", ad.getPassword());
				session.setAttribute("type", ad.getType());
				session.setAttribute("region", ad.getRegion());
			}
			
			@RequestMapping("/createHospital")
			public String createHospital(HttpServletRequest request,HttpServletResponse response)
			{
				
				healthCenter.setName(request.getParameter("name"));
				healthCenter.setEmail(request.getParameter("email"));
				healthCenter.setPhoneNumber(request.getParameter("phoneNumber"));
				healthCenter.setWebsite(request.getParameter("website"));
				healthCenter.setType(request.getParameter("type"));
				String woreda = request.getParameter("woreda");
				woreda wor = woredaDao.getWoreda(woreda);
				healthCenter.setWoredaId(wor);
				healthCenterController.addHealthCenter(healthCenter);
				return "redirect:/admin/showAllHospitals";
			}
			
			@RequestMapping("/createHospitalAdmin")
			public String createHospitalAdmin(HttpServletRequest request,HttpServletResponse response)
			{
				user.setEmail(request.getParameter("email"));
				user.setPassword(request.getParameter("password"));
				user.setPosition("hospital admin");
				user.setName(request.getParameter("userName"));
				user.setStatus("1");
				String hName = request.getParameter("name");
				healthcenter hc = healthCenterDao.getHealthCenter(hName);
				user.setOrganizationId(hc);
				user.setCreatedAt(date.toString());
				user.setUpdatedAt("updatedAt");
				System.out.println(user + "admin con");
				userController.addUser1(user);
				return "redirect:/admin/regionalAdminIndex";
			}
			
			@RequestMapping("/logout")
			public String logout(HttpServletRequest request,HttpServletResponse response)
			{
				
				HttpSession session = request.getSession();
				session.invalidate();
				return "redirect:/";
			}
}
