package com.jiuyi.alps.nka.dto.cust;

/**
 * 客户填写的基础信息
 *
 */
public class CustBasicInfoDto {
    
    /**
     * 客户编号
     */
    private Integer custId;
    
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 手机
     */
    private String mobile;
    
    /**
     * 身份证号
     */
    private String identNo;
    
    /**
     * 性别
     */
    private String gender;
    
    /**
     * 年龄
     */
    private String age;
    
    /**
     * 省
     */
    private String province;

    private String provinceCode;
    
    /**
     * 市
     */
    private String city;

    private String cityCode;
    
    /**
     * 区
     */
    private String area;

    private String areaCode;
    
    /**
     * 地址
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
     * 婚姻状况
     */
    private String maritalStatus;
    
    /**
     * 最高学历
     */
    private String highestDegree;
    
    /**
     * 单位名称
     */
    private String companyName;
    
    /**
     * 省
     */
    private String companyProvince;

    private String companyProvinceCode;
    
    /**
     * 市
     */
    private String companyCity;

    private String companyCityCode;

    /**
     * 区
     */
    private String companyArea;

    private String companyAreaCode;

    /**
     * 公司详细地址
     */
    private String companyAddress;
    
    /**
     * 公司电话
     */
    private String companyPhone;
    
    /**
     * 职位
     */
    private String job;
    
    /**
     * qq
     */
    private String qq;
    
    /**
     * 微信
     */
    private String wechat;
    
    /**
     * 身份认证图片
     */
    private String identAuthPicture;
    
    /**
     * 身份证ocr图片1
     */
    private String identCardOcrPicture1;
    
    /**
     * 身份证ocr图片2
     */
    private String identCardOcrPicture2;
    
    
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
    
    public String getIdentNo() {
        return identNo;
    }
    
    public void setIdentNo(String identNo) {
        this.identNo = identNo;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
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
    
    public String getMaritalStatus() {
        return maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    public String getHighestDegree() {
        return highestDegree;
    }
    
    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
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
    
    public String getCompanyProvince() {
        return companyProvince;
    }
    
    public void setCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
    }
    
    public String getCompanyCity() {
        return companyCity;
    }
    
    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }
    
    public String getCompanyArea() {
        return companyArea;
    }
    
    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }
    
    public String getCompanyAddress() {
        return companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    
    public String getCompanyPhone() {
        return companyPhone;
    }
    
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
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
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getIdentAuthPicture() {
        return identAuthPicture;
    }
    
    public void setIdentAuthPicture(String identAuthPicture) {
        this.identAuthPicture = identAuthPicture;
    }
    
    public String getIdentCardOcrPicture1() {
        return identCardOcrPicture1;
    }
    
    public void setIdentCardOcrPicture1(String identCardOcrPicture1) {
        this.identCardOcrPicture1 = identCardOcrPicture1;
    }
    
    public String getIdentCardOcrPicture2() {
        return identCardOcrPicture2;
    }
    
    public void setIdentCardOcrPicture2(String identCardOcrPicture2) {
        this.identCardOcrPicture2 = identCardOcrPicture2;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCompanyProvinceCode() {
        return companyProvinceCode;
    }

    public void setCompanyProvinceCode(String companyProvinceCode) {
        this.companyProvinceCode = companyProvinceCode;
    }

    public String getCompanyCityCode() {
        return companyCityCode;
    }

    public void setCompanyCityCode(String companyCityCode) {
        this.companyCityCode = companyCityCode;
    }

    public String getCompanyAreaCode() {
        return companyAreaCode;
    }

    public void setCompanyAreaCode(String companyAreaCode) {
        this.companyAreaCode = companyAreaCode;
    }

    @Override
    public String toString() {
        return "CustBasicInfoDto{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", identNo='" + identNo + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", province='" + province + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", city='" + city + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", area='" + area + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", address='" + address + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", highestDegree='" + highestDegree + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyProvince='" + companyProvince + '\'' +
                ", companyProvinceCode='" + companyProvinceCode + '\'' +
                ", companyCity='" + companyCity + '\'' +
                ", companyCityCode='" + companyCityCode + '\'' +
                ", companyArea='" + companyArea + '\'' +
                ", companyAreaCode='" + companyAreaCode + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", job='" + job + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", identAuthPicture='" + identAuthPicture + '\'' +
                ", identCardOcrPicture1='" + identCardOcrPicture1 + '\'' +
                ", identCardOcrPicture2='" + identCardOcrPicture2 + '\'' +
                '}';
    }
}
