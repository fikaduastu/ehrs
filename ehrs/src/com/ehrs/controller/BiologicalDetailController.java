package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.biologicaldetail;
import com.ehrs.service.BiologicalDetailService;

@Controller
@RequestMapping("/biologicalDetail")
public class BiologicalDetailController {
			
			@Autowired
			private BiologicalDetailService biologicalDetailService;
			
			private biologicaldetail biologicalDetail;
			
			@RequestMapping("/addBiologicalDetail")
			public void addBiologicalDetail(HttpServletRequest request,HttpServletResponse response)
			{
				biologicalDetail.setBloodType(request.getParameter("bloodType"));
				biologicalDetail.setDisability(request.getParameter("disability"));
				biologicalDetail.setEyeColor(request.getParameter("eyeColor"));
				biologicalDetail.setHeight(Integer.parseInt(request.getParameter("height")));
				biologicalDetail.setWeight(Integer.parseInt(request.getParameter("weight")));
				biologicalDetail.setSkinColor(request.getParameter("skinColor"));
				biologicalDetail.setHairColor(request.getParameter("hairColor"));
				
				biologicalDetailService.addBiologicalDetail(biologicalDetail);
				
			}
			
			@RequestMapping("/showBiologicalDetail")
			public void showBiologicalDetail(HttpServletRequest request,HttpServletResponse response)
			{
				biologicalDetail.setId(Integer.parseInt(request.getParameter("id")));
				
				biologicalDetailService.showBiologicalDetail(biologicalDetail);
			}
			
			@RequestMapping("/updateBiologicalDetail")
			public void updateBiologicalDetail(HttpServletRequest request,HttpServletResponse response)
			{
				biologicalDetail.setId(Integer.parseInt(request.getParameter("id")));
				biologicalDetail.setBloodType(request.getParameter("bloodType"));
				biologicalDetail.setDisability(request.getParameter("disability"));
				biologicalDetail.setEyeColor(request.getParameter("eyeColor"));
				biologicalDetail.setHeight(Integer.parseInt(request.getParameter("height")));
				biologicalDetail.setWeight(Integer.parseInt(request.getParameter("weight")));
				biologicalDetail.setSkinColor(request.getParameter("skinColor"));
				biologicalDetail.setHairColor(request.getParameter("hairColor"));	
				
				biologicalDetailService.updateBiologicalDetail(biologicalDetail);
			}
			
			@RequestMapping("/deleteBiologicalDetail")
			public void deleteBiologicalDetail(HttpServletRequest request,HttpServletResponse response)
			{
				biologicalDetail.setId(Integer.parseInt(request.getParameter("id")));
				
				biologicalDetailService.deleteBiologicalDetail(biologicalDetail);
			}

}
