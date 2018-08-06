package com.yg.omp.model;

import java.io.Serializable;

/** 
 * @author 
 */
public class MeterDateAnalysis implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -7631482467743374636L;

    private Integer id;

    private Integer meterDateCmdId;

    private String dateName;

    private Integer arrayIndexes01;

    private Integer arrayIndexes02;

    private Integer arrayIndexes03;

    private Integer arrayIndexes04;

    private Float variableRatio01;

    private Float variableRatio02;

    private Float otherRatio01;

    private Float otherRatio02;

    /** 
     * 获取 tb_meter_date_analysis.id
     * @return tb_meter_date_analysis.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_meter_date_analysis.id
     * @param id tb_meter_date_analysis.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 tb_meter_date_analysis.meter_date_cmd_id
     * @return tb_meter_date_analysis.meter_date_cmd_id
     */
    public final Integer getMeterDateCmdId() {
        return meterDateCmdId;
    }

    /** 
     * 设置 tb_meter_date_analysis.meter_date_cmd_id
     * @param meterDateCmdId tb_meter_date_analysis.meter_date_cmd_id
     */
    public final void setMeterDateCmdId(Integer meterDateCmdId) {
        this.meterDateCmdId = meterDateCmdId;
    }

    /** 
     * 获取 tb_meter_date_analysis.date_name
     * @return tb_meter_date_analysis.date_name
     */
    public final String getDateName() {
        return dateName;
    }

    /** 
     * 设置 tb_meter_date_analysis.date_name
     * @param dateName tb_meter_date_analysis.date_name
     */
    public final void setDateName(String dateName) {
        this.dateName = dateName == null ? null : dateName.trim();
    }

    /** 
     * 获取 tb_meter_date_analysis.array_indexes_01
     * @return tb_meter_date_analysis.array_indexes_01
     */
    public final Integer getArrayIndexes01() {
        return arrayIndexes01;
    }

    /** 
     * 设置 tb_meter_date_analysis.array_indexes_01
     * @param arrayIndexes01 tb_meter_date_analysis.array_indexes_01
     */
    public final void setArrayIndexes01(Integer arrayIndexes01) {
        this.arrayIndexes01 = arrayIndexes01;
    }

    /** 
     * 获取 tb_meter_date_analysis.array_indexes_02
     * @return tb_meter_date_analysis.array_indexes_02
     */
    public final Integer getArrayIndexes02() {
        return arrayIndexes02;
    }

    /** 
     * 设置 tb_meter_date_analysis.array_indexes_02
     * @param arrayIndexes02 tb_meter_date_analysis.array_indexes_02
     */
    public final void setArrayIndexes02(Integer arrayIndexes02) {
        this.arrayIndexes02 = arrayIndexes02;
    }

    /** 
     * 获取 tb_meter_date_analysis.array_indexes_03
     * @return tb_meter_date_analysis.array_indexes_03
     */
    public final Integer getArrayIndexes03() {
        return arrayIndexes03;
    }

    /** 
     * 设置 tb_meter_date_analysis.array_indexes_03
     * @param arrayIndexes03 tb_meter_date_analysis.array_indexes_03
     */
    public final void setArrayIndexes03(Integer arrayIndexes03) {
        this.arrayIndexes03 = arrayIndexes03;
    }

    /** 
     * 获取 tb_meter_date_analysis.array_indexes_04
     * @return tb_meter_date_analysis.array_indexes_04
     */
    public final Integer getArrayIndexes04() {
        return arrayIndexes04;
    }

    /** 
     * 设置 tb_meter_date_analysis.array_indexes_04
     * @param arrayIndexes04 tb_meter_date_analysis.array_indexes_04
     */
    public final void setArrayIndexes04(Integer arrayIndexes04) {
        this.arrayIndexes04 = arrayIndexes04;
    }

    /** 
     * 获取 tb_meter_date_analysis.variable_ratio_01
     * @return tb_meter_date_analysis.variable_ratio_01
     */
    public final Float getVariableRatio01() {
        return variableRatio01;
    }

    /** 
     * 设置 tb_meter_date_analysis.variable_ratio_01
     * @param variableRatio01 tb_meter_date_analysis.variable_ratio_01
     */
    public final void setVariableRatio01(Float variableRatio01) {
        this.variableRatio01 = variableRatio01;
    }

    /** 
     * 获取 tb_meter_date_analysis.variable_ratio_02
     * @return tb_meter_date_analysis.variable_ratio_02
     */
    public final Float getVariableRatio02() {
        return variableRatio02;
    }

    /** 
     * 设置 tb_meter_date_analysis.variable_ratio_02
     * @param variableRatio02 tb_meter_date_analysis.variable_ratio_02
     */
    public final void setVariableRatio02(Float variableRatio02) {
        this.variableRatio02 = variableRatio02;
    }

    /** 
     * 获取 tb_meter_date_analysis.other_ratio_01
     * @return tb_meter_date_analysis.other_ratio_01
     */
    public final Float getOtherRatio01() {
        return otherRatio01;
    }

    /** 
     * 设置 tb_meter_date_analysis.other_ratio_01
     * @param otherRatio01 tb_meter_date_analysis.other_ratio_01
     */
    public final void setOtherRatio01(Float otherRatio01) {
        this.otherRatio01 = otherRatio01;
    }

    /** 
     * 获取 tb_meter_date_analysis.other_ratio_02
     * @return tb_meter_date_analysis.other_ratio_02
     */
    public final Float getOtherRatio02() {
        return otherRatio02;
    }

    /** 
     * 设置 tb_meter_date_analysis.other_ratio_02
     * @param otherRatio02 tb_meter_date_analysis.other_ratio_02
     */
    public final void setOtherRatio02(Float otherRatio02) {
        this.otherRatio02 = otherRatio02;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", meterDateCmdId=").append(meterDateCmdId);
        sb.append(", dateName=").append(dateName);
        sb.append(", arrayIndexes01=").append(arrayIndexes01);
        sb.append(", arrayIndexes02=").append(arrayIndexes02);
        sb.append(", arrayIndexes03=").append(arrayIndexes03);
        sb.append(", arrayIndexes04=").append(arrayIndexes04);
        sb.append(", variableRatio01=").append(variableRatio01);
        sb.append(", variableRatio02=").append(variableRatio02);
        sb.append(", otherRatio01=").append(otherRatio01);
        sb.append(", otherRatio02=").append(otherRatio02);
        sb.append("]");
        return sb.toString();
    }
}