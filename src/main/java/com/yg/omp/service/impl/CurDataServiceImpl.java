package com.yg.omp.service.impl;

import com.yg.omp.dao.CurDataDao;
import com.yg.omp.model.CurData;
import com.yg.omp.service.CurDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class CurDataServiceImpl extends AbstractBaseServiceImpl<CurData> implements CurDataService {
    @Autowired
    private CurDataDao curDataDao;

    private static final Logger logger = LoggerFactory.getLogger(CurDataServiceImpl.class);

    @Override
    @PostConstruct
    public void init() {
        this.baseDao = curDataDao;
    }

    @Override
    public List<Map<String, Object>> selectChartMonitorForHigh(Integer buildingId) {
        return curDataDao.findChartMonitorForHigh(buildingId);
    }

    @Override
    public List<Map<String, Object>> selectChartMonitorForLow(Integer buildingId, Integer transformerId) {
        return curDataDao.findChartMonitorForLow(buildingId, transformerId);
    }

    @Override
    public List<Map<String, Object>> selectDataMonitorRealTime(Integer buildingId, Integer transformerId) {
        return curDataDao.findDataMonitorRealTime(buildingId, transformerId);
    }
}