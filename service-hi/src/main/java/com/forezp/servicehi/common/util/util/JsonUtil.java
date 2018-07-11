package com.forezp.servicehi.common.util.util;
/**
 一，几个基本概念
 ①JSONArray 相当于 JAVA中的List<Object>，如：['a','b','c'....]
 ②JSONObject相当于JAVA中的Map<String, Object>，如：{'1':'a', '2':'b'...}
 */


/**
 * @author renpeng
 * @date 2018/5/25
 */
public class JsonUtil {

    /**
     *
     {
        "array": [
         1,
         2,
         3
         ],
         "arraylist": [{
         "a": "b",
         "c": "d",
         "e": "f"
         },
         {
         "a": "b",
         "c": "d",
         "e": "f"
         },
         {
         "a": "b",
         "c": "d",
         "e": "f"
         }
         ],
         "object": {
         "a": "b",
         "c": "d",
         "e": "f"
         },
         "string": "Hello World"
     }
     * @return
     */
    public static String getJsonDataA ="{\n" +
                "  \"array\": [\n" +
                "    1,\n" +
                "    2,\n" +
                "    3\n" +
                "  ],\n" +
                "  \"arraylist\": [\n" +
                "    {\n" +
                "      \"a\": \"b\",\n" +
                "      \"c\": \"d\",\n" +
                "      \"e\": \"f\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"a\": \"b\",\n" +
                "      \"c\": \"d\",\n" +
                "      \"e\": \"f\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"a\": \"b\",\n" +
                "      \"c\": \"d\",\n" +
                "      \"e\": \"f\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"object\": {\n" +
                "    \"a\": \"b\",\n" +
                "    \"c\": \"d\",\n" +
                "    \"e\": \"f\"\n" +
                "  },\n" +
                "  \"string\": \"Hello World\"\n" +
                "}";


//吧对象转为json
//    JSON.toJSONString(request);
//--------------//----------------------//

//    JSONObject personInfo=json.getJSONObject("user_basic");
//    JSONArray jsonArray = json.getJSONObject("user_basic");


//    private String getUserBasicItem(JSONArray jsonArray, String item) {
//
//        String result = null;
//        for (int i = 0; i < jsonArray.size(); i++) {
//            JSONObject detail = jsonArray.getJSONObject(i);
//            if (item.equals(detail.getString("key"))) {
//                return detail.getString("value");
//            }
//        }
//        return result;
//    }


//    JSONArray jsonArray = carrierReport.getJSONArray("user_info_check");
//    boolean callBool = !(jsonArray != null && jsonArray.size() > 0);
//        if (callBool) {
//        return null;
//    }
//        for (int i = 0; i < jsonArray.size(); i++) {
//        JSONObject detail = jsonArray.getJSONObject(i);
//        JSONObject detailCheckBlackInfo =detail.getJSONObject("check_black_info");
//        dto.setCarrierBlackList(detailCheckBlackInfo.getString("phone_gray_score"));
//        dto.setDirectCarrierInBlackList(detailCheckBlackInfo.getString("contacts_class1_blacklist_cnt"));
//    }

// // // // // // // // // // // // // // // // // // // // // // // // // //
//    //身份证组合过的其他姓名数量
//    //身份证组合过其他电话XXXXX
//    JSONObject carrierReport = moXieCarrierService.getCarrierReportJson(moXieCarrierBasicInfoDomain.getUserId());
//        if (carrierReport == null) {
//        return moXieCarrierBaseDto;
//    }
//    JSONArray callContactDetails = carrierReport.getJSONArray("user_info_check");
//    boolean callBool = !(callContactDetails != null && callContactDetails.size() > 0);
//        if (callBool) {
//        return moXieCarrierBaseDto;
//    }
//        for(int i=0;i<callContactDetails.size();i++){
//        JSONObject detail = callContactDetails.getJSONObject(i);
//        String a=detail.getString("check_search_info");
//        JSONObject check=detail.getJSONObject("check_search_info");
//        JSONArray idcardWithOtherNames=check.getJSONArray("idcard_with_other_names");
//        JSONArray idcardWithOtherPhones=check.getJSONArray("idcard_with_other_phones");
//        JSONArray phone_with_other_names=check.getJSONArray("phone_with_other_names");
//        JSONArray phone_with_other_idcards=check.getJSONArray("phone_with_other_idcards");
//
//        boolean otherNamesBool = (idcardWithOtherNames != null && idcardWithOtherNames.size() > 0);
//        if (otherNamesBool) {
//            moXieCarrierBaseDto.setIdcardWithOtherNames(idcardWithOtherNames.toString());
//        }
//        boolean otherPhonesBool = (idcardWithOtherPhones != null && idcardWithOtherPhones.size() > 0);
//        if (otherPhonesBool) {
//            moXieCarrierBaseDto.setIdcardWithOtherPhones(idcardWithOtherPhones.toString());
//        }
//    }
}
