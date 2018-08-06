package com.yg.omp.service.impl;

import com.yg.omp.dao.SerialPortConnStatusDAO;
import com.yg.omp.model.SerialPortConnStatus;
import com.yg.omp.service.SerialPortConnStatusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerialPortConnStatusServiceImpl extends AbstractBaseServiceImpl<SerialPortConnStatus> implements SerialPortConnStatusService {
    @Autowired
    private SerialPortConnStatusDAO serialPortConnStatusDAO;

    private static final Logger logger = LoggerFactory.getLogger(SerialPortConnStatusServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = serialPortConnStatusDAO;
    }
}