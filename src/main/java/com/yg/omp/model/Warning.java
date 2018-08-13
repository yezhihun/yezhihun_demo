package com.yg.omp.model;


import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity
@Table(name = "tb_warning")
public class Warning implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -3171071576805981118L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "transformer_name")
    private String transformerName;

    @Column(name = "loop_no")
    private String loopNo;

    @Column(name = "meter_no")
    private String meterNo;

    @Column(name = "meter_addr")
    private String meterAddr;

    @Column(name = "loop_name")
    private String loopName;

    @Column(name = "warning_type")
    private String warningType;

    @Column(name = "warning_status")
    private String warningStatus;

    @Column(name = "warning_description")
    private String warningDescription;

    /**
     * 获取 tb_warning.id
     *
     * @return tb_warning.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_warning.id
     *
     * @param id tb_warning.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_warning.create_time
     *
     * @return tb_warning.create_time
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 tb_warning.create_time
     *
     * @param createTime tb_warning.create_time
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 tb_warning.update_time
     *
     * @return tb_warning.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 tb_warning.update_time
     *
     * @param updateTime tb_warning.update_time
     */
    public final void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 tb_warning.building_name
     *
     * @return tb_warning.building_name
     */
    public final String getBuildingName() {
        return buildingName;
    }

    /**
     * 设置 tb_warning.building_name
     *
     * @param buildingName tb_warning.building_name
     */
    public final void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * 获取 tb_warning.transformer_name
     *
     * @return tb_warning.transformer_name
     */
    public final String getTransformerName() {
        return transformerName;
    }

    /**
     * 设置 tb_warning.transformer_name
     *
     * @param transformerName tb_warning.transformer_name
     */
    public final void setTransformerName(String transformerName) {
        this.transformerName = transformerName == null ? null : transformerName.trim();
    }

    /**
     * 获取 tb_warning.loop_no
     *
     * @return tb_warning.loop_no
     */
    public final String getLoopNo() {
        return loopNo;
    }

    /**
     * 设置 tb_warning.loop_no
     *
     * @param loopNo tb_warning.loop_no
     */
    public final void setLoopNo(String loopNo) {
        this.loopNo = loopNo == null ? null : loopNo.trim();
    }

    /**
     * 获取 tb_warning.meter_no
     *
     * @return tb_warning.meter_no
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置 tb_warning.meter_no
     *
     * @param meterNo tb_warning.meter_no
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取 tb_warning.meter_addr
     *
     * @return tb_warning.meter_addr
     */
    public final String getMeterAddr() {
        return meterAddr;
    }

    /**
     * 设置 tb_warning.meter_addr
     *
     * @param meterAddr tb_warning.meter_addr
     */
    public final void setMeterAddr(String meterAddr) {
        this.meterAddr = meterAddr == null ? null : meterAddr.trim();
    }

    /**
     * 获取 tb_warning.loop_name
     *
     * @return tb_warning.loop_name
     */
    public final String getLoopName() {
        return loopName;
    }

    /**
     * 设置 tb_warning.loop_name
     *
     * @param loopName tb_warning.loop_name
     */
    public final void setLoopName(String loopName) {
        this.loopName = loopName == null ? null : loopName.trim();
    }

    /**
     * 获取 tb_warning.warning_type
     *
     * @return tb_warning.warning_type
     */
    public final String getWarningType() {
        return warningType;
    }

    /**
     * 设置 tb_warning.warning_type
     *
     * @param warningType tb_warning.warning_type
     */
    public final void setWarningType(String warningType) {
        this.warningType = warningType == null ? null : warningType.trim();
    }

    /**
     * 获取 tb_warning.warning_status
     *
     * @return tb_warning.warning_status
     */
    public final String getWarningStatus() {
        return warningStatus;
    }

    /**
     * 设置 tb_warning.warning_status
     *
     * @param warningStatus tb_warning.warning_status
     */
    public final void setWarningStatus(String warningStatus) {
        this.warningStatus = warningStatus == null ? null : warningStatus.trim();
    }

    /**
     * 获取 tb_warning.warning_description
     *
     * @return tb_warning.warning_description
     */
    public final String getWarningDescription() {
        return warningDescription;
    }

    /**
     * 设置 tb_warning.warning_description
     *
     * @param warningDescription tb_warning.warning_description
     */
    public final void setWarningDescription(String warningDescription) {
        this.warningDescription = warningDescription == null ? null : warningDescription.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", buildingName=").append(buildingName);
        sb.append(", transformerName=").append(transformerName);
        sb.append(", loopNo=").append(loopNo);
        sb.append(", meterNo=").append(meterNo);
        sb.append(", meterAddr=").append(meterAddr);
        sb.append(", loopName=").append(loopName);
        sb.append(", warningType=").append(warningType);
        sb.append(", warningStatus=").append(warningStatus);
        sb.append(", warningDescription=").append(warningDescription);
        sb.append("]");
        return sb.toString();
    }
}