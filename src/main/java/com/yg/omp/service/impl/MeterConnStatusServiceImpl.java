package com.yg.omp.service.impl;

import com.yg.omp.dao.MeterConnStatusDAO;
import com.yg.omp.model.MeterConnStatus;
import com.yg.omp.service.MeterConnStatusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterConnStatusServiceImpl extends AbstractBaseServiceImpl<MeterConnStatus> implements MeterConnStatusService {
    @Autowired
    private MeterConnStatusDAO meterConnStatusDAO;

    private static final Logger logger = LoggerFactory.getLogger(MeterConnStatusServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = meterConnStatusDAO;
    }
}