package com.yg.omp.service.impl;

import com.yg.omp.dao.BakMeterDataHourDAO;
import com.yg.omp.model.BakMeterDataHour;
import com.yg.omp.service.BakMeterDataHourService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BakMeterDataHourServiceImpl extends AbstractBaseServiceImpl<BakMeterDataHour> implements BakMeterDataHourService {
    @Autowired
    private BakMeterDataHourDAO bakMeterDataHourDAO;

    private static final Logger logger = LoggerFactory.getLogger(BakMeterDataHourServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = bakMeterDataHourDAO;
    }

    @Override
    public List<Map<String, Object>> selectTimerMeter(Integer buildingId, String time) {
        return bakMeterDataHourDAO.selectTimerMeter(buildingId, time);
    }

    @Override
    public List<Map<String, Object>> selectLoopMeter(String meterNo, String startTime, String endTime) {
        return bakMeterDataHourDAO.selectLoopMeter(meterNo, startTime, endTime);
    }

    @Override
    public List<Map<String, Object>> selectElectricityMeter(Integer buildingId, String startTime, String endTime) {
        return bakMeterDataHourDAO.selectElectricityMeter(buildingId, startTime, endTime);
    }

    @Override
    public List<BakMeterDataHour> selectTrendAnalysis(String meterNo, String dateTime) {
        return bakMeterDataHourDAO.selectTrendAnalysis(meterNo, dateTime);
    }
}