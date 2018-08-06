package com.yg.omp.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author 
 */
public class Room implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 5418330347824473931L;

    private Integer id;

    private String roomNo;

    private String roomName;

    private Integer floorId;

    private String roomSort;

    private Integer roomShowstatus;

    private Date createTime;

    private Date updateTime;

    /** 
     * 获取 tb_room.id
     * @return tb_room.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_room.id
     * @param id tb_room.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 tb_room.room_no
     * @return tb_room.room_no
     */
    public final String getRoomNo() {
        return roomNo;
    }

    /** 
     * 设置 tb_room.room_no
     * @param roomNo tb_room.room_no
     */
    public final void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
    }

    /** 
     * 获取 tb_room.room_name
     * @return tb_room.room_name
     */
    public final String getRoomName() {
        return roomName;
    }

    /** 
     * 设置 tb_room.room_name
     * @param roomName tb_room.room_name
     */
    public final void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    /** 
     * 获取 tb_room.floor_id
     * @return tb_room.floor_id
     */
    public final Integer getFloorId() {
        return floorId;
    }

    /** 
     * 设置 tb_room.floor_id
     * @param floorId tb_room.floor_id
     */
    public final void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    /** 
     * 获取 tb_room.room_sort
     * @return tb_room.room_sort
     */
    public final String getRoomSort() {
        return roomSort;
    }

    /** 
     * 设置 tb_room.room_sort
     * @param roomSort tb_room.room_sort
     */
    public final void setRoomSort(String roomSort) {
        this.roomSort = roomSort == null ? null : roomSort.trim();
    }

    /** 
     * 获取 tb_room.room_showstatus
     * @return tb_room.room_showstatus
     */
    public final Integer getRoomShowstatus() {
        return roomShowstatus;
    }

    /** 
     * 设置 tb_room.room_showstatus
     * @param roomShowstatus tb_room.room_showstatus
     */
    public final void setRoomShowstatus(Integer roomShowstatus) {
        this.roomShowstatus = roomShowstatus;
    }

    /** 
     * 获取 tb_room.create_time
     * @return tb_room.create_time
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 tb_room.create_time
     * @param createTime tb_room.create_time
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 tb_room.update_time
     * @return tb_room.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 tb_room.update_time
     * @param updateTime tb_room.update_time
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
        sb.append(", roomNo=").append(roomNo);
        sb.append(", roomName=").append(roomName);
        sb.append(", floorId=").append(floorId);
        sb.append(", roomSort=").append(roomSort);
        sb.append(", roomShowstatus=").append(roomShowstatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}