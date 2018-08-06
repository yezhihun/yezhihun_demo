package com.yg.omp.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author 
 */
public class SerialPort implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -4854960959162467891L;

    /**
     * 串口ID唯一标识
     * id
     */
    private Integer id;

    /**
     * 建筑ID
     * building_id
     */
    private Integer buildingId;

    private String serialportName;

    /**
     * 串口标识:例如COM1\COM2\COM3等
     * serialport_no
     */
    private String serialportNo;

    /**
     * 连接类型 1-RTU，2-TCP
     * serialport_conntype
     */
    private Integer serialportConntype;

    /**
     * 串口波特率
     * serialport_baudrate
     */
    private Integer serialportBaudrate;

    /**
     * 串口数据位（一般为8，具体需参考仪表设计要求）
     * serialport_databits
     */
    private Integer serialportDatabits;

    /**
     * 串口校验位（None：无校验；Odd：奇校验；Even：偶校验）
     * serialport_parity
     */
    private String serialportParity;

    /**
     * 串口停止位
     * serialport_stopbits
     */
    private String serialportStopbits;

    /**
     * TCP访问时IP地址
     * serialport_ipaddr
     */
    private String serialportIpaddr;

    /**
     * TCP连接时端口值
     * serialport_port
     */
    private Integer serialportPort;

    /**
     * 串口连接状态（废弃）
     * serialport_connstatus
     */
    private Integer serialportConnstatus;

    /**
     * 串口备注信息
     * serialport_remark
     */
    private String serialportRemark;

    /**
     * 串口显示状态：1展示；2删除
     * serialport_showstatus
     */
    private Integer serialportShowstatus;

    /**
     * 是否采集（1-采集，0-不采集）
     * serialport_is_collect
     */
    private Integer serialportIsCollect;

    /**
     * 是否支持中断（用于预付费系统）（1-支持，0不支持）
     * serialport_sup_interrupt
      默认：0
     */
    private Integer serialportSupInterrupt;

    /**
     * 创建时间
     * serialport_create_time
     */
    private Date serialportCreateTime;

    /**
     * 更新时间
     * serialport_update_time
     */
    private Date serialportUpdateTime;

    /** 
     * 获取 串口ID唯一标识 tb_serialport.id
     * @return 串口ID唯一标识
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 串口ID唯一标识 tb_serialport.id
     * @param id 串口ID唯一标识
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 建筑ID tb_serialport.building_id
     * @return 建筑ID
     */
    public final Integer getBuildingId() {
        return buildingId;
    }

    /** 
     * 设置 建筑ID tb_serialport.building_id
     * @param buildingId 建筑ID
     */
    public final void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /** 
     * 获取 tb_serialport.serialport_name
     * @return tb_serialport.serialport_name
     */
    public final String getSerialportName() {
        return serialportName;
    }

    /** 
     * 设置 tb_serialport.serialport_name
     * @param serialportName tb_serialport.serialport_name
     */
    public final void setSerialportName(String serialportName) {
        this.serialportName = serialportName == null ? null : serialportName.trim();
    }

    /** 
     * 获取 串口标识:例如COM1\COM2\COM3等 tb_serialport.serialport_no
     * @return 串口标识:例如COM1\COM2\COM3等
     */
    public final String getSerialportNo() {
        return serialportNo;
    }

    /** 
     * 设置 串口标识:例如COM1\COM2\COM3等 tb_serialport.serialport_no
     * @param serialportNo 串口标识:例如COM1\COM2\COM3等
     */
    public final void setSerialportNo(String serialportNo) {
        this.serialportNo = serialportNo == null ? null : serialportNo.trim();
    }

    /** 
     * 获取 连接类型 1-RTU，2-TCP tb_serialport.serialport_conntype
     * @return 连接类型 1-RTU，2-TCP
     */
    public final Integer getSerialportConntype() {
        return serialportConntype;
    }

    /** 
     * 设置 连接类型 1-RTU，2-TCP tb_serialport.serialport_conntype
     * @param serialportConntype 连接类型 1-RTU，2-TCP
     */
    public final void setSerialportConntype(Integer serialportConntype) {
        this.serialportConntype = serialportConntype;
    }

    /** 
     * 获取 串口波特率 tb_serialport.serialport_baudrate
     * @return 串口波特率
     */
    public final Integer getSerialportBaudrate() {
        return serialportBaudrate;
    }

    /** 
     * 设置 串口波特率 tb_serialport.serialport_baudrate
     * @param serialportBaudrate 串口波特率
     */
    public final void setSerialportBaudrate(Integer serialportBaudrate) {
        this.serialportBaudrate = serialportBaudrate;
    }

    /** 
     * 获取 串口数据位（一般为8，具体需参考仪表设计要求） tb_serialport.serialport_databits
     * @return 串口数据位（一般为8，具体需参考仪表设计要求）
     */
    public final Integer getSerialportDatabits() {
        return serialportDatabits;
    }

    /** 
     * 设置 串口数据位（一般为8，具体需参考仪表设计要求） tb_serialport.serialport_databits
     * @param serialportDatabits 串口数据位（一般为8，具体需参考仪表设计要求）
     */
    public final void setSerialportDatabits(Integer serialportDatabits) {
        this.serialportDatabits = serialportDatabits;
    }

    /** 
     * 获取 串口校验位（None：无校验；Odd：奇校验；Even：偶校验） tb_serialport.serialport_parity
     * @return 串口校验位（None：无校验；Odd：奇校验；Even：偶校验）
     */
    public final String getSerialportParity() {
        return serialportParity;
    }

    /** 
     * 设置 串口校验位（None：无校验；Odd：奇校验；Even：偶校验） tb_serialport.serialport_parity
     * @param serialportParity 串口校验位（None：无校验；Odd：奇校验；Even：偶校验）
     */
    public final void setSerialportParity(String serialportParity) {
        this.serialportParity = serialportParity == null ? null : serialportParity.trim();
    }

    /** 
     * 获取 串口停止位 tb_serialport.serialport_stopbits
     * @return 串口停止位
     */
    public final String getSerialportStopbits() {
        return serialportStopbits;
    }

    /** 
     * 设置 串口停止位 tb_serialport.serialport_stopbits
     * @param serialportStopbits 串口停止位
     */
    public final void setSerialportStopbits(String serialportStopbits) {
        this.serialportStopbits = serialportStopbits == null ? null : serialportStopbits.trim();
    }

    /** 
     * 获取 TCP访问时IP地址 tb_serialport.serialport_ipaddr
     * @return TCP访问时IP地址
     */
    public final String getSerialportIpaddr() {
        return serialportIpaddr;
    }

    /** 
     * 设置 TCP访问时IP地址 tb_serialport.serialport_ipaddr
     * @param serialportIpaddr TCP访问时IP地址
     */
    public final void setSerialportIpaddr(String serialportIpaddr) {
        this.serialportIpaddr = serialportIpaddr == null ? null : serialportIpaddr.trim();
    }

    /** 
     * 获取 TCP连接时端口值 tb_serialport.serialport_port
     * @return TCP连接时端口值
     */
    public final Integer getSerialportPort() {
        return serialportPort;
    }

    /** 
     * 设置 TCP连接时端口值 tb_serialport.serialport_port
     * @param serialportPort TCP连接时端口值
     */
    public final void setSerialportPort(Integer serialportPort) {
        this.serialportPort = serialportPort;
    }

    /** 
     * 获取 串口连接状态（废弃） tb_serialport.serialport_connstatus
     * @return 串口连接状态（废弃）
     */
    public final Integer getSerialportConnstatus() {
        return serialportConnstatus;
    }

    /** 
     * 设置 串口连接状态（废弃） tb_serialport.serialport_connstatus
     * @param serialportConnstatus 串口连接状态（废弃）
     */
    public final void setSerialportConnstatus(Integer serialportConnstatus) {
        this.serialportConnstatus = serialportConnstatus;
    }

    /** 
     * 获取 串口备注信息 tb_serialport.serialport_remark
     * @return 串口备注信息
     */
    public final String getSerialportRemark() {
        return serialportRemark;
    }

    /** 
     * 设置 串口备注信息 tb_serialport.serialport_remark
     * @param serialportRemark 串口备注信息
     */
    public final void setSerialportRemark(String serialportRemark) {
        this.serialportRemark = serialportRemark == null ? null : serialportRemark.trim();
    }

    /** 
     * 获取 串口显示状态：1展示；2删除 tb_serialport.serialport_showstatus
     * @return 串口显示状态：1展示；2删除
     */
    public final Integer getSerialportShowstatus() {
        return serialportShowstatus;
    }

    /** 
     * 设置 串口显示状态：1展示；2删除 tb_serialport.serialport_showstatus
     * @param serialportShowstatus 串口显示状态：1展示；2删除
     */
    public final void setSerialportShowstatus(Integer serialportShowstatus) {
        this.serialportShowstatus = serialportShowstatus;
    }

    /** 
     * 获取 是否采集（1-采集，0-不采集） tb_serialport.serialport_is_collect
     * @return 是否采集（1-采集，0-不采集）
     */
    public final Integer getSerialportIsCollect() {
        return serialportIsCollect;
    }

    /** 
     * 设置 是否采集（1-采集，0-不采集） tb_serialport.serialport_is_collect
     * @param serialportIsCollect 是否采集（1-采集，0-不采集）
     */
    public final void setSerialportIsCollect(Integer serialportIsCollect) {
        this.serialportIsCollect = serialportIsCollect;
    }

    /** 
     * 获取 是否支持中断（用于预付费系统）（1-支持，0不支持） tb_serialport.serialport_sup_interrupt
     * @return 是否支持中断（用于预付费系统）（1-支持，0不支持）
     */
    public final Integer getSerialportSupInterrupt() {
        return serialportSupInterrupt;
    }

    /** 
     * 设置 是否支持中断（用于预付费系统）（1-支持，0不支持） tb_serialport.serialport_sup_interrupt
     * @param serialportSupInterrupt 是否支持中断（用于预付费系统）（1-支持，0不支持）
     */
    public final void setSerialportSupInterrupt(Integer serialportSupInterrupt) {
        this.serialportSupInterrupt = serialportSupInterrupt;
    }

    /** 
     * 获取 创建时间 tb_serialport.serialport_create_time
     * @return 创建时间
     */
    public final Date getSerialportCreateTime() {
        return serialportCreateTime;
    }

    /** 
     * 设置 创建时间 tb_serialport.serialport_create_time
     * @param serialportCreateTime 创建时间
     */
    public final void setSerialportCreateTime(Date serialportCreateTime) {
        this.serialportCreateTime = serialportCreateTime;
    }

    /** 
     * 获取 更新时间 tb_serialport.serialport_update_time
     * @return 更新时间
     */
    public final Date getSerialportUpdateTime() {
        return serialportUpdateTime;
    }

    /** 
     * 设置 更新时间 tb_serialport.serialport_update_time
     * @param serialportUpdateTime 更新时间
     */
    public final void setSerialportUpdateTime(Date serialportUpdateTime) {
        this.serialportUpdateTime = serialportUpdateTime;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", buildingId=").append(buildingId);
        sb.append(", serialportName=").append(serialportName);
        sb.append(", serialportNo=").append(serialportNo);
        sb.append(", serialportConntype=").append(serialportConntype);
        sb.append(", serialportBaudrate=").append(serialportBaudrate);
        sb.append(", serialportDatabits=").append(serialportDatabits);
        sb.append(", serialportParity=").append(serialportParity);
        sb.append(", serialportStopbits=").append(serialportStopbits);
        sb.append(", serialportIpaddr=").append(serialportIpaddr);
        sb.append(", serialportPort=").append(serialportPort);
        sb.append(", serialportConnstatus=").append(serialportConnstatus);
        sb.append(", serialportRemark=").append(serialportRemark);
        sb.append(", serialportShowstatus=").append(serialportShowstatus);
        sb.append(", serialportIsCollect=").append(serialportIsCollect);
        sb.append(", serialportSupInterrupt=").append(serialportSupInterrupt);
        sb.append(", serialportCreateTime=").append(serialportCreateTime);
        sb.append(", serialportUpdateTime=").append(serialportUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}