package com.yg.omp.service.impl;

import com.yg.omp.dao.MeterDAO;
import com.yg.omp.model.Meter;
import com.yg.omp.service.MeterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeterServiceImpl extends AbstractBaseServiceImpl<Meter> implements MeterService {
    @Autowired
    private MeterDAO meterDAO;

    private static final Logger logger = LoggerFactory.getLogger(MeterServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = meterDAO;
    }

    @Override
    public List<Meter> findByCabinetId(Integer cabinetId) {
        return meterDAO.findByCabinetId(cabinetId);
    }
}