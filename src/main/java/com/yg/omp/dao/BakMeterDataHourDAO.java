package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.model.BakMeterDataHour;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 
 */
@Repository
public interface BakMeterDataHourDAO  extends BaseDao<BakMeterDataHour> {

    List<Map<String, Object>> selectTimerMeter(Integer buildingId, String time);

    List<Map<String, Object>> selectLoopMeter(Integer meterNo, String startTime, String endTime);

    List<Map<String, Object>> selectElectricityMeter(Integer meterNo, String startTime, String endTime);

    List<BakMeterDataHour> selectTrendAnalysis(Integer meterNo, String dateTime);
}