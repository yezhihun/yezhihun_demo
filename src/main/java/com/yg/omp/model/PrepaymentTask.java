package com.yg.omp.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author 
 */
public class PrepaymentTask implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 3384266925832085174L;

    private Integer id;

    /**
     * 预付费所属串口
     * serialport_id
     */
    private Integer serialportId;

    /**
     * 预付费所属仪表编号
     * meter_no
     */
    private String meterNo;

    /**
     * 所属客户ID
     * customer_id
     */
    private Integer customerId;

    /**
     * 充值金额
     * prepayment_value
     */
    private Float prepaymentValue;

    private Integer valueHigh01;

    private Integer valueHigh02;

    private Integer valueLow01;

    private Integer valueLow02;

    /**
     * 任务状态：1-接受充值申请，2-正在执行充值操作，3-充值成功，4-充值失败
     * task_status
     */
    private Integer taskStatus;

    /**
     * 重试次数（重试5次失败后，不再对该任务进行操作）
     * retry_count
     */
    private Integer retryCount;

    private Date createTime;

    private Date updateTime;

    /** 
     * 获取 tb_prepayment_task.id
     * @return tb_prepayment_task.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_prepayment_task.id
     * @param id tb_prepayment_task.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 预付费所属串口 tb_prepayment_task.serialport_id
     * @return 预付费所属串口
     */
    public final Integer getSerialportId() {
        return serialportId;
    }

    /** 
     * 设置 预付费所属串口 tb_prepayment_task.serialport_id
     * @param serialportId 预付费所属串口
     */
    public final void setSerialportId(Integer serialportId) {
        this.serialportId = serialportId;
    }

    /** 
     * 获取 预付费所属仪表编号 tb_prepayment_task.meter_no
     * @return 预付费所属仪表编号
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /** 
     * 设置 预付费所属仪表编号 tb_prepayment_task.meter_no
     * @param meterNo 预付费所属仪表编号
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /** 
     * 获取 所属客户ID tb_prepayment_task.customer_id
     * @return 所属客户ID
     */
    public final Integer getCustomerId() {
        return customerId;
    }

    /** 
     * 设置 所属客户ID tb_prepayment_task.customer_id
     * @param customerId 所属客户ID
     */
    public final void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /** 
     * 获取 充值金额 tb_prepayment_task.prepayment_value
     * @return 充值金额
     */
    public final Float getPrepaymentValue() {
        return prepaymentValue;
    }

    /** 
     * 设置 充值金额 tb_prepayment_task.prepayment_value
     * @param prepaymentValue 充值金额
     */
    public final void setPrepaymentValue(Float prepaymentValue) {
        this.prepaymentValue = prepaymentValue;
    }

    /** 
     * 获取 tb_prepayment_task.value_high_01
     * @return tb_prepayment_task.value_high_01
     */
    public final Integer getValueHigh01() {
        return valueHigh01;
    }

    /** 
     * 设置 tb_prepayment_task.value_high_01
     * @param valueHigh01 tb_prepayment_task.value_high_01
     */
    public final void setValueHigh01(Integer valueHigh01) {
        this.valueHigh01 = valueHigh01;
    }

    /** 
     * 获取 tb_prepayment_task.value_high_02
     * @return tb_prepayment_task.value_high_02
     */
    public final Integer getValueHigh02() {
        return valueHigh02;
    }

    /** 
     * 设置 tb_prepayment_task.value_high_02
     * @param valueHigh02 tb_prepayment_task.value_high_02
     */
    public final void setValueHigh02(Integer valueHigh02) {
        this.valueHigh02 = valueHigh02;
    }

    /** 
     * 获取 tb_prepayment_task.value_low_01
     * @return tb_prepayment_task.value_low_01
     */
    public final Integer getValueLow01() {
        return valueLow01;
    }

    /** 
     * 设置 tb_prepayment_task.value_low_01
     * @param valueLow01 tb_prepayment_task.value_low_01
     */
    public final void setValueLow01(Integer valueLow01) {
        this.valueLow01 = valueLow01;
    }

    /** 
     * 获取 tb_prepayment_task.value_low_02
     * @return tb_prepayment_task.value_low_02
     */
    public final Integer getValueLow02() {
        return valueLow02;
    }

    /** 
     * 设置 tb_prepayment_task.value_low_02
     * @param valueLow02 tb_prepayment_task.value_low_02
     */
    public final void setValueLow02(Integer valueLow02) {
        this.valueLow02 = valueLow02;
    }

    /** 
     * 获取 任务状态：1-接受充值申请，2-正在执行充值操作，3-充值成功，4-充值失败 tb_prepayment_task.task_status
     * @return 任务状态：1-接受充值申请，2-正在执行充值操作，3-充值成功，4-充值失败
     */
    public final Integer getTaskStatus() {
        return taskStatus;
    }

    /** 
     * 设置 任务状态：1-接受充值申请，2-正在执行充值操作，3-充值成功，4-充值失败 tb_prepayment_task.task_status
     * @param taskStatus 任务状态：1-接受充值申请，2-正在执行充值操作，3-充值成功，4-充值失败
     */
    public final void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    /** 
     * 获取 重试次数（重试5次失败后，不再对该任务进行操作） tb_prepayment_task.retry_count
     * @return 重试次数（重试5次失败后，不再对该任务进行操作）
     */
    public final Integer getRetryCount() {
        return retryCount;
    }

    /** 
     * 设置 重试次数（重试5次失败后，不再对该任务进行操作） tb_prepayment_task.retry_count
     * @param retryCount 重试次数（重试5次失败后，不再对该任务进行操作）
     */
    public final void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    /** 
     * 获取 tb_prepayment_task.create_time
     * @return tb_prepayment_task.create_time
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 tb_prepayment_task.create_time
     * @param createTime tb_prepayment_task.create_time
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 tb_prepayment_task.update_time
     * @return tb_prepayment_task.update_time
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 tb_prepayment_task.update_time
     * @param updateTime tb_prepayment_task.update_time
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
        sb.append(", customerId=").append(customerId);
        sb.append(", prepaymentValue=").append(prepaymentValue);
        sb.append(", valueHigh01=").append(valueHigh01);
        sb.append(", valueHigh02=").append(valueHigh02);
        sb.append(", valueLow01=").append(valueLow01);
        sb.append(", valueLow02=").append(valueLow02);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", retryCount=").append(retryCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}