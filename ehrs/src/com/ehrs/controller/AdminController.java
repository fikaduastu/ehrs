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
		   	
		   	@RequestMapping("/showAllHospital")
		   	public String showAllHospital()
		   	{
		   		return "showAllHospital";
		   	}
		   	
		   	@RequestMapping("/createRegionalAdmin")
		   	public String showCreateRegionalAdmin(Model theModel)
		   	{
		   		theModel.addAttribute("admins",adm);
		   		return "createRegionalAdmin";
		   	}
		   	
		   	@RequestMapping(value="/adminLogin", method=RequestMethod.GET)
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
		   	@RequestMapping("/showCreateHospitalAdmin")
		   	public String showCreateHospitalAdmin()
		   	{
		   		return "createHospitalAdmin";
		   	}
		   	@RequestMapping("/showCreateHospital")
		   	public String showCreateHospital()
		   	{
		   		return "createHospital";
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
			public String adminUpdateForm(@RequestParam("id") int id,Model theModel)
			{
		   		admin ad = adminDao.getAdmin(id);
		   		theModel.addAttribute("admins", ad);
				return "createRegionalAdmin";
			}
		   	
		   	@RequestMapping("/adminShowForm")
			public String adminShowForm()
			{
				return "adminShowForm";
			}   	
		   	
				
			@RequestMapping(value="/addAdmin", method=RequestMethod.GET)
			public String addAdmin(@ModelAttribute("admins") admin theAdmin)
			{	
		/*
		 * //String type = request.getParameter("type");
		 * adm.setType("regional system admin");
		 * adm.setUserName(request.getParameter("userName"));
		 * adm.setEmail(request.getParameter("email"));
		 * adm.setPassword(request.getParameter("password"));
		 * adm.setRegion(request.getParameter("region")); //System.out.println(type);
		 * adminService.addAdmin(adm);
		 * 
		 */		theAdmin.setType("regional system admin");
				adminService.addAdmin(theAdmin);
				return "redirect:/admin/showAllRegionalAdmins";
				
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
			public String deleteAdmin(@RequestParam("id") int id,Model theModel)
			{
				adm.setId(id);
				
				adminService.deleteAdmin(adm);
				return "redirect:/admin/showAllRegionalAdmins";
				
			}
			
			
			@RequestMapping("/showAllRegionalAdmins")
			public String showRegionalAdmins(Model theModel)
			{
				List<admin> ad = adminDao.showRegionalAdmins();
				theModel.addAttribute("admins", ad);
				
				return "showAllRegionalAdmins";
				// finished
				// this is for national admin
				
			}
			
			@RequestMapping("/showAllFederalAdmins")
			public String showFederalAdmins(Model theModel)
			{
				List<admin> ad = adminDao.showFederalAdmins();
				theModel.addAttribute("admins", ad);

				
				return "showAllFederalAdmins";
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
			
			@RequestMapping("/createHospital")
			public void createHospital(HttpServletRequest request,HttpServletResponse response)
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
				userController.addUser(user);
				return null;
			}
}
