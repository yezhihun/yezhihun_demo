package com.yg.omp.service.impl;

import com.yg.omp.dao.SerialPortDAO;
import com.yg.omp.model.SerialPort;
import com.yg.omp.service.SerialPortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerialPortServiceImpl extends AbstractBaseServiceImpl<SerialPort> implements SerialPortService {
    @Autowired
    private SerialPortDAO serialPortDAO;

    private static final Logger logger = LoggerFactory.getLogger(SerialPortServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = serialPortDAO;
    }
}