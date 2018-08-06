package com.yg.omp.service.impl;

import com.yg.omp.dao.ReportMonthlyDAO;
import com.yg.omp.model.ReportMonthly;
import com.yg.omp.service.ReportMonthlyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportMonthlyServiceImpl extends AbstractBaseServiceImpl<ReportMonthly> implements ReportMonthlyService {
    @Autowired
    private ReportMonthlyDAO reportMonthlyDAO;

    private static final Logger logger = LoggerFactory.getLogger(ReportMonthlyServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = reportMonthlyDAO;
    }
}