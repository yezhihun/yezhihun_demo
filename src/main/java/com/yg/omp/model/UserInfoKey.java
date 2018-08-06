package com.yg.omp.model;

import java.io.Serializable;

/** 
 * @author 
 */
public class UserInfoKey implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 7634969879732445300L;

    private Integer id;

    /**
     * 用户账号
     * user_name
     */
    private String userName;

    /** 
     * 获取 tb_user_info.id
     * @return tb_user_info.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 tb_user_info.id
     * @param id tb_user_info.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 用户账号 tb_user_info.user_name
     * @return 用户账号
     */
    public final String getUserName() {
        return userName;
    }

    /** 
     * 设置 用户账号 tb_user_info.user_name
     * @param userName 用户账号
     */
    public final void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append("]");
        return sb.toString();
    }
}