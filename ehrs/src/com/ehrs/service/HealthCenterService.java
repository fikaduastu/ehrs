package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.HealthCenterDao;
import com.ehrs.entity.healthcenter;

@Service
public class HealthCenterService {
	
	@Autowired
	private HealthCenterDao healthCenterDao;

	public void updateHealthCenter(healthcenter healthCenter)
	{
		
	}
	public void deleteHealthCenter(healthcenter healthCenter)
	{
		
	}
	public void addHealthCenter(healthcenter healthCenter) {
		
		healthCenterDao.addHealthCenter(healthCenter);
	}
	public void showHealthCenter(healthcenter healthCenter) {
		// TODO Auto-generated method stub
		
	}
}
