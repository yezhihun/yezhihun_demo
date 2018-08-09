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
public interface CurDataDao extends BaseDao<CurData> {

    List<Map<String, Object>> findChartMonitorForHigh(Integer buildingId);

    List<Map<String, Object>> findChartMonitorForLow(Integer buildingId, Integer transformerId);

    List<Map<String, Object>> findDataMonitorRealTime(Integer buildingId, Integer transformerId);
}