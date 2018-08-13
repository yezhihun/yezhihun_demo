package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author
 */
@Entity
@Table(name = "tb_meter_date_cmd")
public class MeterDateCmd implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 6719540229503677403L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "cmd_step")
    private String cmdStep;

    @Column(name = "cmd_meter_addr")
    private Integer cmdMeterAddr;

    /**
     * 指令内容
     * cmd_point_type
     */
    @Column(name = "cmd_point_type")
    private Integer cmdPointType;

    @Column(name = "cmd_startaddr_high")
    private Integer cmdStartaddrHigh;

    @Column(name = "cmd_startaddr_low")
    private Integer cmdStartaddrLow;

    @Column(name = "cmdLength_high")
    private Integer cmdLengthHigh;

    @Column(name = "cmdLength_low")
    private Integer cmdLengthLow;

    @Column(name = "meter_model_id")
    private Integer meterModelId;

    /**
     * 获取 tb_meter_date_cmd.id
     *
     * @return tb_meter_date_cmd.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_meter_date_cmd.id
     *
     * @param id tb_meter_date_cmd.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_meter_date_cmd.cmd_step
     *
     * @return tb_meter_date_cmd.cmd_step
     */
    public final String getCmdStep() {
        return cmdStep;
    }

    /**
     * 设置 tb_meter_date_cmd.cmd_step
     *
     * @param cmdStep tb_meter_date_cmd.cmd_step
     */
    public final void setCmdStep(String cmdStep) {
        this.cmdStep = cmdStep == null ? null : cmdStep.trim();
    }

    /**
     * 获取 tb_meter_date_cmd.cmd_meter_addr
     *
     * @return tb_meter_date_cmd.cmd_meter_addr
     */
    public final Integer getCmdMeterAddr() {
        return cmdMeterAddr;
    }

    /**
     * 设置 tb_meter_date_cmd.cmd_meter_addr
     *
     * @param cmdMeterAddr tb_meter_date_cmd.cmd_meter_addr
     */
    public final void setCmdMeterAddr(Integer cmdMeterAddr) {
        this.cmdMeterAddr = cmdMeterAddr;
    }

    /**
     * 获取 指令内容 tb_meter_date_cmd.cmd_point_type
     *
     * @return 指令内容
     */
    public final Integer getCmdPointType() {
        return cmdPointType;
    }

    /**
     * 设置 指令内容 tb_meter_date_cmd.cmd_point_type
     *
     * @param cmdPointType 指令内容
     */
    public final void setCmdPointType(Integer cmdPointType) {
        this.cmdPointType = cmdPointType;
    }

    /**
     * 获取 tb_meter_date_cmd.cmd_startaddr_high
     *
     * @return tb_meter_date_cmd.cmd_startaddr_high
     */
    public final Integer getCmdStartaddrHigh() {
        return cmdStartaddrHigh;
    }

    /**
     * 设置 tb_meter_date_cmd.cmd_startaddr_high
     *
     * @param cmdStartaddrHigh tb_meter_date_cmd.cmd_startaddr_high
     */
    public final void setCmdStartaddrHigh(Integer cmdStartaddrHigh) {
        this.cmdStartaddrHigh = cmdStartaddrHigh;
    }

    /**
     * 获取 tb_meter_date_cmd.cmd_startaddr_low
     *
     * @return tb_meter_date_cmd.cmd_startaddr_low
     */
    public final Integer getCmdStartaddrLow() {
        return cmdStartaddrLow;
    }

    /**
     * 设置 tb_meter_date_cmd.cmd_startaddr_low
     *
     * @param cmdStartaddrLow tb_meter_date_cmd.cmd_startaddr_low
     */
    public final void setCmdStartaddrLow(Integer cmdStartaddrLow) {
        this.cmdStartaddrLow = cmdStartaddrLow;
    }

    /**
     * 获取 tb_meter_date_cmd.cmd_length_high
     *
     * @return tb_meter_date_cmd.cmd_length_high
     */
    public final Integer getCmdLengthHigh() {
        return cmdLengthHigh;
    }

    /**
     * 设置 tb_meter_date_cmd.cmd_length_high
     *
     * @param cmdLengthHigh tb_meter_date_cmd.cmd_length_high
     */
    public final void setCmdLengthHigh(Integer cmdLengthHigh) {
        this.cmdLengthHigh = cmdLengthHigh;
    }

    /**
     * 获取 tb_meter_date_cmd.cmd_length_low
     *
     * @return tb_meter_date_cmd.cmd_length_low
     */
    public final Integer getCmdLengthLow() {
        return cmdLengthLow;
    }

    /**
     * 设置 tb_meter_date_cmd.cmd_length_low
     *
     * @param cmdLengthLow tb_meter_date_cmd.cmd_length_low
     */
    public final void setCmdLengthLow(Integer cmdLengthLow) {
        this.cmdLengthLow = cmdLengthLow;
    }

    /**
     * 获取 tb_meter_date_cmd.meter_model_id
     *
     * @return tb_meter_date_cmd.meter_model_id
     */
    public final Integer getMeterModelId() {
        return meterModelId;
    }

    /**
     * 设置 tb_meter_date_cmd.meter_model_id
     *
     * @param meterModelId tb_meter_date_cmd.meter_model_id
     */
    public final void setMeterModelId(Integer meterModelId) {
        this.meterModelId = meterModelId;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", cmdStep=").append(cmdStep);
        sb.append(", cmdMeterAddr=").append(cmdMeterAddr);
        sb.append(", cmdPointType=").append(cmdPointType);
        sb.append(", cmdStartaddrHigh=").append(cmdStartaddrHigh);
        sb.append(", cmdStartaddrLow=").append(cmdStartaddrLow);
        sb.append(", cmdLengthHigh=").append(cmdLengthHigh);
        sb.append(", cmdLengthLow=").append(cmdLengthLow);
        sb.append(", meterModelId=").append(meterModelId);
        sb.append("]");
        return sb.toString();
    }
}