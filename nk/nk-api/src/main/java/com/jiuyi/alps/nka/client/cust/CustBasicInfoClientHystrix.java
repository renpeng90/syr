package com.jiuyi.alps.nka.client.cust;

import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoConditionDto;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto;
import common.dto.PageableDto;
import common.rest.RestResponse;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by lixiaolei on 2017/2/28.
 */
@Component
public class CustBasicInfoClientHystrix implements CustBasicInfoClient {
    @Override
    public RestResponse<CustBasicInfoDto> getCustBasicInfoDto(Integer custId) {
        System.out.println("getCustBasicInfoDto  错误");
        return null;
    }

    @Override
    public RestResponse<CustBasicInfoDto> joinCustBasicInfoDto(CustBasicInfoDto dto) {
        System.out.println("joinCustBasicInfoDto  错误");
        return null;
    }

    @Override
    public RestResponse<CustBasicInfoDomain> getCustBasicInfoDomain(Integer custId) {
        System.out.println("getCustBasicInfoDomain  错误");
        return null;
    }

    @Override
    public RestResponse<Boolean> checkRepeatIdentNo(String identNo, Integer custId, String applyNo) {
        System.out.println("checkRepeatIdentNo  错误");
        return null;
    }

    @Override
    public PageableDto<CustBasicInfoDto> getByConditions(CustBasicInfoConditionDto conditionDto) {
        System.out.println("getByConditions  错误");
        return null;
    }

    @Override
    public RestResponse<Integer> udpateByBatch(Map<String, String> params) {
        System.out.println("udpateByBatch  错误");
        return null;
    }
}
