package com.yg.omp.service.impl;

import com.yg.omp.dao.MeterDateCmdDAO;
import com.yg.omp.model.MeterDateCmd;
import com.yg.omp.service.MeterDateCmdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterDateCmdServiceImpl extends AbstractBaseServiceImpl<MeterDateCmd> implements MeterDateCmdService {
    @Autowired
    private MeterDateCmdDAO meterDateCmdDAO;

    private static final Logger logger = LoggerFactory.getLogger(MeterDateCmdServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = meterDateCmdDAO;
    }
}