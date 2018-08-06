package com.yg.omp.service.impl;

import com.yg.omp.dao.RegionDAO;
import com.yg.omp.model.Region;
import com.yg.omp.service.RegionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl extends AbstractBaseServiceImpl<Region> implements RegionService {
    @Autowired
    private RegionDAO regionDAO;

    private static final Logger logger = LoggerFactory.getLogger(RegionServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = regionDAO;
    }
}