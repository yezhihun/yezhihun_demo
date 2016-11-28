package com.yg.omp.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.omp.dao.OmLogDao;
import com.yg.omp.entity.OmLog;
import com.yg.omp.service.OmLogService;

@Service
public class OmLogServiceImpl extends AbstractBaseServiceImpl<OmLog> implements OmLogService{

	@Autowired
	private OmLogDao omLogDao;
	
	@Override
	@PostConstruct
	public void init() {
		this.baseDao = omLogDao;
	}

}
