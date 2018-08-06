package com.yg.omp.service.impl;

import com.yg.omp.dao.WarningDAO;
import com.yg.omp.model.Warning;
import com.yg.omp.service.WarningService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarningServiceImpl extends AbstractBaseServiceImpl<Warning> implements WarningService {
    @Autowired
    private WarningDAO warningDAO;

    private static final Logger logger = LoggerFactory.getLogger(WarningServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = warningDAO;
    }
}