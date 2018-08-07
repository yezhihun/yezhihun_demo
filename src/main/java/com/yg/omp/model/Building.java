package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;

/** 
 * @author 
 */
@Entity(name="tb_building")
public class Building implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 9142804784808249795L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    /**
     * 建筑名称
     * building_name
     */
    @Column(name="building_name")
    private String buildingName;

    /**
     * 编号（非上传数据代码）
     * building_no
     */
    @Column(name="building_no")
    private String buildingNo;

    /**
     * 建筑类型（1-变电所；2-建筑楼层）
     * building_type
     */
    @Column(name="building_type")
    private Integer buildingType;

    /**
     * 建筑排序，用于列表展示排序及下拉框排序
     * building_sort
     */
    @Column(name="building_sort")
    private Integer buildingSort;

    /**
     * 建筑展示状态
     * building_showstatus
     */
    @Column(name="building_showstatus")
    private Integer buildingShowstatus;

    /**
     * 所属区域ID
     * region_id
     */
    @Column(name="region_id")
    private Integer regionId;

    /**
     * 备注信息
     * building_remark
     */
    @Column(name="building_remark")
    private String buildingRemark;

    /** 
     * 获取 tb_building.id
     * @return tb_building.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_building.id
     * @param id tb_building.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 建筑名称 tb_building.building_name
     * @return 建筑名称
     */
    public final String getBuildingName() {
        return buildingName;
    }

    /** 
     * 设置 建筑名称 tb_building.building_name
     * @param buildingName 建筑名称
     */
    public final void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /** 
     * 获取 编号（非上传数据代码） tb_building.building_no
     * @return 编号（非上传数据代码）
     */
    public final String getBuildingNo() {
        return buildingNo;
    }

    /** 
     * 设置 编号（非上传数据代码） tb_building.building_no
     * @param buildingNo 编号（非上传数据代码）
     */
    public final void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    /** 
     * 获取 建筑类型（1-变电所；2-建筑楼层） tb_building.building_type
     * @return 建筑类型（1-变电所；2-建筑楼层）
     */
    public final Integer getBuildingType() {
        return buildingType;
    }

    /** 
     * 设置 建筑类型（1-变电所；2-建筑楼层） tb_building.building_type
     * @param buildingType 建筑类型（1-变电所；2-建筑楼层）
     */
    public final void setBuildingType(Integer buildingType) {
        this.buildingType = buildingType;
    }

    /** 
     * 获取 建筑排序，用于列表展示排序及下拉框排序 tb_building.building_sort
     * @return 建筑排序，用于列表展示排序及下拉框排序
     */
    public final Integer getBuildingSort() {
        return buildingSort;
    }

    /** 
     * 设置 建筑排序，用于列表展示排序及下拉框排序 tb_building.building_sort
     * @param buildingSort 建筑排序，用于列表展示排序及下拉框排序
     */
    public final void setBuildingSort(Integer buildingSort) {
        this.buildingSort = buildingSort;
    }

    /** 
     * 获取 建筑展示状态 tb_building.building_showstatus
     * @return 建筑展示状态
     */
    public final Integer getBuildingShowstatus() {
        return buildingShowstatus;
    }

    /** 
     * 设置 建筑展示状态 tb_building.building_showstatus
     * @param buildingShowstatus 建筑展示状态
     */
    public final void setBuildingShowstatus(Integer buildingShowstatus) {
        this.buildingShowstatus = buildingShowstatus;
    }

    /** 
     * 获取 所属区域ID tb_building.region_id
     * @return 所属区域ID
     */
    public final Integer getRegionId() {
        return regionId;
    }

    /** 
     * 设置 所属区域ID tb_building.region_id
     * @param regionId 所属区域ID
     */
    public final void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    /** 
     * 获取 备注信息 tb_building.building_remark
     * @return 备注信息
     */
    public final String getBuildingRemark() {
        return buildingRemark;
    }

    /** 
     * 设置 备注信息 tb_building.building_remark
     * @param buildingRemark 备注信息
     */
    public final void setBuildingRemark(String buildingRemark) {
        this.buildingRemark = buildingRemark == null ? null : buildingRemark.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", buildingName=").append(buildingName);
        sb.append(", buildingNo=").append(buildingNo);
        sb.append(", buildingType=").append(buildingType);
        sb.append(", buildingSort=").append(buildingSort);
        sb.append(", buildingShowstatus=").append(buildingShowstatus);
        sb.append(", regionId=").append(regionId);
        sb.append(", buildingRemark=").append(buildingRemark);
        sb.append("]");
        return sb.toString();
    }
}