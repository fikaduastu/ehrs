package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.woreda;
import com.ehrs.service.WoredaService;

@Controller
@RequestMapping("/woreda")
public class WoredaController {
	
	
	private woreda woreda;
	@Autowired
	private WoredaService woredaService;
	
	@RequestMapping("/addWoreda")
	public void addWoreda(HttpServletRequest request,HttpServletResponse response)
	{
		woreda.setName(request.getParameter("name"));
		
		woredaService.addWoreda(woreda);
	}
	
	@RequestMapping("/showWoreda")
	public void showWoreda(HttpServletRequest request,HttpServletResponse response)
	{
		woreda.setId(Integer.parseInt(request.getParameter("id")));
		
		woredaService.showWoreda(woreda);
	}
	
	@RequestMapping("/updateWoreda")
	public void updateWoreda(HttpServletRequest request,HttpServletResponse response)
	{
		woreda.setId(Integer.parseInt(request.getParameter("id")));
		woreda.setName(request.getParameter("name"));
		
		woredaService.updateWoreda(woreda);
	}
	
	@RequestMapping("/deleteWoreda")
	public void deleteWoreda(HttpServletRequest request,HttpServletResponse response)
	{
		woreda.setId(Integer.parseInt(request.getParameter("id")));
		
		woredaService.deleteWoreda(woreda);
	}
}
