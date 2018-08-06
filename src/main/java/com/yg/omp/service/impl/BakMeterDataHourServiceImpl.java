package com.yg.omp.service.impl;

import com.yg.omp.dao.BakMeterDataHourDAO;
import com.yg.omp.model.BakMeterDataHour;
import com.yg.omp.service.BakMeterDataHourService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BakMeterDataHourServiceImpl extends AbstractBaseServiceImpl<BakMeterDataHour> implements BakMeterDataHourService {
    @Autowired
    private BakMeterDataHourDAO bakMeterDataHourDAO;

    private static final Logger logger = LoggerFactory.getLogger(BakMeterDataHourServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = bakMeterDataHourDAO;
    }
}