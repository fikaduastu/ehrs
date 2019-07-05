package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.ProfileDao;
import com.ehrs.entity.profile;

@Service
public class ProfileService {

	@Autowired
	private ProfileDao profileDao;
	
	public void addProfile(profile profile) {
		profileDao.addProfile(profile);
		
	}

	public void showProfile(profile profile) {
		// TODO Auto-generated method stub
		
	}

	public void updateProfile(profile profile) {
		profileDao.updateProfile(profile);
		
	}

	public void deleteProfile(profile profile) {
		profileDao.deleteProfile(profile);
		
	}
}
