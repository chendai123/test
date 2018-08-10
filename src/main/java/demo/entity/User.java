package demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long userId;

    private String mobile;

    private String nickName;

    private String realName;

    private Integer gender;

    private Integer grade;

    private Long avatar;

    private String idNumber;

    private Long idPositivePic;

    private Long idObversePic;

    private Date idExpireTime;

    private Long driverLicense;

    private Long driverLicenseDuplication;

    private String driverLicenseDocno;

    private Date driverLicenseExpireTime;

    private Integer isOwnVehicle;

    private Integer certificationStatus;

    private BigDecimal balance;

    private BigDecimal freezeBalance;

    private BigDecimal totalCommission;

    private String inventCodeHash;

    private Long qrcode;

    private Integer isRecommend;

    private Integer source;

    private Integer isDelete;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Long getAvatar() {
        return avatar;
    }

    public void setAvatar(Long avatar) {
        this.avatar = avatar;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Long getIdPositivePic() {
        return idPositivePic;
    }

    public void setIdPositivePic(Long idPositivePic) {
        this.idPositivePic = idPositivePic;
    }

    public Long getIdObversePic() {
        return idObversePic;
    }

    public void setIdObversePic(Long idObversePic) {
        this.idObversePic = idObversePic;
    }

    public Date getIdExpireTime() {
        return idExpireTime;
    }

    public void setIdExpireTime(Date idExpireTime) {
        this.idExpireTime = idExpireTime;
    }

    public Long getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(Long driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Long getDriverLicenseDuplication() {
        return driverLicenseDuplication;
    }

    public void setDriverLicenseDuplication(Long driverLicenseDuplication) {
        this.driverLicenseDuplication = driverLicenseDuplication;
    }

    public String getDriverLicenseDocno() {
        return driverLicenseDocno;
    }

    public void setDriverLicenseDocno(String driverLicenseDocno) {
        this.driverLicenseDocno = driverLicenseDocno == null ? null : driverLicenseDocno.trim();
    }

    public Date getDriverLicenseExpireTime() {
        return driverLicenseExpireTime;
    }

    public void setDriverLicenseExpireTime(Date driverLicenseExpireTime) {
        this.driverLicenseExpireTime = driverLicenseExpireTime;
    }

    public Integer getIsOwnVehicle() {
        return isOwnVehicle;
    }

    public void setIsOwnVehicle(Integer isOwnVehicle) {
        this.isOwnVehicle = isOwnVehicle;
    }

    public Integer getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(Integer certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFreezeBalance() {
        return freezeBalance;
    }

    public void setFreezeBalance(BigDecimal freezeBalance) {
        this.freezeBalance = freezeBalance;
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    public String getInventCodeHash() {
        return inventCodeHash;
    }

    public void setInventCodeHash(String inventCodeHash) {
        this.inventCodeHash = inventCodeHash == null ? null : inventCodeHash.trim();
    }

    public Long getQrcode() {
        return qrcode;
    }

    public void setQrcode(Long qrcode) {
        this.qrcode = qrcode;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}