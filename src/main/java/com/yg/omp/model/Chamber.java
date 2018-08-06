package com.yg.omp.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author 
 */
public class Chamber implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 3466668731385960665L;

    private Integer id;

    /**
     * 配电间编号
     * chamber_no
     */
    private Integer chamberNo;

    /**
     * 配电间名称
     * chamber_name
     */
    private String chamberName;

    /**
     * 排序
     * chamber_sort
     */
    private Integer chamberSort;

    private Integer chamberShowstatus;

    private Integer buildingId;

    private Integer floorId;

    private Date createTime;

    private Date updateTime;

    /** 
     * 获取 tb_chamber.id
     * @return tb_chamber.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_chamber.id
     * @param id tb_chamber.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 配电间编号 tb_chamber.chamber_no
     * @return 配电间编号
     */
    public final Integer getChamberNo() {
        return chamberNo;
    }

    /** 
     * 设置 配电间编号 tb_chamber.chamber_no
     * @param chamberNo 配电间编号
     */
    public final void setChamberNo(Integer chamberNo) {
        this.chamberNo = chamberNo;
    }

    /** 
     * 获取 配电间名称 tb_chamber.chamber_name
     * @return 配电间名称
     */
    public final String getChamberName() {
        return chamberName;
    }

    /** 
     * 设置 配电间名称 tb_chamber.chamber_name
     * @param chamberName 配电间名称
     */
    public final void setChamberName(String chamberName) {
        this.chamberName = chamberName == null ? null : chamberName.trim();
    }

    /** 
     * 获取 排序 tb_chamber.chamber_sort
     * @return 排序
     */
    public final Integer getChamberSort() {
        return chamberSort;
    }

    /** 
     * 设置 排序 tb_chamber.chamber_sort
     * @param chamberSort 排序
     */
    public final void setChamberSort(Integer chamberSort) {
        this.chamberSort = chamberSort;
    }

    /** 
     * 获取 tb_chamber.chamber_showstatus
     * @return tb_chamber.chamber_showstatus
     */
    public final Integer getChamberShowstatus() {
        return chamberShowstatus;
    }

    /** 
     * 设置 tb_chamber.chamber_showstatus
     * @param chamberShowstatus tb_chamber.chamber_showstatus
     */
    public final void setChamberShowstatus(Integer chamberShowstatus) {
        this.chamberShowstatus = chamberShowstatus;
    }

    /** 
     * 获取 tb_chamber.building_id
     * @return tb_chamber.building_id
     */
    public final Integer getBuildingId() {
        return buildingId;
    }

    /** 
     * 设置 tb_chamber.building_id
     * @param buildingId tb_chamber.building_id
     */
    public final void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /** 
     * 获取 tb_chamber.floor_id
     * @return tb_chamber.floor_id
     */
    public final Integer getFloorId() {
        return floorId;
    }

    /** 
     * 设置 tb_chamber.floor_id
     * @param floorId tb_chamber.floor_id
     */
    public final void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    /** 
     * 获取 tb_chamber.create_time
     * @return tb_chamber.create_time
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 tb_chamber.create_time
     * @param createTime tb_chamber.create_time
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 tb_chamber.update_time
     * @return tb_chamber.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 tb_chamber.update_time
     * @param updateTime tb_chamber.update_time
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
        sb.append(", chamberNo=").append(chamberNo);
        sb.append(", chamberName=").append(chamberName);
        sb.append(", chamberSort=").append(chamberSort);
        sb.append(", chamberShowstatus=").append(chamberShowstatus);
        sb.append(", buildingId=").append(buildingId);
        sb.append(", floorId=").append(floorId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}