package com.jiuyi.alps.nka.service.schedule;

import com.jiuyi.alps.nka.dao.cust.CustBasicInfoDao;
import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import com.jiuyi.alps.nka.service.common.ServiceInstanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 定时从fruad获取数据，贷后
 * Created by renpeng on 2018/7/3
 */
@Component
public class GetDataFromFraudSchedule {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Value("#{'${timer.get-data-from-fraud.servers}'.split(',')}")
    private List<String> servers;
    @Autowired
    private CustBasicInfoDao custBasicInfoDao;
    @Autowired
    private ServiceInstanceService serviceInstanceService;

    @Scheduled(cron = "${timer.get-data-from-fraud.cron}")
    public void sendDataSchedule() throws Exception {
        int serviceIndex = serviceInstanceService.getServiceIndex(servers);
        if (serviceIndex == -1) {
            return;
        }
        int serviceCount = serviceInstanceService.getServiceCount(servers);
        try {
            logger.info("[同盾贷后]send data to fraud");
            Date startProgessTime = new Date();

            List<CustBasicInfoDomain> custBasicInfoDomains = custBasicInfoDao.findByIdentNo("11111").stream()
                    .filter(custBasicInfoDomain -> custBasicInfoDomain.getCustId() % serviceCount == serviceIndex)
                    .collect(Collectors.toList());

            Date endProgessTime = new Date();
            long interval = (endProgessTime.getTime() - startProgessTime.getTime())/1000;
            logger.info("[同盾贷后]获取同盾贷后数据：获取同盾贷后数据用时{}秒",interval);
        } catch (Exception e) {
            logger.error("[同盾贷后]获取同盾贷后数据：出错", e);
        }
        logger.info("[同盾贷后]获取同盾贷后数据：结束");
    }

}
