package com.yg.omp.service.impl;

import com.yg.omp.dao.PrepaymentRecordDAO;
import com.yg.omp.model.PrepaymentRecord;
import com.yg.omp.service.PrepaymentRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrepaymentRecordServiceImpl extends AbstractBaseServiceImpl<PrepaymentRecord> implements PrepaymentRecordService {
    @Autowired
    private PrepaymentRecordDAO prepaymentRecordDAO;

    private static final Logger logger = LoggerFactory.getLogger(PrepaymentRecordServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = prepaymentRecordDAO;
    }
}