package com.ehrs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehrs.entity.PhysicalExamination;
import com.ehrs.service.PhysicalExaminationService;



@Controller
@RequestMapping("/physicalExamination")
public class PhysicalExaminationController {
	
	@Autowired
	private PhysicalExaminationService physicalExaminationService;
	
	private PhysicalExamination physicalExamination;
	
	
	@RequestMapping("addPhysicalExamination")
	public void addPhysicalExamination(HttpServletRequest request,HttpServletResponse response)
	{
		physicalExamination.setVitalSign(request.getParameter("vitalSign"));
		physicalExamination.setTempreture(request.getParameter("tempreture"));
		physicalExamination.setBp(request.getParameter("bp"));
		physicalExamination.setResp(request.getParameter("resp"));
		physicalExamination.setHeet(request.getParameter("heet"));
		physicalExamination.setGland(request.getParameter("gland"));
		physicalExamination.setChest(request.getParameter("chest"));
		physicalExamination.setCvs(request.getParameter("cvs"));
		physicalExamination.setGenitoUrinary(request.getParameter("genitoUrinary"));
		physicalExamination.setMuscloSkeletal(request.getParameter("muscloSkeletal"));
		physicalExamination.setSkin(request.getParameter("skin"));
		physicalExamination.setCns(request.getParameter("cns"));
		physicalExamination.setMelto(request.getParameter("melto"));
		physicalExamination.setSensor(request.getParameter("sensor"));
		physicalExamination.setImpression(request.getParameter("impression"));
		physicalExamination.setAbdomen(request.getParameter("abdomen"));
		
		physicalExaminationService.addPhysicalExamination(physicalExamination);
	}
	
	@RequestMapping("showPhysicalExamination")
	public void showPhysicalExamination(HttpServletRequest request,HttpServletResponse response)
	{
		physicalExamination.setId(Integer.parseInt(request.getParameter("id")));
		
		physicalExaminationService.showPhysicalExamination(physicalExamination);
	}
	
	@RequestMapping("updatePhysicalExamination")
	public void updatePhysicalExamination(HttpServletRequest request,HttpServletResponse response)
	{
		physicalExamination.setId(Integer.parseInt(request.getParameter("id")));
		physicalExamination.setVitalSign(request.getParameter("vitalSign"));
		physicalExamination.setTempreture(request.getParameter("tempreture"));
		physicalExamination.setBp(request.getParameter("bp"));
		physicalExamination.setResp(request.getParameter("resp"));
		physicalExamination.setHeet(request.getParameter("heet"));
		physicalExamination.setGland(request.getParameter("gland"));
		physicalExamination.setChest(request.getParameter("chest"));
		physicalExamination.setCvs(request.getParameter("cvs"));
		physicalExamination.setGenitoUrinary(request.getParameter("genitoUrinary"));
		physicalExamination.setMuscloSkeletal(request.getParameter("muscloSkeletal"));
		physicalExamination.setSkin(request.getParameter("skin"));
		physicalExamination.setCns(request.getParameter("cns"));
		physicalExamination.setMelto(request.getParameter("melto"));
		physicalExamination.setSensor(request.getParameter("sensor"));
		physicalExamination.setImpression(request.getParameter("impression"));
		physicalExamination.setAbdomen(request.getParameter("abdomen"));	
		
		physicalExaminationService.updatePhysicalExamination(physicalExamination);
	}
	
	@RequestMapping("deletePhysicalExamination")
	public void deletePhysicalExamination(HttpServletRequest request,HttpServletResponse response)
	{
		physicalExamination.setId(Integer.parseInt(request.getParameter("id")));
		
		physicalExaminationService.deletePhysicalExamination(physicalExamination);
	}
}
