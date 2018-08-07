package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
@Entity(name = "tb_cabinet")
public class Cabinet implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 3943659757256966282L;

    /**
     * 机柜ID
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "cabinet_no")
    private String cabinetNo;

    @Column(name = "cabinet_name")
    private String cabinetName;

    /**
     * 机柜所在分组的排序
     * cabinet_sort
     */
    @Column(name = "cabinet_sort")
    private Integer cabinetSort;

    @Column(name = "building_id")
    private Integer buildingId;

    @Column(name = "floor_id")
    private Integer floorId;

    /**
     * 所在机柜id
     * room_id
     */
    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "floor_name")
    private String floorName;

    /**
     * 机柜分组（例如变电所中，1排、2排等信息）
     * cabinet_group
     */
    @Column(name = "cabinet_group")
    private String cabinetGroup;

    @Column(name = "cabinet_remark")
    private String cabinetRemark;

    /**
     * 机柜显示状态
     * cabinet_showstatus
     */
    @Column(name = "cabinet_showstatus")
    private Integer cabinetShowstatus;

    @Column(name = "cabinet_create_time")
    private Date cabinetCreateTime;

    @Column(name = "cabinet_update_time")
    private Date cabinetUpdateTime;

    /**
     * 获取 机柜ID tb_cabinet.id
     *
     * @return 机柜ID
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 机柜ID tb_cabinet.id
     *
     * @param id 机柜ID
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_cabinet.cabinet_no
     *
     * @return tb_cabinet.cabinet_no
     */
    public final String getCabinetNo() {
        return cabinetNo;
    }

    /**
     * 设置 tb_cabinet.cabinet_no
     *
     * @param cabinetNo tb_cabinet.cabinet_no
     */
    public final void setCabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo == null ? null : cabinetNo.trim();
    }

    /**
     * 获取 tb_cabinet.cabinet_name
     *
     * @return tb_cabinet.cabinet_name
     */
    public final String getCabinetName() {
        return cabinetName;
    }

    /**
     * 设置 tb_cabinet.cabinet_name
     *
     * @param cabinetName tb_cabinet.cabinet_name
     */
    public final void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName == null ? null : cabinetName.trim();
    }

    /**
     * 获取 机柜所在分组的排序 tb_cabinet.cabinet_sort
     *
     * @return 机柜所在分组的排序
     */
    public final Integer getCabinetSort() {
        return cabinetSort;
    }

    /**
     * 设置 机柜所在分组的排序 tb_cabinet.cabinet_sort
     *
     * @param cabinetSort 机柜所在分组的排序
     */
    public final void setCabinetSort(Integer cabinetSort) {
        this.cabinetSort = cabinetSort;
    }

    /**
     * 获取 tb_cabinet.building_id
     *
     * @return tb_cabinet.building_id
     */
    public final Integer getBuildingId() {
        return buildingId;
    }

    /**
     * 设置 tb_cabinet.building_id
     *
     * @param buildingId tb_cabinet.building_id
     */
    public final void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * 获取 tb_cabinet.floor_id
     *
     * @return tb_cabinet.floor_id
     */
    public final Integer getFloorId() {
        return floorId;
    }

    /**
     * 设置 tb_cabinet.floor_id
     *
     * @param floorId tb_cabinet.floor_id
     */
    public final void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    /**
     * 获取 所在机柜id tb_cabinet.room_id
     *
     * @return 所在机柜id
     */
    public final Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置 所在机柜id tb_cabinet.room_id
     *
     * @param roomId 所在机柜id
     */
    public final void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取 tb_cabinet.floor_name
     *
     * @return tb_cabinet.floor_name
     */
    public final String getFloorName() {
        return floorName;
    }

    /**
     * 设置 tb_cabinet.floor_name
     *
     * @param floorName tb_cabinet.floor_name
     */
    public final void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    /**
     * 获取 机柜分组（例如变电所中，1排、2排等信息） tb_cabinet.cabinet_group
     *
     * @return 机柜分组（例如变电所中，1排、2排等信息）
     */
    public final String getCabinetGroup() {
        return cabinetGroup;
    }

    /**
     * 设置 机柜分组（例如变电所中，1排、2排等信息） tb_cabinet.cabinet_group
     *
     * @param cabinetGroup 机柜分组（例如变电所中，1排、2排等信息）
     */
    public final void setCabinetGroup(String cabinetGroup) {
        this.cabinetGroup = cabinetGroup == null ? null : cabinetGroup.trim();
    }

    /**
     * 获取 tb_cabinet.cabinet_remark
     *
     * @return tb_cabinet.cabinet_remark
     */
    public final String getCabinetRemark() {
        return cabinetRemark;
    }

    /**
     * 设置 tb_cabinet.cabinet_remark
     *
     * @param cabinetRemark tb_cabinet.cabinet_remark
     */
    public final void setCabinetRemark(String cabinetRemark) {
        this.cabinetRemark = cabinetRemark == null ? null : cabinetRemark.trim();
    }

    /**
     * 获取 机柜显示状态 tb_cabinet.cabinet_showstatus
     *
     * @return 机柜显示状态
     */
    public final Integer getCabinetShowstatus() {
        return cabinetShowstatus;
    }

    /**
     * 设置 机柜显示状态 tb_cabinet.cabinet_showstatus
     *
     * @param cabinetShowstatus 机柜显示状态
     */
    public final void setCabinetShowstatus(Integer cabinetShowstatus) {
        this.cabinetShowstatus = cabinetShowstatus;
    }

    /**
     * 获取 tb_cabinet.cabinet_create_time
     *
     * @return tb_cabinet.cabinet_create_time
     */
    public final Date getCabinetCreateTime() {
        return cabinetCreateTime;
    }

    /**
     * 设置 tb_cabinet.cabinet_create_time
     *
     * @param cabinetCreateTime tb_cabinet.cabinet_create_time
     */
    public final void setCabinetCreateTime(Date cabinetCreateTime) {
        this.cabinetCreateTime = cabinetCreateTime;
    }

    /**
     * 获取 tb_cabinet.cabinet_update_time
     *
     * @return tb_cabinet.cabinet_update_time
     */
    public final Date getCabinetUpdateTime() {
        return cabinetUpdateTime;
    }

    /**
     * 设置 tb_cabinet.cabinet_update_time
     *
     * @param cabinetUpdateTime tb_cabinet.cabinet_update_time
     */
    public final void setCabinetUpdateTime(Date cabinetUpdateTime) {
        this.cabinetUpdateTime = cabinetUpdateTime;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", cabinetNo=").append(cabinetNo);
        sb.append(", cabinetName=").append(cabinetName);
        sb.append(", cabinetSort=").append(cabinetSort);
        sb.append(", buildingId=").append(buildingId);
        sb.append(", floorId=").append(floorId);
        sb.append(", roomId=").append(roomId);
        sb.append(", floorName=").append(floorName);
        sb.append(", cabinetGroup=").append(cabinetGroup);
        sb.append(", cabinetRemark=").append(cabinetRemark);
        sb.append(", cabinetShowstatus=").append(cabinetShowstatus);
        sb.append(", cabinetCreateTime=").append(cabinetCreateTime);
        sb.append(", cabinetUpdateTime=").append(cabinetUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}