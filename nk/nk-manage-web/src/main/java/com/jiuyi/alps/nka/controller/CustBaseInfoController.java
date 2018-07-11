package com.jiuyi.alps.nka.controller;

import com.jiuyi.alps.nka.client.cust.CustBasicInfoClient;
import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoConditionDto;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto;
import common.dto.PageableDto;
import common.rest.RestResponse;
import common.rest.RestResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Api(tags = "cust-basic-info", description = "客户基础信息")
@RestController
public class CustBaseInfoController {
    @Autowired
    private CustBasicInfoClient custBasicInfoClient;

    @ApiOperation("根据custId获取客户基本信息（返回dto）")
    @RequestMapping(value = "/cust/basicInfo/dto/{custId}", method = RequestMethod.GET)
    public RestResponse<CustBasicInfoDto> getCustBasicInfoDto(@PathVariable("custId") Integer custId) {
        CustBasicInfoDto dto = custBasicInfoClient.getCustBasicInfoDto(custId).getResponse();
        return new RestResponseBuilder<CustBasicInfoDto>().success(dto);
    }

    @ApiOperation("根据custId获取客户基本信息（返回domain）")
    @RequestMapping(value = "/cust/basicInfo/domain/{custId}", method = RequestMethod.GET)
    public RestResponse<CustBasicInfoDomain> getCustBasicInfoDomain(@PathVariable("custId") Integer custId) {
        return custBasicInfoClient.getCustBasicInfoDomain(custId);
    }

    @ApiOperation("新增客户基本信息（返回dto）")
    @RequestMapping(value = "/cust/basicInfo/join", method = RequestMethod.POST)
    public RestResponse<CustBasicInfoDto> joinCustBasicInfoDto(HttpServletRequest request, @RequestBody CustBasicInfoDto dto) {
        CustBasicInfoDto custBasicInfoDto =null;
        RestResponse<CustBasicInfoDto> restResponse = custBasicInfoClient.joinCustBasicInfoDto(dto);
        if (restResponse != null && RestResponse.SUCCESS.equalsIgnoreCase(restResponse.getStatus())) {
             custBasicInfoDto = restResponse.getResponse();
        }
        return restResponse;
    }


    @ApiOperation("客户基本信息列表（加模糊条件查询）(可以根据一些条件，多情况使用)")
    @RequestMapping(value = "/cust/basicInfo/list", method = RequestMethod.POST)
    public PageableDto<CustBasicInfoDto> getByConditions(@RequestBody CustBasicInfoConditionDto conditionDto) {
        if (StringUtils.isEmpty(conditionDto.getHighestDegreeStringArray())) {
            conditionDto.setHighestDegreeStringArray("B,C");
        }
        conditionDto.setQq("NULL");
        return custBasicInfoClient.getByConditions(conditionDto);
    }

//    @RequestMapping(value = "/cust/location/{custId}", method = RequestMethod.POST)
//    public RestResponse<Map<String, String>> getCustAddress(@PathVariable(value = "custId") Integer custId) {
//        return custBasicInfoClient.getCustAddress(custId);
//    }

    @RequestMapping(value = "/cust/basicInfo/join/udpateByBatch", method = RequestMethod.POST)
    public RestResponse<Integer> udpateByBatch(@RequestBody Map<String, String> params) {
        return custBasicInfoClient.udpateByBatch(params);
    }
    

}
