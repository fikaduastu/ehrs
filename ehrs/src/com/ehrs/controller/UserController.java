package com.ehrs.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ehrs.dao.HealthCenterDao;
import com.ehrs.dao.UserDao;
import com.ehrs.entity.healthcenter;
import com.ehrs.entity.user;
import com.ehrs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private user user;
	
	@Autowired
	private HealthCenterDao healthCenterDao;
	
	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping("/showAllHospitalUser")
	public String showAllHospitalUser(Model theModel)
	{
		List<user> user = userDao.showAllUser();
		theModel.addAttribute("users", user);
		return "showAllHospitalUser";
	}
	@RequestMapping("/createUser")
	public String createUser()
	{
		return "createUser";
	}
	
	@RequestMapping("/showUserLoginForm")
	public String showUserLoginForm()
	{
		return "userLoginForm";
	}
	
	@RequestMapping("/doctorIndex")
	public String doctorIndex()
	{
		
		return "doctorIndex";
		
	}
	
	@RequestMapping("/hoIndex")
	public String hoIndex()
	{
		
		return "hoIndex";
		
	}
	
	@RequestMapping("/nurseIndex")
	public String nurseIndex()
	{
		
		return "nurseIndex";
		
	}
	
	@RequestMapping("/pharmacistIndex")
	public String pharmacistIndex()
	{
		
		return "pharmacistIndex";
		
	}
	
	@RequestMapping("/laboratoristIndex")
	public String laboratoristIndex()
	{
		
		return "laboratoristIndex";
		
	}
	
	@RequestMapping("/hospitalAdmin")
	public String hospitalAdmin()
	{
		
		return "hospitalAdmin";
		
	}
	
	@RequestMapping("/showAddUser")
	public String showAddUser()
	{
		return "showAddUser";
	}
	
	@RequestMapping("/showUserUpdateForm")
	public String showUserUpdateForm()
	{
		return "userUpdateForm";
	}
	
	@RequestMapping("/showUserDeleteForm")
	public String showUserDeleteForm()
	{
		return "userDeleteForm";
	}
	
	@RequestMapping("/showUserReadForm")
	public String showUserReadForm()
	{
		return "userReadForm";
	}
	 @RequestMapping("/userLogin")
	 public String login(HttpServletRequest request,HttpServletResponse response) {
		   
		   HttpSession session = (HttpSession) request.getSession();
		   String email =request.getParameter("email");
		   String password = request.getParameter("password");
		   System.out.println(email+""+password);
		   user = userService.login(email,password);
		   if (user.equals(null))
		   {
	   			session.setAttribute("ErrorMessage", "Email/Password does not exist");
				return "userLoginForm";
		   }
		   else if(user.getPosition().equals("doctor"))
		   {
			   session.setAttribute("user", user);
			   return "doctorIndex";
		   }
		   else if(user.getPosition().equals("ho"))
		   {
			   session.setAttribute("user", user); 
			   return "hoIndex";
		   }
		   else if(user.getPosition().equals("nurse"))
		   {
			   session.setAttribute("user", user);
			   return "nurseIndex";
		   }
		   else if(user.getPosition().equals("pharmacist"))
		   {
			   session.setAttribute("user", user);
			   return "pharmacistIndex";
		   }
		   else if(user.getPosition().equals("laboratorist"))
		   {
			   session.setAttribute("user", user);
			   return "laboratoristIndex";
		   }
		   else if(user.getPosition().equals("hospital admin"))
		   {
			   session.setAttribute("user", user);
			   return "hospitalAdmin";
		   }
		   else {
			   return "userLoginForm";
		   }
	   }
	   
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request,HttpServletResponse response)
	{
		Date date = new Date();
		
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("userName"));
		String hName = request.getParameter("name");
		healthcenter hc = healthCenterDao.getHealthCenter(hName);
		user.setOrganizationId(hc);
		user.setCreatedAt(date.toString());
		user.setUpdatedAt("updatedAt");
		user.setPosition(request.getParameter("position"));
		user.setStatus("1");
		userService.addUser(user);
		return "redirect:/user/showAllHospitalUser";

	}
	
	//@RequestMapping("/addUser")
	public void addUser(user user)
	{
		
		userService.addUser(user);

	}
	
	@RequestMapping("/showUser")
	public void showUser(HttpServletRequest request,HttpServletResponse response)
	{
		user.setId(Integer.parseInt(request.getParameter("id")));
		
		userService.showUser(user);
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(HttpServletRequest request,HttpServletResponse response)
	{
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setCreatedAt(request.getParameter("createdAt"));
		user.setUpdatedAt(request.getParameter("updateAt"));
		user.setPosition(request.getParameter("position"));
		user.setStatus(request.getParameter("status"));
		
		userService.updateUser(user);
		
		return null;
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("id") int id,Model theModel)
	{
		user.setId(id);
		
		userService.deleteUser(user);
		return "redirect:/user/showAllHospitalUser";
	}
	
	@RequestMapping("/showHealthCenterAdmins")
	public String showHealthCenterAdmins(Model theModel)
	{
		List<user> ad = userDao.showHealthCenterAdmins();
		theModel.addAttribute("users", ad);
		return "showHealthCenterAdmins";
		// this is for regional admins
	}
}
