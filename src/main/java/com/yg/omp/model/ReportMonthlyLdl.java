package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity
@Table(name = "tb_report_monthly_ldl")
public class ReportMonthlyLdl implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -5664397735256899497L;

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

    @Column(name = "data_item")
    private String dataItem;

    @Column(name = "level3_jb")
    private String level3Jb;

    @Column(name = "level3_db")
    private String level3Db;

    @Column(name = "level3_ydxzb")
    private String level3Ydxzb;

    @Column(name = "level3_ydsbb")
    private String level3Ydsbb;

    @Column(name = "data_date01")
    private String dataDate01;

    @Column(name = "data_date02")
    private String dataDate02;

    @Column(name = "data_date03")
    private String dataDate03;

    @Column(name = "data_date04")
    private String dataDate04;

    @Column(name = "data_date05")
    private String dataDate05;

    @Column(name = "data_date06")
    private String dataDate06;

    @Column(name = "data_date07")
    private String dataDate07;

    @Column(name = "data_date08")
    private String dataDate08;

    @Column(name = "data_date09")
    private String dataDate09;

    @Column(name = "data_date10")
    private String dataDate10;

    @Column(name = "data_date11")
    private String dataDate11;

    @Column(name = "data_date12")
    private String dataDate12;

    @Column(name = "data_date13")
    private String dataDate13;

    @Column(name = "data_date14")
    private String dataDate14;

    @Column(name = "data_date15")
    private String dataDate15;

    @Column(name = "data_date16")
    private String dataDate16;

    @Column(name = "data_date17")
    private String dataDate17;

    @Column(name = "data_date18")
    private String dataDate18;

    @Column(name = "data_date19")
    private String dataDate19;

    @Column(name = "data_date20")
    private String dataDate20;

    @Column(name = "data_date21")
    private String dataDate21;

    @Column(name = "data_date22")
    private String dataDate22;

    @Column(name = "data_date23")
    private String dataDate23;

    @Column(name = "data_date24")
    private String dataDate24;

    @Column(name = "data_date25")
    private String dataDate25;

    @Column(name = "data_date26")
    private String dataDate26;

    @Column(name = "data_date27")
    private String dataDate27;

    @Column(name = "data_date28")
    private String dataDate28;

    @Column(name = "data_date29")
    private String dataDate29;

    @Column(name = "data_date30")
    private String dataDate30;

    @Column(name = "data_date31")
    private String dataDate31;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取 tb_report_monthly_ldl.id
     *
     * @return tb_report_monthly_ldl.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_report_monthly_ldl.id
     *
     * @param id tb_report_monthly_ldl.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_report_monthly_ldl.meter_no
     *
     * @return tb_report_monthly_ldl.meter_no
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置 tb_report_monthly_ldl.meter_no
     *
     * @param meterNo tb_report_monthly_ldl.meter_no
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.report_date
     *
     * @return tb_report_monthly_ldl.report_date
     */
    public final String getReportDate() {
        return reportDate;
    }

    /**
     * 设置 tb_report_monthly_ldl.report_date
     *
     * @param reportDate tb_report_monthly_ldl.report_date
     */
    public final void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.building_name
     *
     * @return tb_report_monthly_ldl.building_name
     */
    public final String getBuildingName() {
        return buildingName;
    }

    /**
     * 设置 tb_report_monthly_ldl.building_name
     *
     * @param buildingName tb_report_monthly_ldl.building_name
     */
    public final void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.transformer_name
     *
     * @return tb_report_monthly_ldl.transformer_name
     */
    public final String getTransformerName() {
        return transformerName;
    }

    /**
     * 设置 tb_report_monthly_ldl.transformer_name
     *
     * @param transformerName tb_report_monthly_ldl.transformer_name
     */
    public final void setTransformerName(String transformerName) {
        this.transformerName = transformerName == null ? null : transformerName.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.cabinet_name
     *
     * @return tb_report_monthly_ldl.cabinet_name
     */
    public final String getCabinetName() {
        return cabinetName;
    }

    /**
     * 设置 tb_report_monthly_ldl.cabinet_name
     *
     * @param cabinetName tb_report_monthly_ldl.cabinet_name
     */
    public final void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName == null ? null : cabinetName.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.loop_no
     *
     * @return tb_report_monthly_ldl.loop_no
     */
    public final String getLoopNo() {
        return loopNo;
    }

    /**
     * 设置 tb_report_monthly_ldl.loop_no
     *
     * @param loopNo tb_report_monthly_ldl.loop_no
     */
    public final void setLoopNo(String loopNo) {
        this.loopNo = loopNo == null ? null : loopNo.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.loop_name
     *
     * @return tb_report_monthly_ldl.loop_name
     */
    public final String getLoopName() {
        return loopName;
    }

    /**
     * 设置 tb_report_monthly_ldl.loop_name
     *
     * @param loopName tb_report_monthly_ldl.loop_name
     */
    public final void setLoopName(String loopName) {
        this.loopName = loopName == null ? null : loopName.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_item
     *
     * @return tb_report_monthly_ldl.data_item
     */
    public final String getDataItem() {
        return dataItem;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_item
     *
     * @param dataItem tb_report_monthly_ldl.data_item
     */
    public final void setDataItem(String dataItem) {
        this.dataItem = dataItem == null ? null : dataItem.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.level3_jb
     *
     * @return tb_report_monthly_ldl.level3_jb
     */
    public final String getLevel3Jb() {
        return level3Jb;
    }

    /**
     * 设置 tb_report_monthly_ldl.level3_jb
     *
     * @param level3Jb tb_report_monthly_ldl.level3_jb
     */
    public final void setLevel3Jb(String level3Jb) {
        this.level3Jb = level3Jb == null ? null : level3Jb.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.level3_db
     *
     * @return tb_report_monthly_ldl.level3_db
     */
    public final String getLevel3Db() {
        return level3Db;
    }

    /**
     * 设置 tb_report_monthly_ldl.level3_db
     *
     * @param level3Db tb_report_monthly_ldl.level3_db
     */
    public final void setLevel3Db(String level3Db) {
        this.level3Db = level3Db == null ? null : level3Db.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.level3_ydxzb
     *
     * @return tb_report_monthly_ldl.level3_ydxzb
     */
    public final String getLevel3Ydxzb() {
        return level3Ydxzb;
    }

    /**
     * 设置 tb_report_monthly_ldl.level3_ydxzb
     *
     * @param level3Ydxzb tb_report_monthly_ldl.level3_ydxzb
     */
    public final void setLevel3Ydxzb(String level3Ydxzb) {
        this.level3Ydxzb = level3Ydxzb == null ? null : level3Ydxzb.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.level3_ydsbb
     *
     * @return tb_report_monthly_ldl.level3_ydsbb
     */
    public final String getLevel3Ydsbb() {
        return level3Ydsbb;
    }

    /**
     * 设置 tb_report_monthly_ldl.level3_ydsbb
     *
     * @param level3Ydsbb tb_report_monthly_ldl.level3_ydsbb
     */
    public final void setLevel3Ydsbb(String level3Ydsbb) {
        this.level3Ydsbb = level3Ydsbb == null ? null : level3Ydsbb.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date01
     *
     * @return tb_report_monthly_ldl.data_date01
     */
    public final String getDataDate01() {
        return dataDate01;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date01
     *
     * @param dataDate01 tb_report_monthly_ldl.data_date01
     */
    public final void setDataDate01(String dataDate01) {
        this.dataDate01 = dataDate01 == null ? null : dataDate01.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date02
     *
     * @return tb_report_monthly_ldl.data_date02
     */
    public final String getDataDate02() {
        return dataDate02;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date02
     *
     * @param dataDate02 tb_report_monthly_ldl.data_date02
     */
    public final void setDataDate02(String dataDate02) {
        this.dataDate02 = dataDate02 == null ? null : dataDate02.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date03
     *
     * @return tb_report_monthly_ldl.data_date03
     */
    public final String getDataDate03() {
        return dataDate03;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date03
     *
     * @param dataDate03 tb_report_monthly_ldl.data_date03
     */
    public final void setDataDate03(String dataDate03) {
        this.dataDate03 = dataDate03 == null ? null : dataDate03.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date04
     *
     * @return tb_report_monthly_ldl.data_date04
     */
    public final String getDataDate04() {
        return dataDate04;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date04
     *
     * @param dataDate04 tb_report_monthly_ldl.data_date04
     */
    public final void setDataDate04(String dataDate04) {
        this.dataDate04 = dataDate04 == null ? null : dataDate04.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date05
     *
     * @return tb_report_monthly_ldl.data_date05
     */
    public final String getDataDate05() {
        return dataDate05;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date05
     *
     * @param dataDate05 tb_report_monthly_ldl.data_date05
     */
    public final void setDataDate05(String dataDate05) {
        this.dataDate05 = dataDate05 == null ? null : dataDate05.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date06
     *
     * @return tb_report_monthly_ldl.data_date06
     */
    public final String getDataDate06() {
        return dataDate06;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date06
     *
     * @param dataDate06 tb_report_monthly_ldl.data_date06
     */
    public final void setDataDate06(String dataDate06) {
        this.dataDate06 = dataDate06 == null ? null : dataDate06.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date07
     *
     * @return tb_report_monthly_ldl.data_date07
     */
    public final String getDataDate07() {
        return dataDate07;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date07
     *
     * @param dataDate07 tb_report_monthly_ldl.data_date07
     */
    public final void setDataDate07(String dataDate07) {
        this.dataDate07 = dataDate07 == null ? null : dataDate07.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date08
     *
     * @return tb_report_monthly_ldl.data_date08
     */
    public final String getDataDate08() {
        return dataDate08;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date08
     *
     * @param dataDate08 tb_report_monthly_ldl.data_date08
     */
    public final void setDataDate08(String dataDate08) {
        this.dataDate08 = dataDate08 == null ? null : dataDate08.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date09
     *
     * @return tb_report_monthly_ldl.data_date09
     */
    public final String getDataDate09() {
        return dataDate09;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date09
     *
     * @param dataDate09 tb_report_monthly_ldl.data_date09
     */
    public final void setDataDate09(String dataDate09) {
        this.dataDate09 = dataDate09 == null ? null : dataDate09.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date10
     *
     * @return tb_report_monthly_ldl.data_date10
     */
    public final String getDataDate10() {
        return dataDate10;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date10
     *
     * @param dataDate10 tb_report_monthly_ldl.data_date10
     */
    public final void setDataDate10(String dataDate10) {
        this.dataDate10 = dataDate10 == null ? null : dataDate10.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date11
     *
     * @return tb_report_monthly_ldl.data_date11
     */
    public final String getDataDate11() {
        return dataDate11;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date11
     *
     * @param dataDate11 tb_report_monthly_ldl.data_date11
     */
    public final void setDataDate11(String dataDate11) {
        this.dataDate11 = dataDate11 == null ? null : dataDate11.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date12
     *
     * @return tb_report_monthly_ldl.data_date12
     */
    public final String getDataDate12() {
        return dataDate12;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date12
     *
     * @param dataDate12 tb_report_monthly_ldl.data_date12
     */
    public final void setDataDate12(String dataDate12) {
        this.dataDate12 = dataDate12 == null ? null : dataDate12.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date13
     *
     * @return tb_report_monthly_ldl.data_date13
     */
    public final String getDataDate13() {
        return dataDate13;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date13
     *
     * @param dataDate13 tb_report_monthly_ldl.data_date13
     */
    public final void setDataDate13(String dataDate13) {
        this.dataDate13 = dataDate13 == null ? null : dataDate13.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date14
     *
     * @return tb_report_monthly_ldl.data_date14
     */
    public final String getDataDate14() {
        return dataDate14;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date14
     *
     * @param dataDate14 tb_report_monthly_ldl.data_date14
     */
    public final void setDataDate14(String dataDate14) {
        this.dataDate14 = dataDate14 == null ? null : dataDate14.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date15
     *
     * @return tb_report_monthly_ldl.data_date15
     */
    public final String getDataDate15() {
        return dataDate15;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date15
     *
     * @param dataDate15 tb_report_monthly_ldl.data_date15
     */
    public final void setDataDate15(String dataDate15) {
        this.dataDate15 = dataDate15 == null ? null : dataDate15.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date16
     *
     * @return tb_report_monthly_ldl.data_date16
     */
    public final String getDataDate16() {
        return dataDate16;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date16
     *
     * @param dataDate16 tb_report_monthly_ldl.data_date16
     */
    public final void setDataDate16(String dataDate16) {
        this.dataDate16 = dataDate16 == null ? null : dataDate16.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date17
     *
     * @return tb_report_monthly_ldl.data_date17
     */
    public final String getDataDate17() {
        return dataDate17;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date17
     *
     * @param dataDate17 tb_report_monthly_ldl.data_date17
     */
    public final void setDataDate17(String dataDate17) {
        this.dataDate17 = dataDate17 == null ? null : dataDate17.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date18
     *
     * @return tb_report_monthly_ldl.data_date18
     */
    public final String getDataDate18() {
        return dataDate18;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date18
     *
     * @param dataDate18 tb_report_monthly_ldl.data_date18
     */
    public final void setDataDate18(String dataDate18) {
        this.dataDate18 = dataDate18 == null ? null : dataDate18.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date19
     *
     * @return tb_report_monthly_ldl.data_date19
     */
    public final String getDataDate19() {
        return dataDate19;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date19
     *
     * @param dataDate19 tb_report_monthly_ldl.data_date19
     */
    public final void setDataDate19(String dataDate19) {
        this.dataDate19 = dataDate19 == null ? null : dataDate19.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date20
     *
     * @return tb_report_monthly_ldl.data_date20
     */
    public final String getDataDate20() {
        return dataDate20;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date20
     *
     * @param dataDate20 tb_report_monthly_ldl.data_date20
     */
    public final void setDataDate20(String dataDate20) {
        this.dataDate20 = dataDate20 == null ? null : dataDate20.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date21
     *
     * @return tb_report_monthly_ldl.data_date21
     */
    public final String getDataDate21() {
        return dataDate21;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date21
     *
     * @param dataDate21 tb_report_monthly_ldl.data_date21
     */
    public final void setDataDate21(String dataDate21) {
        this.dataDate21 = dataDate21 == null ? null : dataDate21.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date22
     *
     * @return tb_report_monthly_ldl.data_date22
     */
    public final String getDataDate22() {
        return dataDate22;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date22
     *
     * @param dataDate22 tb_report_monthly_ldl.data_date22
     */
    public final void setDataDate22(String dataDate22) {
        this.dataDate22 = dataDate22 == null ? null : dataDate22.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date23
     *
     * @return tb_report_monthly_ldl.data_date23
     */
    public final String getDataDate23() {
        return dataDate23;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date23
     *
     * @param dataDate23 tb_report_monthly_ldl.data_date23
     */
    public final void setDataDate23(String dataDate23) {
        this.dataDate23 = dataDate23 == null ? null : dataDate23.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date24
     *
     * @return tb_report_monthly_ldl.data_date24
     */
    public final String getDataDate24() {
        return dataDate24;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date24
     *
     * @param dataDate24 tb_report_monthly_ldl.data_date24
     */
    public final void setDataDate24(String dataDate24) {
        this.dataDate24 = dataDate24 == null ? null : dataDate24.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date25
     *
     * @return tb_report_monthly_ldl.data_date25
     */
    public final String getDataDate25() {
        return dataDate25;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date25
     *
     * @param dataDate25 tb_report_monthly_ldl.data_date25
     */
    public final void setDataDate25(String dataDate25) {
        this.dataDate25 = dataDate25 == null ? null : dataDate25.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date26
     *
     * @return tb_report_monthly_ldl.data_date26
     */
    public final String getDataDate26() {
        return dataDate26;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date26
     *
     * @param dataDate26 tb_report_monthly_ldl.data_date26
     */
    public final void setDataDate26(String dataDate26) {
        this.dataDate26 = dataDate26 == null ? null : dataDate26.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date27
     *
     * @return tb_report_monthly_ldl.data_date27
     */
    public final String getDataDate27() {
        return dataDate27;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date27
     *
     * @param dataDate27 tb_report_monthly_ldl.data_date27
     */
    public final void setDataDate27(String dataDate27) {
        this.dataDate27 = dataDate27 == null ? null : dataDate27.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date28
     *
     * @return tb_report_monthly_ldl.data_date28
     */
    public final String getDataDate28() {
        return dataDate28;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date28
     *
     * @param dataDate28 tb_report_monthly_ldl.data_date28
     */
    public final void setDataDate28(String dataDate28) {
        this.dataDate28 = dataDate28 == null ? null : dataDate28.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date29
     *
     * @return tb_report_monthly_ldl.data_date29
     */
    public final String getDataDate29() {
        return dataDate29;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date29
     *
     * @param dataDate29 tb_report_monthly_ldl.data_date29
     */
    public final void setDataDate29(String dataDate29) {
        this.dataDate29 = dataDate29 == null ? null : dataDate29.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date30
     *
     * @return tb_report_monthly_ldl.data_date30
     */
    public final String getDataDate30() {
        return dataDate30;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date30
     *
     * @param dataDate30 tb_report_monthly_ldl.data_date30
     */
    public final void setDataDate30(String dataDate30) {
        this.dataDate30 = dataDate30 == null ? null : dataDate30.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.data_date31
     *
     * @return tb_report_monthly_ldl.data_date31
     */
    public final String getDataDate31() {
        return dataDate31;
    }

    /**
     * 设置 tb_report_monthly_ldl.data_date31
     *
     * @param dataDate31 tb_report_monthly_ldl.data_date31
     */
    public final void setDataDate31(String dataDate31) {
        this.dataDate31 = dataDate31 == null ? null : dataDate31.trim();
    }

    /**
     * 获取 tb_report_monthly_ldl.update_time
     *
     * @return tb_report_monthly_ldl.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 tb_report_monthly_ldl.update_time
     *
     * @param updateTime tb_report_monthly_ldl.update_time
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
        sb.append(", dataItem=").append(dataItem);
        sb.append(", level3Jb=").append(level3Jb);
        sb.append(", level3Db=").append(level3Db);
        sb.append(", level3Ydxzb=").append(level3Ydxzb);
        sb.append(", level3Ydsbb=").append(level3Ydsbb);
        sb.append(", dataDate01=").append(dataDate01);
        sb.append(", dataDate02=").append(dataDate02);
        sb.append(", dataDate03=").append(dataDate03);
        sb.append(", dataDate04=").append(dataDate04);
        sb.append(", dataDate05=").append(dataDate05);
        sb.append(", dataDate06=").append(dataDate06);
        sb.append(", dataDate07=").append(dataDate07);
        sb.append(", dataDate08=").append(dataDate08);
        sb.append(", dataDate09=").append(dataDate09);
        sb.append(", dataDate10=").append(dataDate10);
        sb.append(", dataDate11=").append(dataDate11);
        sb.append(", dataDate12=").append(dataDate12);
        sb.append(", dataDate13=").append(dataDate13);
        sb.append(", dataDate14=").append(dataDate14);
        sb.append(", dataDate15=").append(dataDate15);
        sb.append(", dataDate16=").append(dataDate16);
        sb.append(", dataDate17=").append(dataDate17);
        sb.append(", dataDate18=").append(dataDate18);
        sb.append(", dataDate19=").append(dataDate19);
        sb.append(", dataDate20=").append(dataDate20);
        sb.append(", dataDate21=").append(dataDate21);
        sb.append(", dataDate22=").append(dataDate22);
        sb.append(", dataDate23=").append(dataDate23);
        sb.append(", dataDate24=").append(dataDate24);
        sb.append(", dataDate25=").append(dataDate25);
        sb.append(", dataDate26=").append(dataDate26);
        sb.append(", dataDate27=").append(dataDate27);
        sb.append(", dataDate28=").append(dataDate28);
        sb.append(", dataDate29=").append(dataDate29);
        sb.append(", dataDate30=").append(dataDate30);
        sb.append(", dataDate31=").append(dataDate31);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}