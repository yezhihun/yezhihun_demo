package com.yg.omp.service.impl;

import com.yg.omp.dao.ReportDailyDAO;
import com.yg.omp.model.ReportDaily;
import com.yg.omp.service.ReportDailyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ReportDailyServiceImpl extends AbstractBaseServiceImpl<ReportDaily> implements ReportDailyService {
    @Autowired
    private ReportDailyDAO reportDailyDAO;

    private static final Logger logger = LoggerFactory.getLogger(ReportDailyServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = reportDailyDAO;
    }

    @Override
    public List<Map<String, Object>> selectDailyReport(Integer buildingId, String time) {
        return reportDailyDAO.selectDailyReport(buildingId, time);
    }
}