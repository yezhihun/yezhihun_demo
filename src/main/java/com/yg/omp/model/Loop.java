package com.yg.omp.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author 
 */
public class Loop implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -7127647881866503968L;

    private Integer id;

    private String loopNo;

    private String loopName;

    /**
     * 回路类型
     * loop_type_id
     */
    private Integer loopTypeId;

    private String loopRemark;

    private Integer loopShowstatus;

    private Integer loopSort;

    private Date loopCreateTime;

    private Date loopUpdateTime;

    /** 
     * 获取 tb_loop.id
     * @return tb_loop.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_loop.id
     * @param id tb_loop.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 tb_loop.loop_no
     * @return tb_loop.loop_no
     */
    public final String getLoopNo() {
        return loopNo;
    }

    /** 
     * 设置 tb_loop.loop_no
     * @param loopNo tb_loop.loop_no
     */
    public final void setLoopNo(String loopNo) {
        this.loopNo = loopNo == null ? null : loopNo.trim();
    }

    /** 
     * 获取 tb_loop.loop_name
     * @return tb_loop.loop_name
     */
    public final String getLoopName() {
        return loopName;
    }

    /** 
     * 设置 tb_loop.loop_name
     * @param loopName tb_loop.loop_name
     */
    public final void setLoopName(String loopName) {
        this.loopName = loopName == null ? null : loopName.trim();
    }

    /** 
     * 获取 回路类型 tb_loop.loop_type_id
     * @return 回路类型
     */
    public final Integer getLoopTypeId() {
        return loopTypeId;
    }

    /** 
     * 设置 回路类型 tb_loop.loop_type_id
     * @param loopTypeId 回路类型
     */
    public final void setLoopTypeId(Integer loopTypeId) {
        this.loopTypeId = loopTypeId;
    }

    /** 
     * 获取 tb_loop.loop_remark
     * @return tb_loop.loop_remark
     */
    public final String getLoopRemark() {
        return loopRemark;
    }

    /** 
     * 设置 tb_loop.loop_remark
     * @param loopRemark tb_loop.loop_remark
     */
    public final void setLoopRemark(String loopRemark) {
        this.loopRemark = loopRemark == null ? null : loopRemark.trim();
    }

    /** 
     * 获取 tb_loop.loop_showstatus
     * @return tb_loop.loop_showstatus
     */
    public final Integer getLoopShowstatus() {
        return loopShowstatus;
    }

    /** 
     * 设置 tb_loop.loop_showstatus
     * @param loopShowstatus tb_loop.loop_showstatus
     */
    public final void setLoopShowstatus(Integer loopShowstatus) {
        this.loopShowstatus = loopShowstatus;
    }

    /** 
     * 获取 tb_loop.loop_sort
     * @return tb_loop.loop_sort
     */
    public final Integer getLoopSort() {
        return loopSort;
    }

    /** 
     * 设置 tb_loop.loop_sort
     * @param loopSort tb_loop.loop_sort
     */
    public final void setLoopSort(Integer loopSort) {
        this.loopSort = loopSort;
    }

    /** 
     * 获取 tb_loop.loop_create_time
     * @return tb_loop.loop_create_time
     */
    public final Date getLoopCreateTime() {
        return loopCreateTime;
    }

    /** 
     * 设置 tb_loop.loop_create_time
     * @param loopCreateTime tb_loop.loop_create_time
     */
    public final void setLoopCreateTime(Date loopCreateTime) {
        this.loopCreateTime = loopCreateTime;
    }

    /** 
     * 获取 tb_loop.loop_update_time
     * @return tb_loop.loop_update_time
     */
    public final Date getLoopUpdateTime() {
        return loopUpdateTime;
    }

    /** 
     * 设置 tb_loop.loop_update_time
     * @param loopUpdateTime tb_loop.loop_update_time
     */
    public final void setLoopUpdateTime(Date loopUpdateTime) {
        this.loopUpdateTime = loopUpdateTime;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", loopNo=").append(loopNo);
        sb.append(", loopName=").append(loopName);
        sb.append(", loopTypeId=").append(loopTypeId);
        sb.append(", loopRemark=").append(loopRemark);
        sb.append(", loopShowstatus=").append(loopShowstatus);
        sb.append(", loopSort=").append(loopSort);
        sb.append(", loopCreateTime=").append(loopCreateTime);
        sb.append(", loopUpdateTime=").append(loopUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}