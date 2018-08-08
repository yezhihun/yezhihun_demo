package com.yg.omp.dao.impl;

import com.yg.omp.base.BaseDaoImpl;
import com.yg.omp.model.CurData;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author
 */
@SuppressWarnings("ALL")
public class CurDataDAOImpl extends BaseDaoImpl<CurData> {

    public List<Map<String, Object>> selectChartMonitorForHigh(Integer buildingId) {
        String sql = "SELECT\n" +
                "\ttc.cabinet_no,\n" +
                "\ttl.loop_name,\n" +
                "\ttcd.curdata_uab,\n" +
                "\ttcd.curdata_ubc,\n" +
                "\ttcd.curdata_uac,\n" +
                "\ttcd.curdata_ia,\n" +
                "\ttcd.curdata_ib,\n" +
                "\ttcd.curdata_ic,\n" +
                "\ttcd.curdata_pz,\n" +
                "\ttcd.curdata_qz,\n" +
                "\ttmc.meter_net_status,\n" +
                "\ttsc.serialport_connstatus,\n" +
                "\ttmc.meter_connstatus\n" +
                "FROM\n" +
                "\ttb_curdata AS tcd\n" +
                "INNER JOIN tb_meter AS tm ON tcd.meter_id = tm.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tm.cabinet_id = tc.id\n" +
                "INNER JOIN tb_loop AS tl ON tm.loop_id = tl.id\n" +
                "INNER JOIN tb_meter_connstatus AS tmc ON tm.id = tmc.meter_id\n" +
                "INNER JOIN tb_serialport_connstatus AS tsc ON tm.serialport_id = tsc.serialport_id\n" +
                "WHERE\n" +
                "\ttm.building_id = " + buildingId +
                "AND tm.transformer_id IS NULL";

        Query q = entityManager.createNativeQuery(sql);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    public List<Map<String, Object>> selectChartMonitorForLow(Integer buildingId, Integer transformerId) {
        String sql = "SELECT\n" +
                "\ttc.cabinet_no,\n" +
                "\ttl.loop_name,\n" +
                "\ttcd.curdata_ua,\n" +
                "\ttcd.curdata_ub,\n" +
                "\ttcd.curdata_uc,\n" +
                "\ttcd.curdata_uab,\n" +
                "\ttcd.curdata_ubc,\n" +
                "\ttcd.curdata_uac,\n" +
                "\ttcd.curdata_ia,\n" +
                "\ttcd.curdata_ib,\n" +
                "\ttcd.curdata_ic,\n" +
                "\ttcd.curdata_pz,\n" +
                "\ttcd.curdata_qz,\n" +
                "\ttcd.curdata_sparefloat01,\n" +
                "\ttcd.curdata_sparefloat02,\n" +
                "\ttcd.curdata_sparefloat03,\n" +
                "\ttcd.curdata_sparefloat04,\n" +
                "\ttcd.curdata_sparefloat05,\n" +
                "\ttcd.curdata_spareint01,\n" +
                "\ttcd.curdata_spareint02,\n" +
                "\ttmc.meter_net_status,\n" +
                "\ttsc.serialport_connstatus,\n" +
                "\ttmc.meter_connstatus\n" +
                "FROM\n" +
                "\ttb_curdata AS tcd\n" +
                "INNER JOIN tb_meter AS tm ON tcd.meter_id = tm.id\n" +
                "INNER JOIN tb_cabinet AS tc ON tm.cabinet_id = tc.id\n" +
                "INNER JOIN tb_loop AS tl ON tm.loop_id = tl.id\n" +
                "INNER JOIN tb_meter_connstatus AS tmc ON tm.id = tmc.meter_id\n" +
                "INNER JOIN tb_serialport_connstatus AS tsc ON tm.serialport_id = tsc.serialport_id\n" +
                "WHERE\n" +
                "\ttm.building_id = " + buildingId +
                "AND tm.transformer_id = " + transformerId;

        Query q = entityManager.createNativeQuery(sql);

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }

    List<Map<String, Object>> selectDataMonitorRealTime(Integer buildingId, Integer transformerId){
        String sql = "SELECT\n" +
                "\ttm.building_id,\n" +
                "\ttm.meter_addr,\n" +
                "\ttm.meter_no,\n" +
                "\ttbb.building_name,\n" +
                "\ttt.transformer_name,\n" +
                "\ttc.cabinet_name,\n" +
                "\tts.serialport_no,\n" +
                "\ttl.loop_no,\n" +
                "\ttl.loop_name,\n" +
                "\ttsc.serialport_connstatus,\n" +
                "\ttmc.meter_connstatus,\n" +
                "\ttmc.meter_net_status,\n" +
                "\ttcd.curdata_ua,\n" +
                "\ttcd.curdata_ub,\n" +
                "\ttcd.curdata_uc,\n" +
                "\ttcd.curdata_uab,\n" +
                "\ttcd.curdata_ubc,\n" +
                "\ttcd.curdata_uac,\n" +
                "\ttcd.curdata_ia,\n" +
                "\ttcd.curdata_ib,\n" +
                "\ttcd.curdata_ic,\n" +
                "\ttcd.curdata_sparefloat01,\n" +
                "\ttcd.curdata_spareint01,\n" +
                "\ttcd.curdata_spareint02,\n" +
                "\ttcd.curdata_pz,\n" +
                "\ttcd.curdata_qz,\n" +
                "\ttcd.curdata_pf,\n" +
                "\ttcd.curdata_f,\n" +
                "\ttcd.curdata_epi,\n" +
                "\ttcd.curdata_threshold_i,\n" +
                "\ttcd.curdata_threshold_p\n" +
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

        List<Map<String, Object>> list = q.getResultList();

        return list;
    }
}