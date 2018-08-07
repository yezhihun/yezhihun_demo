package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity(name = "tb_meter_connstatus")
public class MeterConnStatus implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -7143138394987426119L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "meter_id")
    private Integer meterId;

    @Column(name = "meter_no")
    private String meterNo;

    /**
     * 当前状态
     * meter_connstatus
     */
    @Column(name = "meter_connstatus")
    private Integer meterConnstatus;

    /**
     * 用于判断仪表网络状态(1-网络正常，2-网络断开)
     * meter_net_status
     */
    @Column(name = "meter_net_status")
    private Integer meterNetStatus;

    /**
     * 创建时间
     * create_time
     * 默认：CURRENT_TIMESTAMP
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     * update_time
     * 默认：CURRENT_TIMESTAMP
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取 tb_meter_connstatus.id
     *
     * @return tb_meter_connstatus.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_meter_connstatus.id
     *
     * @param id tb_meter_connstatus.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_meter_connstatus.meter_id
     *
     * @return tb_meter_connstatus.meter_id
     */
    public final Integer getMeterId() {
        return meterId;
    }

    /**
     * 设置 tb_meter_connstatus.meter_id
     *
     * @param meterId tb_meter_connstatus.meter_id
     */
    public final void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    /**
     * 获取 tb_meter_connstatus.meter_no
     *
     * @return tb_meter_connstatus.meter_no
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置 tb_meter_connstatus.meter_no
     *
     * @param meterNo tb_meter_connstatus.meter_no
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取 当前状态 tb_meter_connstatus.meter_connstatus
     *
     * @return 当前状态
     */
    public final Integer getMeterConnstatus() {
        return meterConnstatus;
    }

    /**
     * 设置 当前状态 tb_meter_connstatus.meter_connstatus
     *
     * @param meterConnstatus 当前状态
     */
    public final void setMeterConnstatus(Integer meterConnstatus) {
        this.meterConnstatus = meterConnstatus;
    }

    /**
     * 获取 用于判断仪表网络状态(1-网络正常，2-网络断开) tb_meter_connstatus.meter_net_status
     *
     * @return 用于判断仪表网络状态(1-网络正常，2-网络断开)
     */
    public final Integer getMeterNetStatus() {
        return meterNetStatus;
    }

    /**
     * 设置 用于判断仪表网络状态(1-网络正常，2-网络断开) tb_meter_connstatus.meter_net_status
     *
     * @param meterNetStatus 用于判断仪表网络状态(1-网络正常，2-网络断开)
     */
    public final void setMeterNetStatus(Integer meterNetStatus) {
        this.meterNetStatus = meterNetStatus;
    }

    /**
     * 获取 创建时间 tb_meter_connstatus.create_time
     *
     * @return 创建时间
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 tb_meter_connstatus.create_time
     *
     * @param createTime 创建时间
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 tb_meter_connstatus.update_time
     *
     * @return 更新时间
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 tb_meter_connstatus.update_time
     *
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
        sb.append(", meterId=").append(meterId);
        sb.append(", meterNo=").append(meterNo);
        sb.append(", meterConnstatus=").append(meterConnstatus);
        sb.append(", meterNetStatus=").append(meterNetStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}