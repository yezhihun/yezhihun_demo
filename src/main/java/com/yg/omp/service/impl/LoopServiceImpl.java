package com.yg.omp.service.impl;

import com.yg.omp.dao.LoopDAO;
import com.yg.omp.model.Loop;
import com.yg.omp.service.LoopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoopServiceImpl extends AbstractBaseServiceImpl<Loop> implements LoopService {
    @Autowired
    private LoopDAO loopDAO;

    private static final Logger logger = LoggerFactory.getLogger(LoopServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = loopDAO;
    }
}