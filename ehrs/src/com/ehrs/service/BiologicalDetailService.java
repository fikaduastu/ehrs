package com.ehrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehrs.dao.BiologicalDetailDao;
import com.ehrs.entity.biologicaldetail;

@Service
public class BiologicalDetailService {

	@Autowired
	private BiologicalDetailDao biologicalDetailDao;

	public void updateBiologicalDetail(biologicaldetail biologicalDetail)
	{
		
	}
	public void deleteBiologicalDetail(biologicaldetail biologicalDetail)
	{
		
	}

	public void addBiologicalDetail(biologicaldetail biologicalDetail) {
		biologicalDetailDao.addBiologicalDetail1(biologicalDetail);
		
	}
	public void showBiologicalDetail(biologicaldetail biologicalDetail) {
		// TODO Auto-generated method stub
		
	}
}
