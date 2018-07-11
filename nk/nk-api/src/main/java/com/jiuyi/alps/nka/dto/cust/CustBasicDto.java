package com.jiuyi.alps.nka.dto.cust;

/**
 * 客户基础信息
 *
 * @author renpeng
 * @date 2018/6/27
 */
public class CustBasicDto {
    
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdentNo() {
        return identNo;
    }

    public void setIdentNo(String identNo) {
        this.identNo = identNo;
    }
}
