package com.yg.omp.service.impl;

import com.yg.omp.dao.BuildingExtInfoDAO;
import com.yg.omp.model.BuildingExtInfo;
import com.yg.omp.service.BuildingExtInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingExtInfoServiceImpl extends AbstractBaseServiceImpl<BuildingExtInfo> implements BuildingExtInfoService {
    @Autowired
    private BuildingExtInfoDAO buildingExtInfoDAO;

    private static final Logger logger = LoggerFactory.getLogger(BuildingExtInfoServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = buildingExtInfoDAO;
    }
}