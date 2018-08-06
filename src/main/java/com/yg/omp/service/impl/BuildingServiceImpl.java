package com.yg.omp.service.impl;

import com.yg.omp.dao.BuildingDAO;
import com.yg.omp.model.Building;
import com.yg.omp.service.BuildingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingServiceImpl extends AbstractBaseServiceImpl<Building> implements BuildingService {
    @Autowired
    private BuildingDAO buildingDAO;

    private static final Logger logger = LoggerFactory.getLogger(BuildingServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = buildingDAO;
    }
}