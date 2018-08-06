package com.yg.omp.service.impl;

import com.yg.omp.dao.MeterDateAnalysisDAO;
import com.yg.omp.model.MeterDateAnalysis;
import com.yg.omp.service.MeterDateAnalysisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterDateAnalysisServiceImpl extends AbstractBaseServiceImpl<MeterDateAnalysis> implements MeterDateAnalysisService {
    @Autowired
    private MeterDateAnalysisDAO meterDateAnalysisDAO;

    private static final Logger logger = LoggerFactory.getLogger(MeterDateAnalysisServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = meterDateAnalysisDAO;
    }
}