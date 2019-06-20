package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.region;
import com.ehrs.service.RegionService;

@Controller
@RequestMapping("/region")
public class RegionController {

	private region region;
	
	
	@Autowired
	private RegionService regionService;
	
	@RequestMapping("/addRegion")
	public void addRegion(HttpServletRequest request,HttpServletResponse response)
	{
		
		region.setName(request.getParameter("name"));
		
		regionService.addRegion(region);
	}
	
	@RequestMapping("/showRegion")
	public void showRegion(HttpServletRequest request,HttpServletResponse response)
	{
		region.setId(Integer.parseInt(request.getParameter("id")));
		
		regionService.showRegion(region);
	}
	
	@RequestMapping("/updateRegion")
	public void updateRegion(HttpServletRequest request,HttpServletResponse response)
	{
		region.setId(Integer.parseInt(request.getParameter("id")));
		region.setName(request.getParameter("name"));
		
		regionService.updateRegion(region);
	}
	
	@RequestMapping("/deleteRegion")
	public void deleteRegion(HttpServletRequest request,HttpServletResponse response)
	{
		region.setId(Integer.parseInt(request.getParameter("id")));
		
		regionService.deleteRegion(region);
	}
}
