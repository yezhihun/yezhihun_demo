package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author
 */
@Entity
@Table(name = "tb_prepayment_log")
public class PrepaymentLog implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 6171634794571917257L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "task_id")
    private Integer taskId;

    @Column(name = "log_Description")
    private String logDescription;

    /**
     * 获取 tb_prepayment_log.id
     *
     * @return tb_prepayment_log.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_prepayment_log.id
     *
     * @param id tb_prepayment_log.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 tb_prepayment_log.task_id
     *
     * @return tb_prepayment_log.task_id
     */
    public final Integer getTaskId() {
        return taskId;
    }

    /**
     * 设置 tb_prepayment_log.task_id
     *
     * @param taskId tb_prepayment_log.task_id
     */
    public final void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取 tb_prepayment_log.log_Description
     *
     * @return tb_prepayment_log.log_Description
     */
    public final String getLogDescription() {
        return logDescription;
    }

    /**
     * 设置 tb_prepayment_log.log_Description
     *
     * @param logDescription tb_prepayment_log.log_Description
     */
    public final void setLog_Description(String logDescription) {
        this.logDescription = logDescription == null ? null : logDescription.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", taskId=").append(taskId);
        sb.append(", log_Description=").append(logDescription);
        sb.append("]");
        return sb.toString();
    }
}