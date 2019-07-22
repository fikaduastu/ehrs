package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.HematologyFormDao;
import com.ehrs.entity.hematologyform;

@Service
public class HematologyFormService {
	

	@Autowired
	private HematologyFormDao hematologyFormDao;

	public void updateHematologyForm(hematologyform hematologyForm)
	{
		
	}
	public void deleteHematologyForm(hematologyform hematologyForm)
	{
		
	}
	public void addHematologyForm(hematologyform hematologyForm) {
		
		hematologyFormDao.addHematologyForm1(hematologyForm);
		
	}
	public void showHematologyForm(hematologyform hematologyForm) {
		// TODO Auto-generated method stub
		
	}
}
