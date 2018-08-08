package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.model.CurData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author
 */
@Repository
public interface CurDataDAO extends BaseDao<CurData> {

    List<Map<String, Object>> selectChartMonitorForHigh(Integer buildingId);

    List<Map<String, Object>> selectChartMonitorForLow(Integer buildingId, Integer transformerId);

    List<Map<String, Object>> selectDataMonitorRealTime(Integer buildingId, Integer transformerId);
}