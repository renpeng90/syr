package com.jiuyi.alps.nka.dto.cust;

import common.dto.PageableDto;

/**
 * 客户填写的基础信息
 *
 */
public class CustBasicInfoConditionDto extends PageableDto {
    
    //名字。模糊查询
    private String name;
    //
    private String mobile;
    //性别，==查询
    private String gender;
    //学历，in查询
    private String highestDegreeStringArray;
    //qq，null查询
    private String qq;
    //创建时间（起）
    private String createTimeBegin;
    //创建时间（止）
    private String createTimeEnd;

    public String getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getHighestDegreeStringArray() {
        return highestDegreeStringArray;
    }

    public void setHighestDegreeStringArray(String highestDegreeStringArray) {
        this.highestDegreeStringArray = highestDegreeStringArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
