package com.yg.omp.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.omp.dao.DeductWaterDao;
import com.yg.omp.entity.DeductWater;
import com.yg.omp.service.DeductWaterService;

@Service
public class DeductWaterServiceImpl extends AbstractBaseServiceImpl<DeductWater> implements DeductWaterService{

	@Autowired
	private DeductWaterDao deductWaterDao;
	
	@Override
	@PostConstruct
	public void init() {
		this.baseDao = deductWaterDao;
	}

}
