package com.jiuyi.alps.nka.service.cust;

import com.jiuyi.alps.nka.dao.cust.CustBasicInfoDao;
import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto;
import common.util.date.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class CustBasicInfoService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CustBasicInfoDao custBasicInfoDao;


    public CustBasicInfoDomain getCustBasicInfoDomainByCustId(Integer custId) {
        return custBasicInfoDao.findByCustId(custId);
    }

    public CustBasicInfoDomain findByIdentNo(String identNo) {
        List<CustBasicInfoDomain> custBasicInfoDomains = custBasicInfoDao.findByIdentNo(identNo);
        for (CustBasicInfoDomain custBasicInfoDomain : custBasicInfoDomains) {
            custBasicInfoDomain.getCustId();
        }
        return null;
    }


    public CustBasicInfoDto getCustBasicInfoDtoByCustId(Integer custId) {
        CustBasicInfoDto custBasicInfoDto =new CustBasicInfoDto();
        CustBasicInfoDomain custBasicInfoDomain=custBasicInfoDao.findByCustId(custId);
        custBasicInfoDto.setCustId(custBasicInfoDomain.getCustId());
        return custBasicInfoDto;
    }

    public List<CustBasicInfoDomain> getCustBasicInfoDomainListByIn() {
        List<CustBasicInfoDomain>  custBasicInfoDomainList= custBasicInfoDao.findByPositions(Arrays.asList("B", "C"));
        return custBasicInfoDomainList;
    }

    /**
     * 列表加模糊查询
     * @param conditions
     * @return
     */
    public List<CustBasicInfoDto> getByConditions(Map<String, String> conditions) {
        String mobile = conditions.get("mobile");
        String name = conditions.get("name");
        String gender = conditions.get("gender");
        String qq = conditions.get("qq");
        String createTimeBegin = conditions.get("createTimeBegin");
        String createTimeEnd = conditions.get("createTimeEnd");
        if (StringUtils.isNotBlank(name)) {
            name = "%" + name + "%";
        }
        String highestDegreeStringArray = conditions.get("highestDegreeStringArray");
        List<String> highestDegrees = new ArrayList<>();
        if (StringUtils.isNotBlank(highestDegreeStringArray)) {
            for (String highestDegree : highestDegreeStringArray.split(",")) {
                highestDegrees.add(highestDegree);
            }
        }
        //这种方法主要是用在int类型，但是怎么才可以是String类型啊
        if (!CollectionUtils.isEmpty(highestDegrees)) {
            String s = highestDegrees.toString();
            String param = highestDegrees.toString().replace("[", "(").replace("]", ")");
            System.out.println(param);
        }

        List<CustBasicInfoDto> dtos = custBasicInfoDao.selectByConditions(mobile,
                name,gender,highestDegrees,qq,createTimeBegin,createTimeEnd);
        for (CustBasicInfoDto dto : dtos) {
            if(dto!=null){
                dto.setAge("0");
            }
        }
        return dtos;
    }

//    List<CustLoanApplyDto> custLoanApplyDtos = custLoanApplies.stream().map(custLoanApply -> {
//        CustLoanApplyDto dto = new CustLoanApplyDto();
//        BeanUtils.copyProperties(custLoanApply, dto);
//        return dto;
//    }).collect(Collectors.toList());


    @Async
    public ListenableFuture<CustBasicInfoDomain> getCustBasicInfoDomainByAsync(Integer custId) {
        CustBasicInfoDomain custBasicInfoDomain = this.getCustBasicInfoDomainByCustId(custId);
        logger.info("异步程序执行完成时间"+ DateUtil.getCurrentDateTime19());
        return new AsyncResult<>(custBasicInfoDomain);
    }
}
