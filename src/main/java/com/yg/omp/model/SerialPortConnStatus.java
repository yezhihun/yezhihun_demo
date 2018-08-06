package com.yg.omp.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author 
 */
public class SerialPortConnStatus implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -5055083402023261272L;

    private Integer id;

    /**
     * 串口ID
     * serialport_id
     */
    private Integer serialportId;

    /**
     * 当前状态
     * serialport_connstatus
     */
    private Integer serialportConnstatus;

    /**
     * 创建时间
     * create_time
      默认：CURRENT_TIMESTAMP
     */
    private Date createTime;

    /**
     * 更新时间
     * update_time
      默认：CURRENT_TIMESTAMP
     */
    private Date updateTime;

    /** 
     * 获取 tb_serialport_connstatus.id
     * @return tb_serialport_connstatus.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_serialport_connstatus.id
     * @param id tb_serialport_connstatus.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 串口ID tb_serialport_connstatus.serialport_id
     * @return 串口ID
     */
    public final Integer getSerialportId() {
        return serialportId;
    }

    /** 
     * 设置 串口ID tb_serialport_connstatus.serialport_id
     * @param serialportId 串口ID
     */
    public final void setSerialportId(Integer serialportId) {
        this.serialportId = serialportId;
    }

    /** 
     * 获取 当前状态 tb_serialport_connstatus.serialport_connstatus
     * @return 当前状态
     */
    public final Integer getSerialportConnstatus() {
        return serialportConnstatus;
    }

    /** 
     * 设置 当前状态 tb_serialport_connstatus.serialport_connstatus
     * @param serialportConnstatus 当前状态
     */
    public final void setSerialportConnstatus(Integer serialportConnstatus) {
        this.serialportConnstatus = serialportConnstatus;
    }

    /** 
     * 获取 创建时间 tb_serialport_connstatus.create_time
     * @return 创建时间
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 创建时间 tb_serialport_connstatus.create_time
     * @param createTime 创建时间
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 更新时间 tb_serialport_connstatus.update_time
     * @return 更新时间
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 更新时间 tb_serialport_connstatus.update_time
     * @param updateTime 更新时间
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
        sb.append(", serialportId=").append(serialportId);
        sb.append(", serialportConnstatus=").append(serialportConnstatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}