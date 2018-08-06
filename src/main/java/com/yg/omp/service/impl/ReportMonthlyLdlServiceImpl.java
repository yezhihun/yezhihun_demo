package com.yg.omp.service.impl;

import com.yg.omp.dao.ReportMonthlyLdlDAO;
import com.yg.omp.model.ReportMonthlyLdl;
import com.yg.omp.service.ReportMonthlyLdlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportMonthlyLdlServiceImpl extends AbstractBaseServiceImpl<ReportMonthlyLdl> implements ReportMonthlyLdlService {
    @Autowired
    private ReportMonthlyLdlDAO reportMonthlyLdlDAO;

    private static final Logger logger = LoggerFactory.getLogger(ReportMonthlyLdlServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = reportMonthlyLdlDAO;
    }
}