package com.jiuyi.alps.nka.client.cust;

import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoConditionDto;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto;
import common.dto.PageableDto;
import common.rest.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@FeignClient(value = "nnd-service")
public interface CustBasicInfoClient {

//    @RequestMapping(value = "/cust/basicInfo", method = RequestMethod.POST)
//    RestResponse<Map<String, Object>> saveBasicInfo(@RequestBody CustBasicInfoDto custBasicInfoDto);

    @RequestMapping(value = "/cust/basicInfo/{custId}", method = RequestMethod.GET)
    RestResponse<CustBasicInfoDto> getCustBasicInfoDto(@PathVariable("custId") Integer custId);

    @RequestMapping(value = "/cust/basicInfo/join", method = RequestMethod.POST)
    RestResponse<CustBasicInfoDto> joinCustBasicInfoDto(@RequestBody CustBasicInfoDto dto);

    @RequestMapping(value = "/cust/basicInfo/domain/{custId}", method = RequestMethod.GET)
    RestResponse<CustBasicInfoDomain> getCustBasicInfoDomain(@PathVariable(value = "custId") Integer custId);
//
//    @RequestMapping(value = "/cust/location/{custId}", method = RequestMethod.POST)
//    RestResponse<Map<String, String>> getCustAddress(@PathVariable(value = "custId") Integer custId);
//
    @RequestMapping(value = "/cust/checkIdentNo/{identNo}/{custId}", method = RequestMethod.POST)
    RestResponse<Boolean> checkRepeatIdentNo(@PathVariable(value = "identNo") String identNo, @PathVariable(value = "custId") Integer custId,@RequestParam(value = "applyNo", required = false) String applyNo);

    @RequestMapping(value = "/loan/approval",method = RequestMethod.POST)
    PageableDto<CustBasicInfoDto> getByConditions(@RequestBody CustBasicInfoConditionDto conditionDto);

    @RequestMapping(value = "/cust/basicInfo/join/udpateByBatch", method = RequestMethod.POST)
    RestResponse<Integer> udpateByBatch(@RequestBody Map<String, String> params);
}
