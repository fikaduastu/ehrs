package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.birthrecord;
import com.ehrs.entity.deathrecord;
import com.ehrs.service.BirthRecordService;



@Controller
@RequestMapping("/birthRecord")
public class BirthRecordController {

	@Autowired
	private BirthRecordService birthRecordService;
	private birthrecord birthRecord;
	
	
	@RequestMapping("/addBirthRecord")
	public void addBirthRecord(HttpServletRequest request, HttpServletResponse response)
	{
		birthRecord.setDateOfBirth(request.getParameter("dateOfBirth"));
		birthRecord.setMotherName(request.getParameter("motherName"));
		birthRecord.setFatherName(request.getParameter("fatherName"));
		birthRecord.setChildName(request.getParameter("childName"));
		birthRecord.setGender(request.getParameter("gender"));
		birthRecord.setWeight(Integer.parseInt(request.getParameter("weight")));
		birthRecord.setRemark(request.getParameter("remark"));
		
		birthRecordService.addBirthRecord(birthRecord);
	}
	
	
	@RequestMapping("/updateBirthRecord")
	public void updateBirthRecord(HttpServletRequest request, HttpServletResponse response)
	{
		birthRecord.setId(Integer.parseInt(request.getParameter("id")));
		birthRecord.setDateOfBirth(request.getParameter("dateOfBirth"));
		birthRecord.setMotherName(request.getParameter("motherName"));
		birthRecord.setFatherName(request.getParameter("fatherName"));
		birthRecord.setChildName(request.getParameter("childName"));
		birthRecord.setGender(request.getParameter("gender"));
		birthRecord.setWeight(Integer.parseInt(request.getParameter("weight")));
		birthRecord.setRemark(request.getParameter("remark"));
		
		birthRecordService.updateBirthRecord(birthRecord);
	}
	
	@RequestMapping("/deleteBirthRecord")
	public void deleteBirthRecord(HttpServletRequest request, HttpServletResponse response)
	{
		birthRecord.setId(Integer.parseInt(request.getParameter("id")));
		
		birthRecordService.deleteBirthRecord(birthRecord);

	}
	
	@RequestMapping("/showBirthRecord")
	public void showBirthRecord(HttpServletRequest request, HttpServletResponse response)
	{
		birthRecord.setId(Integer.parseInt(request.getParameter("id")));
		
		birthRecordService.showBirthRecord(birthRecord);

	}


	public void addBirthRecord(birthrecord birthRecord) {
		birthRecordService.addBirthRecord(birthRecord);
		
	}
}
