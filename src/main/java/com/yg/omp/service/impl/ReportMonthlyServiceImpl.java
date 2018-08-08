package com.yg.omp.service.impl;

import com.yg.omp.dao.ReportMonthlyDAO;
import com.yg.omp.model.ReportMonthly;
import com.yg.omp.service.ReportMonthlyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ReportMonthlyServiceImpl extends AbstractBaseServiceImpl<ReportMonthly> implements ReportMonthlyService {
    @Autowired
    private ReportMonthlyDAO reportMonthlyDAO;

    private static final Logger logger = LoggerFactory.getLogger(ReportMonthlyServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = reportMonthlyDAO;
    }

    @Override
    public List<Map<String, Object>> selectMonthlyReport(Integer buildingId, String dateTime) {
        return reportMonthlyDAO.selectMonthlyReport(buildingId, dateTime);
    }
}