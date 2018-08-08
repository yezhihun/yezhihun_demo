package com.yg.omp.service;

import com.yg.omp.model.CurData;

import java.util.List;
import java.util.Map;

public interface CurDataService extends BaseService<CurData> {

    List<Map<String,Object>> selectChartMonitorForHigh(Integer buildingId);

    List<Map<String,Object>> selectChartMonitorForLow(Integer buildingId, Integer transformerId);

    List<Map<String, Object>> selectDataMonitorRealTime(Integer buildingId, Integer transformerId);
}