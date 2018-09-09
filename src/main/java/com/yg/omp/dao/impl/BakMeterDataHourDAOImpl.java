package com.yg.omp.dao.impl;

import com.yg.omp.base.BaseDaoImpl;
import com.yg.omp.model.BakMeterDataHour;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author 
 */
public class BakMeterDataHourDAOImpl extends BaseDaoImpl<BakMeterDataHour> {

    public List<Map<String, Object>> selectTimerMeter(Integer buildingId, String time){
        String sql = "SELECT\n" +
                "\ttbme.meter_no meterNo,\n" +
                "\ttbb.building_name buildingName,\n" +
                "\ttbme.transformer_name transformerName,\n" +
                "\ttbc.cabinet_name cabinetName,\n" +
                "\ttbl.loop_no loopNo,\n" +
                "\ttbl.loop_name loopName,\n" +
                "\ttbbmdh.curdata_ua curdataUa,\n" +
                "\ttbbmdh.curdata_ub curdataUb,\n" +
                "\ttbbmdh.curdata_uc curdataUc,\n" +
                "\ttbbmdh.curdata_uab curdataUab,\n" +
                "\ttbbmdh.curdata_ubc curdataUbc,\n" +
                "\ttbbmdh.curdata_uac curdataUac,\n" +
                "\ttbbmdh.curdata_ia curdataIa,\n" +
                "\ttbbmdh.curdata_ib curdataIb,\n" +
                "\ttbbmdh.curdata_ic curdataIc,\n" +
                "\ttbbmdh.curdata_sparefloat01  curdataSparefloat01,\n" +
                "\ttbbmdh.curdata_pz curdataPz,\n" +
                "\ttbbmdh.curdata_qz curdataQz,\n" +
                "\ttbbmdh.curdata_pf curdataPf,\n" +
                "\ttbbmdh.curdata_f curdataF,\n" +
                "\ttbbmdh.curdata_epi curdataEpi\n" +
                "FROM\n" +
                "\tth_bakmeterdata_hour AS tbbmdh\n" +
                "INNER JOIN tb_meter AS tbme ON tbme.meter_no = tbbmdh.meter_no\n" +
                "INNER JOIN tb_building AS tbb ON tbme.building_id = tbb.id\n" +
                "INNER JOIN tb_loop AS tbl ON tbme.loop_id = tbl.id\n" +
                "INNER JOIN tb_cabinet AS tbc ON tbme.cabinet_id = tbc.id\n" +
                "WHERE\n" +
                "\ttbme.meter_is_report = '1'\n" +
                "AND tbbmdh.bakmeterdata_format_time = '" + time + "'\n" +
                "AND tbme.building_id = " + buildingId + "\n" +
                "GROUP BY\n" +
                "\ttbbmdh.meter_id\n" +
                "ORDER BY\n" +
                "\ttbbmdh.meter_no ASC";

        Query q = entityManager.createNativeQuery(sql);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    public List<Map<String, Object>> selectLoopMeter(String meterNo, String startTime, String endTime){
        String sql = "SELECT\n" +
                "\ttb.building_name buildingName,\n" +
                "\ttme.loop_no loopNo,\n" +
                "\ttme.loop_name loopName,\n" +
                "\ttbbmdh.bakmeterdata_format_time bakmeterdataFormatTime,\n" +
                "\ttbbmdh.curdata_ua curdataUa,\n" +
                "\ttbbmdh.curdata_ub curdataUb,\n" +
                "\ttbbmdh.curdata_uc curdataUc,\n" +
                "\ttbbmdh.curdata_uc curdataUab,\n" +
                "\ttbbmdh.curdata_uc curdataUbc,\n" +
                "\ttbbmdh.curdata_uc curdataUac,\n" +
                "\ttbbmdh.curdata_ia curdataIa,\n" +
                "\ttbbmdh.curdata_ib curdataIb,\n" +
                "\ttbbmdh.curdata_ic curdataIc,\n" +
                "\ttbbmdh.curdata_sparefloat01 curdataSparefloat01,\n" +
                "\ttbbmdh.curdata_pz curdataPz,\n" +
                "\ttbbmdh.curdata_qz curdataQz,\n" +
                "\ttbbmdh.curdata_pf curdataPf,\n" +
                "\ttbbmdh.curdata_f curdataF,\n" +
                "\ttbbmdh.curdata_epi curdataEpi\n" +
                "FROM\n" +
                "\ttz_bakmeterdata_" + meterNo + " AS tbbmdh\n" +
                "INNER JOIN tb_meter AS tme ON tme.meter_no = tbbmdh.meter_no\n" +
                "INNER JOIN tb_building AS tb ON tme.building_id = tb.id\n" +
                "WHERE\n" +
                "\ttbbmdh.meter_no = " + meterNo + "\n" +
                "AND tbbmdh.bakmeterdata_format_time >= '" + startTime + "'\n" +
                "AND tbbmdh.bakmeterdata_format_time <= '" + endTime + "'\n" +
                "GROUP BY\n" +
                "\tDate(\n" +
                "\t\ttbbmdh.bakmeterdata_format_time\n" +
                "\t) + HOUR (\n" +
                "\t\ttbbmdh.bakmeterdata_format_time\n" +
                "\t)\n" +
                "ORDER BY\n" +
                "\ttbbmdh.bakmeterdata_format_time";

        Query q = entityManager.createNativeQuery(sql);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    public List<Map<String, Object>> selectElectricityMeter(Integer buildingId, String startTime, String endTime){
        String sql = "SELECT\n" +
                "\t\tt1.meter_no meterNo,\n" +
                "\t\tt1.building_name buildingName,\n" +
                "\t\tt1.transformer_name transformerName,\n" +
                "\t\tt1.cabinet_name cabinetBame,\n" +
                "\t\tt1.loop_no loopNo,\n" +
                "\t\tt1.loop_name loopName,\n" +
                "\t\tt2.curdata_ua curdataUa,\n" +
                "\t\tt2.curdata_ub curdataUb,\n" +
                "\t\tt2.curdata_uc curdataUc,\n" +
                "\t\tt2.curdata_uab curdataUab,\n" +
                "\t\tt2.curdata_ubc curdataUbc,\n" +
                "\t\tt2.curdata_uac curdataUac,\n" +
                "\t\tt2.curdata_ia curdataIa,\n" +
                "\t\tt2.curdata_ib curdataIb,\n" +
                "\t\tt2.curdata_ic curdataIc,\n" +
                "\t\tt2.curdata_sparefloat01 curdataSparefloat01,\n" +
                "\t\tt2.curdata_pz curdataPz,\n" +
                "\t\tt2.curdata_qz curdataQz,\n" +
                "\t\tt2.curdata_pf curdataPf,\n" +
                "\t\tt2.curdata_f curdataF,\n" +
                "\t\tt2.curdata_epi endCurdataEpi\t\n" +
                "\t\tt1.curdata_epi startCurdataEpi\t\n" +
                "\t\tt2.curdata_epi - t1.curdata_epi  curdataEpi\t\n" +
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
                "\t\tAND tbbmdh.bakmeterdata_format_time = '" + startTime + "'\n" +
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
                "\t\tAND tbbmdh.bakmeterdata_format_time = \'" + endTime + "\'\n" +
                "\t\tAND tbme.building_id = " + buildingId + "\n" +
                "GROUP BY\n" +
                "\t\ttbbmdh.meter_id\n" +
                "\t)t2 ON t1.meter_no = t2.meter_no\n" +
                "ORDER BY\n" +
                "\tmeterNo ASC;\n";

        Query q = entityManager.createNativeQuery(sql);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    public List<BakMeterDataHour> selectTrendAnalysis(String meterNo, String dateTime){
        String sql = "SELECT\n" +
                "\tcurdata_ia curdataIa,\n" +
                "\tcurdata_ib curdataIb,\n" +
                "\tcurdata_ic curdataIc,\n" +
                "\tcurdata_pz curdataPz,\n" +
                "\tcurdata_sparefloat01 curdataSparefloat01,\n" +
                "\tcurdata_sparefloat02 curdataSparefloat02,\n" +
                "\tcurdata_sparefloat03 curdataSparefloat03,\n" +
                "\tcurdata_sparefloat04 curdataSparefloat04,\n" +
                "\tcurdata_sparefloat05 curdataSparefloat05,\n" +
                "\tbakmeterdata_format_time bakmeterdataFormatTime,\n" +
                "\tbakmeterdata_format_index bakmeterdataFormatIndex\n" +
                "FROM\n" +
                "\ttz_bakmeterdata_" + meterNo + "\n" +
                "\tWHERE\n" +
                "\tAND Date(bakmeterdata_format_time) = '" + dateTime +"'";

        Query q = entityManager.createNativeQuery(sql, BakMeterDataHour.class);

        List<BakMeterDataHour> list = q.getResultList();

        return list;
    }
}