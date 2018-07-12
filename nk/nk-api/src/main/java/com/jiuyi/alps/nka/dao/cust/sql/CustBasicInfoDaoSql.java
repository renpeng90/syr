package com.jiuyi.alps.nka.dao.cust.sql;

import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 1.StringUtils.isEmpty和StringUtils.hasText的区别
 */

/**
 * sql的各种情况
 * *************修改*************
 * 1.if (custbasicinfo.getCustId() != null) {
        SET("cust_id=#{custId}");
     }

 * 2. if (!StringUtils.isEmpty(custbasicinfo.getName())) {
        SET("name=#{name}");
     }
 *
 * *************查询*************
 * 1.if (StringUtils.hasText(mobile)) {
        sql.WHERE("ncbi.`mobile` = #{cellphone}");
     }

 * 2.if (StringUtils.hasText(name)) {
        sql.WHERE("ncbi.`name` LIKE #{name}");
     }
 * 3.if (StringUtils.hasText(reviewer)) {
         if (reviewer.equalsIgnoreCase("null")) {
            sql.WHERE("cla.reviewer is null");
         } else {
            sql.WHERE("cla.reviewer = #{reviewer}");
         }
    }
 * 4.if (!CollectionUtils.isEmpty(statuses)) {
         String param = statuses.toString().replace("[", "(").replace("]", ")");
         sql.WHERE("cla.status IN " + param);
     }

 * 5.if (StringUtils.hasText(loanOutTimeBegin)) {
         sql.WHERE("cla.loan_time > #{loanOutTimeBegin}");
     }
 * 1.
 */
public class CustBasicInfoDaoSql {

    public String updateSql(final CustBasicInfoDomain custbasicinfo) {
        return new SQL() {
            {
                UPDATE("nnd_cust_basic_info");
                if (custbasicinfo.getCustId() != null) {
                    SET("cust_id=#{custId}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getName())) {
                    SET("name=#{name}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getGender())) {
                    SET("gender=#{gender}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getIdentNo())) {
                    SET("ident_no=#{identNo}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getMobile())) {
                    SET("mobile=#{mobile}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getMaritalStatus())) {
                    SET("marital_status=#{maritalStatus}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getHighestDegree())) {
                    SET("highest_degree=#{highestDegree}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getProvince())) {
                    SET("province=#{province}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getCity())) {
                    SET("city=#{city}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getArea())) {
                    SET("area=#{area}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getAddress())) {
                    SET("address=#{address}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getLatitude())) {
                    SET("latitude=#{latitude}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getLongitude())) {
                    SET("longitude=#{longitude}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getQq())) {
                    SET("qq=#{qq}");
                }
                if (!StringUtils.isEmpty(custbasicinfo.getWechat())) {
                    SET("wechat=#{wechat}");
                }
                if (custbasicinfo.getUpdateTime() != null) {
                    SET("update_time=#{updateTime}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }

    public String selectByConditionsSql(@Param("mobile") String mobile,
                                        @Param("name") String name,
                                        @Param("gender") String gender,
                                        @Param("highestDegrees") List<String> highestDegrees,
                                        @Param("qq") String qq,
                                        @Param("createTimeBegin") String createTimeBegin,
                                        @Param("createTimeEnd") String createTimeEnd) {
        return new SQL() {
            {
                SQL sql = SELECT("ncbi.* " )
                        .FROM("nnd_cust_basic_info ncbi ")
                        .WHERE("1=1");
                if (StringUtils.hasText(mobile)) {
                    sql.WHERE("ncbi.`mobile` = #{mobile}");
                }
                if (StringUtils.hasText(name)) {
                    sql.WHERE("ncbi.`name` LIKE #{name}");
                }
                if (StringUtils.hasText(gender)) {
                    sql.WHERE("ncbi.`gender` = #{name}");
                }
                if (!CollectionUtils.isEmpty(highestDegrees)) {
                    String param = highestDegrees.toString().replace("[", "(").replace("]", ")");
                    sql.WHERE("ncbi.highest_degree IN " + param);
                }
                if (StringUtils.hasText(qq)) {
                    if (qq.equalsIgnoreCase("null")) {
                        sql.WHERE("ncbi.qq is null");
                    } else {
                        sql.WHERE("ncbi.qq = #{qq}");
                    }
                }
                if (StringUtils.hasText(createTimeBegin)) {
                    sql.WHERE("ncbi.create_time > #{createTimeBegin}");
                }
                if (StringUtils.hasText(createTimeEnd)) {
                    sql.WHERE("ncbi.create_time < #{createTimeEnd}");
                }
            }
        }.ORDER_BY("ncbi.`create_time` desc").toString();
    }


}
