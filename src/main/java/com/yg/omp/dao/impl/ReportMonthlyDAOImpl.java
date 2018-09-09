package com.yg.omp.dao.impl;

import com.yg.omp.base.BaseDaoImpl;
import com.yg.omp.model.ReportMonthly;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author 
 */
@SuppressWarnings("ALL")
public class ReportMonthlyDAOImpl extends BaseDaoImpl<ReportMonthly> {

    public List<Map<String, Object>> selectMonthlyReport(Integer buildingId, String dateTime){
        String sql = "SELECT\n" +
                "\ttb.building_name buildingName,\n" +
                "\ttt.transformer_name transformerName,\n" +
                "\ttc.cabinet_name cabinetName,\n" +
                "\tmonthly.id,monthly.meter_no meterNo, monthly.report_date reportDate, monthly.loop_no loopNo, monthly.loop_name loopName, monthly.level3_jb level3Jb, monthly.level3_db level3Db," +
                "\tmonthly.level3_ydxzb level3Ydxzb, monthly.level3_ydsbb level3Ydsbb, monthly.data_total dataTotal, monthly.update_time updateTime," +
                "\tmonthly.data_date01 dataDate01,\n" +
                "\tmonthly.data_date02 dataDate02,\n" +
                "\tmonthly.data_date03 dataDate03,\n" +
                "\tmonthly.data_date04 dataDate04,\n" +
                "\tmonthly.data_date05 dataDate05,\n" +
                "\tmonthly.data_date06 dataDate06,\n" +
                "\tmonthly.data_date07 dataDate07,\n" +
                "\tmonthly.data_date08 dataDate08,\n" +
                "\tmonthly.data_date09 dataDate09,\n" +
                "\tmonthly.data_date10 dataDate10,\n" +
                "\tmonthly.data_date11 dataDate11,\n" +
                "\tmonthly.data_date12 dataDate12,\n" +
                "\tmonthly.data_date13 dataDate13,\n" +
                "\tmonthly.data_date14 dataDate14,\n" +
                "\tmonthly.data_date15 dataDate15,\n" +
                "\tmonthly.data_date16 dataDate16,\n" +
                "\tmonthly.data_date17 dataDate17,\n" +
                "\tmonthly.data_date18 dataDate18,\n" +
                "\tmonthly.data_date19 dataDate19,\n" +
                "\tmonthly.data_date20 dataDate20,\n" +
                "\tmonthly.data_date21 dataDate21,\n" +
                "\tmonthly.data_date22 dataDate22,\n" +
                "\tmonthly.data_date23 dataDate23,\n" +
                "\tmonthly.data_date24 dataDate24,\n" +
                "\tmonthly.data_date18 dataDate25,\n" +
                "\tmonthly.data_date19 dataDate26,\n" +
                "\tmonthly.data_date20 dataDate27,\n" +
                "\tmonthly.data_date21 dataDate28,\n" +
                "\tmonthly.data_date22 dataDate29,\n" +
                "\tmonthly.data_date23 dataDate30,\n" +
                "\tmonthly.data_date24 dataDate31,\n" +
                "\tIFNULL(monthly.data_date01, 0) + IFNULL(monthly.data_date02, 0) + IFNULL(monthly.data_date03, 0) + IFNULL(monthly.data_date04, 0) + IFNULL(monthly.data_date05, 0) + IFNULL(monthly.data_date06, 0) + IFNULL(monthly.data_date07, 0) + IFNULL(monthly.data_date08, 0) + IFNULL(monthly.data_date09, 0) + IFNULL(monthly.data_date10, 0) + IFNULL(monthly.data_date11, 0) + IFNULL(monthly.data_date12, 0) + IFNULL(monthly.data_date13, 0) + IFNULL(monthly.data_date14, 0) + IFNULL(monthly.data_date15, 0) + IFNULL(monthly.data_date16, 0) + IFNULL(monthly.data_date17, 0) + IFNULL(monthly.data_date18, 0) + IFNULL(monthly.data_date19, 0) + IFNULL(monthly.data_date20, 0) + IFNULL(monthly.data_date21, 0) + IFNULL(monthly.data_date22, 0) + IFNULL(monthly.data_date23, 0) + IFNULL(monthly.data_date24, 0) + IFNULL(monthly.data_date25, 0) + IFNULL(monthly.data_date26, 0) + IFNULL(monthly.data_date27, 0) + IFNULL(monthly.data_date28, 0) + IFNULL(monthly.data_date29, 0) + IFNULL(monthly.data_date30, 0) + IFNULL(monthly.data_date31, 0) AS sumData\n" +
                "FROM\n" +
                "\ttb_report_monthly AS monthly\n" +
                "INNER JOIN tb_meter AS tm ON monthly.meter_no = tm.meter_no\n" +
                "INNER JOIN tb_building AS tb ON tm.building_id = tb.id\n" +
                "LEFT JOIN tb_transformer AS tt ON tm.transformer_id = tt.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tm.cabinet_id = tc.id\n" +
                "WHERE\n" +
                "\ttm.meter_is_report = " + buildingId + "\n" +
                "AND monthly.report_date = '" + dateTime + "'\n" +
                "AND tm.building_id = '1'\n" +
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