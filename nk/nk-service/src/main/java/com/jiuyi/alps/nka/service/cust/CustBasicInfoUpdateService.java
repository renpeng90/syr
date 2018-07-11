package com.jiuyi.alps.nka.service.cust;

import com.jiuyi.alps.nka.dao.cust.CustBasicInfoDao;
import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.dto.cust.CustBasicInfoDto;
import com.jiuyi.alps.nka.error.NkaError;
import common.rest.exception.RestException;
import common.util.date.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 这个service专注于新增和修改的各种情况
 */
@Service
public class CustBasicInfoUpdateService {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private CustBasicInfoDao custBasicInfoDao;

    public void insert(CustBasicInfoDomain custBasicInfoDomain) {
        custBasicInfoDao.insert(custBasicInfoDomain);
    }

    public void update(CustBasicInfoDomain custBasicInfoDomain) {
        custBasicInfoDao.update(custBasicInfoDomain);
    }

    public CustBasicInfoDomain getCustBasicInfoDomainByCustId(Integer custId) {
        return custBasicInfoDao.findByCustId(custId);
    }


    public CustBasicInfoDomain saveOrUpdate(CustBasicInfoDomain custBasicInfo) {
        if (custBasicInfo == null) {
            throw new RestException(NkaError.NND_0101);
        }
        Integer custId = custBasicInfo.getCustId();
        CustBasicInfoDomain oldData = this.getCustBasicInfoDomainByCustId(custId);
        if (oldData == null) {
            this.insert(custBasicInfo);
            return custBasicInfo;
        } else {
            custBasicInfo.setId(oldData.getId());
            this.update(custBasicInfo);
            return custBasicInfo;
        }
    }

    /**
     * 对dto操作，增加和修改
     * @param dto
     * @return
     */
    public CustBasicInfoDto saveOrUpdateCustBasicInfoDto(CustBasicInfoDto dto) {
        if (dto == null) {
            throw new RestException(NkaError.NND_0101);
        }
        CustBasicInfoDomain custBasicInfoDomain =new CustBasicInfoDomain();
        custBasicInfoDomain.setCustId(dto.getCustId());
         custBasicInfoDomain=this.saveOrUpdate(custBasicInfoDomain);
         if(custBasicInfoDomain==null){
             return null;
         }
        return dto;
    }





    public CustBasicInfoDomain saveOrUpdateCustBasicInfoDomain(Integer custId, String qq, String wechat) {
        boolean isUpdate = false;
        CustBasicInfoDomain oldData = this.getCustBasicInfoDomainByCustId(custId);
        if (oldData != null) {
            isUpdate = true;
            oldData.setQq(qq);
            oldData.setWechat(wechat);
        }
        if (isUpdate) {
            custBasicInfoDao.update(oldData);
        } else {
            oldData = new CustBasicInfoDomain();
            oldData.setQq(qq);
            oldData.setWechat(wechat);
            custBasicInfoDao.insert(oldData);
        }

        return oldData;
    }
//    List<CustLoanApplyDto> custLoanApplyDtos = custLoanApplies.stream().map(custLoanApply -> {
//        CustLoanApplyDto dto = new CustLoanApplyDto();
//        BeanUtils.copyProperties(custLoanApply, dto);
//        return dto;
//    }).collect(Collectors.toList());

    /**
     * 批量修改
     * @param qq
     * @param highestDegrees
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int udpateByBatch(String qq, String... highestDegrees) {
        int count = 0;
        for (String highestDegree : highestDegrees) {
            count += custBasicInfoDao.udpateBySelect(qq, highestDegree);
        }
        return count;
    }



}
