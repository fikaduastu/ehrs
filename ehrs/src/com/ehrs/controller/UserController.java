package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ehrs.entity.user;
import com.ehrs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private user user;
	
	@RequestMapping("/showUserLoginForm")
	public String showUserLoginForm()
	{
		return "userLoginForm";
	}
	
	@RequestMapping("/showUserAddForm")
	public String showUserAddForm()
	{
		return "userAddForm";
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
		   user = userService.login(email,password);
		   if (user.equals(null))
		   {
	   			session.setAttribute("ErrorMessage", "Email/Password does not exist");
				return "userLoginForm";
		   }
		   else if(user.getPosition().equals("doctor"))
		   {
			   session.setAttribute("user", user);
			   return "user/doctorIndex";
		   }
		   else if(user.getPosition().equals("ho"))
		   {
			   session.setAttribute("user", user); 
			   return "user/hoIndex";
		   }
		   else if(user.getPosition().equals("nurse"))
		   {
			   session.setAttribute("user", user);
			   return "user/nurseIndex";
		   }
		   else if(user.getPosition().equals("pharmacist"))
		   {
			   session.setAttribute("user", user);
			   return "user/pharmacistIndex";
		   }
		   else if(user.getPosition().equals("laboratorist"))
		   {
			   session.setAttribute("user", user);
			   return "user/laboratoristIndex";
		   }
		   else {
			   return "userLoginForm";
		   }
	   }
	   
	@RequestMapping("/addUser")
	public void addUser(HttpServletRequest request,HttpServletResponse response)
	{
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setCreatedAt(request.getParameter("createdAt"));
		user.setUpdatedAt(request.getParameter("updateAt"));
		user.setPosition(request.getParameter("position"));
		user.setStatus(request.getParameter("status"));
		
		userService.addUser(user);

	}
	
	@RequestMapping("/showUser")
	public void showUser(HttpServletRequest request,HttpServletResponse response)
	{
		user.setId(Integer.parseInt(request.getParameter("id")));
		
		userService.showUser(user);
	}
	
	@RequestMapping("/updateUser")
	public void updateUser(HttpServletRequest request,HttpServletResponse response)
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
	}
	
	@RequestMapping("/deleteUser")
	public void deleteUser(HttpServletRequest request,HttpServletResponse response)
	{
		user.setId(Integer.parseInt(request.getParameter("id")));
		
		userService.deleteUser(user);
	}
}
