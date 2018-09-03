package com.yg.omp.dao.impl;

import com.yg.omp.base.BaseDaoImpl;
import com.yg.omp.model.CurData;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author
 */
public class CurDataDaoImpl extends BaseDaoImpl<CurData> {

    public List<Map<String, Object>> findChartMonitorForHigh(Integer buildingId) {
        String sql = "SELECT\n" +
                "\ttc.cabinet_no cabinetNo,\n" +
                "\ttl.loop_name loopName,\n" +
                "\ttcd.curdata_uab curdataUab,\n" +
                "\ttcd.curdata_ubc curdataUbc,\n" +
                "\ttcd.curdata_uac curdataUac,\n" +
                "\ttcd.curdata_ia curdataIa,\n" +
                "\ttcd.curdata_ib curdataIb,\n" +
                "\ttcd.curdata_ic curdataIc,\n" +
                "\ttcd.curdata_pz curdataPz,\n" +
                "\ttcd.curdata_qz curdataQz,\n" +
                "\ttmc.meter_net_status meterNetStatus,\n" +
                "\ttsc.serialport_connstatus serialportConnstatus,\n" +
                "\ttmc.meter_connstatus meterConnstatus\n" +
                "FROM\n" +
                "\ttb_curdata AS tcd\n" +
                "INNER JOIN tb_meter AS tm ON tcd.meter_id = tm.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tm.cabinet_id = tc.id\n" +
                "INNER JOIN tb_loop AS tl ON tm.loop_id = tl.id\n" +
                "INNER JOIN tb_meter_connstatus AS tmc ON tm.id = tmc.meter_id\n" +
                "INNER JOIN tb_serialport_connstatus AS tsc ON tm.serialport_id = tsc.serialport_id\n" +
                "WHERE\n" +
                "\ttm.building_id = " + buildingId + "\n" +
                "AND tm.transformer_id IS NULL";

        Query q = entityManager.createNativeQuery(sql);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    public List<Map<String, Object>> findChartMonitorForLow(Integer buildingId, Integer transformerId) {
        String sql = "SELECT\n" +
                "\ttc.cabinet_no cabinetNo,\n" +
                "\ttl.loop_name loopName,\n" +
                "\ttcd.curdata_ua curdataUa,\n" +
                "\ttcd.curdata_ub curdataUb,\n" +
                "\ttcd.curdata_uc curdataUc,\n" +
                "\ttcd.curdata_uab curdataUab,\n" +
                "\ttcd.curdata_ubc curdataUbc,\n" +
                "\ttcd.curdata_uac curdataUac,\n" +
                "\ttcd.curdata_ia curdataIa,\n" +
                "\ttcd.curdata_ib curdataIb,\n" +
                "\ttcd.curdata_ic curdataIc,\n" +
                "\ttcd.curdata_pz curdataPz,\n" +
                "\ttcd.curdata_qz curdataQz,\n" +
                "\ttcd.curdata_sparefloat01 curdataSparefloat01,\n" +
                "\ttcd.curdata_sparefloat02 curdataSparefloat02,\n" +
                "\ttcd.curdata_sparefloat03 curdataSparefloat03,\n" +
                "\ttcd.curdata_sparefloat04 curdataSparefloat04,\n" +
                "\ttcd.curdata_sparefloat05 curdataSparefloat05,\n" +
                "\ttcd.curdata_spareint01 curdataSpareint01,\n" +
                "\ttcd.curdata_spareint02 curdataSpareint02,\n" +
                "\ttmc.meter_net_status meterNetStatus,\n" +
                "\ttsc.serialport_connstatus serialportConnstatus,\n" +
                "\ttmc.meter_connstatus meterConnstatus\n" +
                "FROM\n" +
                "\ttb_curdata AS tcd\n" +
                "INNER JOIN tb_meter AS tm ON tcd.meter_id = tm.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tm.cabinet_id = tc.id\n" +
                "INNER JOIN tb_loop AS tl ON tm.loop_id = tl.id\n" +
                "INNER JOIN tb_meter_connstatus AS tmc ON tm.id = tmc.meter_id\n" +
                "INNER JOIN tb_serialport_connstatus AS tsc ON tm.serialport_id = tsc.serialport_id\n" +
                "WHERE\n" +
                "\ttm.building_id = " + buildingId + "\n" +
                "AND tm.transformer_id = " + transformerId;

        Query q = entityManager.createNativeQuery(sql);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    public List<Map<String, Object>> findDataMonitorRealTime(Integer buildingId, Integer transformerId){
        String sql = "SELECT \n" +
                "\ttm.building_id buildingId,\n" +
                "\ttm.meter_addr meterAddr,\n" +
                "\ttm.meter_no MeterNo,\n" +
                "\ttbb.building_name buildingName,\n" +
                "\ttt.transformer_name transformerName,\n" +
                "\ttc.cabinet_name cabinetName,\n" +
                "\tts.serialport_no serialportNo,\n" +
                "\ttl.loop_no loopNo,\n" +
                "\ttl.loop_name loopName,\n" +
                "\ttsc.serialport_connstatus serialportConnstatus,\n" +
                "\ttmc.meter_connstatus meterConnstatus,\n" +
                "\ttmc.meter_net_status meterNetStatus,\n" +
                "\ttcd.curdata_ua curdataUa,\n" +
                "\ttcd.curdata_ub curdataUb,\n" +
                "\ttcd.curdata_uc curdataUc,\n" +
                "\ttcd.curdata_uab curdataUab,\n" +
                "\ttcd.curdata_ubc curdataUbc,\n" +
                "\ttcd.curdata_uac curdataUac,\n" +
                "\ttcd.curdata_ia curdataIa,\n" +
                "\ttcd.curdata_ib curdataIb,\n" +
                "\ttcd.curdata_ic curdataIc,\n" +
                "\ttcd.curdata_sparefloat01 curdataSparefloat01,\n" +
                "\ttcd.curdata_spareint01 curdataSpareint01,\n" +
                "\ttcd.curdata_spareint02 curdataSpareint02,\n" +
                "\ttcd.curdata_pz curdataPz,\n" +
                "\ttcd.curdata_qz curdataQz,\n" +
                "\ttcd.curdata_pf curdataPf,\n" +
                "\ttcd.curdata_f curdataF,\n" +
                "\ttcd.curdata_epi curdataEpi,\n" +
                "\ttcd.curdata_threshold_i curdataThresholdI,\n" +
                "\ttcd.curdata_threshold_p curdataThresholdP\n" +
                "FROM\n" +
                "\ttb_curdata AS tcd\n" +
                "INNER JOIN tb_meter AS tm ON tcd.meter_no = tm.meter_no\n" +
                "INNER JOIN tb_meter_connstatus AS tmc ON tmc.meter_no = tcd.meter_no\n" +
                "INNER JOIN tb_serialport_connstatus AS tsc ON tm.serialport_id = tsc.serialport_id\n" +
                "INNER JOIN tb_building AS tbb ON tm.building_id = tbb.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tc.id = tm.cabinet_id\n" +
                "LEFT JOIN tb_transformer AS tt ON tt.id = tm.transformer_id\n" +
                "INNER JOIN tb_loop AS tl ON tl.id = tm.loop_id\n" +
                "INNER JOIN tb_serialport AS ts ON tm.serialport_id = ts.id\n" +
                "WHERE\n" +
                "\ttm.building_id = " + buildingId + "\n" +
                "AND tm.meter_showstatus = '1'";

        Query q = entityManager.createNativeQuery(sql);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }
}