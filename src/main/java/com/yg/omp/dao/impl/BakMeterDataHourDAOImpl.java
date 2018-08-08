package com.yg.omp.dao.impl;

import com.yg.omp.base.BaseDaoImpl;
import com.yg.omp.model.BakMeterDataHour;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author 
 */
@SuppressWarnings("ALL")
public class BakMeterDataHourDAOImpl extends BaseDaoImpl<BakMeterDataHour> {

    List<Map<String, Object>> selectTimerMeter(Integer buildingId, String time){
        String sql = "SELECT\n" +
                "\ttbme.meter_no,\n" +
                "\ttbb.building_name,\n" +
                "\ttbme.transformer_name,\n" +
                "\ttbc.cabinet_name,\n" +
                "\ttbl.loop_no,\n" +
                "\ttbl.loop_name,\n" +
                "\ttbbmdh.curdata_ua,\n" +
                "\ttbbmdh.curdata_ub,\n" +
                "\ttbbmdh.curdata_uc,\n" +
                "\ttbbmdh.curdata_uab,\n" +
                "\ttbbmdh.curdata_ubc,\n" +
                "\ttbbmdh.curdata_uac,\n" +
                "\ttbbmdh.curdata_ia,\n" +
                "\ttbbmdh.curdata_ib,\n" +
                "\ttbbmdh.curdata_ic,\n" +
                "\ttbbmdh.curdata_sparefloat01,\n" +
                "\ttbbmdh.curdata_pz,\n" +
                "\ttbbmdh.curdata_qz,\n" +
                "\ttbbmdh.curdata_pf,\n" +
                "\ttbbmdh.curdata_f,\n" +
                "\ttbbmdh.curdata_epi\n" +
                "FROM\n" +
                "\tth_bakmeterdata_hour AS tbbmdh\n" +
                "INNER JOIN tb_meter AS tbme ON tbme.meter_no = tbbmdh.meter_no\n" +
                "INNER JOIN tb_building AS tbb ON tbme.building_id = tbb.id\n" +
                "INNER JOIN tb_loop AS tbl ON tbme.loop_id = tbl.id\n" +
                "INNER JOIN tb_cabinet AS tbc ON tbme.cabinet_id = tbc.id\n" +
                "WHERE\n" +
                "\ttbme.meter_is_report = '1'\n" +
                "AND tbbmdh.bakmeterdata_format_time = " + time + "\n" +
                "AND tbme.building_id = " + buildingId + "\n" +
                "GROUP BY\n" +
                "\ttbbmdh.meter_id\n" +
                "ORDER BY\n" +
                "\ttbbmdh.meter_no ASC";

        Query q = entityManager.createNativeQuery(sql);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    List<Map<String, Object>> selectLoopMeter(Integer meterNo, String startTime, String endTime){
        String sql = "SELECT\n" +
                "\ttb.building_name,\n" +
                "\ttme.loop_no,\n" +
                "\ttme.loop_name,\n" +
                "\ttbbmdh.bakmeterdata_format_time,\n" +
                "\ttbbmdh.curdata_ua,\n" +
                "\ttbbmdh.curdata_ub,\n" +
                "\ttbbmdh.curdata_uc,\n" +
                "\ttbbmdh.curdata_ia,\n" +
                "\ttbbmdh.curdata_ib,\n" +
                "\ttbbmdh.curdata_ic,\n" +
                "\ttbbmdh.curdata_sparefloat01,\n" +
                "\ttbbmdh.curdata_pz,\n" +
                "\ttbbmdh.curdata_qz,\n" +
                "\ttbbmdh.curdata_pf,\n" +
                "\ttbbmdh.curdata_f,\n" +
                "\ttbbmdh.curdata_epi\n" +
                "FROM\n" +
                "\ttz_bakmeterdata_" + meterNo + " AS tbbmdh\n" +
                "INNER JOIN tb_meter AS tme ON tme.meter_no = tbbmdh.meter_no\n" +
                "INNER JOIN tb_building AS tb ON tme.building_id = tb.id\n" +
                "WHERE\n" +
                "\ttbbmdh.meter_no = " + meterNo + "\n" +
                "AND tbbmdh.bakmeterdata_format_time >= " + startTime + "\n" +
                "AND tbbmdh.bakmeterdata_format_time <= " + endTime + "\n" +
                "GROUP BY\n" +
                "\tDate(\n" +
                "\t\ttbbmdh.bakmeterdata_format_time\n" +
                "\t) + HOUR (\n" +
                "\t\ttbbmdh.bakmeterdata_format_time\n" +
                "\t)\n" +
                "ORDER BY\n" +
                "\ttbbmdh.bakmeterdata_format_time";

        Query q = entityManager.createNativeQuery(sql);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    List<Map<String, Object>> selectElectricityMeter(Integer buildingId, String startTime, String endTime){
        String sql = "SELECT\n" +
                "\t\tt1.meter_no,\n" +
                "\t\tt1.building_name,\n" +
                "\t\tt1.transformer_name,\n" +
                "\t\tt1.cabinet_name,\n" +
                "\t\tt1.loop_no,\n" +
                "\t\tt1.loop_name,\n" +
                "\t\tt2.curdata_ua - t1.curdata_ua,\n" +
                "\t\tt2.curdata_ub - t1.curdata_ub,\n" +
                "\t\tt2.curdata_uc - t1.curdata_uc,\n" +
                "\t\tt2.curdata_uab - t1.curdata_uab,\n" +
                "\t\tt2.curdata_ubc - t1.curdata_ubc,\n" +
                "\t\tt2.curdata_uac - t1.curdata_uac,\n" +
                "\t\tt2.curdata_ia - t1.curdata_ia,\n" +
                "\t\tt2.curdata_ib - t1.curdata_ib,\n" +
                "\t\tt2.curdata_ic - t1.curdata_ic,\n" +
                "\t\tt2.curdata_sparefloat01 - t1.curdata_sparefloat01,\n" +
                "\t\tt2.curdata_pz - t1.curdata_pz,\n" +
                "\t\tt2.curdata_qz - t1.curdata_qz,\n" +
                "\t\tt2.curdata_pf - t1.curdata_pf,\n" +
                "\t\tt2.curdata_f - t1.curdata_f,\n" +
                "\t\tt2.curdata_epi - t1.curdata_epi\t\n" +
                "FROM\n" +
                "\t(\n" +
                "\t\tSELECT\n" +
                "\t\ttbme.meter_no,\n" +
                "\t\ttbb.building_name,\n" +
                "\t\ttbme.transformer_name,\n" +
                "\t\ttbc.cabinet_name,\n" +
                "\t\ttbl.loop_no,\n" +
                "\t\ttbl.loop_name,\n" +
                "\t\ttbbmdh.curdata_ua,\n" +
                "\t\ttbbmdh.curdata_ub,\n" +
                "\t\ttbbmdh.curdata_uc,\n" +
                "\t\ttbbmdh.curdata_uab,\n" +
                "\t\ttbbmdh.curdata_ubc,\n" +
                "\t\ttbbmdh.curdata_uac,\n" +
                "\t\ttbbmdh.curdata_ia,\n" +
                "\t\ttbbmdh.curdata_ib,\n" +
                "\t\ttbbmdh.curdata_ic,\n" +
                "\t\ttbbmdh.curdata_sparefloat01,\n" +
                "\t\ttbbmdh.curdata_pz,\n" +
                "\t\ttbbmdh.curdata_qz,\n" +
                "\t\ttbbmdh.curdata_pf,\n" +
                "\t\ttbbmdh.curdata_f,\n" +
                "\t\ttbbmdh.curdata_epi\n" +
                "FROM\n" +
                "\t\tth_bakmeterdata_hour AS tbbmdh\n" +
                "\t\tINNER JOIN tb_meter AS tbme ON tbme.meter_no = tbbmdh.meter_no\n" +
                "\t\tINNER JOIN tb_building AS tbb ON tbme.building_id = tbb.id\n" +
                "\t\tINNER JOIN tb_loop AS tbl ON tbme.loop_id = tbl.id\n" +
                "\t\tINNER JOIN tb_cabinet AS tbc ON tbme.cabinet_id = tbc.id\n" +
                "WHERE\n" +
                "\t\ttbme.meter_is_report = '1'\n" +
                "\t\tAND tbbmdh.bakmeterdata_format_time = " + startTime + "\n" +
                "\t\tAND tbme.building_id = " + buildingId + "\n" +
                "GROUP BY\n" +
                "\t\ttbbmdh.meter_id\n" +
                "\t)t1\n" +
                "\tINNER JOIN(\n" +
                "\t\tSELECT\n" +
                "\t\ttbme.meter_no,\n" +
                "\t\ttbb.building_name,\n" +
                "\t\ttbme.transformer_name,\n" +
                "\t\ttbc.cabinet_name,\n" +
                "\t\ttbl.loop_no,\n" +
                "\t\ttbl.loop_name,\n" +
                "\t\ttbbmdh.curdata_ua,\n" +
                "\t\ttbbmdh.curdata_ub,\n" +
                "\t\ttbbmdh.curdata_uc,\n" +
                "\t\ttbbmdh.curdata_uab,\n" +
                "\t\ttbbmdh.curdata_ubc,\n" +
                "\t\ttbbmdh.curdata_uac,\n" +
                "\t\ttbbmdh.curdata_ia,\n" +
                "\t\ttbbmdh.curdata_ib,\n" +
                "\t\ttbbmdh.curdata_ic,\n" +
                "\t\ttbbmdh.curdata_sparefloat01,\n" +
                "\t\ttbbmdh.curdata_pz,\n" +
                "\t\ttbbmdh.curdata_qz,\n" +
                "\t\ttbbmdh.curdata_pf,\n" +
                "\t\ttbbmdh.curdata_f,\n" +
                "\t\ttbbmdh.curdata_epi\n" +
                "FROM\n" +
                "\t\tth_bakmeterdata_hour AS tbbmdh\n" +
                "\t\tINNER JOIN tb_meter AS tbme ON tbme.meter_no = tbbmdh.meter_no\n" +
                "\t\tINNER JOIN tb_building AS tbb ON tbme.building_id = tbb.id\n" +
                "\t\tINNER JOIN tb_loop AS tbl ON tbme.loop_id = tbl.id\n" +
                "\t\tINNER JOIN tb_cabinet AS tbc ON tbme.cabinet_id = tbc.id\n" +
                "WHERE\n" +
                "\t\ttbme.meter_is_report = '1'\n" +
                "\t\tAND tbbmdh.bakmeterdata_format_time = " + endTime + "\n" +
                "\t\tAND tbme.building_id = " + buildingId + "\n" +
                "GROUP BY\n" +
                "\t\ttbbmdh.meter_id\n" +
                "\t)t2 ON t1.meter_no = t2.meter_no\n" +
                "ORDER BY\n" +
                "\tmeter_no ASC;\n";

        Query q = entityManager.createNativeQuery(sql);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    List<BakMeterDataHour> selectTrendAnalysis(Integer meterNo, String dateTime){
        String sql = "SELECT\n" +
                "\tcurdata_ia,\n" +
                "\tcurdata_ib,\n" +
                "\tcurdata_ic,\n" +
                "\tcurdata_pz,\n" +
                "\tcurdata_sparefloat01,\n" +
                "\tcurdata_sparefloat02,\n" +
                "\tcurdata_sparefloat03,\n" +
                "\tcurdata_sparefloat04,\n" +
                "\tcurdata_sparefloat05,\n" +
                "\tbakmeterdata_format_time,\n" +
                "\tbakmeterdata_format_index\n" +
                "FROM\n" +
                "\ttz_bakmeterdata_" + meterNo + "\n" +
                "\tWHERE\n" +
                "\tAND Date(bakmeterdata_format_time) = " + dateTime;

        Query q = entityManager.createNativeQuery(sql, BakMeterDataHour.class);

        List<BakMeterDataHour> list = q.getResultList();

        return list;
    }
}