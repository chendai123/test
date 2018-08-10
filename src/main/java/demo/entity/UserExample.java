package demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected Integer start;

    protected Integer length;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getStart() {
        return start;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
        return length;
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(Long value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(Long value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(Long value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(Long value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(Long value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(Long value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<Long> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<Long> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(Long value1, Long value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(Long value1, Long value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicIsNull() {
            addCriterion("id_positive_pic is null");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicIsNotNull() {
            addCriterion("id_positive_pic is not null");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicEqualTo(Long value) {
            addCriterion("id_positive_pic =", value, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicNotEqualTo(Long value) {
            addCriterion("id_positive_pic <>", value, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicGreaterThan(Long value) {
            addCriterion("id_positive_pic >", value, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicGreaterThanOrEqualTo(Long value) {
            addCriterion("id_positive_pic >=", value, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicLessThan(Long value) {
            addCriterion("id_positive_pic <", value, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicLessThanOrEqualTo(Long value) {
            addCriterion("id_positive_pic <=", value, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicIn(List<Long> values) {
            addCriterion("id_positive_pic in", values, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicNotIn(List<Long> values) {
            addCriterion("id_positive_pic not in", values, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicBetween(Long value1, Long value2) {
            addCriterion("id_positive_pic between", value1, value2, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdPositivePicNotBetween(Long value1, Long value2) {
            addCriterion("id_positive_pic not between", value1, value2, "idPositivePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicIsNull() {
            addCriterion("id_obverse_pic is null");
            return (Criteria) this;
        }

        public Criteria andIdObversePicIsNotNull() {
            addCriterion("id_obverse_pic is not null");
            return (Criteria) this;
        }

        public Criteria andIdObversePicEqualTo(Long value) {
            addCriterion("id_obverse_pic =", value, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicNotEqualTo(Long value) {
            addCriterion("id_obverse_pic <>", value, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicGreaterThan(Long value) {
            addCriterion("id_obverse_pic >", value, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicGreaterThanOrEqualTo(Long value) {
            addCriterion("id_obverse_pic >=", value, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicLessThan(Long value) {
            addCriterion("id_obverse_pic <", value, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicLessThanOrEqualTo(Long value) {
            addCriterion("id_obverse_pic <=", value, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicIn(List<Long> values) {
            addCriterion("id_obverse_pic in", values, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicNotIn(List<Long> values) {
            addCriterion("id_obverse_pic not in", values, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicBetween(Long value1, Long value2) {
            addCriterion("id_obverse_pic between", value1, value2, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdObversePicNotBetween(Long value1, Long value2) {
            addCriterion("id_obverse_pic not between", value1, value2, "idObversePic");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeIsNull() {
            addCriterion("id_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeIsNotNull() {
            addCriterion("id_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeEqualTo(Date value) {
            addCriterion("id_expire_time =", value, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeNotEqualTo(Date value) {
            addCriterion("id_expire_time <>", value, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeGreaterThan(Date value) {
            addCriterion("id_expire_time >", value, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("id_expire_time >=", value, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeLessThan(Date value) {
            addCriterion("id_expire_time <", value, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("id_expire_time <=", value, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeIn(List<Date> values) {
            addCriterion("id_expire_time in", values, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeNotIn(List<Date> values) {
            addCriterion("id_expire_time not in", values, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeBetween(Date value1, Date value2) {
            addCriterion("id_expire_time between", value1, value2, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("id_expire_time not between", value1, value2, "idExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIsNull() {
            addCriterion("driver_license is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIsNotNull() {
            addCriterion("driver_license is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseEqualTo(Long value) {
            addCriterion("driver_license =", value, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseNotEqualTo(Long value) {
            addCriterion("driver_license <>", value, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseGreaterThan(Long value) {
            addCriterion("driver_license >", value, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseGreaterThanOrEqualTo(Long value) {
            addCriterion("driver_license >=", value, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseLessThan(Long value) {
            addCriterion("driver_license <", value, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseLessThanOrEqualTo(Long value) {
            addCriterion("driver_license <=", value, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIn(List<Long> values) {
            addCriterion("driver_license in", values, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseNotIn(List<Long> values) {
            addCriterion("driver_license not in", values, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseBetween(Long value1, Long value2) {
            addCriterion("driver_license between", value1, value2, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseNotBetween(Long value1, Long value2) {
            addCriterion("driver_license not between", value1, value2, "driverLicense");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationIsNull() {
            addCriterion("driver_license_duplication is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationIsNotNull() {
            addCriterion("driver_license_duplication is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationEqualTo(Long value) {
            addCriterion("driver_license_duplication =", value, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationNotEqualTo(Long value) {
            addCriterion("driver_license_duplication <>", value, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationGreaterThan(Long value) {
            addCriterion("driver_license_duplication >", value, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationGreaterThanOrEqualTo(Long value) {
            addCriterion("driver_license_duplication >=", value, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationLessThan(Long value) {
            addCriterion("driver_license_duplication <", value, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationLessThanOrEqualTo(Long value) {
            addCriterion("driver_license_duplication <=", value, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationIn(List<Long> values) {
            addCriterion("driver_license_duplication in", values, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationNotIn(List<Long> values) {
            addCriterion("driver_license_duplication not in", values, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationBetween(Long value1, Long value2) {
            addCriterion("driver_license_duplication between", value1, value2, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDuplicationNotBetween(Long value1, Long value2) {
            addCriterion("driver_license_duplication not between", value1, value2, "driverLicenseDuplication");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoIsNull() {
            addCriterion("driver_license_docno is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoIsNotNull() {
            addCriterion("driver_license_docno is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoEqualTo(String value) {
            addCriterion("driver_license_docno =", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoNotEqualTo(String value) {
            addCriterion("driver_license_docno <>", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoGreaterThan(String value) {
            addCriterion("driver_license_docno >", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoGreaterThanOrEqualTo(String value) {
            addCriterion("driver_license_docno >=", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoLessThan(String value) {
            addCriterion("driver_license_docno <", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoLessThanOrEqualTo(String value) {
            addCriterion("driver_license_docno <=", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoLike(String value) {
            addCriterion("driver_license_docno like", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoNotLike(String value) {
            addCriterion("driver_license_docno not like", value, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoIn(List<String> values) {
            addCriterion("driver_license_docno in", values, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoNotIn(List<String> values) {
            addCriterion("driver_license_docno not in", values, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoBetween(String value1, String value2) {
            addCriterion("driver_license_docno between", value1, value2, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseDocnoNotBetween(String value1, String value2) {
            addCriterion("driver_license_docno not between", value1, value2, "driverLicenseDocno");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeIsNull() {
            addCriterion("driver_license_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeIsNotNull() {
            addCriterion("driver_license_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeEqualTo(Date value) {
            addCriterion("driver_license_expire_time =", value, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeNotEqualTo(Date value) {
            addCriterion("driver_license_expire_time <>", value, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeGreaterThan(Date value) {
            addCriterion("driver_license_expire_time >", value, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("driver_license_expire_time >=", value, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeLessThan(Date value) {
            addCriterion("driver_license_expire_time <", value, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("driver_license_expire_time <=", value, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeIn(List<Date> values) {
            addCriterion("driver_license_expire_time in", values, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeNotIn(List<Date> values) {
            addCriterion("driver_license_expire_time not in", values, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeBetween(Date value1, Date value2) {
            addCriterion("driver_license_expire_time between", value1, value2, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("driver_license_expire_time not between", value1, value2, "driverLicenseExpireTime");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleIsNull() {
            addCriterion("is_own_vehicle is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleIsNotNull() {
            addCriterion("is_own_vehicle is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleEqualTo(Integer value) {
            addCriterion("is_own_vehicle =", value, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleNotEqualTo(Integer value) {
            addCriterion("is_own_vehicle <>", value, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleGreaterThan(Integer value) {
            addCriterion("is_own_vehicle >", value, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_own_vehicle >=", value, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleLessThan(Integer value) {
            addCriterion("is_own_vehicle <", value, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleLessThanOrEqualTo(Integer value) {
            addCriterion("is_own_vehicle <=", value, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleIn(List<Integer> values) {
            addCriterion("is_own_vehicle in", values, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleNotIn(List<Integer> values) {
            addCriterion("is_own_vehicle not in", values, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleBetween(Integer value1, Integer value2) {
            addCriterion("is_own_vehicle between", value1, value2, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andIsOwnVehicleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_own_vehicle not between", value1, value2, "isOwnVehicle");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusIsNull() {
            addCriterion("certification_status is null");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusIsNotNull() {
            addCriterion("certification_status is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusEqualTo(Integer value) {
            addCriterion("certification_status =", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusNotEqualTo(Integer value) {
            addCriterion("certification_status <>", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusGreaterThan(Integer value) {
            addCriterion("certification_status >", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("certification_status >=", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusLessThan(Integer value) {
            addCriterion("certification_status <", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("certification_status <=", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusIn(List<Integer> values) {
            addCriterion("certification_status in", values, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusNotIn(List<Integer> values) {
            addCriterion("certification_status not in", values, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusBetween(Integer value1, Integer value2) {
            addCriterion("certification_status between", value1, value2, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("certification_status not between", value1, value2, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceIsNull() {
            addCriterion("freeze_balance is null");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceIsNotNull() {
            addCriterion("freeze_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceEqualTo(BigDecimal value) {
            addCriterion("freeze_balance =", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceNotEqualTo(BigDecimal value) {
            addCriterion("freeze_balance <>", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceGreaterThan(BigDecimal value) {
            addCriterion("freeze_balance >", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_balance >=", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceLessThan(BigDecimal value) {
            addCriterion("freeze_balance <", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_balance <=", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceIn(List<BigDecimal> values) {
            addCriterion("freeze_balance in", values, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceNotIn(List<BigDecimal> values) {
            addCriterion("freeze_balance not in", values, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_balance between", value1, value2, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_balance not between", value1, value2, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionIsNull() {
            addCriterion("total_commission is null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionIsNotNull() {
            addCriterion("total_commission is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionEqualTo(BigDecimal value) {
            addCriterion("total_commission =", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionNotEqualTo(BigDecimal value) {
            addCriterion("total_commission <>", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionGreaterThan(BigDecimal value) {
            addCriterion("total_commission >", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_commission >=", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionLessThan(BigDecimal value) {
            addCriterion("total_commission <", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_commission <=", value, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionIn(List<BigDecimal> values) {
            addCriterion("total_commission in", values, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionNotIn(List<BigDecimal> values) {
            addCriterion("total_commission not in", values, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_commission between", value1, value2, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andTotalCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_commission not between", value1, value2, "totalCommission");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashIsNull() {
            addCriterion("invent_code_hash is null");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashIsNotNull() {
            addCriterion("invent_code_hash is not null");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashEqualTo(String value) {
            addCriterion("invent_code_hash =", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashNotEqualTo(String value) {
            addCriterion("invent_code_hash <>", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashGreaterThan(String value) {
            addCriterion("invent_code_hash >", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashGreaterThanOrEqualTo(String value) {
            addCriterion("invent_code_hash >=", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashLessThan(String value) {
            addCriterion("invent_code_hash <", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashLessThanOrEqualTo(String value) {
            addCriterion("invent_code_hash <=", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashLike(String value) {
            addCriterion("invent_code_hash like", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashNotLike(String value) {
            addCriterion("invent_code_hash not like", value, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashIn(List<String> values) {
            addCriterion("invent_code_hash in", values, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashNotIn(List<String> values) {
            addCriterion("invent_code_hash not in", values, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashBetween(String value1, String value2) {
            addCriterion("invent_code_hash between", value1, value2, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andInventCodeHashNotBetween(String value1, String value2) {
            addCriterion("invent_code_hash not between", value1, value2, "inventCodeHash");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNull() {
            addCriterion("qrcode is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNotNull() {
            addCriterion("qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeEqualTo(Long value) {
            addCriterion("qrcode =", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotEqualTo(Long value) {
            addCriterion("qrcode <>", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThan(Long value) {
            addCriterion("qrcode >", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("qrcode >=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThan(Long value) {
            addCriterion("qrcode <", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThanOrEqualTo(Long value) {
            addCriterion("qrcode <=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeIn(List<Long> values) {
            addCriterion("qrcode in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotIn(List<Long> values) {
            addCriterion("qrcode not in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeBetween(Long value1, Long value2) {
            addCriterion("qrcode between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotBetween(Long value1, Long value2) {
            addCriterion("qrcode not between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Integer value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Integer value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Integer value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Integer value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Integer> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Integer> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Integer value1, Integer value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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