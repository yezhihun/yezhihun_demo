package com.yg.omp.model;

import java.io.Serializable;

/** 
 * @author 
 */
public class Transformer implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -2953431653603784372L;

    private Integer id;

    private String transformerNo;

    private String transformerName;

    private Integer buildingId;

    private Integer transformerSort;

    private Integer transformerShowstatus;

    private String transformerRemark;

    /** 
     * 获取 tb_transformer.id
     * @return tb_transformer.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_transformer.id
     * @param id tb_transformer.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 tb_transformer.transformer_no
     * @return tb_transformer.transformer_no
     */
    public final String getTransformerNo() {
        return transformerNo;
    }

    /** 
     * 设置 tb_transformer.transformer_no
     * @param transformerNo tb_transformer.transformer_no
     */
    public final void setTransformerNo(String transformerNo) {
        this.transformerNo = transformerNo == null ? null : transformerNo.trim();
    }

    /** 
     * 获取 tb_transformer.transformer_name
     * @return tb_transformer.transformer_name
     */
    public final String getTransformerName() {
        return transformerName;
    }

    /** 
     * 设置 tb_transformer.transformer_name
     * @param transformerName tb_transformer.transformer_name
     */
    public final void setTransformerName(String transformerName) {
        this.transformerName = transformerName == null ? null : transformerName.trim();
    }

    /** 
     * 获取 tb_transformer.building_id
     * @return tb_transformer.building_id
     */
    public final Integer getBuildingId() {
        return buildingId;
    }

    /** 
     * 设置 tb_transformer.building_id
     * @param buildingId tb_transformer.building_id
     */
    public final void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /** 
     * 获取 tb_transformer.transformer_sort
     * @return tb_transformer.transformer_sort
     */
    public final Integer getTransformerSort() {
        return transformerSort;
    }

    /** 
     * 设置 tb_transformer.transformer_sort
     * @param transformerSort tb_transformer.transformer_sort
     */
    public final void setTransformerSort(Integer transformerSort) {
        this.transformerSort = transformerSort;
    }

    /** 
     * 获取 tb_transformer.transformer_showstatus
     * @return tb_transformer.transformer_showstatus
     */
    public final Integer getTransformerShowstatus() {
        return transformerShowstatus;
    }

    /** 
     * 设置 tb_transformer.transformer_showstatus
     * @param transformerShowstatus tb_transformer.transformer_showstatus
     */
    public final void setTransformerShowstatus(Integer transformerShowstatus) {
        this.transformerShowstatus = transformerShowstatus;
    }

    /** 
     * 获取 tb_transformer.transformer_remark
     * @return tb_transformer.transformer_remark
     */
    public final String getTransformerRemark() {
        return transformerRemark;
    }

    /** 
     * 设置 tb_transformer.transformer_remark
     * @param transformerRemark tb_transformer.transformer_remark
     */
    public final void setTransformerRemark(String transformerRemark) {
        this.transformerRemark = transformerRemark == null ? null : transformerRemark.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", transformerNo=").append(transformerNo);
        sb.append(", transformerName=").append(transformerName);
        sb.append(", buildingId=").append(buildingId);
        sb.append(", transformerSort=").append(transformerSort);
        sb.append(", transformerShowstatus=").append(transformerShowstatus);
        sb.append(", transformerRemark=").append(transformerRemark);
        sb.append("]");
        return sb.toString();
    }
}