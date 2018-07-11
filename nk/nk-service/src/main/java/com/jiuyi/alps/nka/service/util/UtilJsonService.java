package com.jiuyi.alps.nka.service.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import common.util.ceshidata.ceshiData.JsonData;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author renpeng
 * @date 2018/6/6
 */
@Service
public class UtilJsonService {

    private Logger logger = LoggerFactory.getLogger(getClass());
//    yyyyMMdd
    public static final String DATE_8_DATE_STR = "20180606";

    //做json缓存的
    private static final int MAX_CACHE_SIZE = 8;
    private Map<String, JSONObject> cache = new LinkedHashMap<String, JSONObject>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, JSONObject> eldest) {
            return this.size() > MAX_CACHE_SIZE;
        }
    };

    /**
     * 先在缓冲中查询数据，如果没有就从数据库差，然后放到缓冲中
     * @param identNo
     * @return
     */
    public JSONObject getCarrierReportJson(String identNo) {
        JSONObject carrierReport = cache.get(identNo);
        if (carrierReport == null) {
            String carrierReportStr = "去查询json数据";//this.getCarrierReport(identNo);
            if (StringUtils.isBlank(carrierReportStr)) {
                return null;
            }
            carrierReport = JSONObject.parseObject(carrierReportStr);
            cache.put(identNo, carrierReport);
        }

        return carrierReport;
    }

    /**
     * 通过jsonUtil了解的使用方法
     * @return
     */
    public String findJson() {
        String carrierReportStr= JsonData.getCarrerInfo();
        JSONObject carrierReport = JSONObject.parseObject(carrierReportStr);
        if (carrierReport == null) {
            return null;
        }
        JSONArray callContactDetails = carrierReport.getJSONArray("call_contact_detail");
        boolean callBool = !(callContactDetails != null && callContactDetails.size() > 0);
        if (callBool) {
            return null;
        }
        //近6个月联系次数≥10次的联系人个数
        Integer sixMoreTenCount=0;
        for (int i = 0; i < callContactDetails.size(); i++) {
            JSONObject callContact = (JSONObject) callContactDetails.get(i);
            if (callContact != null) {
                Integer callCntSixm=(Integer) callContact.get("call_cnt_6m");
                if(callCntSixm!=null&&callCntSixm>=10){
                    sixMoreTenCount++;
                }
            }
        }
        return null;
    }






}
