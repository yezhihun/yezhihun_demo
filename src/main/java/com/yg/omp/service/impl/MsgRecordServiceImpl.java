package com.yg.omp.service.impl;

import com.yg.omp.dao.MsgRecordDAO;
import com.yg.omp.model.MsgRecord;
import com.yg.omp.service.MsgRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsgRecordServiceImpl extends AbstractBaseServiceImpl<MsgRecord> implements MsgRecordService {
    @Autowired
    private MsgRecordDAO msgRecordDAO;

    private static final Logger logger = LoggerFactory.getLogger(MsgRecordServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = msgRecordDAO;
    }
}