package com.jiuyi.alps.nka.dao.cust;

import com.jiuyi.alps.nka.dao.cust.sql.CustBasicInfoDaoSql;
import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto;
import org.apache.ibatis.annotations.*;

import java.util.List;
/**
 * 增删改查
 * 增加{
 *     1.批量插入
 *     2.单个插入（对象）
 * }
 * 删除
 * 修改
 * 查询{
 *     1.模糊查询
 *     2.=查询
 *     3.多条件，in（）
 * }
 */
@Mapper
public interface CustBasicInfoDao {

    @Insert(value = "INSERT INTO nnd_cust_basic_info(cust_id,name,gender,ident_no,mobile,marital_status,highest_degree,province,city,area,address,latitude,longitude,qq,wechat,create_time) " +
            "VALUES (#{custId},#{name},#{gender},#{identNo},#{mobile},#{maritalStatus},#{highestDegree},#{province},#{city},#{area},#{address},#{latitude},#{longitude},#{qq},#{wechat},#{createTime})")
    int insert(CustBasicInfoDomain custBasicInfoDomain);

    @UpdateProvider(type = CustBasicInfoDaoSql.class, method = "updateSql")
    int update(CustBasicInfoDomain custBasicInfoDomain);

    @Update("update nnd_cust_basic_info set qq=#{qq} where highest_degree = #{highestDegree}")
    int udpateBySelect(@Param("qq") String qq, @Param("highestDegree") String highestDegree);


    @Select(value = "select * from nnd_cust_basic_info where cust_id = #{custId} ORDER BY ID DESC")
    CustBasicInfoDomain findByCustId(Integer custId);

    @Select(value = "select * from nnd_cust_basic_info where ident_no = #{identNo}")
    List<CustBasicInfoDomain> findByIdentNo(String identNo);


    //通过in查询
    //item=
    //collection=
    @Select(value = "<script>select * from nnd_cust_basic_info where highest_degree in "+
            "<foreach item='highestDegree' index='index' collection='highestDegrees' open='(' separator=',' close=')'>" +
            "#{highestDegree}" +
            "</foreach></script>")
    List<CustBasicInfoDomain> findByPositions(@Param(value = "highestDegrees") List<String> highestDegrees);

    @SelectProvider(type = CustBasicInfoDaoSql.class, method = "selectByConditionsSql")
    List<CustBasicInfoDto> selectByConditions(@Param("mobile") String mobile,
                                              @Param("name") String name,
                                              @Param("gender") String gender,
                                              @Param("highestDegrees") List<String> highestDegrees,
                                              @Param("qq") String qq,
                                              @Param("createTimeBegin") String createTimeBegin,
                                              @Param("createTimeEnd") String createTimeEnd);




}
