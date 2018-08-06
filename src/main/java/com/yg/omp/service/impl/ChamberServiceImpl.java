package com.yg.omp.service.impl;

import com.yg.omp.dao.ChamberDAO;
import com.yg.omp.model.Chamber;
import com.yg.omp.service.ChamberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChamberServiceImpl extends AbstractBaseServiceImpl<Chamber> implements ChamberService {
    @Autowired
    private ChamberDAO chamberDAO;

    private static final Logger logger = LoggerFactory.getLogger(ChamberServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = chamberDAO;
    }
}