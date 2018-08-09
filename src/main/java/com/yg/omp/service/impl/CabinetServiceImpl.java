package com.yg.omp.service.impl;

import com.yg.omp.dao.CabinetDAO;
import com.yg.omp.model.Cabinet;
import com.yg.omp.service.CabinetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetServiceImpl extends AbstractBaseServiceImpl<Cabinet> implements CabinetService {
    @Autowired
    private CabinetDAO cabinetDAO;

    private static final Logger logger = LoggerFactory.getLogger(CabinetServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = cabinetDAO;
    }

    @Override
    public List<Cabinet> findByBuildingId(Integer buildingId) {
        return cabinetDAO.findByBuildingId(buildingId);
    }
}