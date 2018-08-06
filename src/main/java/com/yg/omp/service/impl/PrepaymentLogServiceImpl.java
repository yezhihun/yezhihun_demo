package com.yg.omp.service.impl;

import com.yg.omp.dao.PrepaymentLogDAO;
import com.yg.omp.model.PrepaymentLog;
import com.yg.omp.service.PrepaymentLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrepaymentLogServiceImpl extends AbstractBaseServiceImpl<PrepaymentLog> implements PrepaymentLogService {
    @Autowired
    private PrepaymentLogDAO prepaymentLogDAO;

    private static final Logger logger = LoggerFactory.getLogger(PrepaymentLogServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = prepaymentLogDAO;
    }
}