package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.BirthRecordDao;
import com.ehrs.entity.birthrecord;

@Service
public class BirthRecordService {

	@Autowired
	private BirthRecordDao birthRecordDao;

	public void updateBirthRecord(birthrecord birthRecord)
	{
		
	}
	public void deleteBirthRecord(birthrecord birthRecord)
	{
		
	}
	public void addBirthRecord(birthrecord birthRecord) {
		birthRecordDao.addBirthRecord1(birthRecord);
		
	}
	public void showBirthRecord(birthrecord birthRecord) {
		// TODO Auto-generated method stub
		
	}
}
