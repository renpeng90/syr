package common.util.ceshidata;

/**
 * @author renpeng
 * @date 2018/5/25
 */
public class JsonUtil {


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
