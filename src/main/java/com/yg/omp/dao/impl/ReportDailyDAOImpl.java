package com.yg.omp.dao.impl;

import com.yg.omp.base.BaseDaoImpl;
import com.yg.omp.model.ReportDaily;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author 
 */
@SuppressWarnings("ALL")
public class ReportDailyDAOImpl extends BaseDaoImpl<ReportDaily> {

    public List<Map<String, Object>> selectDailyReport(Integer buildingId, String time){
        String sql = "SELECT\n" +
                "\ttb.building_name buildingName,\n" +
                "\ttt.transformer_name transformerName,\n" +
                "\ttc.cabinet_name cabinetName,\n" +
                "\tdaily.*, IFNULL(daily.data_hour01, 0) + IFNULL(daily.data_hour02, 0) + IFNULL(daily.data_hour03, 0) + IFNULL(daily.data_hour04, 0) + IFNULL(daily.data_hour05, 0) + IFNULL(daily.data_hour06, 0) + IFNULL(daily.data_hour07, 0) + IFNULL(daily.data_hour08, 0) + IFNULL(daily.data_hour09, 0) + IFNULL(daily.data_hour10, 0) + IFNULL(daily.data_hour11, 0) + IFNULL(daily.data_hour12, 0) + IFNULL(daily.data_hour13, 0) + IFNULL(daily.data_hour14, 0) + IFNULL(daily.data_hour15, 0) + IFNULL(daily.data_hour16, 0) + IFNULL(daily.data_hour17, 0) + IFNULL(daily.data_hour18, 0) + IFNULL(daily.data_hour19, 0) + IFNULL(daily.data_hour20, 0) + IFNULL(daily.data_hour21, 0) + IFNULL(daily.data_hour22, 0) + IFNULL(daily.data_hour23, 0) + IFNULL(daily.data_hour24, 0) AS sumData\n" +
                "FROM\n" +
                "\ttb_report_daily AS daily\n" +
                "INNER JOIN tb_meter AS tm ON daily.meter_no = tm.meter_no\n" +
                "INNER JOIN tb_building AS tb ON tm.building_id = tb.id\n" +
                "LEFT JOIN tb_transformer AS tt ON tm.transformer_id = tt.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tm.cabinet_id = tc.id\n" +
                "WHERE\n" +
                "\ttm.meter_is_report = '1'\n" +
                "AND daily.report_date = '" + time + "'\n" +
                "AND tm.building_id = " + buildingId + "\n" +
                "ORDER BY\n" +
                "\ttm.building_name,\n" +
                "\ttm.meter_sort,\n" +
                "\ttm.transformer_name,\n" +
                "\ttm.cabinet_name,\n" +
                "\ttm.loop_no,\n" +
                "\ttm.id;";

        Query q = entityManager.createNativeQuery(sql);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }
}