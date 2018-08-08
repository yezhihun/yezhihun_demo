package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.model.ReportDaily;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 
 */
@Repository
public interface ReportDailyDAO extends BaseDao<ReportDaily>{
    List<Map<String, Object>> selectDailyReport(Integer buildingId, String time);
}