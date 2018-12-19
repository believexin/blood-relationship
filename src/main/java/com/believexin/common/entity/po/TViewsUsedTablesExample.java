package com.believexin.common.entity.po;

import java.util.ArrayList;
import java.util.List;

public class TViewsUsedTablesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public TViewsUsedTablesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
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

        public Criteria andCViewschemaIsNull() {
            addCriterion("c_viewschema is null");
            return (Criteria) this;
        }

        public Criteria andCViewschemaIsNotNull() {
            addCriterion("c_viewschema is not null");
            return (Criteria) this;
        }

        public Criteria andCViewschemaEqualTo(String value) {
            addCriterion("c_viewschema =", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaNotEqualTo(String value) {
            addCriterion("c_viewschema <>", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaGreaterThan(String value) {
            addCriterion("c_viewschema >", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaGreaterThanOrEqualTo(String value) {
            addCriterion("c_viewschema >=", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaLessThan(String value) {
            addCriterion("c_viewschema <", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaLessThanOrEqualTo(String value) {
            addCriterion("c_viewschema <=", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaLike(String value) {
            addCriterion("c_viewschema like", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaNotLike(String value) {
            addCriterion("c_viewschema not like", value, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaIn(List<String> values) {
            addCriterion("c_viewschema in", values, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaNotIn(List<String> values) {
            addCriterion("c_viewschema not in", values, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaBetween(String value1, String value2) {
            addCriterion("c_viewschema between", value1, value2, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewschemaNotBetween(String value1, String value2) {
            addCriterion("c_viewschema not between", value1, value2, "cViewschema");
            return (Criteria) this;
        }

        public Criteria andCViewnameIsNull() {
            addCriterion("c_viewname is null");
            return (Criteria) this;
        }

        public Criteria andCViewnameIsNotNull() {
            addCriterion("c_viewname is not null");
            return (Criteria) this;
        }

        public Criteria andCViewnameEqualTo(String value) {
            addCriterion("c_viewname =", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameNotEqualTo(String value) {
            addCriterion("c_viewname <>", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameGreaterThan(String value) {
            addCriterion("c_viewname >", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_viewname >=", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameLessThan(String value) {
            addCriterion("c_viewname <", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameLessThanOrEqualTo(String value) {
            addCriterion("c_viewname <=", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameLike(String value) {
            addCriterion("c_viewname like", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameNotLike(String value) {
            addCriterion("c_viewname not like", value, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameIn(List<String> values) {
            addCriterion("c_viewname in", values, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameNotIn(List<String> values) {
            addCriterion("c_viewname not in", values, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameBetween(String value1, String value2) {
            addCriterion("c_viewname between", value1, value2, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCViewnameNotBetween(String value1, String value2) {
            addCriterion("c_viewname not between", value1, value2, "cViewname");
            return (Criteria) this;
        }

        public Criteria andCTableschemaIsNull() {
            addCriterion("c_tableschema is null");
            return (Criteria) this;
        }

        public Criteria andCTableschemaIsNotNull() {
            addCriterion("c_tableschema is not null");
            return (Criteria) this;
        }

        public Criteria andCTableschemaEqualTo(String value) {
            addCriterion("c_tableschema =", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaNotEqualTo(String value) {
            addCriterion("c_tableschema <>", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaGreaterThan(String value) {
            addCriterion("c_tableschema >", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaGreaterThanOrEqualTo(String value) {
            addCriterion("c_tableschema >=", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaLessThan(String value) {
            addCriterion("c_tableschema <", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaLessThanOrEqualTo(String value) {
            addCriterion("c_tableschema <=", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaLike(String value) {
            addCriterion("c_tableschema like", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaNotLike(String value) {
            addCriterion("c_tableschema not like", value, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaIn(List<String> values) {
            addCriterion("c_tableschema in", values, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaNotIn(List<String> values) {
            addCriterion("c_tableschema not in", values, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaBetween(String value1, String value2) {
            addCriterion("c_tableschema between", value1, value2, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTableschemaNotBetween(String value1, String value2) {
            addCriterion("c_tableschema not between", value1, value2, "cTableschema");
            return (Criteria) this;
        }

        public Criteria andCTablenameIsNull() {
            addCriterion("c_tablename is null");
            return (Criteria) this;
        }

        public Criteria andCTablenameIsNotNull() {
            addCriterion("c_tablename is not null");
            return (Criteria) this;
        }

        public Criteria andCTablenameEqualTo(String value) {
            addCriterion("c_tablename =", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameNotEqualTo(String value) {
            addCriterion("c_tablename <>", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameGreaterThan(String value) {
            addCriterion("c_tablename >", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("c_tablename >=", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameLessThan(String value) {
            addCriterion("c_tablename <", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameLessThanOrEqualTo(String value) {
            addCriterion("c_tablename <=", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameLike(String value) {
            addCriterion("c_tablename like", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameNotLike(String value) {
            addCriterion("c_tablename not like", value, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameIn(List<String> values) {
            addCriterion("c_tablename in", values, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameNotIn(List<String> values) {
            addCriterion("c_tablename not in", values, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameBetween(String value1, String value2) {
            addCriterion("c_tablename between", value1, value2, "cTablename");
            return (Criteria) this;
        }

        public Criteria andCTablenameNotBetween(String value1, String value2) {
            addCriterion("c_tablename not between", value1, value2, "cTablename");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_views_used_tables
     *
     * @mbg.generated do_not_delete_during_merge Fri Nov 02 17:27:42 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_views_used_tables
     *
     * @mbg.generated Fri Nov 02 17:27:42 CST 2018
     */
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