package com.yg.omp.model;

import java.io.Serializable;

/** 
 * @author 
 */
public class UserInfo extends UserInfoKey implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 8969259516371093698L;

    /**
     * 用户密码
     * user_password
     */
    private String userPassword;

    /**
     * 真是姓名
     * user_real_name
     */
    private String userRealName;

    /**
     * 身份证号
     * user_card_no
     */
    private String userCardNo;

    /**
     * 手机号
     * user_mobile
     */
    private String userMobile;

    /**
     * 电话号
     * user_tel
     */
    private String userTel;

    private String userIsShow;

    /**
     * ADMIN（管理员），EMPLOYEE（员工）
     * user_auth
     */
    private String userAuth;

    private String userRemarks;

    /** 
     * 获取 用户密码 tb_user_info.user_password
     * @return 用户密码
     */
    public final String getUserPassword() {
        return userPassword;
    }

    /** 
     * 设置 用户密码 tb_user_info.user_password
     * @param userPassword 用户密码
     */
    public final void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /** 
     * 获取 真是姓名 tb_user_info.user_real_name
     * @return 真是姓名
     */
    public final String getUserRealName() {
        return userRealName;
    }

    /** 
     * 设置 真是姓名 tb_user_info.user_real_name
     * @param userRealName 真是姓名
     */
    public final void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /** 
     * 获取 身份证号 tb_user_info.user_card_no
     * @return 身份证号
     */
    public final String getUserCardNo() {
        return userCardNo;
    }

    /** 
     * 设置 身份证号 tb_user_info.user_card_no
     * @param userCardNo 身份证号
     */
    public final void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo == null ? null : userCardNo.trim();
    }

    /** 
     * 获取 手机号 tb_user_info.user_mobile
     * @return 手机号
     */
    public final String getUserMobile() {
        return userMobile;
    }

    /** 
     * 设置 手机号 tb_user_info.user_mobile
     * @param userMobile 手机号
     */
    public final void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /** 
     * 获取 电话号 tb_user_info.user_tel
     * @return 电话号
     */
    public final String getUserTel() {
        return userTel;
    }

    /** 
     * 设置 电话号 tb_user_info.user_tel
     * @param userTel 电话号
     */
    public final void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    /** 
     * 获取 tb_user_info.user_is_show
     * @return tb_user_info.user_is_show
     */
    public final String getUserIsShow() {
        return userIsShow;
    }

    /** 
     * 设置 tb_user_info.user_is_show
     * @param userIsShow tb_user_info.user_is_show
     */
    public final void setUserIsShow(String userIsShow) {
        this.userIsShow = userIsShow == null ? null : userIsShow.trim();
    }

    /** 
     * 获取 ADMIN（管理员），EMPLOYEE（员工） tb_user_info.user_auth
     * @return ADMIN（管理员），EMPLOYEE（员工）
     */
    public final String getUserAuth() {
        return userAuth;
    }

    /** 
     * 设置 ADMIN（管理员），EMPLOYEE（员工） tb_user_info.user_auth
     * @param userAuth ADMIN（管理员），EMPLOYEE（员工）
     */
    public final void setUserAuth(String userAuth) {
        this.userAuth = userAuth == null ? null : userAuth.trim();
    }

    /** 
     * 获取 tb_user_info.user_remarks
     * @return tb_user_info.user_remarks
     */
    public final String getUserRemarks() {
        return userRemarks;
    }

    /** 
     * 设置 tb_user_info.user_remarks
     * @param userRemarks tb_user_info.user_remarks
     */
    public final void setUserRemarks(String userRemarks) {
        this.userRemarks = userRemarks == null ? null : userRemarks.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", userCardNo=").append(userCardNo);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userTel=").append(userTel);
        sb.append(", userIsShow=").append(userIsShow);
        sb.append(", userAuth=").append(userAuth);
        sb.append(", userRemarks=").append(userRemarks);
        sb.append("]");
        return sb.toString();
    }
}