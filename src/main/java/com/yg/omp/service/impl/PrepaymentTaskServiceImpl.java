package com.yg.omp.service.impl;

import com.yg.omp.dao.PrepaymentTaskDAO;
import com.yg.omp.model.PrepaymentTask;
import com.yg.omp.service.PrepaymentTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrepaymentTaskServiceImpl extends AbstractBaseServiceImpl<PrepaymentTask> implements PrepaymentTaskService {
    @Autowired
    private PrepaymentTaskDAO prepaymentTaskDAO;

    private static final Logger logger = LoggerFactory.getLogger(PrepaymentTaskServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = prepaymentTaskDAO;
    }
}