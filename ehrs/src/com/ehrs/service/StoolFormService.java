package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.StoolFormDao;
import com.ehrs.entity.stoolform;

@Service
public class StoolFormService {

	@Autowired
	private StoolFormDao stoolFormDao;

	public void updateStoolForm(stoolform stoolForm)
	{
		
	}
	public void deleteStoolForm(stoolform stoolForm)
	{
		
	}
	public void addStoolForm(stoolform stoolForm) {
		stoolFormDao.addStoolForm1(stoolForm);
	}
	public void showStoolForm(stoolform stoolForm) {
		// TODO Auto-generated method stub
		
	}

}
