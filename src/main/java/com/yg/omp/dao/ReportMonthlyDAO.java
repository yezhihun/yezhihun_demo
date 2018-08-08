package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.model.ReportMonthly;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 
 */
@Repository
public interface ReportMonthlyDAO extends BaseDao<ReportMonthly> {

    List<Map<String, Object>> selectMonthlyReport(Integer buildingId, String dateTime);
}