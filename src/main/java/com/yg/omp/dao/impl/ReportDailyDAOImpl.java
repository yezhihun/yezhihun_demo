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
                "\tdaily.id,daily.meter_no meterNo, daily.report_date reportDate, daily.loop_no loopNo, daily.loop_name loopName, daily.level3_jb level3Jb, daily.level3_db level3Db," +
                "\tdaily.level3_ydxzb level3Ydxzb, daily.level3_ydsbb level3Ydsbb, daily.data_total dataTotal, daily.update_time updateTime," +
                "\tdaily.data_hour01 dataHour01,\n" +
                "\tdaily.data_hour02 dataHour02,\n" +
                "\tdaily.data_hour03 dataHour03,\n" +
                "\tdaily.data_hour04 dataHour04,\n" +
                "\tdaily.data_hour05 dataHour05,\n" +
                "\tdaily.data_hour06 dataHour06,\n" +
                "\tdaily.data_hour07 dataHour07,\n" +
                "\tdaily.data_hour08 dataHour08,\n" +
                "\tdaily.data_hour09 dataHour09,\n" +
                "\tdaily.data_hour10 dataHour10,\n" +
                "\tdaily.data_hour11 dataHour11,\n" +
                "\tdaily.data_hour12 dataHour12,\n" +
                "\tdaily.data_hour13 dataHour13,\n" +
                "\tdaily.data_hour14 dataHour14,\n" +
                "\tdaily.data_hour15 dataHour15,\n" +
                "\tdaily.data_hour16 dataHour16,\n" +
                "\tdaily.data_hour17 dataHour17,\n" +
                "\tdaily.data_hour18 dataHour18,\n" +
                "\tdaily.data_hour19 dataHour19,\n" +
                "\tdaily.data_hour20 dataHour20,\n" +
                "\tdaily.data_hour21 dataHour21,\n" +
                "\tdaily.data_hour22 dataHour22,\n" +
                "\tdaily.data_hour23 dataHour23,\n" +
                "\tdaily.data_hour24 dataHour24,\n" +
                "\tIFNULL(daily.data_hour01, 0) + IFNULL(daily.data_hour02, 0) + IFNULL(daily.data_hour03, 0) + IFNULL(daily.data_hour04, 0) + IFNULL(daily.data_hour05, 0) + IFNULL(daily.data_hour06, 0) + IFNULL(daily.data_hour07, 0) + IFNULL(daily.data_hour08, 0) + IFNULL(daily.data_hour09, 0) + IFNULL(daily.data_hour10, 0) + IFNULL(daily.data_hour11, 0) + IFNULL(daily.data_hour12, 0) + IFNULL(daily.data_hour13, 0) + IFNULL(daily.data_hour14, 0) + IFNULL(daily.data_hour15, 0) + IFNULL(daily.data_hour16, 0) + IFNULL(daily.data_hour17, 0) + IFNULL(daily.data_hour18, 0) + IFNULL(daily.data_hour19, 0) + IFNULL(daily.data_hour20, 0) + IFNULL(daily.data_hour21, 0) + IFNULL(daily.data_hour22, 0) + IFNULL(daily.data_hour23, 0) + IFNULL(daily.data_hour24, 0) AS sumData\n" +
                "FROM\n" +
                "\ttb_report_daily AS daily\n" +
                "INNER JOIN tb_meter AS tm ON daily.meter_no = tm.meter_no\n" +
                "INNER JOIN tb_building AS tb ON tm.building_id = tb.id\n" +
                "LEFT JOIN tb_transformer AS tt ON tm.transformer_id = tt.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tm.cabinet_id = tc.id\n" +
                "WHERE\n" +
                "\ttm.meter_is_report = '1'\n" +
                "AND daily.report_date = " + time + "\n" +
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