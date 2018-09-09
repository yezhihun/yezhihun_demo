package com.yg.omp.service;

import com.yg.omp.model.BakMeterDataHour;

import java.util.List;
import java.util.Map;

public interface BakMeterDataHourService extends BaseService<BakMeterDataHour>{

    List<Map<String, Object>> selectTimerMeter(Integer buildingId, String time);

    List<Map<String, Object>> selectLoopMeter(String meterNo, String startTime, String endTime);

    List<Map<String, Object>> selectElectricityMeter(Integer buildingId, String startTime, String endTime);

    List<BakMeterDataHour> selectTrendAnalysis(String meterNo, String dateTime);
}