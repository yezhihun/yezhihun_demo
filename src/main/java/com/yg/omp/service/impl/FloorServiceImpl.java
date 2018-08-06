package com.yg.omp.service.impl;

import com.yg.omp.dao.FloorDAO;
import com.yg.omp.model.Floor;
import com.yg.omp.service.FloorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FloorServiceImpl extends AbstractBaseServiceImpl<Floor> implements FloorService {
    @Autowired
    private FloorDAO floorDAO;

    private static final Logger logger = LoggerFactory.getLogger(FloorServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = floorDAO;
    }
}