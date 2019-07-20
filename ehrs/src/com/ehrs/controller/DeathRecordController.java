package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.deathrecord;
import com.ehrs.service.DeathRecordService;


@Controller
@RequestMapping("/deathRecord")
public class DeathRecordController {
	
	private deathrecord deathRecord;
	
	@Autowired
	private DeathRecordService deathRecordService;
	
	@RequestMapping("/addDeathRecord")
	public void addDeathRecord(HttpServletRequest request, HttpServletResponse response)
	{
		deathRecord.setDateOfDeath(request.getParameter("dateOfDeath"));
		deathRecord.setReasonForDeath(request.getParameter("reasonForDeath"));
		deathRecord.setFuneralPlace(request.getParameter("funeralPlace"));
		deathRecord.setFuneralDate(request.getParameter("funeralDate"));
		
		deathRecordService.addDeathRecord(deathRecord);
		
	}
	
	@RequestMapping("/updateDeathRecord")
	public void updateDeathRecord(HttpServletRequest request, HttpServletResponse response)
	{
		deathRecord.setId(Integer.parseInt(request.getParameter("id")));
		deathRecord.setDateOfDeath(request.getParameter("dateOfDeath"));
		deathRecord.setReasonForDeath(request.getParameter("reasonForDeath"));
		deathRecord.setFuneralPlace(request.getParameter("funeralPlace"));
		deathRecord.setFuneralDate(request.getParameter("funeralDate"));
		
		deathRecordService.updateDeathRecord(deathRecord);
	}
	
	@RequestMapping("/showDeathRecord")
	public void showDeathRecord(HttpServletRequest request, HttpServletResponse response)
	{
		deathRecord.setId(Integer.parseInt(request.getParameter("id")));	
		
		deathRecordService.showDeathRecord(deathRecord);
	}
	
	@RequestMapping("/deleteDeathRecord")
	public void deleteDeathRecord(HttpServletRequest request, HttpServletResponse response)
	{
		deathRecord.setId(Integer.parseInt(request.getParameter("id")));
		
		deathRecordService.deleteDeathRecord(deathRecord);
	}

	public void addDeathRecord(deathrecord deathRecord2) {
		deathRecordService.addDeathRecord(deathRecord2);
		
	}
}

