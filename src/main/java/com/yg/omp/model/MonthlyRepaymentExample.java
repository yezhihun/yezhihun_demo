package com.yg.omp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MonthlyRepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MonthlyRepaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReIdIsNull() {
            addCriterion("re_id is null");
            return (Criteria) this;
        }

        public Criteria andReIdIsNotNull() {
            addCriterion("re_id is not null");
            return (Criteria) this;
        }

        public Criteria andReIdEqualTo(String value) {
            addCriterion("re_id =", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotEqualTo(String value) {
            addCriterion("re_id <>", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThan(String value) {
            addCriterion("re_id >", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThanOrEqualTo(String value) {
            addCriterion("re_id >=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThan(String value) {
            addCriterion("re_id <", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThanOrEqualTo(String value) {
            addCriterion("re_id <=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLike(String value) {
            addCriterion("re_id like", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotLike(String value) {
            addCriterion("re_id not like", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdIn(List<String> values) {
            addCriterion("re_id in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotIn(List<String> values) {
            addCriterion("re_id not in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdBetween(String value1, String value2) {
            addCriterion("re_id between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotBetween(String value1, String value2) {
            addCriterion("re_id not between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIsNull() {
            addCriterion("global_id is null");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIsNotNull() {
            addCriterion("global_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalIdEqualTo(String value) {
            addCriterion("global_id =", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotEqualTo(String value) {
            addCriterion("global_id <>", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdGreaterThan(String value) {
            addCriterion("global_id >", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdGreaterThanOrEqualTo(String value) {
            addCriterion("global_id >=", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLessThan(String value) {
            addCriterion("global_id <", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLessThanOrEqualTo(String value) {
            addCriterion("global_id <=", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLike(String value) {
            addCriterion("global_id like", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotLike(String value) {
            addCriterion("global_id not like", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIn(List<String> values) {
            addCriterion("global_id in", values, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotIn(List<String> values) {
            addCriterion("global_id not in", values, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdBetween(String value1, String value2) {
            addCriterion("global_id between", value1, value2, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotBetween(String value1, String value2) {
            addCriterion("global_id not between", value1, value2, "globalId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("id_type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("id_type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserCardIsNull() {
            addCriterion("user_card is null");
            return (Criteria) this;
        }

        public Criteria andUserCardIsNotNull() {
            addCriterion("user_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardEqualTo(String value) {
            addCriterion("user_card =", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotEqualTo(String value) {
            addCriterion("user_card <>", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardGreaterThan(String value) {
            addCriterion("user_card >", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_card >=", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLessThan(String value) {
            addCriterion("user_card <", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLessThanOrEqualTo(String value) {
            addCriterion("user_card <=", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLike(String value) {
            addCriterion("user_card like", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotLike(String value) {
            addCriterion("user_card not like", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardIn(List<String> values) {
            addCriterion("user_card in", values, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotIn(List<String> values) {
            addCriterion("user_card not in", values, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardBetween(String value1, String value2) {
            addCriterion("user_card between", value1, value2, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotBetween(String value1, String value2) {
            addCriterion("user_card not between", value1, value2, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankDetailIsNull() {
            addCriterion("bank_detail is null");
            return (Criteria) this;
        }

        public Criteria andBankDetailIsNotNull() {
            addCriterion("bank_detail is not null");
            return (Criteria) this;
        }

        public Criteria andBankDetailEqualTo(String value) {
            addCriterion("bank_detail =", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailNotEqualTo(String value) {
            addCriterion("bank_detail <>", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailGreaterThan(String value) {
            addCriterion("bank_detail >", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailGreaterThanOrEqualTo(String value) {
            addCriterion("bank_detail >=", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailLessThan(String value) {
            addCriterion("bank_detail <", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailLessThanOrEqualTo(String value) {
            addCriterion("bank_detail <=", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailLike(String value) {
            addCriterion("bank_detail like", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailNotLike(String value) {
            addCriterion("bank_detail not like", value, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailIn(List<String> values) {
            addCriterion("bank_detail in", values, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailNotIn(List<String> values) {
            addCriterion("bank_detail not in", values, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailBetween(String value1, String value2) {
            addCriterion("bank_detail between", value1, value2, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankDetailNotBetween(String value1, String value2) {
            addCriterion("bank_detail not between", value1, value2, "bankDetail");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("trans_type is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("trans_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(Integer value) {
            addCriterion("trans_type =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(Integer value) {
            addCriterion("trans_type <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(Integer value) {
            addCriterion("trans_type >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_type >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(Integer value) {
            addCriterion("trans_type <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trans_type <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<Integer> values) {
            addCriterion("trans_type in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<Integer> values) {
            addCriterion("trans_type not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(Integer value1, Integer value2) {
            addCriterion("trans_type between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_type not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andPayAmountsIsNull() {
            addCriterion("pay_amounts is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountsIsNotNull() {
            addCriterion("pay_amounts is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountsEqualTo(BigDecimal value) {
            addCriterion("pay_amounts =", value, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsNotEqualTo(BigDecimal value) {
            addCriterion("pay_amounts <>", value, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsGreaterThan(BigDecimal value) {
            addCriterion("pay_amounts >", value, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amounts >=", value, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsLessThan(BigDecimal value) {
            addCriterion("pay_amounts <", value, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amounts <=", value, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsIn(List<BigDecimal> values) {
            addCriterion("pay_amounts in", values, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsNotIn(List<BigDecimal> values) {
            addCriterion("pay_amounts not in", values, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amounts between", value1, value2, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andPayAmountsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amounts not between", value1, value2, "payAmounts");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNull() {
            addCriterion("repay_date is null");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNotNull() {
            addCriterion("repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDateEqualTo(Date value) {
            addCriterionForJDBCDate("repay_date =", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repay_date <>", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThan(Date value) {
            addCriterionForJDBCDate("repay_date >", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repay_date >=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThan(Date value) {
            addCriterionForJDBCDate("repay_date <", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repay_date <=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateIn(List<Date> values) {
            addCriterionForJDBCDate("repay_date in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repay_date not in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repay_date between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repay_date not between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andDeductStatusIsNull() {
            addCriterion("deduct_status is null");
            return (Criteria) this;
        }

        public Criteria andDeductStatusIsNotNull() {
            addCriterion("deduct_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeductStatusEqualTo(Integer value) {
            addCriterion("deduct_status =", value, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusNotEqualTo(Integer value) {
            addCriterion("deduct_status <>", value, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusGreaterThan(Integer value) {
            addCriterion("deduct_status >", value, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("deduct_status >=", value, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusLessThan(Integer value) {
            addCriterion("deduct_status <", value, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusLessThanOrEqualTo(Integer value) {
            addCriterion("deduct_status <=", value, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusIn(List<Integer> values) {
            addCriterion("deduct_status in", values, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusNotIn(List<Integer> values) {
            addCriterion("deduct_status not in", values, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusBetween(Integer value1, Integer value2) {
            addCriterion("deduct_status between", value1, value2, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andDeductStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("deduct_status not between", value1, value2, "deductStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeIsNull() {
            addCriterion("deduct_time is null");
            return (Criteria) this;
        }

        public Criteria andDeductTimeIsNotNull() {
            addCriterion("deduct_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeductTimeEqualTo(Date value) {
            addCriterion("deduct_time =", value, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeNotEqualTo(Date value) {
            addCriterion("deduct_time <>", value, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeGreaterThan(Date value) {
            addCriterion("deduct_time >", value, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deduct_time >=", value, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeLessThan(Date value) {
            addCriterion("deduct_time <", value, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeLessThanOrEqualTo(Date value) {
            addCriterion("deduct_time <=", value, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeIn(List<Date> values) {
            addCriterion("deduct_time in", values, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeNotIn(List<Date> values) {
            addCriterion("deduct_time not in", values, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeBetween(Date value1, Date value2) {
            addCriterion("deduct_time between", value1, value2, "deductTime");
            return (Criteria) this;
        }

        public Criteria andDeductTimeNotBetween(Date value1, Date value2) {
            addCriterion("deduct_time not between", value1, value2, "deductTime");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("application_id like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("application_id not like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIsNull() {
            addCriterion("loan_deadline is null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIsNotNull() {
            addCriterion("loan_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineEqualTo(String value) {
            addCriterion("loan_deadline =", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotEqualTo(String value) {
            addCriterion("loan_deadline <>", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineGreaterThan(String value) {
            addCriterion("loan_deadline >", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("loan_deadline >=", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineLessThan(String value) {
            addCriterion("loan_deadline <", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineLessThanOrEqualTo(String value) {
            addCriterion("loan_deadline <=", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineLike(String value) {
            addCriterion("loan_deadline like", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotLike(String value) {
            addCriterion("loan_deadline not like", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIn(List<String> values) {
            addCriterion("loan_deadline in", values, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotIn(List<String> values) {
            addCriterion("loan_deadline not in", values, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineBetween(String value1, String value2) {
            addCriterion("loan_deadline between", value1, value2, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotBetween(String value1, String value2) {
            addCriterion("loan_deadline not between", value1, value2, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgIsNull() {
            addCriterion("transaction_Status_Msg is null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgIsNotNull() {
            addCriterion("transaction_Status_Msg is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgEqualTo(String value) {
            addCriterion("transaction_Status_Msg =", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgNotEqualTo(String value) {
            addCriterion("transaction_Status_Msg <>", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgGreaterThan(String value) {
            addCriterion("transaction_Status_Msg >", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_Status_Msg >=", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgLessThan(String value) {
            addCriterion("transaction_Status_Msg <", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgLessThanOrEqualTo(String value) {
            addCriterion("transaction_Status_Msg <=", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgLike(String value) {
            addCriterion("transaction_Status_Msg like", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgNotLike(String value) {
            addCriterion("transaction_Status_Msg not like", value, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgIn(List<String> values) {
            addCriterion("transaction_Status_Msg in", values, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgNotIn(List<String> values) {
            addCriterion("transaction_Status_Msg not in", values, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgBetween(String value1, String value2) {
            addCriterion("transaction_Status_Msg between", value1, value2, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusMsgNotBetween(String value1, String value2) {
            addCriterion("transaction_Status_Msg not between", value1, value2, "transactionStatusMsg");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreCityIsNull() {
            addCriterion("store_city is null");
            return (Criteria) this;
        }

        public Criteria andStoreCityIsNotNull() {
            addCriterion("store_city is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCityEqualTo(String value) {
            addCriterion("store_city =", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotEqualTo(String value) {
            addCriterion("store_city <>", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityGreaterThan(String value) {
            addCriterion("store_city >", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityGreaterThanOrEqualTo(String value) {
            addCriterion("store_city >=", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLessThan(String value) {
            addCriterion("store_city <", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLessThanOrEqualTo(String value) {
            addCriterion("store_city <=", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLike(String value) {
            addCriterion("store_city like", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotLike(String value) {
            addCriterion("store_city not like", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityIn(List<String> values) {
            addCriterion("store_city in", values, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotIn(List<String> values) {
            addCriterion("store_city not in", values, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityBetween(String value1, String value2) {
            addCriterion("store_city between", value1, value2, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotBetween(String value1, String value2) {
            addCriterion("store_city not between", value1, value2, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreAreaIsNull() {
            addCriterion("store_area is null");
            return (Criteria) this;
        }

        public Criteria andStoreAreaIsNotNull() {
            addCriterion("store_area is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAreaEqualTo(String value) {
            addCriterion("store_area =", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaNotEqualTo(String value) {
            addCriterion("store_area <>", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaGreaterThan(String value) {
            addCriterion("store_area >", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaGreaterThanOrEqualTo(String value) {
            addCriterion("store_area >=", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaLessThan(String value) {
            addCriterion("store_area <", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaLessThanOrEqualTo(String value) {
            addCriterion("store_area <=", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaLike(String value) {
            addCriterion("store_area like", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaNotLike(String value) {
            addCriterion("store_area not like", value, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaIn(List<String> values) {
            addCriterion("store_area in", values, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaNotIn(List<String> values) {
            addCriterion("store_area not in", values, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaBetween(String value1, String value2) {
            addCriterion("store_area between", value1, value2, "storeArea");
            return (Criteria) this;
        }

        public Criteria andStoreAreaNotBetween(String value1, String value2) {
            addCriterion("store_area not between", value1, value2, "storeArea");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNull() {
            addCriterion("request_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("request_id =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("request_id <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("request_id >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_id >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("request_id <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("request_id <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("request_id like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("request_id not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("request_id in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("request_id not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("request_id between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("request_id not between", value1, value2, "requestId");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}