package com.yg.omp.service.impl;

import com.yg.omp.dao.MeterModelDAO;
import com.yg.omp.model.MeterModel;
import com.yg.omp.service.MeterModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterModelServiceImpl extends AbstractBaseServiceImpl<MeterModel> implements MeterModelService {
    @Autowired
    private MeterModelDAO meterModelDAO;

    private static final Logger logger = LoggerFactory.getLogger(MeterModelServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = meterModelDAO;
    }
}