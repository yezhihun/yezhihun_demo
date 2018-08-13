package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author
 */
@Entity
@Table(name = "tb_region")
public class Region implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -612474902882125605L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    /**
     * 区域名称
     * region_name
     */
    @Column(name = "region_name")
    private String regionName;

    /**
     * 区域编号
     * region_no
     */
    @Column(name = "region_no")
    private String regionNo;

    /**
     * 排序
     * region_sort
     */
    @Column(name = "region_sort")
    private Integer regionSort;

    @Column(name = "region_showstatus")
    private Integer regionShowstatus;

    /**
     * 备注信息
     * region_remark
     */
    @Column(name = "region_remark")
    private String regionRemark;

    /**
     * 获取 tb_region.id
     *
     * @return tb_region.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_region.id
     *
     * @param id tb_region.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 区域名称 tb_region.region_name
     *
     * @return 区域名称
     */
    public final String getRegionName() {
        return regionName;
    }

    /**
     * 设置 区域名称 tb_region.region_name
     *
     * @param regionName 区域名称
     */
    public final void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * 获取 区域编号 tb_region.region_no
     *
     * @return 区域编号
     */
    public final String getRegionNo() {
        return regionNo;
    }

    /**
     * 设置 区域编号 tb_region.region_no
     *
     * @param regionNo 区域编号
     */
    public final void setRegionNo(String regionNo) {
        this.regionNo = regionNo == null ? null : regionNo.trim();
    }

    /**
     * 获取 排序 tb_region.region_sort
     *
     * @return 排序
     */
    public final Integer getRegionSort() {
        return regionSort;
    }

    /**
     * 设置 排序 tb_region.region_sort
     *
     * @param regionSort 排序
     */
    public final void setRegionSort(Integer regionSort) {
        this.regionSort = regionSort;
    }

    /**
     * 获取 tb_region.region_showstatus
     *
     * @return tb_region.region_showstatus
     */
    public final Integer getRegionShowstatus() {
        return regionShowstatus;
    }

    /**
     * 设置 tb_region.region_showstatus
     *
     * @param regionShowstatus tb_region.region_showstatus
     */
    public final void setRegionShowstatus(Integer regionShowstatus) {
        this.regionShowstatus = regionShowstatus;
    }

    /**
     * 获取 备注信息 tb_region.region_remark
     *
     * @return 备注信息
     */
    public final String getRegionRemark() {
        return regionRemark;
    }

    /**
     * 设置 备注信息 tb_region.region_remark
     *
     * @param regionRemark 备注信息
     */
    public final void setRegionRemark(String regionRemark) {
        this.regionRemark = regionRemark == null ? null : regionRemark.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", regionName=").append(regionName);
        sb.append(", regionNo=").append(regionNo);
        sb.append(", regionSort=").append(regionSort);
        sb.append(", regionShowstatus=").append(regionShowstatus);
        sb.append(", regionRemark=").append(regionRemark);
        sb.append("]");
        return sb.toString();
    }
}