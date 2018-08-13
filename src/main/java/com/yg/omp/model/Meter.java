package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity
@Table(name = "tb_meter")
public class Meter implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 1606082975783237767L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    /**
     * 仪表编号（串口no+仪表id）
     * meter_no
     */
    @Column(name = "meter_no")
    private String meterNo;

    /**
     * 电表名称
     * meter_name
     */
    @Column(name = "meter_name")
    private String meterName;

    /**
     * 仪表所在回路ID
     * loop_id
     */
    @Column(name = "loop_id")
    private Integer loopId;

    /**
     * 回路编号
     * loop_no
     */
    @Column(name = "loop_no")
    private String loopNo;

    /**
     * 回路名称
     * loop_name
     */
    @Column(name = "loop_name")
    private String loopName;

    /**
     * 仪表所在建筑ID（buildinfo表中的编号）
     * building_id
     */
    @Column(name = "building_id")
    private Integer buildingId;

    /**
     * 建筑名称
     * building_name
     */
    @Column(name = "building_name")
    private String buildingName;

    /**
     * 变压器ID
     * transformer_id
     */
    @Column(name = "transformer_id")
    private Integer transformerId;

    /**
     * 变压器名称
     * transformer_name
     */
    @Column(name = "transformer_name")
    private String transformerName;

    /**
     * 仪表所在机柜ID
     * cabinet_id
     */
    @Column(name = "cabinet_id")
    private Integer cabinetId;

    /**
     * 配电柜名称
     * cabinet_name
     */
    @Column(name = "cabinet_name")
    private String cabinetName;

    /**
     * 所属串口或虚拟串口id
     * serialport_id
     */
    @Column(name = "serialport_id")
    private Integer serialportId;

    /**
     * 串口名称
     * serialport_name
     */
    @Column(name = "serialport_name")
    private String serialportName;

    /**
     * 仪表Addr-仪表地址
     * meter_addr
     */
    @Column(name = "meter_addr")
    private Integer meterAddr;

    /**
     * 仪表型号ID
     * meter_model_id
     * 默认：0
     */
    @Column(name = "meter_model_id")
    private Integer meterModelId;

    /**
     * 仪表网络状态：1-网络正常，2-网络断开
     * meter_net_status
     */
    @Column(name = "meter_net_status")
    private Integer meterNetStatus;

    @Column(name = "meter_showstatus")
    private Integer meterShowstatus;

    @Column(name = "meteris_collect")
    private Integer meterIsCollect;

    /**
     * 是否生成报表（0-不生成；1-生成）
     * meter_is_report
     */
    @Column(name = "meter_is_report")
    private Integer meterIsReport;

    /**
     * 是否生成曲线（0-不生成，1-生成）
     * meter_is_cure
     */
    @Column(name = "meter_is_cure")
    private Integer meterIsCure;

    @Column(name = "meter_is_t3")
    private Integer meterIsT3;

    @Column(name = "meter_is_it")
    private Integer meterIsIt;

    /**
     * 电压变比
     * meter_electricity_pt
     */
    @Column(name = "meter_electricity_pt")
    private Integer meterElectricityPt;

    /**
     * 电流变比
     * meter_electricity_ct
     */
    @Column(name = "meter_electricity_ct")
    private Integer meterElectricityCt;

    @Column(name = "meter_ele_price_sharp")
    private Float meterElePriceSharp;

    @Column(name = "meter_ele_price_peak")
    private Float meterElePricePeak;

    @Column(name = "meter_ele_price_flat")
    private Float meterElePriceFlat;

    @Column(name = "meter_ele_price_valley")
    private Float meterElePriceValley;

    /**
     * 仪表编号（一般为机柜编号+数字）
     * meter_num
     */
    @Column(name = "meter_num")
    private String meterNum;

    /**
     * 排序
     * meter_sort
     */
    @Column(name = "meter_sort")
    private Integer meterSort;

    /**
     * 仪表类型：1-高压表；2-低压表；3-配电间表
     * meter_type
     */
    @Column(name = "meter_type")
    private Integer meterType;

    /**
     * 仪表波特率（应与所在串口波特率一致）
     * meter_baudrate
     */
    @Column(name = "meter_baudrate")
    private Integer meterBaudrate;

    /**
     * 是否为虚拟表
     * mete_is_virtual
     */
    @Column(name = "mete_is_virtual")
    private Integer meteIsVirtual;

    /**
     * 父表1
     * meter_parent1
     */
    @Column(name = "meter_parent1")
    private Integer meterParent1;

    /**
     * 父表2
     * meter_parent2
     */
    @Column(name = "meter_parent2")
    private Integer meterParent2;

    /**
     * 所属级别
     * meter_level
     */
    @Column(name = "meter_level")
    private Integer meterLevel;

    /**
     * 附属关系表id（附属关系表的ID）
     * meter_attached_id
     */
    @Column(name = "meter_attached_id")
    private Integer meterAttachedId;

    /**
     * 在附属关系中，该表处于的角色（当前表而非附属表）1-主表，2-从表，3-并用表
     * meter_attached_currole
     */
    @Column(name = "meter_attached_currole")
    private Integer meterAttachedCurrole;

    @Column(name = "floor_id")
    private Integer floorId;

    /**
     * 仪表所在楼层名称（同配电间所在楼层）
     * floor_name
     */
    @Column(name = "floor_name")
    private String floorName;

    /**
     * 仪表所在房间id（变电所、配电间）
     * room_id
     */
    @Column(name = "room_id")
    private Integer roomId;

    /**
     * 房间名称
     * room_name
     */
    @Column(name = "room_name")
    private String roomName;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "chamber_id")
    private Integer chamberId;

    /**
     * 所在竖井id
     * verticalwell_id
     */
    @Column(name = "verticalwell_id")
    private Integer verticalwellId;

    @Column(name = "meter_remark")
    private String meterRemark;

    /**
     * 创建时间（创建1次后不再更改）
     * meter_create_time
     */
    @Column(name = "meter_create_time")
    private Date meterCreateTime;

    /**
     * 更新时间（记录最后一次操作时间）
     * meter_update_time
     */
    @Column(name = "meter_update_time")
    private Date meterUpdateTime;

    /**
     * 获取 tb_meter.id
     *
     * @return tb_meter.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_meter.id
     *
     * @param id tb_meter.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 仪表编号（串口no+仪表id） tb_meter.meter_no
     *
     * @return 仪表编号（串口no+仪表id）
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置 仪表编号（串口no+仪表id） tb_meter.meter_no
     *
     * @param meterNo 仪表编号（串口no+仪表id）
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取 电表名称 tb_meter.meter_name
     *
     * @return 电表名称
     */
    public final String getMeterName() {
        return meterName;
    }

    /**
     * 设置 电表名称 tb_meter.meter_name
     *
     * @param meterName 电表名称
     */
    public final void setMeterName(String meterName) {
        this.meterName = meterName == null ? null : meterName.trim();
    }

    /**
     * 获取 仪表所在回路ID tb_meter.loop_id
     *
     * @return 仪表所在回路ID
     */
    public final Integer getLoopId() {
        return loopId;
    }

    /**
     * 设置 仪表所在回路ID tb_meter.loop_id
     *
     * @param loopId 仪表所在回路ID
     */
    public final void setLoopId(Integer loopId) {
        this.loopId = loopId;
    }

    /**
     * 获取 回路编号 tb_meter.loop_no
     *
     * @return 回路编号
     */
    public final String getLoopNo() {
        return loopNo;
    }

    /**
     * 设置 回路编号 tb_meter.loop_no
     *
     * @param loopNo 回路编号
     */
    public final void setLoopNo(String loopNo) {
        this.loopNo = loopNo == null ? null : loopNo.trim();
    }

    /**
     * 获取 回路名称 tb_meter.loop_name
     *
     * @return 回路名称
     */
    public final String getLoopName() {
        return loopName;
    }

    /**
     * 设置 回路名称 tb_meter.loop_name
     *
     * @param loopName 回路名称
     */
    public final void setLoopName(String loopName) {
        this.loopName = loopName == null ? null : loopName.trim();
    }

    /**
     * 获取 仪表所在建筑ID（buildinfo表中的编号） tb_meter.building_id
     *
     * @return 仪表所在建筑ID（buildinfo表中的编号）
     */
    public final Integer getBuildingId() {
        return buildingId;
    }

    /**
     * 设置 仪表所在建筑ID（buildinfo表中的编号） tb_meter.building_id
     *
     * @param buildingId 仪表所在建筑ID（buildinfo表中的编号）
     */
    public final void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * 获取 建筑名称 tb_meter.building_name
     *
     * @return 建筑名称
     */
    public final String getBuildingName() {
        return buildingName;
    }

    /**
     * 设置 建筑名称 tb_meter.building_name
     *
     * @param buildingName 建筑名称
     */
    public final void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * 获取 变压器ID tb_meter.transformer_id
     *
     * @return 变压器ID
     */
    public final Integer getTransformerId() {
        return transformerId;
    }

    /**
     * 设置 变压器ID tb_meter.transformer_id
     *
     * @param transformerId 变压器ID
     */
    public final void setTransformerId(Integer transformerId) {
        this.transformerId = transformerId;
    }

    /**
     * 获取 变压器名称 tb_meter.transformer_name
     *
     * @return 变压器名称
     */
    public final String getTransformerName() {
        return transformerName;
    }

    /**
     * 设置 变压器名称 tb_meter.transformer_name
     *
     * @param transformerName 变压器名称
     */
    public final void setTransformerName(String transformerName) {
        this.transformerName = transformerName == null ? null : transformerName.trim();
    }

    /**
     * 获取 仪表所在机柜ID tb_meter.cabinet_id
     *
     * @return 仪表所在机柜ID
     */
    public final Integer getCabinetId() {
        return cabinetId;
    }

    /**
     * 设置 仪表所在机柜ID tb_meter.cabinet_id
     *
     * @param cabinetId 仪表所在机柜ID
     */
    public final void setCabinetId(Integer cabinetId) {
        this.cabinetId = cabinetId;
    }

    /**
     * 获取 配电柜名称 tb_meter.cabinet_name
     *
     * @return 配电柜名称
     */
    public final String getCabinetName() {
        return cabinetName;
    }

    /**
     * 设置 配电柜名称 tb_meter.cabinet_name
     *
     * @param cabinetName 配电柜名称
     */
    public final void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName == null ? null : cabinetName.trim();
    }

    /**
     * 获取 所属串口或虚拟串口id tb_meter.serialport_id
     *
     * @return 所属串口或虚拟串口id
     */
    public final Integer getSerialportId() {
        return serialportId;
    }

    /**
     * 设置 所属串口或虚拟串口id tb_meter.serialport_id
     *
     * @param serialportId 所属串口或虚拟串口id
     */
    public final void setSerialportId(Integer serialportId) {
        this.serialportId = serialportId;
    }

    /**
     * 获取 串口名称 tb_meter.serialport_name
     *
     * @return 串口名称
     */
    public final String getSerialportName() {
        return serialportName;
    }

    /**
     * 设置 串口名称 tb_meter.serialport_name
     *
     * @param serialportName 串口名称
     */
    public final void setSerialportName(String serialportName) {
        this.serialportName = serialportName == null ? null : serialportName.trim();
    }

    /**
     * 获取 仪表Addr-仪表地址 tb_meter.meter_addr
     *
     * @return 仪表Addr-仪表地址
     */
    public final Integer getMeterAddr() {
        return meterAddr;
    }

    /**
     * 设置 仪表Addr-仪表地址 tb_meter.meter_addr
     *
     * @param meterAddr 仪表Addr-仪表地址
     */
    public final void setMeterAddr(Integer meterAddr) {
        this.meterAddr = meterAddr;
    }

    /**
     * 获取 仪表型号ID tb_meter.meter_model_id
     *
     * @return 仪表型号ID
     */
    public final Integer getMeterModelId() {
        return meterModelId;
    }

    /**
     * 设置 仪表型号ID tb_meter.meter_model_id
     *
     * @param meterModelId 仪表型号ID
     */
    public final void setMeterModelId(Integer meterModelId) {
        this.meterModelId = meterModelId;
    }

    /**
     * 获取 仪表网络状态：1-网络正常，2-网络断开 tb_meter.meter_net_status
     *
     * @return 仪表网络状态：1-网络正常，2-网络断开
     */
    public final Integer getMeterNetStatus() {
        return meterNetStatus;
    }

    /**
     * 设置 仪表网络状态：1-网络正常，2-网络断开 tb_meter.meter_net_status
     *
     * @param meterNetStatus 仪表网络状态：1-网络正常，2-网络断开
     */
    public final void setMeterNetStatus(Integer meterNetStatus) {
        this.meterNetStatus = meterNetStatus;
    }

    /**
     * 获取 tb_meter.meter_showstatus
     *
     * @return tb_meter.meter_showstatus
     */
    public final Integer getMeterShowstatus() {
        return meterShowstatus;
    }

    /**
     * 设置 tb_meter.meter_showstatus
     *
     * @param meterShowstatus tb_meter.meter_showstatus
     */
    public final void setMeterShowstatus(Integer meterShowstatus) {
        this.meterShowstatus = meterShowstatus;
    }

    /**
     * 获取 tb_meter.meter_is_collect
     *
     * @return tb_meter.meter_is_collect
     */
    public final Integer getMeterIsCollect() {
        return meterIsCollect;
    }

    /**
     * 设置 tb_meter.meter_is_collect
     *
     * @param meterIsCollect tb_meter.meter_is_collect
     */
    public final void setMeterIsCollect(Integer meterIsCollect) {
        this.meterIsCollect = meterIsCollect;
    }

    /**
     * 获取 是否生成报表（0-不生成；1-生成） tb_meter.meter_is_report
     *
     * @return 是否生成报表（0-不生成；1-生成）
     */
    public final Integer getMeterIsReport() {
        return meterIsReport;
    }

    /**
     * 设置 是否生成报表（0-不生成；1-生成） tb_meter.meter_is_report
     *
     * @param meterIsReport 是否生成报表（0-不生成；1-生成）
     */
    public final void setMeterIsReport(Integer meterIsReport) {
        this.meterIsReport = meterIsReport;
    }

    /**
     * 获取 是否生成曲线（0-不生成，1-生成） tb_meter.meter_is_cure
     *
     * @return 是否生成曲线（0-不生成，1-生成）
     */
    public final Integer getMeterIsCure() {
        return meterIsCure;
    }

    /**
     * 设置 是否生成曲线（0-不生成，1-生成） tb_meter.meter_is_cure
     *
     * @param meterIsCure 是否生成曲线（0-不生成，1-生成）
     */
    public final void setMeterIsCure(Integer meterIsCure) {
        this.meterIsCure = meterIsCure;
    }

    /**
     * 获取 tb_meter.meter_is_t3
     *
     * @return tb_meter.meter_is_t3
     */
    public final Integer getMeterIsT3() {
        return meterIsT3;
    }

    /**
     * 设置 tb_meter.meter_is_t3
     *
     * @param meterIsT3 tb_meter.meter_is_t3
     */
    public final void setMeterIsT3(Integer meterIsT3) {
        this.meterIsT3 = meterIsT3;
    }

    /**
     * 获取 tb_meter.meter_is_it
     *
     * @return tb_meter.meter_is_it
     */
    public final Integer getMeterIsIt() {
        return meterIsIt;
    }

    /**
     * 设置 tb_meter.meter_is_it
     *
     * @param meterIsIt tb_meter.meter_is_it
     */
    public final void setMeterIsIt(Integer meterIsIt) {
        this.meterIsIt = meterIsIt;
    }

    /**
     * 获取 电压变比 tb_meter.meter_electricity_pt
     *
     * @return 电压变比
     */
    public final Integer getMeterElectricityPt() {
        return meterElectricityPt;
    }

    /**
     * 设置 电压变比 tb_meter.meter_electricity_pt
     *
     * @param meterElectricityPt 电压变比
     */
    public final void setMeterElectricityPt(Integer meterElectricityPt) {
        this.meterElectricityPt = meterElectricityPt;
    }

    /**
     * 获取 电流变比 tb_meter.meter_electricity_ct
     *
     * @return 电流变比
     */
    public final Integer getMeterElectricityCt() {
        return meterElectricityCt;
    }

    /**
     * 设置 电流变比 tb_meter.meter_electricity_ct
     *
     * @param meterElectricityCt 电流变比
     */
    public final void setMeterElectricityCt(Integer meterElectricityCt) {
        this.meterElectricityCt = meterElectricityCt;
    }

    /**
     * 获取 tb_meter.meter_ele_price_sharp
     *
     * @return tb_meter.meter_ele_price_sharp
     */
    public final Float getMeterElePriceSharp() {
        return meterElePriceSharp;
    }

    /**
     * 设置 tb_meter.meter_ele_price_sharp
     *
     * @param meterElePriceSharp tb_meter.meter_ele_price_sharp
     */
    public final void setMeterElePriceSharp(Float meterElePriceSharp) {
        this.meterElePriceSharp = meterElePriceSharp;
    }

    /**
     * 获取 tb_meter.meter_ele_price_peak
     *
     * @return tb_meter.meter_ele_price_peak
     */
    public final Float getMeterElePricePeak() {
        return meterElePricePeak;
    }

    /**
     * 设置 tb_meter.meter_ele_price_peak
     *
     * @param meterElePricePeak tb_meter.meter_ele_price_peak
     */
    public final void setMeterElePricePeak(Float meterElePricePeak) {
        this.meterElePricePeak = meterElePricePeak;
    }

    /**
     * 获取 tb_meter.meter_ele_price_flat
     *
     * @return tb_meter.meter_ele_price_flat
     */
    public final Float getMeterElePriceFlat() {
        return meterElePriceFlat;
    }

    /**
     * 设置 tb_meter.meter_ele_price_flat
     *
     * @param meterElePriceFlat tb_meter.meter_ele_price_flat
     */
    public final void setMeterElePriceFlat(Float meterElePriceFlat) {
        this.meterElePriceFlat = meterElePriceFlat;
    }

    /**
     * 获取 tb_meter.meter_ele_price_valley
     *
     * @return tb_meter.meter_ele_price_valley
     */
    public final Float getMeterElePriceValley() {
        return meterElePriceValley;
    }

    /**
     * 设置 tb_meter.meter_ele_price_valley
     *
     * @param meterElePriceValley tb_meter.meter_ele_price_valley
     */
    public final void setMeterElePriceValley(Float meterElePriceValley) {
        this.meterElePriceValley = meterElePriceValley;
    }

    /**
     * 获取 仪表编号（一般为机柜编号+数字） tb_meter.meter_num
     *
     * @return 仪表编号（一般为机柜编号+数字）
     */
    public final String getMeterNum() {
        return meterNum;
    }

    /**
     * 设置 仪表编号（一般为机柜编号+数字） tb_meter.meter_num
     *
     * @param meterNum 仪表编号（一般为机柜编号+数字）
     */
    public final void setMeterNum(String meterNum) {
        this.meterNum = meterNum == null ? null : meterNum.trim();
    }

    /**
     * 获取 排序 tb_meter.meter_sort
     *
     * @return 排序
     */
    public final Integer getMeterSort() {
        return meterSort;
    }

    /**
     * 设置 排序 tb_meter.meter_sort
     *
     * @param meterSort 排序
     */
    public final void setMeterSort(Integer meterSort) {
        this.meterSort = meterSort;
    }

    /**
     * 获取 仪表类型：1-高压表；2-低压表；3-配电间表 tb_meter.meter_type
     *
     * @return 仪表类型：1-高压表；2-低压表；3-配电间表
     */
    public final Integer getMeterType() {
        return meterType;
    }

    /**
     * 设置 仪表类型：1-高压表；2-低压表；3-配电间表 tb_meter.meter_type
     *
     * @param meterType 仪表类型：1-高压表；2-低压表；3-配电间表
     */
    public final void setMeterType(Integer meterType) {
        this.meterType = meterType;
    }

    /**
     * 获取 仪表波特率（应与所在串口波特率一致） tb_meter.meter_baudrate
     *
     * @return 仪表波特率（应与所在串口波特率一致）
     */
    public final Integer getMeterBaudrate() {
        return meterBaudrate;
    }

    /**
     * 设置 仪表波特率（应与所在串口波特率一致） tb_meter.meter_baudrate
     *
     * @param meterBaudrate 仪表波特率（应与所在串口波特率一致）
     */
    public final void setMeterBaudrate(Integer meterBaudrate) {
        this.meterBaudrate = meterBaudrate;
    }

    /**
     * 获取 是否为虚拟表 tb_meter.mete_is_virtual
     *
     * @return 是否为虚拟表
     */
    public final Integer getMeteIsVirtual() {
        return meteIsVirtual;
    }

    /**
     * 设置 是否为虚拟表 tb_meter.mete_is_virtual
     *
     * @param meteIsVirtual 是否为虚拟表
     */
    public final void setMeteIsVirtual(Integer meteIsVirtual) {
        this.meteIsVirtual = meteIsVirtual;
    }

    /**
     * 获取 父表1 tb_meter.meter_parent1
     *
     * @return 父表1
     */
    public final Integer getMeterParent1() {
        return meterParent1;
    }

    /**
     * 设置 父表1 tb_meter.meter_parent1
     *
     * @param meterParent1 父表1
     */
    public final void setMeterParent1(Integer meterParent1) {
        this.meterParent1 = meterParent1;
    }

    /**
     * 获取 父表2 tb_meter.meter_parent2
     *
     * @return 父表2
     */
    public final Integer getMeterParent2() {
        return meterParent2;
    }

    /**
     * 设置 父表2 tb_meter.meter_parent2
     *
     * @param meterParent2 父表2
     */
    public final void setMeterParent2(Integer meterParent2) {
        this.meterParent2 = meterParent2;
    }

    /**
     * 获取 所属级别 tb_meter.meter_level
     *
     * @return 所属级别
     */
    public final Integer getMeterLevel() {
        return meterLevel;
    }

    /**
     * 设置 所属级别 tb_meter.meter_level
     *
     * @param meterLevel 所属级别
     */
    public final void setMeterLevel(Integer meterLevel) {
        this.meterLevel = meterLevel;
    }

    /**
     * 获取 附属关系表id（附属关系表的ID） tb_meter.meter_attached_id
     *
     * @return 附属关系表id（附属关系表的ID）
     */
    public final Integer getMeterAttachedId() {
        return meterAttachedId;
    }

    /**
     * 设置 附属关系表id（附属关系表的ID） tb_meter.meter_attached_id
     *
     * @param meterAttachedId 附属关系表id（附属关系表的ID）
     */
    public final void setMeterAttachedId(Integer meterAttachedId) {
        this.meterAttachedId = meterAttachedId;
    }

    /**
     * 获取 在附属关系中，该表处于的角色（当前表而非附属表）1-主表，2-从表，3-并用表 tb_meter.meter_attached_currole
     *
     * @return 在附属关系中，该表处于的角色（当前表而非附属表）1-主表，2-从表，3-并用表
     */
    public final Integer getMeterAttachedCurrole() {
        return meterAttachedCurrole;
    }

    /**
     * 设置 在附属关系中，该表处于的角色（当前表而非附属表）1-主表，2-从表，3-并用表 tb_meter.meter_attached_currole
     *
     * @param meterAttachedCurrole 在附属关系中，该表处于的角色（当前表而非附属表）1-主表，2-从表，3-并用表
     */
    public final void setMeterAttachedCurrole(Integer meterAttachedCurrole) {
        this.meterAttachedCurrole = meterAttachedCurrole;
    }

    /**
     * 获取 tb_meter.floor_id
     *
     * @return tb_meter.floor_id
     */
    public final Integer getFloorId() {
        return floorId;
    }

    /**
     * 设置 tb_meter.floor_id
     *
     * @param floorId tb_meter.floor_id
     */
    public final void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    /**
     * 获取 仪表所在楼层名称（同配电间所在楼层） tb_meter.floor_name
     *
     * @return 仪表所在楼层名称（同配电间所在楼层）
     */
    public final String getFloorName() {
        return floorName;
    }

    /**
     * 设置 仪表所在楼层名称（同配电间所在楼层） tb_meter.floor_name
     *
     * @param floorName 仪表所在楼层名称（同配电间所在楼层）
     */
    public final void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    /**
     * 获取 仪表所在房间id（变电所、配电间） tb_meter.room_id
     *
     * @return 仪表所在房间id（变电所、配电间）
     */
    public final Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置 仪表所在房间id（变电所、配电间） tb_meter.room_id
     *
     * @param roomId 仪表所在房间id（变电所、配电间）
     */
    public final void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取 房间名称 tb_meter.room_name
     *
     * @return 房间名称
     */
    public final String getRoomName() {
        return roomName;
    }

    /**
     * 设置 房间名称 tb_meter.room_name
     *
     * @param roomName 房间名称
     */
    public final void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    /**
     * 获取 tb_meter.customer_id
     *
     * @return tb_meter.customer_id
     */
    public final Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置 tb_meter.customer_id
     *
     * @param customerId tb_meter.customer_id
     */
    public final void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取 tb_meter.chamber_id
     *
     * @return tb_meter.chamber_id
     */
    public final Integer getChamberId() {
        return chamberId;
    }

    /**
     * 设置 tb_meter.chamber_id
     *
     * @param chamberId tb_meter.chamber_id
     */
    public final void setChamberId(Integer chamberId) {
        this.chamberId = chamberId;
    }

    /**
     * 获取 所在竖井id tb_meter.verticalwell_id
     *
     * @return 所在竖井id
     */
    public final Integer getVerticalwellId() {
        return verticalwellId;
    }

    /**
     * 设置 所在竖井id tb_meter.verticalwell_id
     *
     * @param verticalwellId 所在竖井id
     */
    public final void setVerticalwellId(Integer verticalwellId) {
        this.verticalwellId = verticalwellId;
    }

    /**
     * 获取 tb_meter.meter_remark
     *
     * @return tb_meter.meter_remark
     */
    public final String getMeterRemark() {
        return meterRemark;
    }

    /**
     * 设置 tb_meter.meter_remark
     *
     * @param meterRemark tb_meter.meter_remark
     */
    public final void setMeterRemark(String meterRemark) {
        this.meterRemark = meterRemark == null ? null : meterRemark.trim();
    }

    /**
     * 获取 创建时间（创建1次后不再更改） tb_meter.meter_create_time
     *
     * @return 创建时间（创建1次后不再更改）
     */
    public final Date getMeterCreateTime() {
        return meterCreateTime;
    }

    /**
     * 设置 创建时间（创建1次后不再更改） tb_meter.meter_create_time
     *
     * @param meterCreateTime 创建时间（创建1次后不再更改）
     */
    public final void setMeterCreateTime(Date meterCreateTime) {
        this.meterCreateTime = meterCreateTime;
    }

    /**
     * 获取 更新时间（记录最后一次操作时间） tb_meter.meter_update_time
     *
     * @return 更新时间（记录最后一次操作时间）
     */
    public final Date getMeterUpdateTime() {
        return meterUpdateTime;
    }

    /**
     * 设置 更新时间（记录最后一次操作时间） tb_meter.meter_update_time
     *
     * @param meterUpdateTime 更新时间（记录最后一次操作时间）
     */
    public final void setMeterUpdateTime(Date meterUpdateTime) {
        this.meterUpdateTime = meterUpdateTime;
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
        sb.append(", meterName=").append(meterName);
        sb.append(", loopId=").append(loopId);
        sb.append(", loopNo=").append(loopNo);
        sb.append(", loopName=").append(loopName);
        sb.append(", buildingId=").append(buildingId);
        sb.append(", buildingName=").append(buildingName);
        sb.append(", transformerId=").append(transformerId);
        sb.append(", transformerName=").append(transformerName);
        sb.append(", cabinetId=").append(cabinetId);
        sb.append(", cabinetName=").append(cabinetName);
        sb.append(", serialportId=").append(serialportId);
        sb.append(", serialportName=").append(serialportName);
        sb.append(", meterAddr=").append(meterAddr);
        sb.append(", meterModelId=").append(meterModelId);
        sb.append(", meterNetStatus=").append(meterNetStatus);
        sb.append(", meterShowstatus=").append(meterShowstatus);
        sb.append(", meterIsCollect=").append(meterIsCollect);
        sb.append(", meterIsReport=").append(meterIsReport);
        sb.append(", meterIsCure=").append(meterIsCure);
        sb.append(", meterIsT3=").append(meterIsT3);
        sb.append(", meterIsIt=").append(meterIsIt);
        sb.append(", meterElectricityPt=").append(meterElectricityPt);
        sb.append(", meterElectricityCt=").append(meterElectricityCt);
        sb.append(", meterElePriceSharp=").append(meterElePriceSharp);
        sb.append(", meterElePricePeak=").append(meterElePricePeak);
        sb.append(", meterElePriceFlat=").append(meterElePriceFlat);
        sb.append(", meterElePriceValley=").append(meterElePriceValley);
        sb.append(", meterNum=").append(meterNum);
        sb.append(", meterSort=").append(meterSort);
        sb.append(", meterType=").append(meterType);
        sb.append(", meterBaudrate=").append(meterBaudrate);
        sb.append(", meteIsVirtual=").append(meteIsVirtual);
        sb.append(", meterParent1=").append(meterParent1);
        sb.append(", meterParent2=").append(meterParent2);
        sb.append(", meterLevel=").append(meterLevel);
        sb.append(", meterAttachedId=").append(meterAttachedId);
        sb.append(", meterAttachedCurrole=").append(meterAttachedCurrole);
        sb.append(", floorId=").append(floorId);
        sb.append(", floorName=").append(floorName);
        sb.append(", roomId=").append(roomId);
        sb.append(", roomName=").append(roomName);
        sb.append(", customerId=").append(customerId);
        sb.append(", chamberId=").append(chamberId);
        sb.append(", verticalwellId=").append(verticalwellId);
        sb.append(", meterRemark=").append(meterRemark);
        sb.append(", meterCreateTime=").append(meterCreateTime);
        sb.append(", meterUpdateTime=").append(meterUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}