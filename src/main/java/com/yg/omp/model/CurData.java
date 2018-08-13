package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity
@Table(name = "tb_cur_data")
public class CurData implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 8964312826288657493L;

    /**
     * 当前数据id
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "meter_no")
    private String meterNo;

    /**
     * 当前数据所属仪表id
     * meter_id
     */
    @Column(name = "meter_id")
    private Integer meterId;

    /**
     * 电表显示状态
     * meter_showstatus
     */
    @Column(name = "meter_showstatus")
    private Integer meterShowstatus;

    /**
     * A相电压
     * curdata_ua
     */
    @Column(name = "curdata_ua")
    private Float curdataUa;

    /**
     * B相电压
     * curdata_ub
     */
    @Column(name = "curdata_ub")
    private Float curdataUb;

    /**
     * C相电压
     * curdata_uc
     */
    @Column(name = "curdata_uc")
    private Float curdataUc;

    /**
     * AB线电压
     * curdata_uab
     */
    @Column(name = "curdata_uab")
    private Float curdataUab;

    /**
     * BC线电压
     * curdata_ubc
     */
    @Column(name = "curdata_ubc")
    private Float curdataUbc;

    /**
     * AC线电压
     * curdata_uac
     */
    @Column(name = "curdata_uac")
    private Float curdataUac;

    /**
     * A相电流
     * curdata_ia
     */
    @Column(name = "curdata_ia")
    private Float curdataIa;

    /**
     * B相电流
     * curdata_ib
     */
    @Column(name = "curdata_ib")
    private Float curdataIb;

    /**
     * C相电流
     * curdata_ic
     */
    @Column(name = "curdata_ic")
    private Float curdataIc;

    /**
     * 电流报警阈值
     * curdata_threshold_i
     */
    @Column(name = "curdata_threshold_i")
    private Float curdataThresholdI;

    /**
     * 总有功功率
     * curdata_pz
     */
    @Column(name = "curdata_pz")
    private Float curdataPz;

    /**
     * 功率报警阈值
     * curdata_threshold_p
     */
    @Column(name = "curdata_threshold_p")
    private Float curdataThresholdP;

    /**
     * 总无功功率
     * curdata_qz
     */
    @Column(name = "curdata_qz")
    private Float curdataQz;

    /**
     * 总功率因数
     * curdata_pf
     */
    @Column(name = "curdata_pf")
    private Float curdataPf;

    /**
     * 频率
     * curdata_f
     */
    @Column(name = "curdata_f")
    private Float curdataF;

    /**
     * 正向有功电度
     * curdata_epi
     */
    @Column(name = "curdata_epi")
    private Float curdataEpi;

    /**
     * 反向有功电度
     * curdata_epe
     */
    @Column(name = "curdata_epe")
    private Float curdataEpe;

    /**
     * 正向无功电度
     * curdata_eql
     */
    @Column(name = "curdata_eql")
    private Float curdataEql;

    /**
     * 正向无功电度
     * curdata_eqc
     */
    @Column(name = "curdata_eqc")
    private Float curdataEqc;

    /**
     * 电压变比
     * curdata_pt
     */
    @Column(name = "curdata_pt")
    private Float curdataPt;

    /**
     * 电压变比
     * curdata_ct
     */
    @Column(name = "curdata_ct")
    private Float curdataCt;

    /**
     * 连接状态
     * curdata_conn_status
     */
    @Column(name = "curdata_conn_status")
    private Integer curdataConnStatus;

    @Column(name = "curdata_freate_time")
    private Date curdataCreateTime;

    /**
     * 更新时间
     * curdata_update_time
     */
    @Column(name = "curdata_update_time")
    private Date curdataUpdateTime;

    /**
     * 总视在功率
     * curdata_s
     */
    @Column(name = "curdata_s")
    private Float curdataS;

    /**
     * 总有功功率
     * curdata_epz
     */
    @Column(name = "curdata_epz")
    private Float curdataEpz;

    /**
     * 总无功功率
     * curdata_eqz
     */
    @Column(name = "curdata_eqz")
    private Float curdataEqz;

    /**
     * 零序电流
     * curdata_i0
     */
    @Column(name = "curdata_i0")
    private Float curdataI0;

    /**
     * 零序电压
     * curdata_u0
     */
    @Column(name = "curdata_u0")
    private Float curdataU0;

    @Column(name = "curdata_sparefloat01")
    private Float curdataSparefloat01;

    @Column(name = "curdata_sparefloat02")
    private Float curdataSparefloat02;

    @Column(name = "curdata_sparefloat03")
    private Float curdataSparefloat03;

    @Column(name = "curdata_sparefloat04")
    private Float curdataSparefloat04;

    @Column(name = "curdata_sparefloat05")
    private Float curdataSparefloat05;

    @Column(name = "curdata_sparefloat06")
    private Float curdataSparefloat06;

    @Column(name = "curdata_sparefloat07")
    private Float curdataSparefloat07;

    @Column(name = "curdata_sparefloat08")
    private Float curdataSparefloat08;

    @Column(name = "curdata_sparefloat09")
    private Float curdataSparefloat09;

    @Column(name = "curdata_sparefloat10")
    private Float curdataSparefloat10;

    @Column(name = "curdata_sparefloat11")
    private Float curdataSparefloat11;

    @Column(name = "curdata_sparefloat12")
    private Float curdataSparefloat12;

    @Column(name = "curdata_sparefloat13")
    private Float curdataSparefloat13;

    @Column(name = "curdata_sparefloat14")
    private Float curdataSparefloat14;

    @Column(name = "curdata_sparefloat15")
    private Float curdataSparefloat15;

    @Column(name = "curdata_sparefloat16")
    private Float curdataSparefloat16;

    @Column(name = "curdata_sparefloat17")
    private Float curdataSparefloat17;

    @Column(name = "curdata_sparefloat18")
    private Float curdataSparefloat18;

    @Column(name = "curdata_sparefloat19")
    private Float curdataSparefloat19;

    @Column(name = "curdata_sparefloat20")
    private Float curdataSparefloat20;

    @Column(name = "curdata_sparefloat21")
    private Float curdataSparefloat21;

    @Column(name = "curdata_sparefloat22")
    private Float curdataSparefloat22;

    @Column(name = "curdata_sparefloat23")
    private Float curdataSparefloat23;

    @Column(name = "curdata_sparefloat24")
    private Float curdataSparefloat24;

    @Column(name = "curdata_sparefloat25")
    private Float curdataSparefloat25;

    @Column(name = "curdata_sparefloat26")
    private Float curdataSparefloat26;

    @Column(name = "curdata_sparefloat27")
    private Float curdataSparefloat27;

    @Column(name = "curdata_sparefloat28")
    private Float curdataSparefloat28;

    @Column(name = "curdata_sparefloat29")
    private Float curdataSparefloat29;

    @Column(name = "curdata_sparefloat30")
    private Float curdataSparefloat30;

    @Column(name = "curdata_sparefloat31")
    private Float curdataSparefloat31;

    @Column(name = "curdata_sparefloat32")
    private Float curdataSparefloat32;

    @Column(name = "curdata_spareint01")
    private Integer curdataSpareint01;

    @Column(name = "curdata_spareint02")
    private Integer curdataSpareint02;

    @Column(name = "curdata_spareint03")
    private Integer curdataSpareint03;

    @Column(name = "curdata_spareint04")
    private Integer curdataSpareint04;

    @Column(name = "curdata_spareint05")
    private Integer curdataSpareint05;

    @Column(name = "curdata_spareint06")
    private Integer curdataSpareint06;

    @Column(name = "curdata_spareint07")
    private Integer curdataSpareint07;

    @Column(name = "curdata_spareint08")
    private Integer curdataSpareint08;

    @Column(name = "curdata_spareint09")
    private Integer curdataSpareint09;

    @Column(name = "curdata_spareint10")
    private Integer curdataSpareint10;

    @Column(name = "curdata_spareint11")
    private Integer curdataSpareint11;

    @Column(name = "curdata_spareint12")
    private Integer curdataSpareint12;

    @Column(name = "curdata_spareint13")
    private Integer curdataSpareint13;

    @Column(name = "curdata_spareint14")
    private Integer curdataSpareint14;

    @Column(name = "curdata_spareint15")
    private Integer curdataSpareint15;

    @Column(name = "curdata_spareint16")
    private Integer curdataSpareint16;

    @Column(name = "curdata_spareint17")
    private Integer curdataSpareint17;

    @Column(name = "curdata_spareint18")
    private Integer curdataSpareint18;

    @Column(name = "curdata_spareint19")
    private Integer curdataSpareint19;

    @Column(name = "curdata_spareint20")
    private Integer curdataSpareint20;

    @Column(name = "curdata_spareint21")
    private Integer curdataSpareint21;

    @Column(name = "curdata_spareint22")
    private Integer curdataSpareint22;

    @Column(name = "curdata_spareint23")
    private Integer curdataSpareint23;

    @Column(name = "curdata_spareint24")
    private Integer curdataSpareint24;

    @Column(name = "curdata_spareint25")
    private Integer curdataSpareint25;

    @Column(name = "curdata_spareint26")
    private Integer curdataSpareint26;

    @Column(name = "curdata_spareint27")
    private Integer curdataSpareint27;

    @Column(name = "curdata_spareint28")
    private Integer curdataSpareint28;

    @Column(name = "curdata_spareint29")
    private Integer curdataSpareint29;

    @Column(name = "curdata_spareint30")
    private Integer curdataSpareint30;

    @Column(name = "curdata_spareint31")
    private Integer curdataSpareint31;

    @Column(name = "curdata_spareint32")
    private Integer curdataSpareint32;

    /**
     * 获取 当前数据id tb_curdata.id
     *
     * @return 当前数据id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 当前数据id tb_curdata.id
     *
     * @param id 当前数据id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_curdata.meter_no
     *
     * @return tb_curdata.meter_no
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置 tb_curdata.meter_no
     *
     * @param meterNo tb_curdata.meter_no
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取 当前数据所属仪表id tb_curdata.meter_id
     *
     * @return 当前数据所属仪表id
     */
    public final Integer getMeterId() {
        return meterId;
    }

    /**
     * 设置 当前数据所属仪表id tb_curdata.meter_id
     *
     * @param meterId 当前数据所属仪表id
     */
    public final void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    /**
     * 获取 电表显示状态 tb_curdata.meter_showstatus
     *
     * @return 电表显示状态
     */
    public final Integer getMeterShowstatus() {
        return meterShowstatus;
    }

    /**
     * 设置 电表显示状态 tb_curdata.meter_showstatus
     *
     * @param meterShowstatus 电表显示状态
     */
    public final void setMeterShowstatus(Integer meterShowstatus) {
        this.meterShowstatus = meterShowstatus;
    }

    /**
     * 获取 A相电压 tb_curdata.curdata_ua
     *
     * @return A相电压
     */
    public final Float getCurdataUa() {
        return curdataUa;
    }

    /**
     * 设置 A相电压 tb_curdata.curdata_ua
     *
     * @param curdataUa A相电压
     */
    public final void setCurdataUa(Float curdataUa) {
        this.curdataUa = curdataUa;
    }

    /**
     * 获取 B相电压 tb_curdata.curdata_ub
     *
     * @return B相电压
     */
    public final Float getCurdataUb() {
        return curdataUb;
    }

    /**
     * 设置 B相电压 tb_curdata.curdata_ub
     *
     * @param curdataUb B相电压
     */
    public final void setCurdataUb(Float curdataUb) {
        this.curdataUb = curdataUb;
    }

    /**
     * 获取 C相电压 tb_curdata.curdata_uc
     *
     * @return C相电压
     */
    public final Float getCurdataUc() {
        return curdataUc;
    }

    /**
     * 设置 C相电压 tb_curdata.curdata_uc
     *
     * @param curdataUc C相电压
     */
    public final void setCurdataUc(Float curdataUc) {
        this.curdataUc = curdataUc;
    }

    /**
     * 获取 AB线电压 tb_curdata.curdata_uab
     *
     * @return AB线电压
     */
    public final Float getCurdataUab() {
        return curdataUab;
    }

    /**
     * 设置 AB线电压 tb_curdata.curdata_uab
     *
     * @param curdataUab AB线电压
     */
    public final void setCurdataUab(Float curdataUab) {
        this.curdataUab = curdataUab;
    }

    /**
     * 获取 BC线电压 tb_curdata.curdata_ubc
     *
     * @return BC线电压
     */
    public final Float getCurdataUbc() {
        return curdataUbc;
    }

    /**
     * 设置 BC线电压 tb_curdata.curdata_ubc
     *
     * @param curdataUbc BC线电压
     */
    public final void setCurdataUbc(Float curdataUbc) {
        this.curdataUbc = curdataUbc;
    }

    /**
     * 获取 AC线电压 tb_curdata.curdata_uac
     *
     * @return AC线电压
     */
    public final Float getCurdataUac() {
        return curdataUac;
    }

    /**
     * 设置 AC线电压 tb_curdata.curdata_uac
     *
     * @param curdataUac AC线电压
     */
    public final void setCurdataUac(Float curdataUac) {
        this.curdataUac = curdataUac;
    }

    /**
     * 获取 A相电流 tb_curdata.curdata_ia
     *
     * @return A相电流
     */
    public final Float getCurdataIa() {
        return curdataIa;
    }

    /**
     * 设置 A相电流 tb_curdata.curdata_ia
     *
     * @param curdataIa A相电流
     */
    public final void setCurdataIa(Float curdataIa) {
        this.curdataIa = curdataIa;
    }

    /**
     * 获取 B相电流 tb_curdata.curdata_ib
     *
     * @return B相电流
     */
    public final Float getCurdataIb() {
        return curdataIb;
    }

    /**
     * 设置 B相电流 tb_curdata.curdata_ib
     *
     * @param curdataIb B相电流
     */
    public final void setCurdataIb(Float curdataIb) {
        this.curdataIb = curdataIb;
    }

    /**
     * 获取 C相电流 tb_curdata.curdata_ic
     *
     * @return C相电流
     */
    public final Float getCurdataIc() {
        return curdataIc;
    }

    /**
     * 设置 C相电流 tb_curdata.curdata_ic
     *
     * @param curdataIc C相电流
     */
    public final void setCurdataIc(Float curdataIc) {
        this.curdataIc = curdataIc;
    }

    /**
     * 获取 电流报警阈值 tb_curdata.curdata_threshold_i
     *
     * @return 电流报警阈值
     */
    public final Float getCurdataThresholdI() {
        return curdataThresholdI;
    }

    /**
     * 设置 电流报警阈值 tb_curdata.curdata_threshold_i
     *
     * @param curdataThresholdI 电流报警阈值
     */
    public final void setCurdataThresholdI(Float curdataThresholdI) {
        this.curdataThresholdI = curdataThresholdI;
    }

    /**
     * 获取 总有功功率 tb_curdata.curdata_pz
     *
     * @return 总有功功率
     */
    public final Float getCurdataPz() {
        return curdataPz;
    }

    /**
     * 设置 总有功功率 tb_curdata.curdata_pz
     *
     * @param curdataPz 总有功功率
     */
    public final void setCurdataPz(Float curdataPz) {
        this.curdataPz = curdataPz;
    }

    /**
     * 获取 功率报警阈值 tb_curdata.curdata_threshold_p
     *
     * @return 功率报警阈值
     */
    public final Float getCurdataThresholdP() {
        return curdataThresholdP;
    }

    /**
     * 设置 功率报警阈值 tb_curdata.curdata_threshold_p
     *
     * @param curdataThresholdP 功率报警阈值
     */
    public final void setCurdataThresholdP(Float curdataThresholdP) {
        this.curdataThresholdP = curdataThresholdP;
    }

    /**
     * 获取 总无功功率 tb_curdata.curdata_qz
     *
     * @return 总无功功率
     */
    public final Float getCurdataQz() {
        return curdataQz;
    }

    /**
     * 设置 总无功功率 tb_curdata.curdata_qz
     *
     * @param curdataQz 总无功功率
     */
    public final void setCurdataQz(Float curdataQz) {
        this.curdataQz = curdataQz;
    }

    /**
     * 获取 总功率因数 tb_curdata.curdata_pf
     *
     * @return 总功率因数
     */
    public final Float getCurdataPf() {
        return curdataPf;
    }

    /**
     * 设置 总功率因数 tb_curdata.curdata_pf
     *
     * @param curdataPf 总功率因数
     */
    public final void setCurdataPf(Float curdataPf) {
        this.curdataPf = curdataPf;
    }

    /**
     * 获取 频率 tb_curdata.curdata_f
     *
     * @return 频率
     */
    public final Float getCurdataF() {
        return curdataF;
    }

    /**
     * 设置 频率 tb_curdata.curdata_f
     *
     * @param curdataF 频率
     */
    public final void setCurdataF(Float curdataF) {
        this.curdataF = curdataF;
    }

    /**
     * 获取 正向有功电度 tb_curdata.curdata_epi
     *
     * @return 正向有功电度
     */
    public final Float getCurdataEpi() {
        return curdataEpi;
    }

    /**
     * 设置 正向有功电度 tb_curdata.curdata_epi
     *
     * @param curdataEpi 正向有功电度
     */
    public final void setCurdataEpi(Float curdataEpi) {
        this.curdataEpi = curdataEpi;
    }

    /**
     * 获取 反向有功电度 tb_curdata.curdata_epe
     *
     * @return 反向有功电度
     */
    public final Float getCurdataEpe() {
        return curdataEpe;
    }

    /**
     * 设置 反向有功电度 tb_curdata.curdata_epe
     *
     * @param curdataEpe 反向有功电度
     */
    public final void setCurdataEpe(Float curdataEpe) {
        this.curdataEpe = curdataEpe;
    }

    /**
     * 获取 正向无功电度 tb_curdata.curdata_eql
     *
     * @return 正向无功电度
     */
    public final Float getCurdataEql() {
        return curdataEql;
    }

    /**
     * 设置 正向无功电度 tb_curdata.curdata_eql
     *
     * @param curdataEql 正向无功电度
     */
    public final void setCurdataEql(Float curdataEql) {
        this.curdataEql = curdataEql;
    }

    /**
     * 获取 正向无功电度 tb_curdata.curdata_eqc
     *
     * @return 正向无功电度
     */
    public final Float getCurdataEqc() {
        return curdataEqc;
    }

    /**
     * 设置 正向无功电度 tb_curdata.curdata_eqc
     *
     * @param curdataEqc 正向无功电度
     */
    public final void setCurdataEqc(Float curdataEqc) {
        this.curdataEqc = curdataEqc;
    }

    /**
     * 获取 电压变比 tb_curdata.curdata_pt
     *
     * @return 电压变比
     */
    public final Float getCurdataPt() {
        return curdataPt;
    }

    /**
     * 设置 电压变比 tb_curdata.curdata_pt
     *
     * @param curdataPt 电压变比
     */
    public final void setCurdataPt(Float curdataPt) {
        this.curdataPt = curdataPt;
    }

    /**
     * 获取 电压变比 tb_curdata.curdata_ct
     *
     * @return 电压变比
     */
    public final Float getCurdataCt() {
        return curdataCt;
    }

    /**
     * 设置 电压变比 tb_curdata.curdata_ct
     *
     * @param curdataCt 电压变比
     */
    public final void setCurdataCt(Float curdataCt) {
        this.curdataCt = curdataCt;
    }

    /**
     * 获取 连接状态 tb_curdata.curdata_conn_status
     *
     * @return 连接状态
     */
    public final Integer getCurdataConnStatus() {
        return curdataConnStatus;
    }

    /**
     * 设置 连接状态 tb_curdata.curdata_conn_status
     *
     * @param curdataConnStatus 连接状态
     */
    public final void setCurdataConnStatus(Integer curdataConnStatus) {
        this.curdataConnStatus = curdataConnStatus;
    }

    /**
     * 获取 tb_curdata.curdata_create_time
     *
     * @return tb_curdata.curdata_create_time
     */
    public final Date getCurdataCreateTime() {
        return curdataCreateTime;
    }

    /**
     * 设置 tb_curdata.curdata_create_time
     *
     * @param curdataCreateTime tb_curdata.curdata_create_time
     */
    public final void setCurdataCreateTime(Date curdataCreateTime) {
        this.curdataCreateTime = curdataCreateTime;
    }

    /**
     * 获取 更新时间 tb_curdata.curdata_update_time
     *
     * @return 更新时间
     */
    public final Date getCurdataUpdateTime() {
        return curdataUpdateTime;
    }

    /**
     * 设置 更新时间 tb_curdata.curdata_update_time
     *
     * @param curdataUpdateTime 更新时间
     */
    public final void setCurdataUpdateTime(Date curdataUpdateTime) {
        this.curdataUpdateTime = curdataUpdateTime;
    }

    /**
     * 获取 总视在功率 tb_curdata.curdata_s
     *
     * @return 总视在功率
     */
    public final Float getCurdataS() {
        return curdataS;
    }

    /**
     * 设置 总视在功率 tb_curdata.curdata_s
     *
     * @param curdataS 总视在功率
     */
    public final void setCurdataS(Float curdataS) {
        this.curdataS = curdataS;
    }

    /**
     * 获取 总有功功率 tb_curdata.curdata_epz
     *
     * @return 总有功功率
     */
    public final Float getCurdataEpz() {
        return curdataEpz;
    }

    /**
     * 设置 总有功功率 tb_curdata.curdata_epz
     *
     * @param curdataEpz 总有功功率
     */
    public final void setCurdataEpz(Float curdataEpz) {
        this.curdataEpz = curdataEpz;
    }

    /**
     * 获取 总无功功率 tb_curdata.curdata_eqz
     *
     * @return 总无功功率
     */
    public final Float getCurdataEqz() {
        return curdataEqz;
    }

    /**
     * 设置 总无功功率 tb_curdata.curdata_eqz
     *
     * @param curdataEqz 总无功功率
     */
    public final void setCurdataEqz(Float curdataEqz) {
        this.curdataEqz = curdataEqz;
    }

    /**
     * 获取 零序电流 tb_curdata.curdata_i0
     *
     * @return 零序电流
     */
    public final Float getCurdataI0() {
        return curdataI0;
    }

    /**
     * 设置 零序电流 tb_curdata.curdata_i0
     *
     * @param curdataI0 零序电流
     */
    public final void setCurdataI0(Float curdataI0) {
        this.curdataI0 = curdataI0;
    }

    /**
     * 获取 零序电压 tb_curdata.curdata_u0
     *
     * @return 零序电压
     */
    public final Float getCurdataU0() {
        return curdataU0;
    }

    /**
     * 设置 零序电压 tb_curdata.curdata_u0
     *
     * @param curdataU0 零序电压
     */
    public final void setCurdataU0(Float curdataU0) {
        this.curdataU0 = curdataU0;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat01
     *
     * @return tb_curdata.curdata_sparefloat01
     */
    public final Float getCurdataSparefloat01() {
        return curdataSparefloat01;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat01
     *
     * @param curdataSparefloat01 tb_curdata.curdata_sparefloat01
     */
    public final void setCurdataSparefloat01(Float curdataSparefloat01) {
        this.curdataSparefloat01 = curdataSparefloat01;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat02
     *
     * @return tb_curdata.curdata_sparefloat02
     */
    public final Float getCurdataSparefloat02() {
        return curdataSparefloat02;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat02
     *
     * @param curdataSparefloat02 tb_curdata.curdata_sparefloat02
     */
    public final void setCurdataSparefloat02(Float curdataSparefloat02) {
        this.curdataSparefloat02 = curdataSparefloat02;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat03
     *
     * @return tb_curdata.curdata_sparefloat03
     */
    public final Float getCurdataSparefloat03() {
        return curdataSparefloat03;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat03
     *
     * @param curdataSparefloat03 tb_curdata.curdata_sparefloat03
     */
    public final void setCurdataSparefloat03(Float curdataSparefloat03) {
        this.curdataSparefloat03 = curdataSparefloat03;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat04
     *
     * @return tb_curdata.curdata_sparefloat04
     */
    public final Float getCurdataSparefloat04() {
        return curdataSparefloat04;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat04
     *
     * @param curdataSparefloat04 tb_curdata.curdata_sparefloat04
     */
    public final void setCurdataSparefloat04(Float curdataSparefloat04) {
        this.curdataSparefloat04 = curdataSparefloat04;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat05
     *
     * @return tb_curdata.curdata_sparefloat05
     */
    public final Float getCurdataSparefloat05() {
        return curdataSparefloat05;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat05
     *
     * @param curdataSparefloat05 tb_curdata.curdata_sparefloat05
     */
    public final void setCurdataSparefloat05(Float curdataSparefloat05) {
        this.curdataSparefloat05 = curdataSparefloat05;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat06
     *
     * @return tb_curdata.curdata_sparefloat06
     */
    public final Float getCurdataSparefloat06() {
        return curdataSparefloat06;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat06
     *
     * @param curdataSparefloat06 tb_curdata.curdata_sparefloat06
     */
    public final void setCurdataSparefloat06(Float curdataSparefloat06) {
        this.curdataSparefloat06 = curdataSparefloat06;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat07
     *
     * @return tb_curdata.curdata_sparefloat07
     */
    public final Float getCurdataSparefloat07() {
        return curdataSparefloat07;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat07
     *
     * @param curdataSparefloat07 tb_curdata.curdata_sparefloat07
     */
    public final void setCurdataSparefloat07(Float curdataSparefloat07) {
        this.curdataSparefloat07 = curdataSparefloat07;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat08
     *
     * @return tb_curdata.curdata_sparefloat08
     */
    public final Float getCurdataSparefloat08() {
        return curdataSparefloat08;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat08
     *
     * @param curdataSparefloat08 tb_curdata.curdata_sparefloat08
     */
    public final void setCurdataSparefloat08(Float curdataSparefloat08) {
        this.curdataSparefloat08 = curdataSparefloat08;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat09
     *
     * @return tb_curdata.curdata_sparefloat09
     */
    public final Float getCurdataSparefloat09() {
        return curdataSparefloat09;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat09
     *
     * @param curdataSparefloat09 tb_curdata.curdata_sparefloat09
     */
    public final void setCurdataSparefloat09(Float curdataSparefloat09) {
        this.curdataSparefloat09 = curdataSparefloat09;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat10
     *
     * @return tb_curdata.curdata_sparefloat10
     */
    public final Float getCurdataSparefloat10() {
        return curdataSparefloat10;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat10
     *
     * @param curdataSparefloat10 tb_curdata.curdata_sparefloat10
     */
    public final void setCurdataSparefloat10(Float curdataSparefloat10) {
        this.curdataSparefloat10 = curdataSparefloat10;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat11
     *
     * @return tb_curdata.curdata_sparefloat11
     */
    public final Float getCurdataSparefloat11() {
        return curdataSparefloat11;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat11
     *
     * @param curdataSparefloat11 tb_curdata.curdata_sparefloat11
     */
    public final void setCurdataSparefloat11(Float curdataSparefloat11) {
        this.curdataSparefloat11 = curdataSparefloat11;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat12
     *
     * @return tb_curdata.curdata_sparefloat12
     */
    public final Float getCurdataSparefloat12() {
        return curdataSparefloat12;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat12
     *
     * @param curdataSparefloat12 tb_curdata.curdata_sparefloat12
     */
    public final void setCurdataSparefloat12(Float curdataSparefloat12) {
        this.curdataSparefloat12 = curdataSparefloat12;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat13
     *
     * @return tb_curdata.curdata_sparefloat13
     */
    public final Float getCurdataSparefloat13() {
        return curdataSparefloat13;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat13
     *
     * @param curdataSparefloat13 tb_curdata.curdata_sparefloat13
     */
    public final void setCurdataSparefloat13(Float curdataSparefloat13) {
        this.curdataSparefloat13 = curdataSparefloat13;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat14
     *
     * @return tb_curdata.curdata_sparefloat14
     */
    public final Float getCurdataSparefloat14() {
        return curdataSparefloat14;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat14
     *
     * @param curdataSparefloat14 tb_curdata.curdata_sparefloat14
     */
    public final void setCurdataSparefloat14(Float curdataSparefloat14) {
        this.curdataSparefloat14 = curdataSparefloat14;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat15
     *
     * @return tb_curdata.curdata_sparefloat15
     */
    public final Float getCurdataSparefloat15() {
        return curdataSparefloat15;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat15
     *
     * @param curdataSparefloat15 tb_curdata.curdata_sparefloat15
     */
    public final void setCurdataSparefloat15(Float curdataSparefloat15) {
        this.curdataSparefloat15 = curdataSparefloat15;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat16
     *
     * @return tb_curdata.curdata_sparefloat16
     */
    public final Float getCurdataSparefloat16() {
        return curdataSparefloat16;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat16
     *
     * @param curdataSparefloat16 tb_curdata.curdata_sparefloat16
     */
    public final void setCurdataSparefloat16(Float curdataSparefloat16) {
        this.curdataSparefloat16 = curdataSparefloat16;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat17
     *
     * @return tb_curdata.curdata_sparefloat17
     */
    public final Float getCurdataSparefloat17() {
        return curdataSparefloat17;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat17
     *
     * @param curdataSparefloat17 tb_curdata.curdata_sparefloat17
     */
    public final void setCurdataSparefloat17(Float curdataSparefloat17) {
        this.curdataSparefloat17 = curdataSparefloat17;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat18
     *
     * @return tb_curdata.curdata_sparefloat18
     */
    public final Float getCurdataSparefloat18() {
        return curdataSparefloat18;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat18
     *
     * @param curdataSparefloat18 tb_curdata.curdata_sparefloat18
     */
    public final void setCurdataSparefloat18(Float curdataSparefloat18) {
        this.curdataSparefloat18 = curdataSparefloat18;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat19
     *
     * @return tb_curdata.curdata_sparefloat19
     */
    public final Float getCurdataSparefloat19() {
        return curdataSparefloat19;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat19
     *
     * @param curdataSparefloat19 tb_curdata.curdata_sparefloat19
     */
    public final void setCurdataSparefloat19(Float curdataSparefloat19) {
        this.curdataSparefloat19 = curdataSparefloat19;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat20
     *
     * @return tb_curdata.curdata_sparefloat20
     */
    public final Float getCurdataSparefloat20() {
        return curdataSparefloat20;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat20
     *
     * @param curdataSparefloat20 tb_curdata.curdata_sparefloat20
     */
    public final void setCurdataSparefloat20(Float curdataSparefloat20) {
        this.curdataSparefloat20 = curdataSparefloat20;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat21
     *
     * @return tb_curdata.curdata_sparefloat21
     */
    public final Float getCurdataSparefloat21() {
        return curdataSparefloat21;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat21
     *
     * @param curdataSparefloat21 tb_curdata.curdata_sparefloat21
     */
    public final void setCurdataSparefloat21(Float curdataSparefloat21) {
        this.curdataSparefloat21 = curdataSparefloat21;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat22
     *
     * @return tb_curdata.curdata_sparefloat22
     */
    public final Float getCurdataSparefloat22() {
        return curdataSparefloat22;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat22
     *
     * @param curdataSparefloat22 tb_curdata.curdata_sparefloat22
     */
    public final void setCurdataSparefloat22(Float curdataSparefloat22) {
        this.curdataSparefloat22 = curdataSparefloat22;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat23
     *
     * @return tb_curdata.curdata_sparefloat23
     */
    public final Float getCurdataSparefloat23() {
        return curdataSparefloat23;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat23
     *
     * @param curdataSparefloat23 tb_curdata.curdata_sparefloat23
     */
    public final void setCurdataSparefloat23(Float curdataSparefloat23) {
        this.curdataSparefloat23 = curdataSparefloat23;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat24
     *
     * @return tb_curdata.curdata_sparefloat24
     */
    public final Float getCurdataSparefloat24() {
        return curdataSparefloat24;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat24
     *
     * @param curdataSparefloat24 tb_curdata.curdata_sparefloat24
     */
    public final void setCurdataSparefloat24(Float curdataSparefloat24) {
        this.curdataSparefloat24 = curdataSparefloat24;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat25
     *
     * @return tb_curdata.curdata_sparefloat25
     */
    public final Float getCurdataSparefloat25() {
        return curdataSparefloat25;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat25
     *
     * @param curdataSparefloat25 tb_curdata.curdata_sparefloat25
     */
    public final void setCurdataSparefloat25(Float curdataSparefloat25) {
        this.curdataSparefloat25 = curdataSparefloat25;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat26
     *
     * @return tb_curdata.curdata_sparefloat26
     */
    public final Float getCurdataSparefloat26() {
        return curdataSparefloat26;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat26
     *
     * @param curdataSparefloat26 tb_curdata.curdata_sparefloat26
     */
    public final void setCurdataSparefloat26(Float curdataSparefloat26) {
        this.curdataSparefloat26 = curdataSparefloat26;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat27
     *
     * @return tb_curdata.curdata_sparefloat27
     */
    public final Float getCurdataSparefloat27() {
        return curdataSparefloat27;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat27
     *
     * @param curdataSparefloat27 tb_curdata.curdata_sparefloat27
     */
    public final void setCurdataSparefloat27(Float curdataSparefloat27) {
        this.curdataSparefloat27 = curdataSparefloat27;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat28
     *
     * @return tb_curdata.curdata_sparefloat28
     */
    public final Float getCurdataSparefloat28() {
        return curdataSparefloat28;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat28
     *
     * @param curdataSparefloat28 tb_curdata.curdata_sparefloat28
     */
    public final void setCurdataSparefloat28(Float curdataSparefloat28) {
        this.curdataSparefloat28 = curdataSparefloat28;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat29
     *
     * @return tb_curdata.curdata_sparefloat29
     */
    public final Float getCurdataSparefloat29() {
        return curdataSparefloat29;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat29
     *
     * @param curdataSparefloat29 tb_curdata.curdata_sparefloat29
     */
    public final void setCurdataSparefloat29(Float curdataSparefloat29) {
        this.curdataSparefloat29 = curdataSparefloat29;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat30
     *
     * @return tb_curdata.curdata_sparefloat30
     */
    public final Float getCurdataSparefloat30() {
        return curdataSparefloat30;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat30
     *
     * @param curdataSparefloat30 tb_curdata.curdata_sparefloat30
     */
    public final void setCurdataSparefloat30(Float curdataSparefloat30) {
        this.curdataSparefloat30 = curdataSparefloat30;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat31
     *
     * @return tb_curdata.curdata_sparefloat31
     */
    public final Float getCurdataSparefloat31() {
        return curdataSparefloat31;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat31
     *
     * @param curdataSparefloat31 tb_curdata.curdata_sparefloat31
     */
    public final void setCurdataSparefloat31(Float curdataSparefloat31) {
        this.curdataSparefloat31 = curdataSparefloat31;
    }

    /**
     * 获取 tb_curdata.curdata_sparefloat32
     *
     * @return tb_curdata.curdata_sparefloat32
     */
    public final Float getCurdataSparefloat32() {
        return curdataSparefloat32;
    }

    /**
     * 设置 tb_curdata.curdata_sparefloat32
     *
     * @param curdataSparefloat32 tb_curdata.curdata_sparefloat32
     */
    public final void setCurdataSparefloat32(Float curdataSparefloat32) {
        this.curdataSparefloat32 = curdataSparefloat32;
    }

    /**
     * 获取 tb_curdata.curdata_spareint01
     *
     * @return tb_curdata.curdata_spareint01
     */
    public final Integer getCurdataSpareint01() {
        return curdataSpareint01;
    }

    /**
     * 设置 tb_curdata.curdata_spareint01
     *
     * @param curdataSpareint01 tb_curdata.curdata_spareint01
     */
    public final void setCurdataSpareint01(Integer curdataSpareint01) {
        this.curdataSpareint01 = curdataSpareint01;
    }

    /**
     * 获取 tb_curdata.curdata_spareint02
     *
     * @return tb_curdata.curdata_spareint02
     */
    public final Integer getCurdataSpareint02() {
        return curdataSpareint02;
    }

    /**
     * 设置 tb_curdata.curdata_spareint02
     *
     * @param curdataSpareint02 tb_curdata.curdata_spareint02
     */
    public final void setCurdataSpareint02(Integer curdataSpareint02) {
        this.curdataSpareint02 = curdataSpareint02;
    }

    /**
     * 获取 tb_curdata.curdata_spareint03
     *
     * @return tb_curdata.curdata_spareint03
     */
    public final Integer getCurdataSpareint03() {
        return curdataSpareint03;
    }

    /**
     * 设置 tb_curdata.curdata_spareint03
     *
     * @param curdataSpareint03 tb_curdata.curdata_spareint03
     */
    public final void setCurdataSpareint03(Integer curdataSpareint03) {
        this.curdataSpareint03 = curdataSpareint03;
    }

    /**
     * 获取 tb_curdata.curdata_spareint04
     *
     * @return tb_curdata.curdata_spareint04
     */
    public final Integer getCurdataSpareint04() {
        return curdataSpareint04;
    }

    /**
     * 设置 tb_curdata.curdata_spareint04
     *
     * @param curdataSpareint04 tb_curdata.curdata_spareint04
     */
    public final void setCurdataSpareint04(Integer curdataSpareint04) {
        this.curdataSpareint04 = curdataSpareint04;
    }

    /**
     * 获取 tb_curdata.curdata_spareint05
     *
     * @return tb_curdata.curdata_spareint05
     */
    public final Integer getCurdataSpareint05() {
        return curdataSpareint05;
    }

    /**
     * 设置 tb_curdata.curdata_spareint05
     *
     * @param curdataSpareint05 tb_curdata.curdata_spareint05
     */
    public final void setCurdataSpareint05(Integer curdataSpareint05) {
        this.curdataSpareint05 = curdataSpareint05;
    }

    /**
     * 获取 tb_curdata.curdata_spareint06
     *
     * @return tb_curdata.curdata_spareint06
     */
    public final Integer getCurdataSpareint06() {
        return curdataSpareint06;
    }

    /**
     * 设置 tb_curdata.curdata_spareint06
     *
     * @param curdataSpareint06 tb_curdata.curdata_spareint06
     */
    public final void setCurdataSpareint06(Integer curdataSpareint06) {
        this.curdataSpareint06 = curdataSpareint06;
    }

    /**
     * 获取 tb_curdata.curdata_spareint07
     *
     * @return tb_curdata.curdata_spareint07
     */
    public final Integer getCurdataSpareint07() {
        return curdataSpareint07;
    }

    /**
     * 设置 tb_curdata.curdata_spareint07
     *
     * @param curdataSpareint07 tb_curdata.curdata_spareint07
     */
    public final void setCurdataSpareint07(Integer curdataSpareint07) {
        this.curdataSpareint07 = curdataSpareint07;
    }

    /**
     * 获取 tb_curdata.curdata_spareint08
     *
     * @return tb_curdata.curdata_spareint08
     */
    public final Integer getCurdataSpareint08() {
        return curdataSpareint08;
    }

    /**
     * 设置 tb_curdata.curdata_spareint08
     *
     * @param curdataSpareint08 tb_curdata.curdata_spareint08
     */
    public final void setCurdataSpareint08(Integer curdataSpareint08) {
        this.curdataSpareint08 = curdataSpareint08;
    }

    /**
     * 获取 tb_curdata.curdata_spareint09
     *
     * @return tb_curdata.curdata_spareint09
     */
    public final Integer getCurdataSpareint09() {
        return curdataSpareint09;
    }

    /**
     * 设置 tb_curdata.curdata_spareint09
     *
     * @param curdataSpareint09 tb_curdata.curdata_spareint09
     */
    public final void setCurdataSpareint09(Integer curdataSpareint09) {
        this.curdataSpareint09 = curdataSpareint09;
    }

    /**
     * 获取 tb_curdata.curdata_spareint10
     *
     * @return tb_curdata.curdata_spareint10
     */
    public final Integer getCurdataSpareint10() {
        return curdataSpareint10;
    }

    /**
     * 设置 tb_curdata.curdata_spareint10
     *
     * @param curdataSpareint10 tb_curdata.curdata_spareint10
     */
    public final void setCurdataSpareint10(Integer curdataSpareint10) {
        this.curdataSpareint10 = curdataSpareint10;
    }

    /**
     * 获取 tb_curdata.curdata_spareint11
     *
     * @return tb_curdata.curdata_spareint11
     */
    public final Integer getCurdataSpareint11() {
        return curdataSpareint11;
    }

    /**
     * 设置 tb_curdata.curdata_spareint11
     *
     * @param curdataSpareint11 tb_curdata.curdata_spareint11
     */
    public final void setCurdataSpareint11(Integer curdataSpareint11) {
        this.curdataSpareint11 = curdataSpareint11;
    }

    /**
     * 获取 tb_curdata.curdata_spareint12
     *
     * @return tb_curdata.curdata_spareint12
     */
    public final Integer getCurdataSpareint12() {
        return curdataSpareint12;
    }

    /**
     * 设置 tb_curdata.curdata_spareint12
     *
     * @param curdataSpareint12 tb_curdata.curdata_spareint12
     */
    public final void setCurdataSpareint12(Integer curdataSpareint12) {
        this.curdataSpareint12 = curdataSpareint12;
    }

    /**
     * 获取 tb_curdata.curdata_spareint13
     *
     * @return tb_curdata.curdata_spareint13
     */
    public final Integer getCurdataSpareint13() {
        return curdataSpareint13;
    }

    /**
     * 设置 tb_curdata.curdata_spareint13
     *
     * @param curdataSpareint13 tb_curdata.curdata_spareint13
     */
    public final void setCurdataSpareint13(Integer curdataSpareint13) {
        this.curdataSpareint13 = curdataSpareint13;
    }

    /**
     * 获取 tb_curdata.curdata_spareint14
     *
     * @return tb_curdata.curdata_spareint14
     */
    public final Integer getCurdataSpareint14() {
        return curdataSpareint14;
    }

    /**
     * 设置 tb_curdata.curdata_spareint14
     *
     * @param curdataSpareint14 tb_curdata.curdata_spareint14
     */
    public final void setCurdataSpareint14(Integer curdataSpareint14) {
        this.curdataSpareint14 = curdataSpareint14;
    }

    /**
     * 获取 tb_curdata.curdata_spareint15
     *
     * @return tb_curdata.curdata_spareint15
     */
    public final Integer getCurdataSpareint15() {
        return curdataSpareint15;
    }

    /**
     * 设置 tb_curdata.curdata_spareint15
     *
     * @param curdataSpareint15 tb_curdata.curdata_spareint15
     */
    public final void setCurdataSpareint15(Integer curdataSpareint15) {
        this.curdataSpareint15 = curdataSpareint15;
    }

    /**
     * 获取 tb_curdata.curdata_spareint16
     *
     * @return tb_curdata.curdata_spareint16
     */
    public final Integer getCurdataSpareint16() {
        return curdataSpareint16;
    }

    /**
     * 设置 tb_curdata.curdata_spareint16
     *
     * @param curdataSpareint16 tb_curdata.curdata_spareint16
     */
    public final void setCurdataSpareint16(Integer curdataSpareint16) {
        this.curdataSpareint16 = curdataSpareint16;
    }

    /**
     * 获取 tb_curdata.curdata_spareint17
     *
     * @return tb_curdata.curdata_spareint17
     */
    public final Integer getCurdataSpareint17() {
        return curdataSpareint17;
    }

    /**
     * 设置 tb_curdata.curdata_spareint17
     *
     * @param curdataSpareint17 tb_curdata.curdata_spareint17
     */
    public final void setCurdataSpareint17(Integer curdataSpareint17) {
        this.curdataSpareint17 = curdataSpareint17;
    }

    /**
     * 获取 tb_curdata.curdata_spareint18
     *
     * @return tb_curdata.curdata_spareint18
     */
    public final Integer getCurdataSpareint18() {
        return curdataSpareint18;
    }

    /**
     * 设置 tb_curdata.curdata_spareint18
     *
     * @param curdataSpareint18 tb_curdata.curdata_spareint18
     */
    public final void setCurdataSpareint18(Integer curdataSpareint18) {
        this.curdataSpareint18 = curdataSpareint18;
    }

    /**
     * 获取 tb_curdata.curdata_spareint19
     *
     * @return tb_curdata.curdata_spareint19
     */
    public final Integer getCurdataSpareint19() {
        return curdataSpareint19;
    }

    /**
     * 设置 tb_curdata.curdata_spareint19
     *
     * @param curdataSpareint19 tb_curdata.curdata_spareint19
     */
    public final void setCurdataSpareint19(Integer curdataSpareint19) {
        this.curdataSpareint19 = curdataSpareint19;
    }

    /**
     * 获取 tb_curdata.curdata_spareint20
     *
     * @return tb_curdata.curdata_spareint20
     */
    public final Integer getCurdataSpareint20() {
        return curdataSpareint20;
    }

    /**
     * 设置 tb_curdata.curdata_spareint20
     *
     * @param curdataSpareint20 tb_curdata.curdata_spareint20
     */
    public final void setCurdataSpareint20(Integer curdataSpareint20) {
        this.curdataSpareint20 = curdataSpareint20;
    }

    /**
     * 获取 tb_curdata.curdata_spareint21
     *
     * @return tb_curdata.curdata_spareint21
     */
    public final Integer getCurdataSpareint21() {
        return curdataSpareint21;
    }

    /**
     * 设置 tb_curdata.curdata_spareint21
     *
     * @param curdataSpareint21 tb_curdata.curdata_spareint21
     */
    public final void setCurdataSpareint21(Integer curdataSpareint21) {
        this.curdataSpareint21 = curdataSpareint21;
    }

    /**
     * 获取 tb_curdata.curdata_spareint22
     *
     * @return tb_curdata.curdata_spareint22
     */
    public final Integer getCurdataSpareint22() {
        return curdataSpareint22;
    }

    /**
     * 设置 tb_curdata.curdata_spareint22
     *
     * @param curdataSpareint22 tb_curdata.curdata_spareint22
     */
    public final void setCurdataSpareint22(Integer curdataSpareint22) {
        this.curdataSpareint22 = curdataSpareint22;
    }

    /**
     * 获取 tb_curdata.curdata_spareint23
     *
     * @return tb_curdata.curdata_spareint23
     */
    public final Integer getCurdataSpareint23() {
        return curdataSpareint23;
    }

    /**
     * 设置 tb_curdata.curdata_spareint23
     *
     * @param curdataSpareint23 tb_curdata.curdata_spareint23
     */
    public final void setCurdataSpareint23(Integer curdataSpareint23) {
        this.curdataSpareint23 = curdataSpareint23;
    }

    /**
     * 获取 tb_curdata.curdata_spareint24
     *
     * @return tb_curdata.curdata_spareint24
     */
    public final Integer getCurdataSpareint24() {
        return curdataSpareint24;
    }

    /**
     * 设置 tb_curdata.curdata_spareint24
     *
     * @param curdataSpareint24 tb_curdata.curdata_spareint24
     */
    public final void setCurdataSpareint24(Integer curdataSpareint24) {
        this.curdataSpareint24 = curdataSpareint24;
    }

    /**
     * 获取 tb_curdata.curdata_spareint25
     *
     * @return tb_curdata.curdata_spareint25
     */
    public final Integer getCurdataSpareint25() {
        return curdataSpareint25;
    }

    /**
     * 设置 tb_curdata.curdata_spareint25
     *
     * @param curdataSpareint25 tb_curdata.curdata_spareint25
     */
    public final void setCurdataSpareint25(Integer curdataSpareint25) {
        this.curdataSpareint25 = curdataSpareint25;
    }

    /**
     * 获取 tb_curdata.curdata_spareint26
     *
     * @return tb_curdata.curdata_spareint26
     */
    public final Integer getCurdataSpareint26() {
        return curdataSpareint26;
    }

    /**
     * 设置 tb_curdata.curdata_spareint26
     *
     * @param curdataSpareint26 tb_curdata.curdata_spareint26
     */
    public final void setCurdataSpareint26(Integer curdataSpareint26) {
        this.curdataSpareint26 = curdataSpareint26;
    }

    /**
     * 获取 tb_curdata.curdata_spareint27
     *
     * @return tb_curdata.curdata_spareint27
     */
    public final Integer getCurdataSpareint27() {
        return curdataSpareint27;
    }

    /**
     * 设置 tb_curdata.curdata_spareint27
     *
     * @param curdataSpareint27 tb_curdata.curdata_spareint27
     */
    public final void setCurdataSpareint27(Integer curdataSpareint27) {
        this.curdataSpareint27 = curdataSpareint27;
    }

    /**
     * 获取 tb_curdata.curdata_spareint28
     *
     * @return tb_curdata.curdata_spareint28
     */
    public final Integer getCurdataSpareint28() {
        return curdataSpareint28;
    }

    /**
     * 设置 tb_curdata.curdata_spareint28
     *
     * @param curdataSpareint28 tb_curdata.curdata_spareint28
     */
    public final void setCurdataSpareint28(Integer curdataSpareint28) {
        this.curdataSpareint28 = curdataSpareint28;
    }

    /**
     * 获取 tb_curdata.curdata_spareint29
     *
     * @return tb_curdata.curdata_spareint29
     */
    public final Integer getCurdataSpareint29() {
        return curdataSpareint29;
    }

    /**
     * 设置 tb_curdata.curdata_spareint29
     *
     * @param curdataSpareint29 tb_curdata.curdata_spareint29
     */
    public final void setCurdataSpareint29(Integer curdataSpareint29) {
        this.curdataSpareint29 = curdataSpareint29;
    }

    /**
     * 获取 tb_curdata.curdata_spareint30
     *
     * @return tb_curdata.curdata_spareint30
     */
    public final Integer getCurdataSpareint30() {
        return curdataSpareint30;
    }

    /**
     * 设置 tb_curdata.curdata_spareint30
     *
     * @param curdataSpareint30 tb_curdata.curdata_spareint30
     */
    public final void setCurdataSpareint30(Integer curdataSpareint30) {
        this.curdataSpareint30 = curdataSpareint30;
    }

    /**
     * 获取 tb_curdata.curdata_spareint31
     *
     * @return tb_curdata.curdata_spareint31
     */
    public final Integer getCurdataSpareint31() {
        return curdataSpareint31;
    }

    /**
     * 设置 tb_curdata.curdata_spareint31
     *
     * @param curdataSpareint31 tb_curdata.curdata_spareint31
     */
    public final void setCurdataSpareint31(Integer curdataSpareint31) {
        this.curdataSpareint31 = curdataSpareint31;
    }

    /**
     * 获取 tb_curdata.curdata_spareint32
     *
     * @return tb_curdata.curdata_spareint32
     */
    public final Integer getCurdataSpareint32() {
        return curdataSpareint32;
    }

    /**
     * 设置 tb_curdata.curdata_spareint32
     *
     * @param curdataSpareint32 tb_curdata.curdata_spareint32
     */
    public final void setCurdataSpareint32(Integer curdataSpareint32) {
        this.curdataSpareint32 = curdataSpareint32;
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
        sb.append(", meterId=").append(meterId);
        sb.append(", meterShowstatus=").append(meterShowstatus);
        sb.append(", curdataUa=").append(curdataUa);
        sb.append(", curdataUb=").append(curdataUb);
        sb.append(", curdataUc=").append(curdataUc);
        sb.append(", curdataUab=").append(curdataUab);
        sb.append(", curdataUbc=").append(curdataUbc);
        sb.append(", curdataUac=").append(curdataUac);
        sb.append(", curdataIa=").append(curdataIa);
        sb.append(", curdataIb=").append(curdataIb);
        sb.append(", curdataIc=").append(curdataIc);
        sb.append(", curdataThresholdI=").append(curdataThresholdI);
        sb.append(", curdataPz=").append(curdataPz);
        sb.append(", curdataThresholdP=").append(curdataThresholdP);
        sb.append(", curdataQz=").append(curdataQz);
        sb.append(", curdataPf=").append(curdataPf);
        sb.append(", curdataF=").append(curdataF);
        sb.append(", curdataEpi=").append(curdataEpi);
        sb.append(", curdataEpe=").append(curdataEpe);
        sb.append(", curdataEql=").append(curdataEql);
        sb.append(", curdataEqc=").append(curdataEqc);
        sb.append(", curdataPt=").append(curdataPt);
        sb.append(", curdataCt=").append(curdataCt);
        sb.append(", curdataConnStatus=").append(curdataConnStatus);
        sb.append(", curdataCreateTime=").append(curdataCreateTime);
        sb.append(", curdataUpdateTime=").append(curdataUpdateTime);
        sb.append(", curdataS=").append(curdataS);
        sb.append(", curdataEpz=").append(curdataEpz);
        sb.append(", curdataEqz=").append(curdataEqz);
        sb.append(", curdataI0=").append(curdataI0);
        sb.append(", curdataU0=").append(curdataU0);
        sb.append(", curdataSparefloat01=").append(curdataSparefloat01);
        sb.append(", curdataSparefloat02=").append(curdataSparefloat02);
        sb.append(", curdataSparefloat03=").append(curdataSparefloat03);
        sb.append(", curdataSparefloat04=").append(curdataSparefloat04);
        sb.append(", curdataSparefloat05=").append(curdataSparefloat05);
        sb.append(", curdataSparefloat06=").append(curdataSparefloat06);
        sb.append(", curdataSparefloat07=").append(curdataSparefloat07);
        sb.append(", curdataSparefloat08=").append(curdataSparefloat08);
        sb.append(", curdataSparefloat09=").append(curdataSparefloat09);
        sb.append(", curdataSparefloat10=").append(curdataSparefloat10);
        sb.append(", curdataSparefloat11=").append(curdataSparefloat11);
        sb.append(", curdataSparefloat12=").append(curdataSparefloat12);
        sb.append(", curdataSparefloat13=").append(curdataSparefloat13);
        sb.append(", curdataSparefloat14=").append(curdataSparefloat14);
        sb.append(", curdataSparefloat15=").append(curdataSparefloat15);
        sb.append(", curdataSparefloat16=").append(curdataSparefloat16);
        sb.append(", curdataSparefloat17=").append(curdataSparefloat17);
        sb.append(", curdataSparefloat18=").append(curdataSparefloat18);
        sb.append(", curdataSparefloat19=").append(curdataSparefloat19);
        sb.append(", curdataSparefloat20=").append(curdataSparefloat20);
        sb.append(", curdataSparefloat21=").append(curdataSparefloat21);
        sb.append(", curdataSparefloat22=").append(curdataSparefloat22);
        sb.append(", curdataSparefloat23=").append(curdataSparefloat23);
        sb.append(", curdataSparefloat24=").append(curdataSparefloat24);
        sb.append(", curdataSparefloat25=").append(curdataSparefloat25);
        sb.append(", curdataSparefloat26=").append(curdataSparefloat26);
        sb.append(", curdataSparefloat27=").append(curdataSparefloat27);
        sb.append(", curdataSparefloat28=").append(curdataSparefloat28);
        sb.append(", curdataSparefloat29=").append(curdataSparefloat29);
        sb.append(", curdataSparefloat30=").append(curdataSparefloat30);
        sb.append(", curdataSparefloat31=").append(curdataSparefloat31);
        sb.append(", curdataSparefloat32=").append(curdataSparefloat32);
        sb.append(", curdataSpareint01=").append(curdataSpareint01);
        sb.append(", curdataSpareint02=").append(curdataSpareint02);
        sb.append(", curdataSpareint03=").append(curdataSpareint03);
        sb.append(", curdataSpareint04=").append(curdataSpareint04);
        sb.append(", curdataSpareint05=").append(curdataSpareint05);
        sb.append(", curdataSpareint06=").append(curdataSpareint06);
        sb.append(", curdataSpareint07=").append(curdataSpareint07);
        sb.append(", curdataSpareint08=").append(curdataSpareint08);
        sb.append(", curdataSpareint09=").append(curdataSpareint09);
        sb.append(", curdataSpareint10=").append(curdataSpareint10);
        sb.append(", curdataSpareint11=").append(curdataSpareint11);
        sb.append(", curdataSpareint12=").append(curdataSpareint12);
        sb.append(", curdataSpareint13=").append(curdataSpareint13);
        sb.append(", curdataSpareint14=").append(curdataSpareint14);
        sb.append(", curdataSpareint15=").append(curdataSpareint15);
        sb.append(", curdataSpareint16=").append(curdataSpareint16);
        sb.append(", curdataSpareint17=").append(curdataSpareint17);
        sb.append(", curdataSpareint18=").append(curdataSpareint18);
        sb.append(", curdataSpareint19=").append(curdataSpareint19);
        sb.append(", curdataSpareint20=").append(curdataSpareint20);
        sb.append(", curdataSpareint21=").append(curdataSpareint21);
        sb.append(", curdataSpareint22=").append(curdataSpareint22);
        sb.append(", curdataSpareint23=").append(curdataSpareint23);
        sb.append(", curdataSpareint24=").append(curdataSpareint24);
        sb.append(", curdataSpareint25=").append(curdataSpareint25);
        sb.append(", curdataSpareint26=").append(curdataSpareint26);
        sb.append(", curdataSpareint27=").append(curdataSpareint27);
        sb.append(", curdataSpareint28=").append(curdataSpareint28);
        sb.append(", curdataSpareint29=").append(curdataSpareint29);
        sb.append(", curdataSpareint30=").append(curdataSpareint30);
        sb.append(", curdataSpareint31=").append(curdataSpareint31);
        sb.append(", curdataSpareint32=").append(curdataSpareint32);
        sb.append("]");
        return sb.toString();
    }
}