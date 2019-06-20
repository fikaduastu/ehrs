package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.stoolform;
import com.ehrs.service.StoolFormService;

@Controller
@RequestMapping("/stoolForm")
public class StoolFormController {
	
	
	private stoolform stoolForm;
	@Autowired
	private StoolFormService stoolFormService;
	
	@RequestMapping("/addStoolForm")
	public void addStoolForm(HttpServletRequest request,HttpServletResponse response)
	{
		stoolForm.setDirectToolExam(request.getParameter("directToolExam"));
		stoolForm.setPusCell(request.getParameter("pusCell"));
		stoolForm.setRbc(request.getParameter("rbc"));
		stoolForm.setOccultBloodCell(request.getParameter("occultBloodCell"));
		stoolForm.setHpyloriStoolAgent(request.getParameter("hpyloriStoolAgent"));
		
		stoolFormService.addStoolForm(stoolForm);
	}
	
	@RequestMapping("/showStoolForm")
	public void showStoolForm(HttpServletRequest request,HttpServletResponse response)
	{
		stoolForm.setId(Integer.parseInt(request.getParameter("id")));
		
		stoolFormService.showStoolForm(stoolForm);
	}
	
	@RequestMapping("/updateStoolForm")
	public void updateStoolForm(HttpServletRequest request,HttpServletResponse response)
	{
		stoolForm.setId(Integer.parseInt(request.getParameter("id")));
		stoolForm.setDirectToolExam(request.getParameter("directToolExam"));
		stoolForm.setPusCell(request.getParameter("pusCell"));
		stoolForm.setRbc(request.getParameter("rbc"));
		stoolForm.setOccultBloodCell(request.getParameter("occultBloodCell"));
		stoolForm.setHpyloriStoolAgent(request.getParameter("hpyloriStoolAgent"));
		
		stoolFormService.updateStoolForm(stoolForm);
	}
	
	@RequestMapping("/deleteStoolForm")
	public void deleteStoolForm(HttpServletRequest request,HttpServletResponse response)
	{
		stoolForm.setId(Integer.parseInt(request.getParameter("id")));
		
		stoolFormService.deleteStoolForm(stoolForm);
	}

}
