package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ehrs.entity.User;
import com.ehrs.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private User user;
	
	   @RequestMapping("/login")
	   public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
		/*
		 * user.setEmail(request.getParameter("email"));
		 * user.setPassword(request.getParameter("password")); user =
		 * userService.login(user); if(user == null) return new ModelAndView(); else
		 * 
		 */
		   return new ModelAndView();
	   }
	   
	public void createUser()
	{
		
	}
	public void readUser()
	{
		
	}
	public void updateUser()
	{
		
	}
	public void deleteUser()
	{
		
	}
}
