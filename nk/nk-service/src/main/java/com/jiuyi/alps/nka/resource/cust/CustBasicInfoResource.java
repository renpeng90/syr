package com.jiuyi.alps.nka.resource.cust;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.jiuyi.alps.nka.client.cust.CustBasicInfoClient;
import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoConditionDto;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto2;
import com.jiuyi.alps.nka.error.NkaError;
import com.jiuyi.alps.nka.service.cust.CustBasicInfoService;
import com.jiuyi.alps.nka.service.cust.CustBasicInfoUpdateService;
import com.jiuyi.alps.nka.util.FieldNameConversionUtil;
import common.dto.PageableDto;
import common.rest.RestResponse;
import common.rest.RestResponseBuilder;
import common.rest.exception.RestException;
import common.util.date.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(tags = "cust-basic-info", description = "客户基础信息")
@RestController
public class CustBasicInfoResource implements CustBasicInfoClient {

    @Autowired
    private CustBasicInfoService custBasicInfoService;
    @Autowired
    private CustBasicInfoUpdateService custBasicInfoUpdateService;


    private static final Logger logger = LoggerFactory.getLogger(CustBasicInfoResource.class);

    @Override
    @ApiOperation("根据custId判断身份信息")
    @RequestMapping(value = "/cust/checkIdentNo/{identNo}/{custId}", method = RequestMethod.POST)
    public RestResponse<Boolean> checkRepeatIdentNo(@PathVariable(value = "identNo") String identNo,
                                                    @PathVariable(value = "custId") Integer custId,
                                                    @RequestParam(value = "applyNo", required = false) String applyNo) {
        CustBasicInfoDomain custBasicInfo = custBasicInfoService.findByIdentNo(identNo);
        if (custBasicInfo == null) {
            return new RestResponseBuilder().success(false);
        }
        return new RestResponseBuilder<Boolean>().success(!custBasicInfo.getCustId().equals(custId));
    }


    @Override
    @ApiOperation("根据custId获取客户基本信息（返回dto）")
    @RequestMapping(value = "/cust/basicInfo/dto/{custId}", method = RequestMethod.GET)
    public RestResponse<CustBasicInfoDto> getCustBasicInfoDto(@PathVariable("custId") Integer custId) {
        CustBasicInfoDto dto = custBasicInfoService.getCustBasicInfoDtoByCustId(custId);
        return new RestResponseBuilder().success(dto);
    }

    @ApiOperation("根据custId获取客户基本信息（返回domain）")
    @RequestMapping(value = "/cust/basicInfo/domain/{custId}", method = RequestMethod.GET)
    public RestResponse<CustBasicInfoDomain> getCustBasicInfoDomain(@PathVariable(value = "custId") Integer custId) {
        CustBasicInfoDomain custBasicInfo = custBasicInfoService.getCustBasicInfoDomainByCustId(custId);
        if (custBasicInfo == null) {
            logger.error("不存在的客户,custId = {}", custId);
            throw new RestException(NkaError.NND_0301);
        }
        return new RestResponseBuilder<CustBasicInfoDomain>().success(custBasicInfo);
    }
    @ApiOperation("根据custId获取客户基本信息（返回dto）(测试复制功能)")
    @RequestMapping(value = "/cust/basicInfo/dto/{custId}/dto2", method = RequestMethod.GET)
    public RestResponse<CustBasicInfoDto2> getCustBasicInfoDto2(@PathVariable(value = "custId") Integer custId) {
        CustBasicInfoDomain custBasicInfo = custBasicInfoService.getCustBasicInfoDomainByCustId(custId);
        CustBasicInfoDto2 custBasicInfoDto2=new CustBasicInfoDto2();
        //源头，目标（要保证一致才可以用）
        BeanUtils.copyProperties(custBasicInfo, custBasicInfoDto2);
        return new RestResponseBuilder<CustBasicInfoDto2>().success(custBasicInfoDto2);
    }
    @ApiOperation("新增客户基本信息（返回dto）")
    @RequestMapping(value = "/cust/basicInfo/join", method = RequestMethod.GET)
    public RestResponse<CustBasicInfoDto> joinCustBasicInfoDto(@RequestBody CustBasicInfoDto dto) {
        CustBasicInfoDto custBasicInfoDto = custBasicInfoUpdateService.saveOrUpdateCustBasicInfoDto(dto);
        if (custBasicInfoDto==null) {
            return new RestResponseBuilder<>().fail(custBasicInfoDto,NkaError.NND_0301.getCode(),"新增失败");
        }
        return new RestResponseBuilder<CustBasicInfoDto>().success(custBasicInfoDto);
    }
    @ApiOperation("异步--查询客户基本信息")
    @RequestMapping(value = "/cust/basicInfo/domain/{custId}/asyncUpdate", method = RequestMethod.GET)
    public RestResponse<CustBasicInfoDomain> udpateByAsync(@PathVariable(value = "custId") Integer custId) {
        ListenableFuture<CustBasicInfoDomain> future = custBasicInfoService.getCustBasicInfoDomainByAsync(custId);
        future.addCallback(new ListenableFutureCallback<CustBasicInfoDomain>() {
            @Override
            public void onFailure(Throwable throwable) {
                logger.error("失败",  throwable);
            }
            @Override
            public void onSuccess(CustBasicInfoDomain  custBasicInfoDomain) {
                logger.info("完成",  custBasicInfoDomain.getQq());
            }
        });
        logger.info("主程序执行完成时间"+DateUtil.getCurrentDateTime19());
        return new RestResponseBuilder<CustBasicInfoDomain>().success(null);
    }

    //批量分配借款申请,修改过来的
    @ApiOperation("批量修改客户基本信息,把选中的学历的人，改他们的qq")
    @RequestMapping(value = "/cust/basicInfo/join/udpateByBatch", method = RequestMethod.POST)
    public RestResponse<Integer> udpateByBatch(@RequestBody Map<String, String> params) {
        String highestDegrees = params.get("highestDegrees");
        String qq = params.get("qq");
        return new RestResponseBuilder<>().success(custBasicInfoUpdateService.udpateByBatch(qq, highestDegrees.split(",")));
    }

    @ApiOperation("根据Map获取客户基本信息（返回map）")
    @RequestMapping(value = "/cust/basicInfo/map", method = RequestMethod.POST)
    public RestResponse<Map<String, Object>> getCustBasicInfoMap(@RequestBody Map<String, Object> paramMaps) {
        Integer custId = (Integer) paramMaps.get("custId");
        String identNo = (String) paramMaps.get("identNo");
        Map<String, Object> result = Maps.newHashMapWithExpectedSize(2);
        if (true) {
            result.put("a", "111");
            result.put("b", 1);
        }
        return new RestResponseBuilder<>().success(result);
    }
    @ApiOperation("根据in的方式来查询（返回list）")
    @RequestMapping(value = "/cust/basicInfo/in", method = RequestMethod.GET)
    public RestResponse<List<CustBasicInfoDomain>> getCustBasicInfoDomainListByIn() {
        List<CustBasicInfoDomain> custBasicInfoDomainList= custBasicInfoService.getCustBasicInfoDomainListByIn();
        return new RestResponseBuilder<List<CustBasicInfoDomain>>().success(custBasicInfoDomainList);
    }

    @ApiOperation("客户基本信息列表（加模糊条件查询）(可以根据一些条件，多情况使用)")
//    @Override
    @RequestMapping(value = "/cust/basicInfo/list",method = RequestMethod.POST)
    public PageableDto<CustBasicInfoDto> getByConditions(@RequestBody CustBasicInfoConditionDto custBasicInfoConditionDto) {
        Map<String, String> map = Maps.newHashMapWithExpectedSize(10);
        map.put("mobile", custBasicInfoConditionDto.getMobile());
        map.put("name", custBasicInfoConditionDto.getName());
        map.put("gender", custBasicInfoConditionDto.getGender());
        map.put("qq", custBasicInfoConditionDto.getQq());
        map.put("createTimeBegin", custBasicInfoConditionDto.getCreateTimeBegin());
        map.put("createTimeEnd", custBasicInfoConditionDto.getCreateTimeEnd());

        //-------//可以根据一些条件，多情况使用
        if (StringUtils.isNotBlank(custBasicInfoConditionDto.getHighestDegreeStringArray())) {
            map.put("highestDegreeStringArray", custBasicInfoConditionDto.getHighestDegreeStringArray());
        }
        //-------//

        PageHelper.offsetPage(custBasicInfoConditionDto.getOffset(),custBasicInfoConditionDto.getLimit());
        if (StringUtils.isNotBlank(custBasicInfoConditionDto.getSort()) && StringUtils.isNotBlank(custBasicInfoConditionDto.getOrder())) {
            PageHelper.orderBy(FieldNameConversionUtil.fieldNameToColumnName(custBasicInfoConditionDto.getSort()) + " " + custBasicInfoConditionDto.getOrder());
        }
        List<CustBasicInfoDto> dtos = custBasicInfoService.getByConditions(map);
        PageInfo<CustBasicInfoDto> pageInfo = new PageInfo<>(dtos);
        PageableDto<CustBasicInfoDto> pageableDto = new PageableDto<>();
        pageableDto.setRows(dtos);
        pageableDto.setTotal(pageInfo.getTotal());
        return pageableDto;
    }




}
