package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.UrineFormDao;
import com.ehrs.entity.urineform;

@Service
public class UrineFormService {

	@Autowired
	private UrineFormDao urineFormDao;

	public void updateUrineForm(urineform urineForm)
	{
		
	}
	public void deleteUrineForm(urineform urineForm)
	{
		
	}
	public void addUrineForm(urineform urineForm) {
		
		urineFormDao.addUrineForm1(urineForm);
	}
	public void showUrineForm(urineform urineForm) {
		// TODO Auto-generated method stub
		
	}
}
