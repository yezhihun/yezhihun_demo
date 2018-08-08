package com.yg.omp.service;

import com.yg.omp.model.ReportMonthly;

import java.util.List;
import java.util.Map;

public interface ReportMonthlyService extends BaseService<ReportMonthly> {

    List<Map<String, Object>> selectMonthlyReport(Integer buildingId, String dateTime);
}