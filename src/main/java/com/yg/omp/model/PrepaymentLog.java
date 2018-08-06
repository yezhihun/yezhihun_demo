package com.yg.omp.model;

import java.io.Serializable;

/** 
 * @author 
 */
public class PrepaymentLog implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 6171634794571917257L;

    private Integer id;

    private Integer taskId;

    private String log_Description;

    /** 
     * 获取 tb_prepayment_log.id
     * @return tb_prepayment_log.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_prepayment_log.id
     * @param id tb_prepayment_log.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 tb_prepayment_log.task_id
     * @return tb_prepayment_log.task_id
     */
    public final Integer getTaskId() {
        return taskId;
    }

    /** 
     * 设置 tb_prepayment_log.task_id
     * @param taskId tb_prepayment_log.task_id
     */
    public final void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /** 
     * 获取 tb_prepayment_log.log_Description
     * @return tb_prepayment_log.log_Description
     */
    public final String getLog_Description() {
        return log_Description;
    }

    /** 
     * 设置 tb_prepayment_log.log_Description
     * @param log_Description tb_prepayment_log.log_Description
     */
    public final void setLog_Description(String log_Description) {
        this.log_Description = log_Description == null ? null : log_Description.trim();
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
        sb.append(", log_Description=").append(log_Description);
        sb.append("]");
        return sb.toString();
    }
}