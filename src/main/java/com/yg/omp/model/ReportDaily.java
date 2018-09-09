package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity
@Table(name = "tb_report_daily")
public class ReportDaily implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -6433981512371782393L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "meter_no")
    private String meterNo;

    @Column(name = "report_date")
    private String reportDate;

    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "transformer_name")
    private String transformerName;

    @Column(name = "cabinet_name")
    private String cabinetName;

    @Column(name = "loop_no")
    private String loopNo;

    @Column(name = "loop_name")
    private String loopName;

    @Column(name = "level3_jb")
    private String level3Jb;

    @Column(name = "level3_db")
    private String level3Db;

    @Column(name = "level3_ydxzb")
    private String level3Ydxzb;

    @Column(name = "level3_ydsbb")
    private String level3Ydsbb;

    @Column(name = "data_hour01")
    private Float dataHour01;

    @Column(name = "data_hour02")
    private Float dataHour02;

    @Column(name = "data_hour03")
    private Float dataHour03;

    @Column(name = "data_hour04")
    private Float dataHour04;

    @Column(name = "data_hour05")
    private Float dataHour05;

    @Column(name = "data_hour06")
    private Float dataHour06;

    @Column(name = "data_hour07")
    private Float dataHour07;

    @Column(name = "data_hour08")
    private Float dataHour08;

    @Column(name = "data_hour09")
    private Float dataHour09;

    @Column(name = "data_hour10")
    private Float dataHour10;

    @Column(name = "data_hour11")
    private Float dataHour11;

    @Column(name = "data_hour12")
    private Float dataHour12;

    @Column(name = "data_hour13")
    private Float dataHour13;

    @Column(name = "data_hour14")
    private Float dataHour14;

    @Column(name = "data_hour15")
    private Float dataHour15;

    @Column(name = "data_hour16")
    private Float dataHour16;

    @Column(name = "data_hour17")
    private Float dataHour17;

    @Column(name = "data_hour18")
    private Float dataHour18;

    @Column(name = "data_hour19")
    private Float dataHour19;

    @Column(name = "data_hour20")
    private Float dataHour20;

    @Column(name = "data_hour21")
    private Float dataHour21;

    @Column(name = "data_hour22")
    private Float dataHour22;

    @Column(name = "data_hour23")
    private Float dataHour23;

    @Column(name = "data_hour24")
    private Float dataHour24;

    @Column(name = "data_total")
    private Float dataTotal;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取 tb_report_daily.id
     *
     * @return tb_report_daily.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_report_daily.id
     *
     * @param id tb_report_daily.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_report_daily.meter_no
     *
     * @return tb_report_daily.meter_no
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置 tb_report_daily.meter_no
     *
     * @param meterNo tb_report_daily.meter_no
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取 tb_report_daily.report_date
     *
     * @return tb_report_daily.report_date
     */
    public final String getReportDate() {
        return reportDate;
    }

    /**
     * 设置 tb_report_daily.report_date
     *
     * @param reportDate tb_report_daily.report_date
     */
    public final void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    /**
     * 获取 tb_report_daily.building_name
     *
     * @return tb_report_daily.building_name
     */
    public final String getBuildingName() {
        return buildingName;
    }

    /**
     * 设置 tb_report_daily.building_name
     *
     * @param buildingName tb_report_daily.building_name
     */
    public final void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * 获取 tb_report_daily.transformer_name
     *
     * @return tb_report_daily.transformer_name
     */
    public final String getTransformerName() {
        return transformerName;
    }

    /**
     * 设置 tb_report_daily.transformer_name
     *
     * @param transformerName tb_report_daily.transformer_name
     */
    public final void setTransformerName(String transformerName) {
        this.transformerName = transformerName == null ? null : transformerName.trim();
    }

    /**
     * 获取 tb_report_daily.cabinet_name
     *
     * @return tb_report_daily.cabinet_name
     */
    public final String getCabinetName() {
        return cabinetName;
    }

    /**
     * 设置 tb_report_daily.cabinet_name
     *
     * @param cabinetName tb_report_daily.cabinet_name
     */
    public final void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName == null ? null : cabinetName.trim();
    }

    /**
     * 获取 tb_report_daily.loop_no
     *
     * @return tb_report_daily.loop_no
     */
    public final String getLoopNo() {
        return loopNo;
    }

    /**
     * 设置 tb_report_daily.loop_no
     *
     * @param loopNo tb_report_daily.loop_no
     */
    public final void setLoopNo(String loopNo) {
        this.loopNo = loopNo == null ? null : loopNo.trim();
    }

    /**
     * 获取 tb_report_daily.loop_name
     *
     * @return tb_report_daily.loop_name
     */
    public final String getLoopName() {
        return loopName;
    }

    /**
     * 设置 tb_report_daily.loop_name
     *
     * @param loopName tb_report_daily.loop_name
     */
    public final void setLoopName(String loopName) {
        this.loopName = loopName == null ? null : loopName.trim();
    }

    /**
     * 获取 tb_report_daily.level3_jb
     *
     * @return tb_report_daily.level3_jb
     */
    public final String getLevel3Jb() {
        return level3Jb;
    }

    /**
     * 设置 tb_report_daily.level3_jb
     *
     * @param level3Jb tb_report_daily.level3_jb
     */
    public final void setLevel3Jb(String level3Jb) {
        this.level3Jb = level3Jb == null ? null : level3Jb.trim();
    }

    /**
     * 获取 tb_report_daily.level3_db
     *
     * @return tb_report_daily.level3_db
     */
    public final String getLevel3Db() {
        return level3Db;
    }

    /**
     * 设置 tb_report_daily.level3_db
     *
     * @param level3Db tb_report_daily.level3_db
     */
    public final void setLevel3Db(String level3Db) {
        this.level3Db = level3Db == null ? null : level3Db.trim();
    }

    /**
     * 获取 tb_report_daily.level3_ydxzb
     *
     * @return tb_report_daily.level3_ydxzb
     */
    public final String getLevel3Ydxzb() {
        return level3Ydxzb;
    }

    /**
     * 设置 tb_report_daily.level3_ydxzb
     *
     * @param level3Ydxzb tb_report_daily.level3_ydxzb
     */
    public final void setLevel3Ydxzb(String level3Ydxzb) {
        this.level3Ydxzb = level3Ydxzb == null ? null : level3Ydxzb.trim();
    }

    /**
     * 获取 tb_report_daily.level3_ydsbb
     *
     * @return tb_report_daily.level3_ydsbb
     */
    public final String getLevel3Ydsbb() {
        return level3Ydsbb;
    }

    /**
     * 设置 tb_report_daily.level3_ydsbb
     *
     * @param level3Ydsbb tb_report_daily.level3_ydsbb
     */
    public final void setLevel3Ydsbb(String level3Ydsbb) {
        this.level3Ydsbb = level3Ydsbb == null ? null : level3Ydsbb.trim();
    }

    /**
     * 获取 tb_report_daily.data_hour01
     *
     * @return tb_report_daily.data_hour01
     */
    public final Float getDataHour01() {
        return dataHour01;
    }

    /**
     * 设置 tb_report_daily.data_hour01
     *
     * @param dataHour01 tb_report_daily.data_hour01
     */
    public final void setDataHour01(Float dataHour01) {
        this.dataHour01 = dataHour01;
    }

    /**
     * 获取 tb_report_daily.data_hour02
     *
     * @return tb_report_daily.data_hour02
     */
    public final Float getDataHour02() {
        return dataHour02;
    }

    /**
     * 设置 tb_report_daily.data_hour02
     *
     * @param dataHour02 tb_report_daily.data_hour02
     */
    public final void setDataHour02(Float dataHour02) {
        this.dataHour02 = dataHour02;
    }

    /**
     * 获取 tb_report_daily.data_hour03
     *
     * @return tb_report_daily.data_hour03
     */
    public final Float getDataHour03() {
        return dataHour03;
    }

    /**
     * 设置 tb_report_daily.data_hour03
     *
     * @param dataHour03 tb_report_daily.data_hour03
     */
    public final void setDataHour03(Float dataHour03) {
        this.dataHour03 = dataHour03;
    }

    /**
     * 获取 tb_report_daily.data_hour04
     *
     * @return tb_report_daily.data_hour04
     */
    public final Float getDataHour04() {
        return dataHour04;
    }

    /**
     * 设置 tb_report_daily.data_hour04
     *
     * @param dataHour04 tb_report_daily.data_hour04
     */
    public final void setDataHour04(Float dataHour04) {
        this.dataHour04 = dataHour04;
    }

    /**
     * 获取 tb_report_daily.data_hour05
     *
     * @return tb_report_daily.data_hour05
     */
    public final Float getDataHour05() {
        return dataHour05;
    }

    /**
     * 设置 tb_report_daily.data_hour05
     *
     * @param dataHour05 tb_report_daily.data_hour05
     */
    public final void setDataHour05(Float dataHour05) {
        this.dataHour05 = dataHour05;
    }

    /**
     * 获取 tb_report_daily.data_hour06
     *
     * @return tb_report_daily.data_hour06
     */
    public final Float getDataHour06() {
        return dataHour06;
    }

    /**
     * 设置 tb_report_daily.data_hour06
     *
     * @param dataHour06 tb_report_daily.data_hour06
     */
    public final void setDataHour06(Float dataHour06) {
        this.dataHour06 = dataHour06;
    }

    /**
     * 获取 tb_report_daily.data_hour07
     *
     * @return tb_report_daily.data_hour07
     */
    public final Float getDataHour07() {
        return dataHour07;
    }

    /**
     * 设置 tb_report_daily.data_hour07
     *
     * @param dataHour07 tb_report_daily.data_hour07
     */
    public final void setDataHour07(Float dataHour07) {
        this.dataHour07 = dataHour07;
    }

    /**
     * 获取 tb_report_daily.data_hour08
     *
     * @return tb_report_daily.data_hour08
     */
    public final Float getDataHour08() {
        return dataHour08;
    }

    /**
     * 设置 tb_report_daily.data_hour08
     *
     * @param dataHour08 tb_report_daily.data_hour08
     */
    public final void setDataHour08(Float dataHour08) {
        this.dataHour08 = dataHour08;
    }

    /**
     * 获取 tb_report_daily.data_hour09
     *
     * @return tb_report_daily.data_hour09
     */
    public final Float getDataHour09() {
        return dataHour09;
    }

    /**
     * 设置 tb_report_daily.data_hour09
     *
     * @param dataHour09 tb_report_daily.data_hour09
     */
    public final void setDataHour09(Float dataHour09) {
        this.dataHour09 = dataHour09;
    }

    /**
     * 获取 tb_report_daily.data_hour10
     *
     * @return tb_report_daily.data_hour10
     */
    public final Float getDataHour10() {
        return dataHour10;
    }

    /**
     * 设置 tb_report_daily.data_hour10
     *
     * @param dataHour10 tb_report_daily.data_hour10
     */
    public final void setDataHour10(Float dataHour10) {
        this.dataHour10 = dataHour10;
    }

    /**
     * 获取 tb_report_daily.data_hour11
     *
     * @return tb_report_daily.data_hour11
     */
    public final Float getDataHour11() {
        return dataHour11;
    }

    /**
     * 设置 tb_report_daily.data_hour11
     *
     * @param dataHour11 tb_report_daily.data_hour11
     */
    public final void setDataHour11(Float dataHour11) {
        this.dataHour11 = dataHour11;
    }

    /**
     * 获取 tb_report_daily.data_hour12
     *
     * @return tb_report_daily.data_hour12
     */
    public final Float getDataHour12() {
        return dataHour12;
    }

    /**
     * 设置 tb_report_daily.data_hour12
     *
     * @param dataHour12 tb_report_daily.data_hour12
     */
    public final void setDataHour12(Float dataHour12) {
        this.dataHour12 = dataHour12;
    }

    /**
     * 获取 tb_report_daily.data_hour13
     *
     * @return tb_report_daily.data_hour13
     */
    public final Float getDataHour13() {
        return dataHour13;
    }

    /**
     * 设置 tb_report_daily.data_hour13
     *
     * @param dataHour13 tb_report_daily.data_hour13
     */
    public final void setDataHour13(Float dataHour13) {
        this.dataHour13 = dataHour13;
    }

    /**
     * 获取 tb_report_daily.data_hour14
     *
     * @return tb_report_daily.data_hour14
     */
    public final Float getDataHour14() {
        return dataHour14;
    }

    /**
     * 设置 tb_report_daily.data_hour14
     *
     * @param dataHour14 tb_report_daily.data_hour14
     */
    public final void setDataHour14(Float dataHour14) {
        this.dataHour14 = dataHour14;
    }

    /**
     * 获取 tb_report_daily.data_hour15
     *
     * @return tb_report_daily.data_hour15
     */
    public final Float getDataHour15() {
        return dataHour15;
    }

    /**
     * 设置 tb_report_daily.data_hour15
     *
     * @param dataHour15 tb_report_daily.data_hour15
     */
    public final void setDataHour15(Float dataHour15) {
        this.dataHour15 = dataHour15;
    }

    /**
     * 获取 tb_report_daily.data_hour16
     *
     * @return tb_report_daily.data_hour16
     */
    public final Float getDataHour16() {
        return dataHour16;
    }

    /**
     * 设置 tb_report_daily.data_hour16
     *
     * @param dataHour16 tb_report_daily.data_hour16
     */
    public final void setDataHour16(Float dataHour16) {
        this.dataHour16 = dataHour16;
    }

    /**
     * 获取 tb_report_daily.data_hour17
     *
     * @return tb_report_daily.data_hour17
     */
    public final Float getDataHour17() {
        return dataHour17;
    }

    /**
     * 设置 tb_report_daily.data_hour17
     *
     * @param dataHour17 tb_report_daily.data_hour17
     */
    public final void setDataHour17(Float dataHour17) {
        this.dataHour17 = dataHour17;
    }

    /**
     * 获取 tb_report_daily.data_hour18
     *
     * @return tb_report_daily.data_hour18
     */
    public final Float getDataHour18() {
        return dataHour18;
    }

    /**
     * 设置 tb_report_daily.data_hour18
     *
     * @param dataHour18 tb_report_daily.data_hour18
     */
    public final void setDataHour18(Float dataHour18) {
        this.dataHour18 = dataHour18;
    }

    /**
     * 获取 tb_report_daily.data_hour19
     *
     * @return tb_report_daily.data_hour19
     */
    public final Float getDataHour19() {
        return dataHour19;
    }

    /**
     * 设置 tb_report_daily.data_hour19
     *
     * @param dataHour19 tb_report_daily.data_hour19
     */
    public final void setDataHour19(Float dataHour19) {
        this.dataHour19 = dataHour19;
    }

    /**
     * 获取 tb_report_daily.data_hour20
     *
     * @return tb_report_daily.data_hour20
     */
    public final Float getDataHour20() {
        return dataHour20;
    }

    /**
     * 设置 tb_report_daily.data_hour20
     *
     * @param dataHour20 tb_report_daily.data_hour20
     */
    public final void setDataHour20(Float dataHour20) {
        this.dataHour20 = dataHour20;
    }

    /**
     * 获取 tb_report_daily.data_hour21
     *
     * @return tb_report_daily.data_hour21
     */
    public final Float getDataHour21() {
        return dataHour21;
    }

    /**
     * 设置 tb_report_daily.data_hour21
     *
     * @param dataHour21 tb_report_daily.data_hour21
     */
    public final void setDataHour21(Float dataHour21) {
        this.dataHour21 = dataHour21;
    }

    /**
     * 获取 tb_report_daily.data_hour22
     *
     * @return tb_report_daily.data_hour22
     */
    public final Float getDataHour22() {
        return dataHour22;
    }

    /**
     * 设置 tb_report_daily.data_hour22
     *
     * @param dataHour22 tb_report_daily.data_hour22
     */
    public final void setDataHour22(Float dataHour22) {
        this.dataHour22 = dataHour22;
    }

    /**
     * 获取 tb_report_daily.data_hour23
     *
     * @return tb_report_daily.data_hour23
     */
    public final Float getDataHour23() {
        return dataHour23;
    }

    /**
     * 设置 tb_report_daily.data_hour23
     *
     * @param dataHour23 tb_report_daily.data_hour23
     */
    public final void setDataHour23(Float dataHour23) {
        this.dataHour23 = dataHour23;
    }

    /**
     * 获取 tb_report_daily.data_hour24
     *
     * @return tb_report_daily.data_hour24
     */
    public final Float getDataHour24() {
        return dataHour24;
    }

    /**
     * 设置 tb_report_daily.data_hour24
     *
     * @param dataHour24 tb_report_daily.data_hour24
     */
    public final void setDataHour24(Float dataHour24) {
        this.dataHour24 = dataHour24;
    }

    /**
     * 获取 tb_report_daily.data_total
     *
     * @return tb_report_daily.data_total
     */
    public final Float getDataTotal() {
        return dataTotal;
    }

    /**
     * 设置 tb_report_daily.data_total
     *
     * @param dataTotal tb_report_daily.data_total
     */
    public final void setDataTotal(Float dataTotal) {
        this.dataTotal = dataTotal;
    }

    /**
     * 获取 tb_report_daily.update_time
     *
     * @return tb_report_daily.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 tb_report_daily.update_time
     *
     * @param updateTime tb_report_daily.update_time
     */
    public final void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", meterNo=").append(meterNo);
        sb.append(", reportDate=").append(reportDate);
        sb.append(", buildingName=").append(buildingName);
        sb.append(", transformerName=").append(transformerName);
        sb.append(", cabinetName=").append(cabinetName);
        sb.append(", loopNo=").append(loopNo);
        sb.append(", loopName=").append(loopName);
        sb.append(", level3Jb=").append(level3Jb);
        sb.append(", level3Db=").append(level3Db);
        sb.append(", level3Ydxzb=").append(level3Ydxzb);
        sb.append(", level3Ydsbb=").append(level3Ydsbb);
        sb.append(", dataHour01=").append(dataHour01);
        sb.append(", dataHour02=").append(dataHour02);
        sb.append(", dataHour03=").append(dataHour03);
        sb.append(", dataHour04=").append(dataHour04);
        sb.append(", dataHour05=").append(dataHour05);
        sb.append(", dataHour06=").append(dataHour06);
        sb.append(", dataHour07=").append(dataHour07);
        sb.append(", dataHour08=").append(dataHour08);
        sb.append(", dataHour09=").append(dataHour09);
        sb.append(", dataHour10=").append(dataHour10);
        sb.append(", dataHour11=").append(dataHour11);
        sb.append(", dataHour12=").append(dataHour12);
        sb.append(", dataHour13=").append(dataHour13);
        sb.append(", dataHour14=").append(dataHour14);
        sb.append(", dataHour15=").append(dataHour15);
        sb.append(", dataHour16=").append(dataHour16);
        sb.append(", dataHour17=").append(dataHour17);
        sb.append(", dataHour18=").append(dataHour18);
        sb.append(", dataHour19=").append(dataHour19);
        sb.append(", dataHour20=").append(dataHour20);
        sb.append(", dataHour21=").append(dataHour21);
        sb.append(", dataHour22=").append(dataHour22);
        sb.append(", dataHour23=").append(dataHour23);
        sb.append(", dataHour24=").append(dataHour24);
        sb.append(", dataTotal=").append(dataTotal);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}