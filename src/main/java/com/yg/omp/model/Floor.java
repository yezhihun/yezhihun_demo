package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity(name = "tb_floor")
public class Floor implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -3503347643331735462L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "floor_name")
    private String floorName;

    @Column(name = "floor_sort")
    private Integer floorSort;

    @Column(name = "build_id")
    private Integer buildId;

    @Column(name = "floor_show_status")
    private Integer floorShowStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取 tb_floor.id
     *
     * @return tb_floor.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_floor.id
     *
     * @param id tb_floor.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_floor.floor_name
     *
     * @return tb_floor.floor_name
     */
    public final String getFloorName() {
        return floorName;
    }

    /**
     * 设置 tb_floor.floor_name
     *
     * @param floorName tb_floor.floor_name
     */
    public final void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    /**
     * 获取 tb_floor.floor_sort
     *
     * @return tb_floor.floor_sort
     */
    public final Integer getFloorSort() {
        return floorSort;
    }

    /**
     * 设置 tb_floor.floor_sort
     *
     * @param floorSort tb_floor.floor_sort
     */
    public final void setFloorSort(Integer floorSort) {
        this.floorSort = floorSort;
    }

    /**
     * 获取 tb_floor.build_id
     *
     * @return tb_floor.build_id
     */
    public final Integer getBuildId() {
        return buildId;
    }

    /**
     * 设置 tb_floor.build_id
     *
     * @param buildId tb_floor.build_id
     */
    public final void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    /**
     * 获取 tb_floor.floor_show_status
     *
     * @return tb_floor.floor_show_status
     */
    public final Integer getFloorShowStatus() {
        return floorShowStatus;
    }

    /**
     * 设置 tb_floor.floor_show_status
     *
     * @param floorShowStatus tb_floor.floor_show_status
     */
    public final void setFloorShowStatus(Integer floorShowStatus) {
        this.floorShowStatus = floorShowStatus;
    }

    /**
     * 获取 tb_floor.create_time
     *
     * @return tb_floor.create_time
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 tb_floor.create_time
     *
     * @param createTime tb_floor.create_time
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 tb_floor.update_time
     *
     * @return tb_floor.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 tb_floor.update_time
     *
     * @param updateTime tb_floor.update_time
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
        sb.append(", floorName=").append(floorName);
        sb.append(", floorSort=").append(floorSort);
        sb.append(", buildId=").append(buildId);
        sb.append(", floorShowStatus=").append(floorShowStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}