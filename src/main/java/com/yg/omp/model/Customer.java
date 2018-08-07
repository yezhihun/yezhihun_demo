package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author
 */
@Entity(name = "tb_customer")
public class Customer implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -2823771019854574557L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    /**
     * 客户名
     * customer_name
     */
    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_password")
    private String customerPassword;

    /**
     * 客户手机号
     * customer_mobile
     */
    @Column(name = "customer_mobile")
    private String customerMobile;

    /**
     * 客户座机号
     * customer_tel
     */
    @Column(name = "customer_tel")
    private String customerTel;

    /**
     * 真实姓名
     * customer_real_name
     */
    @Column(name = "customer_real_name")
    private String customerRealName;

    /**
     * 身份证号码
     * customer_card_no
     */
    @Column(name = "customer_card_no")
    private String customerCardNo;

    @Column(name = "customer_showstatus")
    private Integer customerShowstatus;

    /**
     * 获取 tb_customer.id
     *
     * @return tb_customer.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_customer.id
     *
     * @param id tb_customer.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 客户名 tb_customer.customer_name
     *
     * @return 客户名
     */
    public final String getCustomerName() {
        return customerName;
    }

    /**
     * 设置 客户名 tb_customer.customer_name
     *
     * @param customerName 客户名
     */
    public final void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 获取 tb_customer.customer_password
     *
     * @return tb_customer.customer_password
     */
    public final String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * 设置 tb_customer.customer_password
     *
     * @param customerPassword tb_customer.customer_password
     */
    public final void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    /**
     * 获取 客户手机号 tb_customer.customer_mobile
     *
     * @return 客户手机号
     */
    public final String getCustomerMobile() {
        return customerMobile;
    }

    /**
     * 设置 客户手机号 tb_customer.customer_mobile
     *
     * @param customerMobile 客户手机号
     */
    public final void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }

    /**
     * 获取 客户座机号 tb_customer.customer_tel
     *
     * @return 客户座机号
     */
    public final String getCustomerTel() {
        return customerTel;
    }

    /**
     * 设置 客户座机号 tb_customer.customer_tel
     *
     * @param customerTel 客户座机号
     */
    public final void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    /**
     * 获取 真实姓名 tb_customer.customer_real_name
     *
     * @return 真实姓名
     */
    public final String getCustomerRealName() {
        return customerRealName;
    }

    /**
     * 设置 真实姓名 tb_customer.customer_real_name
     *
     * @param customerRealName 真实姓名
     */
    public final void setCustomerRealName(String customerRealName) {
        this.customerRealName = customerRealName == null ? null : customerRealName.trim();
    }

    /**
     * 获取 身份证号码 tb_customer.customer_card_no
     *
     * @return 身份证号码
     */
    public final String getCustomerCardNo() {
        return customerCardNo;
    }

    /**
     * 设置 身份证号码 tb_customer.customer_card_no
     *
     * @param customerCardNo 身份证号码
     */
    public final void setCustomerCardNo(String customerCardNo) {
        this.customerCardNo = customerCardNo == null ? null : customerCardNo.trim();
    }

    /**
     * 获取 tb_customer.customer_showstatus
     *
     * @return tb_customer.customer_showstatus
     */
    public final Integer getCustomerShowstatus() {
        return customerShowstatus;
    }

    /**
     * 设置 tb_customer.customer_showstatus
     *
     * @param customerShowstatus tb_customer.customer_showstatus
     */
    public final void setCustomerShowstatus(Integer customerShowstatus) {
        this.customerShowstatus = customerShowstatus;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerPassword=").append(customerPassword);
        sb.append(", customerMobile=").append(customerMobile);
        sb.append(", customerTel=").append(customerTel);
        sb.append(", customerRealName=").append(customerRealName);
        sb.append(", customerCardNo=").append(customerCardNo);
        sb.append(", customerShowstatus=").append(customerShowstatus);
        sb.append("]");
        return sb.toString();
    }
}