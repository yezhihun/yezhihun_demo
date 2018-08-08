package com.yg.omp.service;

import com.yg.omp.model.BakMeterDataHour;

import java.util.List;
import java.util.Map;

public interface BakMeterDataHourService extends BaseService<BakMeterDataHour>{

    List<Map<String, Object>> selectTimerMeter(Integer buildingId, String time);

    List<Map<String, Object>> selectLoopMeter(Integer meterNo, String startTime, String endTime);

    List<Map<String, Object>> selectElectricityMeter(Integer meterNo, String startTime, String endTime);

    List<BakMeterDataHour> selectTrendAnalysis(Integer meterNo, String dateTime);
}