package com.jiuyi.alps.nka.domain.cust;


import common.domain.BaseDomain;

/**
 * 客户基本信息
 * @author zhangyibo
 * @date 2017/11/20
 */
public class CustBasicInfoDomain extends BaseDomain {

    /**
     * 已婚
     */
    public static final String MARRIED = "M";
    /**
     * 未婚
     */
    public static final String SPINSTERHOOD = "S";
    /**
     * 离异
     */
    public static final String DIVORCED = "D";
    /**
     * 其他
     */
    public static final String OTHER = "O";

    /**
     * 最高学历
     */
    private String highestDegree;

    /**
     * 研究生
     */
    public static final String POST_GRADUATE = "A";
    /**
     * 本科
     */
    public static final String UNDER_GRADUATE = "B";
    /**
     * 大专
     */
    public static final String JUNIOR_COLLEGE = "C";
    /**
     * 高中
     */
    public static final String HIGH_SCHOOL = "D";
    /**
     * 高中以下
     */
    public static final String PRE_HIGH_SCHOOL = "E";


    /**
     * 性别-男
     */
    public static final String GENDER_MALE = "M";

    /**
     * 性别-女
     */
    public static final String GENDER_FEMALE = "F";

    /**
     * 客户ID
     */
    private Integer custId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 身份证号
     */
    private String identNo;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 婚姻状态
     */
    private String maritalStatus;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 经度
     */
    private String longitude;

    /**
     * qq
     */
    private String qq;

    /**
     * 微信
     */
    private String wechat;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentNo() {
        return identNo;
    }

    public void setIdentNo(String identNo) {
        this.identNo = identNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "CustBasicInfo{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", identNo='" + identNo + '\'' +
                ", mobile='" + mobile + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", highestDegree='" + highestDegree + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                '}';
    }
}
