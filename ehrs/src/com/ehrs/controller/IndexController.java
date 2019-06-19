package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ehrs.entity.User;

@Controller
public class IndexController {
	
	@Autowired
	private User user; 
	
	
	
		
	   @RequestMapping("/login")
	   public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
		  user.setEmail(request.getParameter("email"));
		  user.setPassword(request.getParameter("password"));
		  
	      return new ModelAndView();
	   }
	
}
