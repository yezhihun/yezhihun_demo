package com.yg.omp.service.impl;

import com.yg.omp.dao.CurDataDAO;
import com.yg.omp.model.CurData;
import com.yg.omp.service.CurDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurDataServiceImpl extends AbstractBaseServiceImpl<CurData> implements CurDataService {
    @Autowired
    private CurDataDAO curDataDAO;

    private static final Logger logger = LoggerFactory.getLogger(CurDataServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = curDataDAO;
    }

}