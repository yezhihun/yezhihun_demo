package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author
 */
@Entity(name = "tb_msg_record")
public class MsgRecord implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -3632208150135724688L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "serialport_id")
    private Integer serialportId;

    @Column(name = "meter_no")
    private String meterNo;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_mobile")
    private String customerMobile;

    @Column(name = "msg_content")
    private String msgContent;

    @Column(name = "msg_status")
    private Integer msgStatus;

    /**
     * 获取 tb_msg_record.id
     *
     * @return tb_msg_record.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_msg_record.id
     *
     * @param id tb_msg_record.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_msg_record.serialport_id
     *
     * @return tb_msg_record.serialport_id
     */
    public final Integer getSerialportId() {
        return serialportId;
    }

    /**
     * 设置 tb_msg_record.serialport_id
     *
     * @param serialportId tb_msg_record.serialport_id
     */
    public final void setSerialportId(Integer serialportId) {
        this.serialportId = serialportId;
    }

    /**
     * 获取 tb_msg_record.meter_no
     *
     * @return tb_msg_record.meter_no
     */
    public final String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置 tb_msg_record.meter_no
     *
     * @param meterNo tb_msg_record.meter_no
     */
    public final void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取 tb_msg_record.customer_id
     *
     * @return tb_msg_record.customer_id
     */
    public final Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置 tb_msg_record.customer_id
     *
     * @param customerId tb_msg_record.customer_id
     */
    public final void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取 tb_msg_record.customer_mobile
     *
     * @return tb_msg_record.customer_mobile
     */
    public final String getCustomerMobile() {
        return customerMobile;
    }

    /**
     * 设置 tb_msg_record.customer_mobile
     *
     * @param customerMobile tb_msg_record.customer_mobile
     */
    public final void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }

    /**
     * 获取 tb_msg_record.msg_content
     *
     * @return tb_msg_record.msg_content
     */
    public final String getMsgContent() {
        return msgContent;
    }

    /**
     * 设置 tb_msg_record.msg_content
     *
     * @param msgContent tb_msg_record.msg_content
     */
    public final void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    /**
     * 获取 tb_msg_record.msg_status
     *
     * @return tb_msg_record.msg_status
     */
    public final Integer getMsgStatus() {
        return msgStatus;
    }

    /**
     * 设置 tb_msg_record.msg_status
     *
     * @param msgStatus tb_msg_record.msg_status
     */
    public final void setMsgStatus(Integer msgStatus) {
        this.msgStatus = msgStatus;
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
        sb.append(", customerMobile=").append(customerMobile);
        sb.append(", msgContent=").append(msgContent);
        sb.append(", msgStatus=").append(msgStatus);
        sb.append("]");
        return sb.toString();
    }
}