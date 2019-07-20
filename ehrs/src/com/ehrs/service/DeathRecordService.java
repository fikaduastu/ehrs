package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.DeathRecordDao;
import com.ehrs.entity.deathrecord;

@Service
public class DeathRecordService {

	@Autowired
	private DeathRecordDao deathRecordDao;

	public void updateDeathRecord(deathrecord deathRecord)
	{
		
	}
	public void deleteDeathRecord(deathrecord deathRecord)
	{
		
	}
	public void addDeathRecord(deathrecord deathRecord) {
		deathRecordDao.addDeathRecord1(deathRecord);
		
	}
	public void showDeathRecord(deathrecord deathRecord) {
		// TODO Auto-generated method stub
		
	}
}
