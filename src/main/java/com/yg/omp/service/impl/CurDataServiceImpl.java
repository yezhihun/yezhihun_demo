package com.yg.omp.service.impl;

import com.yg.omp.dao.CurDataDAO;
import com.yg.omp.model.CurData;
import com.yg.omp.service.CurDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CurDataServiceImpl extends AbstractBaseServiceImpl<CurData> implements CurDataService {
    @Autowired
    private CurDataDAO curDataDAO;

    private static final Logger logger = LoggerFactory.getLogger(CurDataServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = curDataDAO;
    }

    @Override
    public List<Map<String, Object>> selectChartMonitorForHigh(Integer buildingId) {
        return curDataDAO.selectChartMonitorForHigh(buildingId);
    }

    @Override
    public List<Map<String, Object>> selectChartMonitorForLow(Integer buildingId, Integer transformerId) {
        return curDataDAO.selectChartMonitorForLow(buildingId, transformerId);
    }

    @Override
    public List<Map<String, Object>> selectDataMonitorRealTime(Integer buildingId, Integer transformerId) {
        return curDataDAO.selectDataMonitorRealTime(buildingId, transformerId);
    }
}