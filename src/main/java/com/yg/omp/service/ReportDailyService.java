package com.yg.omp.service;

import com.yg.omp.model.ReportDaily;

import java.util.List;
import java.util.Map;

public interface ReportDailyService extends BaseService<ReportDaily> {

    List<Map<String, Object>> selectDailyReport(Integer buildingId, String time);
}