package com.yg.omp.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author 
 */
public class PrepaymentRecord implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 3082228696548872201L;

    private Integer id;

    private Integer serialportId;

    private Integer meterNo;

    private Float prepaymentValue;

    /**
     * 充值结果-1充值成功，2充值失败
     * prepayment_result
     */
    private Integer prepaymentResult;

    private Date createTime;

    private Date updateTime;

    /** 
     * 获取 tb_prepayment_record.id
     * @return tb_prepayment_record.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_prepayment_record.id
     * @param id tb_prepayment_record.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 tb_prepayment_record.serialport_id
     * @return tb_prepayment_record.serialport_id
     */
    public final Integer getSerialportId() {
        return serialportId;
    }

    /** 
     * 设置 tb_prepayment_record.serialport_id
     * @param serialportId tb_prepayment_record.serialport_id
     */
    public final void setSerialportId(Integer serialportId) {
        this.serialportId = serialportId;
    }

    /** 
     * 获取 tb_prepayment_record.meter_no
     * @return tb_prepayment_record.meter_no
     */
    public final Integer getMeterNo() {
        return meterNo;
    }

    /** 
     * 设置 tb_prepayment_record.meter_no
     * @param meterNo tb_prepayment_record.meter_no
     */
    public final void setMeterNo(Integer meterNo) {
        this.meterNo = meterNo;
    }

    /** 
     * 获取 tb_prepayment_record.prepayment_value
     * @return tb_prepayment_record.prepayment_value
     */
    public final Float getPrepaymentValue() {
        return prepaymentValue;
    }

    /** 
     * 设置 tb_prepayment_record.prepayment_value
     * @param prepaymentValue tb_prepayment_record.prepayment_value
     */
    public final void setPrepaymentValue(Float prepaymentValue) {
        this.prepaymentValue = prepaymentValue;
    }

    /** 
     * 获取 充值结果-1充值成功，2充值失败 tb_prepayment_record.prepayment_result
     * @return 充值结果-1充值成功，2充值失败
     */
    public final Integer getPrepaymentResult() {
        return prepaymentResult;
    }

    /** 
     * 设置 充值结果-1充值成功，2充值失败 tb_prepayment_record.prepayment_result
     * @param prepaymentResult 充值结果-1充值成功，2充值失败
     */
    public final void setPrepaymentResult(Integer prepaymentResult) {
        this.prepaymentResult = prepaymentResult;
    }

    /** 
     * 获取 tb_prepayment_record.create_time
     * @return tb_prepayment_record.create_time
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 tb_prepayment_record.create_time
     * @param createTime tb_prepayment_record.create_time
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 tb_prepayment_record.update_time
     * @return tb_prepayment_record.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 tb_prepayment_record.update_time
     * @param updateTime tb_prepayment_record.update_time
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
        sb.append(", serialportId=").append(serialportId);
        sb.append(", meterNo=").append(meterNo);
        sb.append(", prepaymentValue=").append(prepaymentValue);
        sb.append(", prepaymentResult=").append(prepaymentResult);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}