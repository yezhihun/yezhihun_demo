package com.yg.omp.entity;

public class QrtzTriggersBackup {
    /**
    * ID
    */
    private Integer id;

    /**
    * 调度程序名称
    */
    private String schedName;

    /**
    * 触发器名称
    */
    private String triggerName;

    /**
    * 触发器组
    */
    private String triggerGroup;
    /**
    * 任务名称
    */
    private String jobName;

    /**
    * 任务组
    */
    private String jobGroup;

    /**
    * 任务描述
    */
    private String description;

    /**
    * 执行时间
    */
    private Long fireTime;

    /**
    * 定时任务状态
    */
    private String triggerState;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFireTime() {
        return fireTime;
    }

    public void setFireTime(Long fireTime) {
        this.fireTime = fireTime;
    }

	public String getTriggerState() {
		return triggerState;
	}

	public void setTriggerState(String triggerState) {
		this.triggerState = triggerState;
	}
}