package cn.joongky.society.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityActorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityActorExample() {
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

        public Criteria andActivityActorIdIsNull() {
            addCriterion("activity_actor_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdIsNotNull() {
            addCriterion("activity_actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdEqualTo(String value) {
            addCriterion("activity_actor_id =", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdNotEqualTo(String value) {
            addCriterion("activity_actor_id <>", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdGreaterThan(String value) {
            addCriterion("activity_actor_id >", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdGreaterThanOrEqualTo(String value) {
            addCriterion("activity_actor_id >=", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdLessThan(String value) {
            addCriterion("activity_actor_id <", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdLessThanOrEqualTo(String value) {
            addCriterion("activity_actor_id <=", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdLike(String value) {
            addCriterion("activity_actor_id like", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdNotLike(String value) {
            addCriterion("activity_actor_id not like", value, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdIn(List<String> values) {
            addCriterion("activity_actor_id in", values, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdNotIn(List<String> values) {
            addCriterion("activity_actor_id not in", values, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdBetween(String value1, String value2) {
            addCriterion("activity_actor_id between", value1, value2, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityActorIdNotBetween(String value1, String value2) {
            addCriterion("activity_actor_id not between", value1, value2, "activityActorId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("activity_id like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("activity_id not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNull() {
            addCriterion("actor_id is null");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNotNull() {
            addCriterion("actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andActorIdEqualTo(String value) {
            addCriterion("actor_id =", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotEqualTo(String value) {
            addCriterion("actor_id <>", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThan(String value) {
            addCriterion("actor_id >", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThanOrEqualTo(String value) {
            addCriterion("actor_id >=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThan(String value) {
            addCriterion("actor_id <", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThanOrEqualTo(String value) {
            addCriterion("actor_id <=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLike(String value) {
            addCriterion("actor_id like", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotLike(String value) {
            addCriterion("actor_id not like", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdIn(List<String> values) {
            addCriterion("actor_id in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotIn(List<String> values) {
            addCriterion("actor_id not in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdBetween(String value1, String value2) {
            addCriterion("actor_id between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotBetween(String value1, String value2) {
            addCriterion("actor_id not between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeIsNull() {
            addCriterion("joined_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeIsNotNull() {
            addCriterion("joined_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeEqualTo(Date value) {
            addCriterion("joined_time =", value, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeNotEqualTo(Date value) {
            addCriterion("joined_time <>", value, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeGreaterThan(Date value) {
            addCriterion("joined_time >", value, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("joined_time >=", value, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeLessThan(Date value) {
            addCriterion("joined_time <", value, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeLessThanOrEqualTo(Date value) {
            addCriterion("joined_time <=", value, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeIn(List<Date> values) {
            addCriterion("joined_time in", values, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeNotIn(List<Date> values) {
            addCriterion("joined_time not in", values, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeBetween(Date value1, Date value2) {
            addCriterion("joined_time between", value1, value2, "joinedTime");
            return (Criteria) this;
        }

        public Criteria andJoinedTimeNotBetween(Date value1, Date value2) {
            addCriterion("joined_time not between", value1, value2, "joinedTime");
            return (Criteria) this;
        }
    }

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