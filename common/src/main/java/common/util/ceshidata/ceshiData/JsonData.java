package common.util.ceshidata.ceshiData;

/**
 * @author renpeng
 * @date 2018/6/5
 */
public class JsonData {

    /**
     * 运营商的数据
     * @return
     */
    public static String getCarrerInfo(){
//        String a="{report:[{key:data_type,value:运营商},{key:source_name,value:chinamobilebj},{key:source_name_zh,value:北京移动},{key:data_gain_time,value:2018-05-21},{key:task_id,value:b06b0b30-5ca3-11e8-a991-00163e13f173},{key:update_time,value:2018-05-21 11:04:34},{key:version,value:1.0}],user_basic:[{key:name,value:赵肖静},{key:id_card,value:130925198707135649},{key:gender,value:女},{key:age,value:30},{key:constellation,value:巨蟹座},{key:province,value:河北省},{key:city,value:沧洲市},{key:region,value:盐山县},{key:native_place\"value:河北省沧洲市盐山县}],cell_phone:[{\"key\":\"mobile\",\"value\":\"15801348636\"},{\"key\":\"carrier_name\",\"value\":\"赵肖静\"},{\"key\":\"carrier_idcard\",\"value\":\"运营商未提供身份证\"},{\"key\":\"reg_time\",\"value\":\"2014-01-19 00:00:00\"},{\"key\":\"in_time\",\"value\":\"53\"},{\"key\":\"email\",\"value\":\"运营商未提供邮箱\"},{\"key\":\"address\",\"value\":\"北京市昌平区回龙观天慧园三单元201室\"},{\"key\":\"reliability\",\"value\":\"实名认证\"},{\"key\":\"phone_attribution\",\"value\":\"北京\"},{\"key\":\"live_address\",\"value\":\"北京\"},{\"key\":\"available_balance\",\"value\":\"9202\"},{\"key\":\"package_name\",\"value\":\"新神州行B和4G套餐58套餐\"},{\"key\":\"bill_certification_day\",\"value\":\"2018-05-31\"}],\"basic_check_items\":[{\"result\":\"无数据\",\"comment\":null,\"check_item\":\"idcard_check\"},{\"result\":\"未提供邮箱\",\"comment\":null,\"check_item\":\"email_check\"},{\"result\":\"通过检验\",\"comment\":null,\"check_item\":\"address_check\"},{\"result\":\"通话记录正常\",\"comment\":null,\"check_item\":\"call_data_check\"},{\"result\":\"运营商未提供身份证\",\"comment\":null,\"check_item\":\"idcard_match\"},{\"result\":\"匹配成功\",\"comment\":null,\"check_item\":\"name_match\"},{\"result\":\"否\",\"comment\":null,\"check_item\":\"is_name_and_idcard_in_court_black\"},{\"result\":\"否\",\"comment\":\"\",\"check_item\":\"is_name_and_idcard_in_finance_black\"},{\"result\":\"否\",\"comment\":\"\",\"check_item\":\"is_name_and_mobile_in_finance_black\"},{\"result\":\"6\",\"comment\":null,\"check_item\":\"mobile_silence_3m\"},{\"result\":\"6\",\"comment\":null,\"check_item\":\"mobile_silence_6m\"},{\"result\":\"0\",\"comment\":null,\"check_item\":\"arrearage_risk_3m\"},{\"result\":\"0\",\"comment\":null,\"check_item\":\"arrearage_risk_6m\"},{\"result\":\"10\",\"comment\":null,\"check_item\":\"binding_risk\"}],\"behavior_check\":[{\"result\":\"朋友圈主要活跃在北京地区(居住地)\",\"evidence\":\"北京地区通话时间占比为76%\",\"score\":1,\"check_point\":\"regular_circle\",\"check_point_cn\":\"朋友圈在哪里\"},{\"result\":\"长期使用（24个月以上，包含24）\",\"evidence\":\"根据号码[15801348636]运营商提供的认证时间,推算该号码使用53个月\",\"score\":1,\"check_point\":\"phone_used_time\",\"check_point_cn\":\"号码使用时间\"},{\"result\":\"180天内有62天无通话记录\",\"evidence\":\"根据运营商通话详单数据，连续三天以上无通话记录5次：2017-11-23 - 2017-11-27, 3天；2018-01-07 - 2018-01-12, 4天；2018-01-12 - 2018-01-16, 3天；2018-02-14 - 2018-02-18, 3天；2018-04-04 - 2018-04-08, 3天\",\"score\":2,\"check_point\":\"phone_silent\",\"check_point_cn\":\"手机静默情况\"},{\"result\":\"关机共62天\",\"evidence\":\"根据运营商详单数据，180天内关机62天，连续三天以上关机2次\",\"score\":2,\"check_point\":\"phone_power_off\",\"check_point_cn\":\"关机情况\"},{\"result\":\"数量正常（10 - 100）\",\"evidence\":\"互通过电话的号码有12个，比例为19%\",\"score\":1,\"check_point\":\"contact_each_other\",\"check_point_cn\":\"互通过电话的号码数量\"},{\"result\":\"无通话记录\",\"evidence\":\"未发现与澳门地区电话通话记录\",\"score\":1,\"check_point\":\"contact_macao\",\"check_point_cn\":\"与澳门地区电话通话情况\"},{\"result\":\"无通话记录\",\"evidence\":\"未发现与110电话通话记录\",\"score\":1,\"check_point\":\"contact_110\",\"check_point_cn\":\"与110电话通话情况\"},{\"result\":\"无通话记录\",\"evidence\":\"未发现与120电话通话记录\",\"score\":1,\"check_point\":\"contact_120\",\"check_point_cn\":\"与120电话通话情况\"},{\"result\":\"无通话记录\",\"evidence\":\"未发现与律师电话通话记录\",\"score\":1,\"check_point\":\"contact_lawyer\",\"check_point_cn\":\"与律师电话通话情况\"},{\"result\":\"无通话记录\",\"evidence\":\"未发现与法院电话通话记录\",\"score\":1,\"check_point\":\"contact_court\",\"check_point_cn\":\"与法院电话通话情况\"},{\"result\":\"无该类号码记录\",\"evidence\":\"未找到贷款类相关号码\",\"score\":1,\"check_point\":\"contact_loan\",\"check_point_cn\":\"与贷款类号码联系情况\"},{\"result\":\"无该类号码记录\",\"evidence\":\"未找到银行类相关号码\",\"score\":1,\"check_point\":\"contact_bank\",\"check_point_cn\":\"与银行类号码联系情况\"},{\"result\":\"无该类号码记录\",\"evidence\":\"未找到信用卡类相关号码\",\"score\":1,\"check_point\":\"contact_credit_card\",\"check_point_cn\":\"与信用卡类号码联系情况\"},{\"result\":\"很少夜间活动（低于20%)\",\"evidence\":\"晚间活跃频率占全天的0.3%\",\"score\":1,\"check_point\":\"contact_night\",\"check_point_cn\":\"夜间活动情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"dwell_used_time\",\"check_point_cn\":\"居住地本地（省份）地址在电商中使用时长\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"ebusiness_info\",\"check_point_cn\":\"总体电商使用情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"person_ebusiness_info\",\"check_point_cn\":\"申请人本人电商使用情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"virtual_buying\",\"check_point_cn\":\"虚拟商品购买情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"lottery_buying\",\"check_point_cn\":\"彩票购买情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"person_addr_changed\",\"check_point_cn\":\"申请人本人地址变化情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供学信网数据\",\"score\":0,\"check_point\":\"school_status\",\"check_point_cn\":\"申请人的学籍状态是否为在校学生\"},{\"result\":\"无数据\",\"evidence\":\"未提供学历数据\",\"score\":0,\"check_point\":\"education_info\",\"check_point_cn\":\"申请人的学历情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"work_addr_info\",\"check_point_cn\":\"申请人本人最近使用工作地址情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"live_addr_info\",\"check_point_cn\":\"申请人本人最近使用居住地址情况\"},{\"result\":\"无数据\",\"evidence\":\"未提供电商数据\",\"score\":0,\"check_point\":\"school_addr_info\",\"check_point_cn\":\"申请人本人最近使用学校地址情况\"}],\"friend_circle\":{\"summary\":[{\"key\":\"friend_num_3m\",\"value\":\"27\"},{\"key\":\"good_friend_num_3m\",\"value\":\"1\"},{\"key\":\"friend_city_center_3m\",\"value\":\"北京\"},{\"key\":\"is_city_match_friend_city_center_3m\",\"value\":\"是\"},{\"key\":\"inter_peer_num_3m\",\"value\":\"6\"},{\"key\":\"friend_num_6m\",\"value\":\"62\"},{\"key\":\"good_friend_num_6m\",\"value\":\"1\"},{\"key\":\"friend_city_center_6m\",\"value\":\"北京\"},{\"key\":\"is_city_match_friend_city_center_6m\",\"value\":\"是\"},{\"key\":\"inter_peer_num_6m\",\"value\":\"12\"}],\"peer_num_top_list\":[{\"key\":\"peer_num_top3_3m\",\"top_item\":[{\"peer_number\":\"15010538023\",\"peer_num_loc\":\"北京\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt\":91,\"call_time\":3571,\"dial_cnt\":59,\"dialed_cnt\":32,\"dial_time\":2431,\"dialed_time\":1140},{\"peer_number\":\"13651090861\",\"peer_num_loc\":\"北京\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt\":8,\"call_time\":1049,\"dial_cnt\":3,\"dialed_cnt\":5,\"dial_time\":309,\"dialed_time\":740},{\"peer_number\":\"18600362114\",\"peer_num_loc\":\"北京\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt\":6,\"call_time\":233,\"dial_cnt\":5,\"dialed_cnt\":1,\"dial_time\":133,\"dialed_time\":100}]},{\"key\":\"peer_num_top3_6m\",\"top_item\":[{\"peer_number\":\"15010538023\",\"peer_num_loc\":\"北京\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt\":150,\"call_time\":5355,\"dial_cnt\":94,\"dialed_cnt\":56,\"dial_time\":3357,\"dialed_time\":1998},{\"peer_number\":\"13651090861\",\"peer_num_loc\":\"北京\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt\":10,\"call_time\":1348,\"dial_cnt\":5,\"dialed_cnt\":5,\"dial_time\":608,\"dialed_time\":740},{\"peer_number\":\"13930714070\",\"peer_num_loc\":\"沧州\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt\":8,\"call_time\":443,\"dial_cnt\":3,\"dialed_cnt\":5,\"dial_time\":222,\"dialed_time\":221}]}],\"location_top_list\":[{\"key\":\"location_top3_3m\",\"top_item\":[{\"location\":\"北京\",\"peer_number_cnt\":17,\"call_cnt\":122,\"call_time\":5897,\"dial_cnt\":69,\"dialed_cnt\":53,\"dial_time\":3161,\"dialed_time\":2736},{\"location\":\"沧州\",\"peer_number_cnt\":3,\"call_cnt\":6,\"call_time\":331,\"dial_cnt\":3,\"dialed_cnt\":3,\"dial_time\":194,\"dialed_time\":137},{\"location\":\"张家口\",\"peer_number_cnt\":1,\"call_cnt\":4,\"call_time\":785,\"dial_cnt\":2,\"dialed_cnt\":2,\"dial_time\":238,\"dialed_time\":547}]},{\"key\":\"location_top3_6m\",\"top_item\":[{\"location\":\"北京\",\"peer_number_cnt\":44,\"call_cnt\":222,\"call_time\":8830,\"dial_cnt\":117,\"dialed_cnt\":105,\"dial_time\":4679,\"dialed_time\":4151},{\"location\":\"沧州\",\"peer_number_cnt\":3,\"call_cnt\":13,\"call_time\":1036,\"dial_cnt\":6,\"dialed_cnt\":7,\"dial_time\":315,\"dialed_time\":721},{\"location\":\"张家口\",\"peer_number_cnt\":1,\"call_cnt\":7,\"call_time\":988,\"dial_cnt\":2,\"dialed_cnt\":5,\"dial_time\":238,\"dialed_time\":750}]}]},\"cell_behavior\":[{\"behavior\":[{\"sms_cnt\":0,\"cell_phone_num\":\"15801348636\",\"net_flow\":1695352,\"total_amount\":5800,\"cell_mth\":\"2018-05\",\"cell_loc\":\"北京\",\"cell_operator_zh\":\"北京移动\",\"cell_operator\":\"chinamobilebj\",\"call_cnt\":21,\"call_time\":869,\"dial_cnt\":13,\"dial_time\":333,\"dialed_cnt\":8,\"dialed_time\":536,\"rechange_cnt\":0,\"rechange_amount\":0},{\"sms_cnt\":0,\"cell_phone_num\":\"15801348636\",\"net_flow\":0,\"total_amount\":6800,\"cell_mth\":\"2018-04\",\"cell_loc\":\"北京\",\"cell_operator_zh\":\"北京移动\",\"cell_operator\":\"chinamobilebj\",\"call_cnt\":38,\"call_time\":1927,\"dial_cnt\":18,\"dial_time\":798,\"dialed_cnt\":20,\"dialed_time\":1129,\"rechange_cnt\":1,\"rechange_amount\":10000},{\"sms_cnt\":0,\"cell_phone_num\":\"15801348636\",\"net_flow\":2316451,\"total_amount\":5800,\"cell_mth\":\"2018-03\",\"cell_loc\":\"北京\",\"cell_operator_zh\":\"北京移动\",\"cell_operator\":\"chinamobilebj\",\"call_cnt\":69,\"call_time\":3690,\"dial_cnt\":38,\"dial_time\":1988,\"dialed_cnt\":31,\"dialed_time\":1702,\"rechange_cnt\":0,\"rechange_amount\":0},{\"sms_cnt\":1,\"cell_phone_num\":\"15801348636\",\"net_flow\":1203259,\"total_amount\":5974,\"cell_mth\":\"2018-02\",\"cell_loc\":\"北京\",\"cell_operator_zh\":\"北京移动\",\"cell_operator\":\"chinamobilebj\",\"call_cnt\":47,\"call_time\":2701,\"dial_cnt\":25,\"dial_time\":1515,\"dialed_cnt\":22,\"dialed_time\":1186,\"rechange_cnt\":1,\"rechange_amount\":10000},{\"sms_cnt\":0,\"cell_phone_num\":\"15801348636\",\"net_flow\":383392,\"total_amount\":5800,\"cell_mth\":\"2018-01\",\"cell_loc\":\"北京\",\"cell_operator_zh\":\"北京移动\",\"cell_operator\":\"chinamobilebj\",\"call_cnt\":25,\"call_time\":720,\"dial_cnt\":13,\"dial_time\":306,\"dialed_cnt\":12,\"dialed_time\":414,\"rechange_cnt\":0,\"rechange_amount\":0},{\"sms_cnt\":3,\"cell_phone_num\":\"15801348636\",\"net_flow\":112744,\"total_amount\":5845,\"cell_mth\":\"2017-12\",\"cell_loc\":\"北京\",\"cell_operator_zh\":\"北京移动\",\"cell_operator\":\"chinamobilebj\",\"call_cnt\":57,\"call_time\":1536,\"dial_cnt\":23,\"dial_time\":733,\"dialed_cnt\":34,\"dialed_time\":803,\"rechange_cnt\":1,\"rechange_amount\":10000}],\"phone_num\":\"15801348636\"}],\"call_contact_detail\":[{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15010538023\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":8,\"call_cnt_1m\":27,\"call_cnt_3m\":91,\"call_cnt_6m\":150,\"call_time_3m\":3571,\"call_time_6m\":5355,\"dial_cnt_3m\":59,\"dial_cnt_6m\":94,\"dial_time_3m\":2431,\"dial_time_6m\":3357,\"dialed_cnt_3m\":32,\"dialed_cnt_6m\":56,\"dialed_time_3m\":1140,\"dialed_time_6m\":1998,\"call_cnt_morning_3m\":2,\"call_cnt_morning_6m\":6,\"call_cnt_noon_3m\":1,\"call_cnt_noon_6m\":5,\"call_cnt_afternoon_3m\":11,\"call_cnt_afternoon_6m\":16,\"call_cnt_evening_3m\":76,\"call_cnt_evening_6m\":122,\"call_cnt_night_3m\":1,\"call_cnt_night_6m\":1,\"call_cnt_weekday_3m\":67,\"call_cnt_weekday_6m\":115,\"call_cnt_weekend_3m\":22,\"call_cnt_weekend_6m\":31,\"call_cnt_holiday_3m\":2,\"call_cnt_holiday_6m\":4,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-11-27 19:49:15\",\"trans_end\":\"2018-05-18 21:38:33\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13651090861\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":8,\"call_cnt_6m\":10,\"call_time_3m\":1049,\"call_time_6m\":1348,\"dial_cnt_3m\":3,\"dial_cnt_6m\":5,\"dial_time_3m\":309,\"dial_time_6m\":608,\"dialed_cnt_3m\":5,\"dialed_cnt_6m\":5,\"dialed_time_3m\":740,\"dialed_time_6m\":740,\"call_cnt_morning_3m\":4,\"call_cnt_morning_6m\":4,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":3,\"call_cnt_evening_6m\":4,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":3,\"call_cnt_weekday_6m\":4,\"call_cnt_weekend_3m\":5,\"call_cnt_weekend_6m\":6,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-21 12:29:36\",\"trans_end\":\"2018-04-09 18:09:31\"},{\"city\":\"沧州\",\"p_relation\":\"\",\"peer_num\":\"13930714070\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":4,\"call_cnt_6m\":8,\"call_time_3m\":259,\"call_time_6m\":443,\"dial_cnt_3m\":1,\"dial_cnt_6m\":3,\"dial_time_3m\":122,\"dial_time_6m\":222,\"dialed_cnt_3m\":3,\"dialed_cnt_6m\":5,\"dialed_time_3m\":137,\"dialed_time_6m\":221,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":3,\"call_cnt_noon_3m\":1,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":2,\"call_cnt_afternoon_6m\":2,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":2,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":4,\"call_cnt_weekend_3m\":4,\"call_cnt_weekend_6m\":4,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-05 11:00:23\",\"trans_end\":\"2018-03-04 19:12:59\"},{\"city\":\"张家口\",\"p_relation\":\"\",\"peer_num\":\"15230332957\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":4,\"call_cnt_6m\":7,\"call_time_3m\":785,\"call_time_6m\":988,\"dial_cnt_3m\":2,\"dial_cnt_6m\":2,\"dial_time_3m\":238,\"dial_time_6m\":238,\"dialed_cnt_3m\":2,\"dialed_cnt_6m\":5,\"dialed_time_3m\":547,\"dialed_time_6m\":750,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":3,\"call_cnt_afternoon_6m\":4,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":3,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":3,\"call_cnt_weekend_3m\":3,\"call_cnt_weekend_6m\":3,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":1,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-08 21:44:48\",\"trans_end\":\"2018-03-31 15:01:52\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18600362114\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":6,\"call_cnt_6m\":6,\"call_time_3m\":233,\"call_time_6m\":233,\"dial_cnt_3m\":5,\"dial_cnt_6m\":5,\"dial_time_3m\":133,\"dial_time_6m\":133,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":100,\"dialed_time_6m\":100,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":2,\"call_cnt_noon_6m\":2,\"call_cnt_afternoon_3m\":2,\"call_cnt_afternoon_6m\":2,\"call_cnt_evening_3m\":2,\"call_cnt_evening_6m\":2,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":2,\"call_cnt_weekday_6m\":2,\"call_cnt_weekend_3m\":4,\"call_cnt_weekend_6m\":4,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-11 14:21:25\",\"trans_end\":\"2018-03-25 12:59:56\"},{\"city\":\"安庆\",\"p_relation\":\"\",\"peer_num\":\"17309661058\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":2,\"call_cnt_3m\":3,\"call_cnt_6m\":5,\"call_time_3m\":68,\"call_time_6m\":96,\"dial_cnt_3m\":2,\"dial_cnt_6m\":3,\"dial_time_3m\":28,\"dial_time_6m\":42,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":2,\"dialed_time_3m\":40,\"dialed_time_6m\":54,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":1,\"call_cnt_noon_6m\":3,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":3,\"call_cnt_weekday_6m\":5,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-06 12:14:29\",\"trans_end\":\"2018-05-11 12:15:53\"},{\"city\":\"沧州\",\"p_relation\":\"\",\"peer_num\":\"15226707712\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":4,\"call_time_3m\":54,\"call_time_6m\":575,\"dial_cnt_3m\":1,\"dial_cnt_6m\":2,\"dial_time_3m\":54,\"dial_time_6m\":75,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":2,\"dialed_time_3m\":0,\"dialed_time_6m\":500,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":3,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":1,\"call_cnt_weekend_6m\":2,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":2,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-04 11:30:01\",\"trans_end\":\"2018-03-04 16:16:53\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18612464349\",\"group_name\":\"旅游出行\",\"company_name\":\"滴滴/优步  已通过百度安全号码认证\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":4,\"call_time_3m\":0,\"call_time_6m\":106,\"dial_cnt_3m\":0,\"dial_cnt_6m\":3,\"dial_time_3m\":0,\"dial_time_6m\":77,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":29,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":4,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":4,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-03 19:42:42\",\"trans_end\":\"2018-02-03 19:58:31\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18511987751\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":4,\"call_time_3m\":0,\"call_time_6m\":33,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":4,\"dialed_time_3m\":0,\"dialed_time_6m\":33,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":4,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":4,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-14 09:42:49\",\"trans_end\":\"2017-12-14 09:46:13\"},{\"city\":\"全国\",\"p_relation\":\"\",\"peer_num\":\"4008306666\",\"group_name\":\"铁路航空\",\"company_name\":\"携程网订机票\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":3,\"call_time_3m\":0,\"call_time_6m\":352,\"dial_cnt_3m\":0,\"dial_cnt_6m\":3,\"dial_time_3m\":0,\"dial_time_6m\":352,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":3,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":3,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-14 15:23:11\",\"trans_end\":\"2018-02-14 15:27:53\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15801438879\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":3,\"call_cnt_6m\":3,\"call_time_3m\":201,\"call_time_6m\":201,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":3,\"dialed_cnt_6m\":3,\"dialed_time_3m\":201,\"dialed_time_6m\":201,\"call_cnt_morning_3m\":1,\"call_cnt_morning_6m\":1,\"call_cnt_noon_3m\":1,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":1,\"call_cnt_night_6m\":1,\"call_cnt_weekday_3m\":3,\"call_cnt_weekday_6m\":3,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-19 10:28:06\",\"trans_end\":\"2018-03-20 00:07:00\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18710085398\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"call_time_3m\":0,\"call_time_6m\":129,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":2,\"dialed_time_3m\":0,\"dialed_time_6m\":129,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":2,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":2,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-21 20:24:15\",\"trans_end\":\"2018-01-21 21:06:55\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15313196958\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"call_time_3m\":0,\"call_time_6m\":79,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":49,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":30,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":2,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":2,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-30 11:08:54\",\"trans_end\":\"2017-12-30 11:10:19\"},{\"city\":\"郑州\",\"p_relation\":\"\",\"peer_num\":\"13838591667\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"call_time_3m\":0,\"call_time_6m\":72,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":30,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":42,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":2,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":2,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-16 09:25:14\",\"trans_end\":\"2017-12-16 11:00:25\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13121704393\",\"group_name\":\"快递送餐\",\"company_name\":\"京东快递电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"call_time_3m\":0,\"call_time_6m\":72,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":45,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":27,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":2,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":2,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-11-27 12:53:23\",\"trans_end\":\"2017-11-27 13:24:48\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01067440894\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":2,\"call_cnt_6m\":2,\"call_time_3m\":44,\"call_time_6m\":44,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":2,\"dialed_cnt_6m\":2,\"dialed_time_3m\":44,\"dialed_time_6m\":44,\"call_cnt_morning_3m\":1,\"call_cnt_morning_6m\":1,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":2,\"call_cnt_weekday_6m\":2,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-27 10:12:59\",\"trans_end\":\"2018-03-28 19:18:47\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13522263595\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"call_time_3m\":0,\"call_time_6m\":33,\"dial_cnt_3m\":0,\"dial_cnt_6m\":2,\"dial_time_3m\":0,\"dial_time_6m\":33,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":1,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":2,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-16 09:55:11\",\"trans_end\":\"2018-01-07 14:23:01\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13717793641\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"call_time_3m\":0,\"call_time_6m\":31,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":25,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":6,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":2,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":2,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-27 12:11:08\",\"trans_end\":\"2017-12-27 12:13:32\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"17310639203\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"call_time_3m\":0,\"call_time_6m\":28,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":2,\"dialed_time_3m\":0,\"dialed_time_6m\":28,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":1,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-09 11:48:51\",\"trans_end\":\"2017-12-14 20:01:08\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01053181542\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":242,\"call_time_6m\":242,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":242,\"dialed_time_6m\":242,\"call_cnt_morning_3m\":1,\"call_cnt_morning_6m\":1,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-05-04 10:13:53\",\"trans_end\":\"2018-05-04 10:13:53\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18001223504\",\"group_name\":\"快递送餐\",\"company_name\":\"中通快递电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":156,\"call_time_6m\":156,\"dial_cnt_3m\":1,\"dial_cnt_6m\":1,\"dial_time_3m\":156,\"dial_time_6m\":156,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-25 19:11:42\",\"trans_end\":\"2018-04-25 19:11:42\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13261175324\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":132,\"call_time_6m\":132,\"dial_cnt_3m\":1,\"dial_cnt_6m\":1,\"dial_time_3m\":132,\"dial_time_6m\":132,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-25 19:15:30\",\"trans_end\":\"2018-04-25 19:15:30\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01053185934\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":115,\"call_time_6m\":115,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":115,\"dialed_time_6m\":115,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-05-04 16:36:18\",\"trans_end\":\"2018-05-04 16:36:18\"},{\"city\":\"全国\",\"p_relation\":\"\",\"peer_num\":\"4008895543\",\"group_name\":\"快递送餐\",\"company_name\":\"申通快递有限公司\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":104,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":104,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":1,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-09 12:22:36\",\"trans_end\":\"2017-12-09 12:22:36\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15810437127\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":82,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":82,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-23 14:19:11\",\"trans_end\":\"2018-01-23 14:19:11\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01081758030\",\"group_name\":\"其他\",\"company_name\":\"昌平区北七家镇名佳花园社区居委会\",\"call_cnt_1w\":0,\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":37,\"call_time_6m\":37,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":37,\"dialed_time_6m\":37,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-27 14:04:43\",\"trans_end\":\"2018-04-27 14:04:43\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01080455931\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":35,\"call_time_6m\":35,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":35,\"dialed_time_6m\":35,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-26 14:37:32\",\"trans_end\":\"2018-03-26 14:37:32\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13911575376\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":30,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":30,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":1,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-30 17:15:14\",\"trans_end\":\"2017-12-30 17:15:14\"},{\"city\":\"沈阳\",\"p_relation\":\"\",\"peer_num\":\"17640103678\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":29,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":29,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-18 12:07:49\",\"trans_end\":\"2018-01-18 12:07:49\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01058461699\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":22,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":22,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-16 16:28:06\",\"trans_end\":\"2018-01-16 16:28:06\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01064789878\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":22,\"call_time_6m\":22,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":22,\"dialed_time_6m\":22,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-22 14:43:15\",\"trans_end\":\"2018-02-22 14:43:15\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13331004569\",\"group_name\":\"快递送餐\",\"company_name\":\"京东快递电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":19,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":19,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":1,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-18 16:52:39\",\"trans_end\":\"2018-02-18 16:52:39\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15321515966\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":19,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":19,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-08 11:33:26\",\"trans_end\":\"2017-12-08 11:33:26\"},{\"city\":\"沈阳\",\"p_relation\":\"\",\"peer_num\":\"15541952096\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":19,\"call_time_6m\":19,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":19,\"dialed_time_6m\":19,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-18 17:06:42\",\"trans_end\":\"2018-04-18 17:06:42\"},{\"city\":\"沧州\",\"p_relation\":\"\",\"peer_num\":\"13930709179\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":18,\"call_time_6m\":18,\"dial_cnt_3m\":1,\"dial_cnt_6m\":1,\"dial_time_3m\":18,\"dial_time_6m\":18,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":1,\"call_cnt_holiday_6m\":1,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-21 21:03:01\",\"trans_end\":\"2018-02-21 21:03:01\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13661142215\",\"group_name\":\"旅游出行\",\"company_name\":\"出租车电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":18,\"call_time_6m\":18,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":18,\"dialed_time_6m\":18,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":1,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-19 23:13:17\",\"trans_end\":\"2018-03-19 23:13:17\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15330003575\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":16,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":16,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-14 19:26:05\",\"trans_end\":\"2017-12-14 19:26:05\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18519883202\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":16,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":16,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-29 13:38:26\",\"trans_end\":\"2018-01-29 13:38:26\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"17310851285\",\"group_name\":\"快递送餐\",\"company_name\":\"快递电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":15,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":15,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-11-28 11:59:46\",\"trans_end\":\"2017-11-28 11:59:46\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18810915264\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":15,\"dial_cnt_3m\":0,\"dial_cnt_6m\":1,\"dial_time_3m\":0,\"dial_time_6m\":15,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":0,\"dialed_time_3m\":0,\"dialed_time_6m\":0,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-15 12:14:13\",\"trans_end\":\"2017-12-15 12:14:13\"},{\"city\":\"济南\",\"p_relation\":\"\",\"peer_num\":\"13156445069\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":15,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":15,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":1,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-09 15:01:56\",\"trans_end\":\"2017-12-09 15:01:56\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13718412809\",\"group_name\":\"快递送餐\",\"company_name\":\"快递电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":14,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":14,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-18 12:06:34\",\"trans_end\":\"2017-12-18 12:06:34\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13522123533\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":13,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":13,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-02 12:28:54\",\"trans_end\":\"2018-02-02 12:28:54\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18811153691\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":13,\"call_time_6m\":13,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":13,\"dialed_time_6m\":13,\"call_cnt_morning_3m\":1,\"call_cnt_morning_6m\":1,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-05-11 10:24:06\",\"trans_end\":\"2018-05-11 10:24:06\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13301283705\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":12,\"call_time_6m\":12,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":12,\"dialed_time_6m\":12,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-01 14:11:04\",\"trans_end\":\"2018-03-01 14:11:04\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01053933979\",\"group_name\":\"骚扰电话\",\"company_name\":\"骚扰电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":11,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":11,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-05 11:37:07\",\"trans_end\":\"2018-02-05 11:37:07\"},{\"city\":\"苏州\",\"p_relation\":\"\",\"peer_num\":\"13270470696\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":11,\"call_time_6m\":11,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":11,\"dialed_time_6m\":11,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":1,\"call_cnt_weekend_6m\":1,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-15 14:29:45\",\"trans_end\":\"2018-04-15 14:29:45\"},{\"city\":\"邢台\",\"p_relation\":\"\",\"peer_num\":\"13231973700\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":11,\"call_time_6m\":11,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":11,\"dialed_time_6m\":11,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-06 15:59:07\",\"trans_end\":\"2018-03-06 15:59:07\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15611953268\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":11,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":11,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-15 15:41:29\",\"trans_end\":\"2017-12-15 15:41:29\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18618467489\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":11,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":11,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":0,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":1,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-10 13:32:11\",\"trans_end\":\"2017-12-10 13:32:11\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15910256443\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":10,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":10,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-16 12:15:30\",\"trans_end\":\"2018-01-16 12:15:30\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"01086485966\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":10,\"call_time_6m\":10,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":10,\"dialed_time_6m\":10,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-19 15:26:07\",\"trans_end\":\"2018-04-19 15:26:07\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"17610389983\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":10,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":10,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-26 12:05:49\",\"trans_end\":\"2017-12-26 12:05:49\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"15811031654\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":9,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":9,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-19 11:59:37\",\"trans_end\":\"2017-12-19 11:59:37\"},{\"city\":\"洛阳\",\"p_relation\":\"\",\"peer_num\":\"15737967596\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":9,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":9,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":1,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-02-06 11:02:50\",\"trans_end\":\"2018-02-06 11:02:50\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"13439979173\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":8,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":8,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":1,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-18 19:18:38\",\"trans_end\":\"2018-01-18 19:18:38\"},{\"city\":\"天津\",\"p_relation\":\"\",\"peer_num\":\"15722046140\",\"group_name\":\"骚扰电话\",\"company_name\":\"骚扰电话\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":8,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":8,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-11 16:36:46\",\"trans_end\":\"2017-12-11 16:36:46\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18518090951\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":8,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":8,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2017-12-01 11:39:15\",\"trans_end\":\"2017-12-01 11:39:15\"},{\"city\":\"沈阳\",\"p_relation\":\"\",\"peer_num\":\"02467904027\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":8,\"call_time_6m\":8,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":8,\"dialed_time_6m\":8,\"call_cnt_morning_3m\":1,\"call_cnt_morning_6m\":1,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-03-26 11:27:06\",\"trans_end\":\"2018-03-26 11:27:06\"},{\"city\":\"萍乡\",\"p_relation\":\"\",\"peer_num\":\"07996318099\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":7,\"call_time_6m\":7,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":7,\"dialed_time_6m\":7,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":1,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-26 15:22:05\",\"trans_end\":\"2018-04-26 15:22:05\"},{\"city\":\"北京\",\"p_relation\":\"\",\"peer_num\":\"18410285701\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":1,\"call_cnt_6m\":1,\"call_time_3m\":7,\"call_time_6m\":7,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":1,\"dialed_cnt_6m\":1,\"dialed_time_3m\":7,\"dialed_time_6m\":7,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":1,\"call_cnt_noon_6m\":1,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":0,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":1,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-04-16 11:37:19\",\"trans_end\":\"2018-04-16 11:37:19\"},{\"city\":\"济南\",\"p_relation\":\"\",\"peer_num\":\"13256138727\",\"group_name\":\"未知\",\"company_name\":\"未知\",\"call_cnt_1w\":0,\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":1,\"call_time_3m\":0,\"call_time_6m\":6,\"dial_cnt_3m\":0,\"dial_cnt_6m\":0,\"dial_time_3m\":0,\"dial_time_6m\":0,\"dialed_cnt_3m\":0,\"dialed_cnt_6m\":1,\"dialed_time_3m\":0,\"dialed_time_6m\":6,\"call_cnt_morning_3m\":0,\"call_cnt_morning_6m\":0,\"call_cnt_noon_3m\":0,\"call_cnt_noon_6m\":0,\"call_cnt_afternoon_3m\":0,\"call_cnt_afternoon_6m\":1,\"call_cnt_evening_3m\":0,\"call_cnt_evening_6m\":0,\"call_cnt_night_3m\":0,\"call_cnt_night_6m\":0,\"call_cnt_weekday_3m\":0,\"call_cnt_weekday_6m\":1,\"call_cnt_weekend_3m\":0,\"call_cnt_weekend_6m\":0,\"call_cnt_holiday_3m\":0,\"call_cnt_holiday_6m\":0,\"call_if_whole_day_3m\":false,\"call_if_whole_day_6m\":false,\"trans_start\":\"2018-01-12 13:52:21\",\"trans_end\":\"2018-01-12 13:52:21\"}],\"sms_contact_detail\":[{\"peer_num\":\"95533009\",\"sms_cnt_1w\":0,\"sms_cnt_1m\":0,\"sms_cnt_3m\":0,\"sms_cnt_6m\":1,\"send_cnt_3m\":0,\"send_cnt_6m\":1,\"receive_cnt_3m\":0,\"receive_cnt_6m\":0},{\"peer_num\":\"18511987751\",\"sms_cnt_1w\":0,\"sms_cnt_1m\":0,\"sms_cnt_3m\":0,\"sms_cnt_6m\":1,\"send_cnt_3m\":0,\"send_cnt_6m\":1,\"receive_cnt_3m\":0,\"receive_cnt_6m\":0},{\"peer_num\":\"95533007\",\"sms_cnt_1w\":0,\"sms_cnt_1m\":0,\"sms_cnt_3m\":0,\"sms_cnt_6m\":1,\"send_cnt_3m\":0,\"send_cnt_6m\":1,\"receive_cnt_3m\":0,\"receive_cnt_6m\":0},{\"peer_num\":\"00447537410227\",\"sms_cnt_1w\":0,\"sms_cnt_1m\":0,\"sms_cnt_3m\":0,\"sms_cnt_6m\":1,\"send_cnt_3m\":0,\"send_cnt_6m\":1,\"receive_cnt_3m\":0,\"receive_cnt_6m\":0}],\"contact_region\":[{\"key\":\"contact_region_3m\",\"desc\":\"联系人手机号码归属地 (近3月联系次数降序)\",\"region_list\":[{\"region_loc\":\"北京\",\"region_uniq_num_cnt\":17,\"region_call_cnt\":122,\"region_call_time\":5897,\"region_dial_cnt\":69,\"region_dial_time\":3161,\"region_dialed_cnt\":53,\"region_dialed_time\":2736,\"region_avg_dial_time\":46,\"region_avg_dialed_time\":52,\"region_dial_cnt_pct\":0.57,\"region_dial_time_pct\":0.54,\"region_dialed_cnt_pct\":0.43,\"region_dialed_time_pct\":0.46},{\"region_loc\":\"沧州\",\"region_uniq_num_cnt\":3,\"region_call_cnt\":6,\"region_call_time\":331,\"region_dial_cnt\":3,\"region_dial_time\":194,\"region_dialed_cnt\":3,\"region_dialed_time\":137,\"region_avg_dial_time\":65,\"region_avg_dialed_time\":46,\"region_dial_cnt_pct\":0.5,\"region_dial_time_pct\":0.59,\"region_dialed_cnt_pct\":0.5,\"region_dialed_time_pct\":0.41},{\"region_loc\":\"张家口\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":4,\"region_call_time\":785,\"region_dial_cnt\":2,\"region_dial_time\":238,\"region_dialed_cnt\":2,\"region_dialed_time\":547,\"region_avg_dial_time\":119,\"region_avg_dialed_time\":274,\"region_dial_cnt_pct\":0.5,\"region_dial_time_pct\":0.3,\"region_dialed_cnt_pct\":0.5,\"region_dialed_time_pct\":0.7},{\"region_loc\":\"安庆\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":3,\"region_call_time\":68,\"region_dial_cnt\":2,\"region_dial_time\":28,\"region_dialed_cnt\":1,\"region_dialed_time\":40,\"region_avg_dial_time\":14,\"region_avg_dialed_time\":40,\"region_dial_cnt_pct\":0.67,\"region_dial_time_pct\":0.41,\"region_dialed_cnt_pct\":0.33,\"region_dialed_time_pct\":0.59},{\"region_loc\":\"沈阳\",\"region_uniq_num_cnt\":2,\"region_call_cnt\":2,\"region_call_time\":27,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":2,\"region_dialed_time\":27,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":14,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"邢台\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":11,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":11,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":11,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"苏州\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":11,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":11,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":11,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"萍乡\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":7,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":7,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":7,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0}]},{\"key\":\"contact_region_6m\",\"desc\":\"联系人手机号码归属地 (近6月联系次数降序)\",\"region_list\":[{\"region_loc\":\"北京\",\"region_uniq_num_cnt\":44,\"region_call_cnt\":222,\"region_call_time\":8830,\"region_dial_cnt\":117,\"region_dial_time\":4679,\"region_dialed_cnt\":105,\"region_dialed_time\":4151,\"region_avg_dial_time\":40,\"region_avg_dialed_time\":40,\"region_dial_cnt_pct\":0.53,\"region_dial_time_pct\":0.53,\"region_dialed_cnt_pct\":0.47,\"region_dialed_time_pct\":0.47},{\"region_loc\":\"沧州\",\"region_uniq_num_cnt\":3,\"region_call_cnt\":13,\"region_call_time\":1036,\"region_dial_cnt\":6,\"region_dial_time\":315,\"region_dialed_cnt\":7,\"region_dialed_time\":721,\"region_avg_dial_time\":53,\"region_avg_dialed_time\":103,\"region_dial_cnt_pct\":0.46,\"region_dial_time_pct\":0.3,\"region_dialed_cnt_pct\":0.54,\"region_dialed_time_pct\":0.7},{\"region_loc\":\"张家口\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":7,\"region_call_time\":988,\"region_dial_cnt\":2,\"region_dial_time\":238,\"region_dialed_cnt\":5,\"region_dialed_time\":750,\"region_avg_dial_time\":119,\"region_avg_dialed_time\":150,\"region_dial_cnt_pct\":0.29,\"region_dial_time_pct\":0.24,\"region_dialed_cnt_pct\":0.71,\"region_dialed_time_pct\":0.76},{\"region_loc\":\"安庆\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":5,\"region_call_time\":96,\"region_dial_cnt\":3,\"region_dial_time\":42,\"region_dialed_cnt\":2,\"region_dialed_time\":54,\"region_avg_dial_time\":14,\"region_avg_dialed_time\":27,\"region_dial_cnt_pct\":0.6,\"region_dial_time_pct\":0.44,\"region_dialed_cnt_pct\":0.4,\"region_dialed_time_pct\":0.56},{\"region_loc\":\"全国\",\"region_uniq_num_cnt\":2,\"region_call_cnt\":4,\"region_call_time\":456,\"region_dial_cnt\":4,\"region_dial_time\":456,\"region_dialed_cnt\":0,\"region_dialed_time\":0,\"region_avg_dial_time\":114,\"region_avg_dialed_time\":0,\"region_dial_cnt_pct\":1.0,\"region_dial_time_pct\":1.0,\"region_dialed_cnt_pct\":0.0,\"region_dialed_time_pct\":0.0},{\"region_loc\":\"沈阳\",\"region_uniq_num_cnt\":3,\"region_call_cnt\":3,\"region_call_time\":56,\"region_dial_cnt\":1,\"region_dial_time\":29,\"region_dialed_cnt\":2,\"region_dialed_time\":27,\"region_avg_dial_time\":29,\"region_avg_dialed_time\":14,\"region_dial_cnt_pct\":0.33,\"region_dial_time_pct\":0.52,\"region_dialed_cnt_pct\":0.67,\"region_dialed_time_pct\":0.48},{\"region_loc\":\"郑州\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":2,\"region_call_time\":72,\"region_dial_cnt\":1,\"region_dial_time\":30,\"region_dialed_cnt\":1,\"region_dialed_time\":42,\"region_avg_dial_time\":30,\"region_avg_dialed_time\":42,\"region_dial_cnt_pct\":0.5,\"region_dial_time_pct\":0.42,\"region_dialed_cnt_pct\":0.5,\"region_dialed_time_pct\":0.58},{\"region_loc\":\"济南\",\"region_uniq_num_cnt\":2,\"region_call_cnt\":2,\"region_call_time\":21,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":2,\"region_dialed_time\":21,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":11,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"邢台\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":11,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":11,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":11,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"苏州\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":11,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":11,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":11,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"洛阳\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":9,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":9,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":9,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"天津\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":8,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":8,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":8,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0},{\"region_loc\":\"萍乡\",\"region_uniq_num_cnt\":1,\"region_call_cnt\":1,\"region_call_time\":7,\"region_dial_cnt\":0,\"region_dial_time\":0,\"region_dialed_cnt\":1,\"region_dialed_time\":7,\"region_avg_dial_time\":0,\"region_avg_dialed_time\":7,\"region_dial_cnt_pct\":0.0,\"region_dial_time_pct\":0.0,\"region_dialed_cnt_pct\":1.0,\"region_dialed_time_pct\":1.0}]}],\"call_risk_analysis\":[{\"analysis_item\":\"110\",\"analysis_desc\":\"110\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"120\",\"analysis_desc\":\"120\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"loan\",\"analysis_desc\":\"贷款\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"credit_card\",\"analysis_desc\":\"信用卡\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"macao\",\"analysis_desc\":\"澳门地区\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"collection\",\"analysis_desc\":\"催收公司\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"lawyer\",\"analysis_desc\":\"律师\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"agency\",\"analysis_desc\":\"中介\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"fraud\",\"analysis_desc\":\"诈骗电话\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"nuisance\",\"analysis_desc\":\"骚扰电话\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":2,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.33,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":19,\"avg_call_time_3m\":0,\"avg_call_time_6m\":3}},{\"analysis_item\":\"court\",\"analysis_desc\":\"法院\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}}],\"main_service\":[],\"call_service_analysis\":[{\"analysis_item\":\"bank\",\"analysis_desc\":\"银行\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"railway_airway\",\"analysis_desc\":\"航旅机构\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":3,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.5,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":352,\"avg_call_time_3m\":0,\"avg_call_time_6m\":59}},{\"analysis_item\":\"special_service\",\"analysis_desc\":\"特种服务\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"express\",\"analysis_desc\":\"快递公司\",\"analysis_point\":{\"call_cnt_1m\":1,\"call_cnt_3m\":1,\"call_cnt_6m\":7,\"avg_call_cnt_3m\":0.33,\"avg_call_cnt_6m\":1.17,\"call_time_1m\":156,\"call_time_3m\":156,\"call_time_6m\":380,\"avg_call_time_3m\":52,\"avg_call_time_6m\":63}},{\"analysis_item\":\"ins_fin\",\"analysis_desc\":\"保险公司\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"car_firm\",\"analysis_desc\":\"汽车公司\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}},{\"analysis_item\":\"carrier\",\"analysis_desc\":\"通信服务机构\",\"analysis_point\":{\"call_cnt_1m\":0,\"call_cnt_3m\":0,\"call_cnt_6m\":0,\"avg_call_cnt_3m\":0.0,\"avg_call_cnt_6m\":0.0,\"call_time_1m\":0,\"call_time_3m\":0,\"call_time_6m\":0,\"avg_call_time_3m\":0,\"avg_call_time_6m\":0}}],\"active_degree\":[{\"item\":{\"item_1m\":\"20\",\"item_3m\":\"63\",\"item_6m\":\"118\",\"avg_item_3m\":\"21.00\",\"avg_item_6m\":\"19.67\"},\"app_point\":\"call_day\",\"app_point_zh\":\"通话活跃天数\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"3\",\"avg_item_3m\":\"0.00\",\"avg_item_6m\":\"0.50\"},\"app_point\":\"sms_day\",\"app_point_zh\":\"短信活跃天数\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"1\",\"item_6m\":\"3\",\"avg_item_3m\":\"0.33\",\"avg_item_6m\":\"0.50\"},\"app_point\":\"recharge_cnt\",\"app_point_zh\":\"充值次数\"},{\"item\":{\"item_1m\":\"36\",\"item_3m\":\"140\",\"item_6m\":\"263\",\"avg_item_3m\":\"46.67\",\"avg_item_6m\":\"43.83\"},\"app_point\":\"call_cnt\",\"app_point_zh\":\"通话次数\"},{\"item\":{\"item_1m\":\"9\",\"item_3m\":\"27\",\"item_6m\":\"62\",\"avg_item_3m\":\"9.00\",\"avg_item_6m\":\"10.33\"},\"app_point\":\"peer_num_cnt\",\"app_point_zh\":\"通话号码数目\"},{\"item\":{\"item_1m\":\"3\",\"item_3m\":\"8\",\"item_6m\":\"13\",\"avg_item_3m\":\"2.67\",\"avg_item_6m\":\"2.17\"},\"app_point\":\"peer_loc_cnt\",\"app_point_zh\":\"通话号码归属地总数\"},{\"item\":{\"item_1m\":\"20\",\"item_3m\":\"76\",\"item_6m\":\"134\",\"avg_item_3m\":\"25.33\",\"avg_item_6m\":\"22.33\"},\"app_point\":\"dial_cnt\",\"app_point_zh\":\"主叫次数\"},{\"item\":{\"item_1m\":\"16\",\"item_3m\":\"64\",\"item_6m\":\"129\",\"avg_item_3m\":\"21.33\",\"avg_item_6m\":\"21.50\"},\"app_point\":\"dialed_cnt\",\"app_point_zh\":\"被叫次数\"},{\"item\":{\"item_1m\":\"4\",\"item_3m\":\"10\",\"item_6m\":\"22\",\"avg_item_3m\":\"3.33\",\"avg_item_6m\":\"3.67\"},\"app_point\":\"dial_peer_num_cnt\",\"app_point_zh\":\"主叫号码数\"},{\"item\":{\"item_1m\":\"7\",\"item_3m\":\"23\",\"item_6m\":\"52\",\"avg_item_3m\":\"7.67\",\"avg_item_6m\":\"8.67\"},\"app_point\":\"dialed_peer_num_cnt\",\"app_point_zh\":\"被叫号码数\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"4\",\"avg_item_3m\":\"0.00\",\"avg_item_6m\":\"0.67\"},\"app_point\":\"sms_cnt\",\"app_point_zh\":\"短信次数\"},{\"item\":{\"item_1m\":\"1693\",\"item_3m\":\"7137\",\"item_6m\":\"11601\",\"avg_item_3m\":\"2379\",\"avg_item_6m\":\"1934\"},\"app_point\":\"call_time\",\"app_point_zh\":\"通话时长（秒）\"},{\"item\":{\"item_1m\":\"902\",\"item_3m\":\"3621\",\"item_6m\":\"5789\",\"avg_item_3m\":\"1207\",\"avg_item_6m\":\"965\"},\"app_point\":\"dial_time\",\"app_point_zh\":\"主叫时长（秒）\"},{\"item\":{\"item_1m\":\"791\",\"item_3m\":\"3516\",\"item_6m\":\"5812\",\"avg_item_3m\":\"1172\",\"avg_item_6m\":\"969\"},\"app_point\":\"dialed_time\",\"app_point_zh\":\"被叫时长（秒）\"},{\"item\":{\"item_1m\":\"17289216\",\"item_3m\":\"39591936\",\"item_6m\":\"62982747\",\"avg_item_3m\":\"13197312\",\"avg_item_6m\":\"10497125\"},\"app_point\":\"net_total\",\"app_point_zh\":\"流量套餐总量（KB）\"},{\"item\":{\"item_1m\":\"1696890\",\"item_3m\":\"3028090\",\"item_6m\":\"4975450\",\"avg_item_3m\":\"1009363\",\"avg_item_6m\":\"829242\"},\"app_point\":\"net_used\",\"app_point_zh\":\"流量套餐使用量（KB）\"},{\"item\":{\"item_1m\":\"47\",\"item_3m\":\"51\",\"item_6m\":\"44\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"avg_call_time\",\"app_point_zh\":\"均次通话时长（秒）\"},{\"item\":{\"item_1m\":\"15\",\"item_3m\":\"48\",\"item_6m\":\"101\",\"avg_item_3m\":\"16.00\",\"avg_item_6m\":\"16.83\"},\"app_point\":\"no_dial_day\",\"app_point_zh\":\"无呼出天数\"},{\"item\":{\"item_1m\":\"0.50\",\"item_3m\":\"0.53\",\"item_6m\":\"0.56\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"no_dial_day_pct\",\"app_point_zh\":\"无呼出天数占比\"},{\"item\":{\"item_1m\":\"10\",\"item_3m\":\"27\",\"item_6m\":\"62\",\"avg_item_3m\":\"9.00\",\"avg_item_6m\":\"10.33\"},\"app_point\":\"no_call_day\",\"app_point_zh\":\"无通话天数\"},{\"item\":{\"item_1m\":\"0.33\",\"item_3m\":\"0.30\",\"item_6m\":\"0.34\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"no_call_day_pct\",\"app_point_zh\":\"无通话天数占比\"},{\"item\":{\"item_1m\":\"8\",\"item_3m\":\"8\",\"item_6m\":\"12\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"max_power_on_day\",\"app_point_zh\":\"最大连续开机天数\"},{\"item\":{\"item_1m\":\"10\",\"item_3m\":\"27\",\"item_6m\":\"62\",\"avg_item_3m\":\"9.00\",\"avg_item_6m\":\"10.33\"},\"app_point\":\"power_off_day\",\"app_point_zh\":\"关机天数\"},{\"item\":{\"item_1m\":\"0.33\",\"item_3m\":\"0.30\",\"item_6m\":\"0.34\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"power_off_day_pct\",\"app_point_zh\":\"关机天数占比\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"2\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"continue_power_off_cnt\",\"app_point_zh\":\"连续3天以上关机次数\"}],\"consumption_detail\":[{\"item\":{\"item_1m\":\"5800\",\"item_3m\":\"18400\",\"item_6m\":\"36019\",\"avg_item_3m\":\"6133\",\"avg_item_6m\":\"6003\"},\"app_point\":\"total_fee\",\"app_point_zh\":\"消费总金额（分）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"1000\",\"item_6m\":\"1174\",\"avg_item_3m\":\"333\",\"avg_item_6m\":\"196\"},\"app_point\":\"net_fee\",\"app_point_zh\":\"网络流量消费金额（分）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"0\",\"avg_item_3m\":\"0\",\"avg_item_6m\":\"0\"},\"app_point\":\"voice_fee\",\"app_point_zh\":\"通话消费金额（分）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"45\",\"avg_item_3m\":\"0\",\"avg_item_6m\":\"8\"},\"app_point\":\"sms_fee\",\"app_point_zh\":\"短信消费金额（分）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"0\",\"avg_item_3m\":\"0\",\"avg_item_6m\":\"0\"},\"app_point\":\"vas_fee\",\"app_point_zh\":\"增值业务消费金额（分）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"0\",\"avg_item_3m\":\"0\",\"avg_item_6m\":\"0\"},\"app_point\":\"extra_fee\",\"app_point_zh\":\"其它消费金额（分）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"10000\",\"item_6m\":\"30000\",\"avg_item_3m\":\"3333\",\"avg_item_6m\":\"5000\"},\"app_point\":\"recharge_amount\",\"app_point_zh\":\"充值金额（分）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"10000\",\"item_6m\":\"10000\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"max_single_recharge\",\"app_point_zh\":\"单次充值最大金额（分）\"}],\"call_time_detail\":[{\"item\":{\"item_1m\":\"242\",\"item_3m\":\"656\",\"item_6m\":\"656\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"max_single_time\",\"app_point_zh\":\"单次通话最长时长（秒）\"},{\"item\":{\"item_1m\":\"7\",\"item_3m\":\"1\",\"item_6m\":\"1\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"min_single_time\",\"app_point_zh\":\"单次通话最短时长（秒）\"},{\"item\":{\"item_1m\":\"28\",\"item_3m\":\"111\",\"item_6m\":\"218\",\"avg_item_3m\":\"37.00\",\"avg_item_6m\":\"36.33\"},\"app_point\":\"cnt_1min_within\",\"app_point_zh\":\"时长在1min内的通话次数\"},{\"item\":{\"item_1m\":\"8\",\"item_3m\":\"27\",\"item_6m\":\"42\",\"avg_item_3m\":\"9.00\",\"avg_item_6m\":\"7.00\"},\"app_point\":\"cnt_1min_5min\",\"app_point_zh\":\"时长在1min-5min内的通话次数\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"1\",\"item_6m\":\"2\",\"avg_item_3m\":\"0.33\",\"avg_item_6m\":\"0.33\"},\"app_point\":\"cnt_5min_10min\",\"app_point_zh\":\"时长在5min-10min内的通话次数\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"1\",\"item_6m\":\"1\",\"avg_item_3m\":\"0.33\",\"avg_item_6m\":\"0.17\"},\"app_point\":\"cnt_10min_over\",\"app_point_zh\":\"时长在10min以上的通话次数\"},{\"item\":{\"item_1m\":\"36\",\"item_3m\":\"139\",\"item_6m\":\"262\",\"avg_item_3m\":\"46.33\",\"avg_item_6m\":\"43.67\"},\"app_point\":\"daytime_cnt\",\"app_point_zh\":\"白天(7:00-0:00)通话次数\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"1\",\"item_6m\":\"1\",\"avg_item_3m\":\"0.33\",\"avg_item_6m\":\"0.17\"},\"app_point\":\"night_cnt\",\"app_point_zh\":\"夜晚(0:00-7:00)通话次数\"},{\"item\":{\"item_1m\":\"1693\",\"item_3m\":\"7102\",\"item_6m\":\"11566\",\"avg_item_3m\":\"2367\",\"avg_item_6m\":\"1928\"},\"app_point\":\"daytime_time\",\"app_point_zh\":\"白天(7:00-0:00)通话时长（秒）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"35\",\"item_6m\":\"35\",\"avg_item_3m\":\"12\",\"avg_item_6m\":\"6\"},\"app_point\":\"night_time\",\"app_point_zh\":\"夜晚(0:00-7:00)通话时长（秒）\"},{\"item\":{\"item_1m\":\"36\",\"item_3m\":\"123\",\"item_6m\":\"239\",\"avg_item_3m\":\"41.00\",\"avg_item_6m\":\"39.83\"},\"app_point\":\"local_cnt\",\"app_point_zh\":\"本机号码归属地通话次数\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"17\",\"item_6m\":\"24\",\"avg_item_3m\":\"5.67\",\"avg_item_6m\":\"4.00\"},\"app_point\":\"remote_cnt\",\"app_point_zh\":\"本机号码归属地以外通话次数\"},{\"item\":{\"item_1m\":\"1693\",\"item_3m\":\"6092\",\"item_6m\":\"10120\",\"avg_item_3m\":\"2031\",\"avg_item_6m\":\"1687\"},\"app_point\":\"local_time\",\"app_point_zh\":\"本机号码归属地通话时长（秒）\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"1045\",\"item_6m\":\"1481\",\"avg_item_3m\":\"348\",\"avg_item_6m\":\"247\"},\"app_point\":\"remote_time\",\"app_point_zh\":\"本机号码归属地以外通话时长（秒）\"}],\"call_family_detail\":[{\"item\":{\"item_1m\":\"否\",\"item_3m\":\"否\",\"item_6m\":\"否\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"is_family_member\",\"app_point_zh\":\"是否为亲情网用户\"},{\"item\":{\"item_1m\":\"否\",\"item_3m\":\"否\",\"item_6m\":\"否\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"is_family_master\",\"app_point_zh\":\"是否为亲情网户主\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"1\",\"item_6m\":\"2\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"continue_recharge_month_cnt\",\"app_point_zh\":\"连续充值月数\"},{\"item\":{\"item_1m\":\"是\",\"item_3m\":\"是\",\"item_6m\":\"是\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"is_address_match_attribution\",\"app_point_zh\":\"常联系地址是否为手机归属地\"},{\"item\":{\"item_1m\":\"否\",\"item_3m\":\"否\",\"item_6m\":\"否\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"call_cnt_less\",\"app_point_zh\":\"通话次数 小于 使用月数＊1次\"},{\"item\":{\"item_1m\":\"否\",\"item_3m\":\"否\",\"item_6m\":\"否\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"call_cnt_more\",\"app_point_zh\":\"通话次数 大于 使用月数＊300次\"},{\"item\":{\"item_1m\":\"0\",\"item_3m\":\"0\",\"item_6m\":\"0\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"unpaid_month_cnt\",\"app_point_zh\":\"连续欠费月数\"},{\"item\":{\"item_1m\":\"1\",\"item_3m\":\"3\",\"item_6m\":\"6\",\"avg_item_3m\":null,\"avg_item_6m\":null},\"app_point\":\"live_month_cnt\",\"app_point_zh\":\"本机号码归属地使用月数\"}],\"call_duration_detail\":[{\"key\":\"call_duration_detail_3m\",\"desc\":\"通话时段（近三月）\",\"duration_list\":[{\"item\":{\"total_cnt\":0,\"uniq_num_cnt\":0,\"total_time\":0,\"dial_cnt\":0,\"dialed_cnt\":0,\"dial_time\":0,\"dialed_time\":0,\"latest_call_time\":\"该时段无通话记录\",\"farthest_call_time\":\"该时段无通话记录\"},\"time_step\":\"morning\",\"time_step_zh\":\"早晨[5:30-9:00]\"},{\"item\":{\"total_cnt\":11,\"uniq_num_cnt\":7,\"total_time\":615,\"dial_cnt\":2,\"dialed_cnt\":9,\"dial_time\":48,\"dialed_time\":567,\"latest_call_time\":\"20180511-102406\",\"farthest_call_time\":\"20180304-090337\"},\"time_step\":\"forenoon\",\"time_step_zh\":\"上午[9:00-11:30]\"},{\"item\":{\"total_cnt\":7,\"uniq_num_cnt\":6,\"total_time\":439,\"dial_cnt\":3,\"dialed_cnt\":4,\"dial_time\":336,\"dialed_time\":103,\"latest_call_time\":\"20180511-121553\",\"farthest_call_time\":\"20180225-115334\"},\"time_step\":\"noon\",\"time_step_zh\":\"中午[11:30-13:30]\"},{\"item\":{\"total_cnt\":31,\"uniq_num_cnt\":17,\"total_time\":2185,\"dial_cnt\":16,\"dialed_cnt\":15,\"dial_time\":1154,\"dialed_time\":1031,\"latest_call_time\":\"20180504-163618\",\"farthest_call_time\":\"20180222-144315\"},\"time_step\":\"afternoon\",\"time_step_zh\":\"下午[13:30-17:30]\"},{\"item\":{\"total_cnt\":26,\"uniq_num_cnt\":8,\"total_time\":1937,\"dial_cnt\":17,\"dialed_cnt\":9,\"dial_time\":1034,\"dialed_time\":903,\"latest_call_time\":\"20180516-184457\",\"farthest_call_time\":\"20180223-182514\"},\"time_step\":\"dusk\",\"time_step_zh\":\"傍晚[17:30-19:30]\"},{\"item\":{\"total_cnt\":63,\"uniq_num_cnt\":4,\"total_time\":1925,\"dial_cnt\":38,\"dialed_cnt\":25,\"dial_time\":1049,\"dialed_time\":876,\"latest_call_time\":\"20180518-213833\",\"farthest_call_time\":\"20180221-210301\"},\"time_step\":\"evening\",\"time_step_zh\":\"晚上[19:30-23:30]\"},{\"item\":{\"total_cnt\":2,\"uniq_num_cnt\":2,\"total_time\":36,\"dial_cnt\":0,\"dialed_cnt\":2,\"dial_time\":0,\"dialed_time\":36,\"latest_call_time\":\"20180411-233149\",\"farthest_call_time\":\"20180320-000700\"},\"time_step\":\"daybreak\",\"time_step_zh\":\"凌晨[23:30-1:30]\"},{\"item\":{\"total_cnt\":0,\"uniq_num_cnt\":0,\"total_time\":0,\"dial_cnt\":0,\"dialed_cnt\":0,\"dial_time\":0,\"dialed_time\":0,\"latest_call_time\":\"该时段无通话记录\",\"farthest_call_time\":\"该时段无通话记录\"},\"time_step\":\"midnight\",\"time_step_zh\":\"深夜[1:30-5:30]\"}]},{\"key\":\"call_duration_detail_6m\",\"desc\":\"通话时段（近六月）\",\"duration_list\":[{\"item\":{\"total_cnt\":2,\"uniq_num_cnt\":1,\"total_time\":31,\"dial_cnt\":1,\"dialed_cnt\":1,\"dial_time\":22,\"dialed_time\":9,\"latest_call_time\":\"20180211-083621\",\"farthest_call_time\":\"20180112-081258\"},\"time_step\":\"morning\",\"time_step_zh\":\"早晨[5:30-9:00]\"},{\"item\":{\"total_cnt\":26,\"uniq_num_cnt\":13,\"total_time\":1050,\"dial_cnt\":8,\"dialed_cnt\":18,\"dial_time\":297,\"dialed_time\":753,\"latest_call_time\":\"20180511-102406\",\"farthest_call_time\":\"20171214-094249\"},\"time_step\":\"forenoon\",\"time_step_zh\":\"上午[9:00-11:30]\"},{\"item\":{\"total_cnt\":34,\"uniq_num_cnt\":23,\"total_time\":1587,\"dial_cnt\":11,\"dialed_cnt\":23,\"dial_time\":619,\"dialed_time\":968,\"latest_call_time\":\"20180511-121553\",\"farthest_call_time\":\"20171127-125323\"},\"time_step\":\"noon\",\"time_step_zh\":\"中午[11:30-13:30]\"},{\"item\":{\"total_cnt\":51,\"uniq_num_cnt\":29,\"total_time\":2896,\"dial_cnt\":25,\"dialed_cnt\":26,\"dial_time\":1602,\"dialed_time\":1294,\"latest_call_time\":\"20180504-163618\",\"farthest_call_time\":\"20171209-150156\"},\"time_step\":\"afternoon\",\"time_step_zh\":\"下午[13:30-17:30]\"},{\"item\":{\"total_cnt\":39,\"uniq_num_cnt\":10,\"total_time\":2430,\"dial_cnt\":23,\"dialed_cnt\":16,\"dial_time\":1346,\"dialed_time\":1084,\"latest_call_time\":\"20180516-184457\",\"farthest_call_time\":\"20171130-185733\"},\"time_step\":\"dusk\",\"time_step_zh\":\"傍晚[17:30-19:30]\"},{\"item\":{\"total_cnt\":109,\"uniq_num_cnt\":9,\"total_time\":3571,\"dial_cnt\":66,\"dialed_cnt\":43,\"dial_time\":1903,\"dialed_time\":1668,\"latest_call_time\":\"20180518-213833\",\"farthest_call_time\":\"20171127-194915\"},\"time_step\":\"evening\",\"time_step_zh\":\"晚上[19:30-23:30]\"},{\"item\":{\"total_cnt\":2,\"uniq_num_cnt\":2,\"total_time\":36,\"dial_cnt\":0,\"dialed_cnt\":2,\"dial_time\":0,\"dialed_time\":36,\"latest_call_time\":\"20180411-233149\",\"farthest_call_time\":\"20180320-000700\"},\"time_step\":\"daybreak\",\"time_step_zh\":\"凌晨[23:30-1:30]\"},{\"item\":{\"total_cnt\":0,\"uniq_num_cnt\":0,\"total_time\":0,\"dial_cnt\":0,\"dialed_cnt\":0,\"dial_time\":0,\"dialed_time\":0,\"latest_call_time\":\"该时段无通话记录\",\"farthest_call_time\":\"该时段无通话记录\"},\"time_step\":\"midnight\",\"time_step_zh\":\"深夜[1:30-5:30]\"}]}],\"roam_analysis\":[{\"roam_location\":\"沧州\",\"roam_day_cnt_3m\":6,\"roam_day_cnt_6m\":7,\"continue_roam_cnt_3m\":2,\"continue_roam_cnt_6m\":2,\"max_roam_day_cnt_3m\":4,\"max_roam_day_cnt_6m\":5},{\"roam_location\":\"海口\",\"roam_day_cnt_3m\":0,\"roam_day_cnt_6m\":3,\"continue_roam_cnt_3m\":0,\"continue_roam_cnt_6m\":1,\"max_roam_day_cnt_3m\":0,\"max_roam_day_cnt_6m\":2},{\"roam_location\":\"天津\",\"roam_day_cnt_3m\":1,\"roam_day_cnt_6m\":1,\"continue_roam_cnt_3m\":0,\"continue_roam_cnt_6m\":0,\"max_roam_day_cnt_3m\":1,\"max_roam_day_cnt_6m\":1}],\"roam_detail\":[{\"roam_day\":\"2018-03-04\",\"roam_location\":\"沧州\"},{\"roam_day\":\"2018-03-04\",\"roam_location\":\"天津\"},{\"roam_day\":\"2018-03-03\",\"roam_location\":\"沧州\"},{\"roam_day\":\"2018-02-24\",\"roam_location\":\"沧州\"},{\"roam_day\":\"2018-02-23\",\"roam_location\":\"沧州\"},{\"roam_day\":\"2018-02-22\",\"roam_location\":\"沧州\"},{\"roam_day\":\"2018-02-21\",\"roam_location\":\"沧州\"},{\"roam_day\":\"2018-02-20\",\"roam_location\":\"沧州\"},{\"roam_day\":\"2018-02-14\",\"roam_location\":\"海口\"},{\"roam_day\":\"2018-02-13\",\"roam_location\":\"海口\"},{\"roam_day\":\"2018-02-11\",\"roam_location\":\"海口\"}],\"user_info_check\":[{\"check_search_info\":{\"searched_org_cnt\":3,\"searched_org_type\":[\"CASH_LOAN\"],\"idcard_with_other_names\":[],\"idcard_with_other_phones\":[\"15801348625\"],\"phone_with_other_names\":[\"孙凯文\",\"臧红莲\",\"张霞\",\"韩旭\",\"李金惠\",\"藏红莲\",\"杨华林\"],\"phone_with_other_idcards\":[\"410781197709264332\",\"532201197108262446\",\"110222199305213310\",\"511028197510075918\",\"510130196304052127\",\"410102199003190168\"],\"register_org_cnt\":3,\"register_org_type\":[\"CASH_LOAN\"],\"arised_open_web\":[]},\"check_black_info\":{\"phone_gray_score\":80,\"contacts_class1_blacklist_cnt\":0,\"contacts_class2_blacklist_cnt\":4,\"contacts_class1_cnt\":62,\"contacts_router_cnt\":1,\"contacts_router_ratio\":0.02}}],\"trip_info\":[{\"trip_dest\":\"海口\",\"trip_start_time\":\"2018-02-09 19:12:53\",\"trip_end_time\":\"2018-02-14 15:27:53\",\"trip_leave\":\"北京\",\"trip_type\":\"双休日\"},{\"trip_dest\":\"沧州\",\"trip_start_time\":\"2018-02-18 17:23:22\",\"trip_end_time\":\"2018-02-24 15:46:28\",\"trip_leave\":\"北京\",\"trip_type\":\"节假日\"},{\"trip_dest\":\"沧州\",\"trip_start_time\":\"2018-03-02 19:58:20\",\"trip_end_time\":\"2018-03-04 09:15:45\",\"trip_leave\":\"北京\",\"trip_type\":\"双休日\"},{\"trip_dest\":\"天津\",\"trip_start_time\":\"2018-03-04 09:15:45\",\"trip_end_time\":\"2018-03-04 19:12:59\",\"trip_leave\":\"沧州\",\"trip_type\":\"双休日\"}]}";
        String a="{\n" +
                "\t\"report\": [{\n" +
                "\t\t\"key\": \"data_type\",\n" +
                "\t\t\"value\": \"运营商\"\n" +
                "\t}, {\n" +
                "\t\t\"key\": \"source_name\",\n" +
                "\t\t\"value\": \"chinamobilebj\"\n" +
                "\t}, {\n" +
                "\t\t\"key\": \"source_name_zh\",\n" +
                "\t\t\"value\": \"北京移动\"\n" +
                "\t}, {\n" +
                "\t\t\"key\": \"data_gain_time\",\n" +
                "\t\t\"value\": \"2017-11-20\"\n" +
                "\t}, {\n" +
                "\t\t\"key\": \"task_id\",\n" +
                "\t\t\"value\": \"ecffb680-ce01-11e7-90a0-00163e0d2629\"\n" +
                "\t}, {\n" +
                "\t\t\"key\": \"update_time\",\n" +
                "\t\t\"value\": \"2017-11-20 22:48:52\"\n" +
                "\t}, {\n" +
                "\t\t\"key\": \"version\",\n" +
                "\t\t\"value\": \"1.0\"\n" +
                "\t}],\n" +
                "\t\n" +
                "\t\"basic_check_items\": [{\n" +
                "\t\t\"result\": \"无数据\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"idcard_check\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"未提供邮箱\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"email_check\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"通过检验\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"address_check\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"通话记录正常\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"call_data_check\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"运营商未提供身份证\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"idcard_match\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"匹配成功\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"name_match\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"否\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"is_name_and_idcard_in_court_black\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"否\",\n" +
                "\t\t\"comment\": \"\",\n" +
                "\t\t\"check_item\": \"is_name_and_idcard_in_finance_black\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"否\",\n" +
                "\t\t\"comment\": \"\",\n" +
                "\t\t\"check_item\": \"is_name_and_mobile_in_finance_black\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"3\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"mobile_silence_3m\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"3\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"mobile_silence_6m\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"0\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"arrearage_risk_3m\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"0\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"arrearage_risk_6m\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"10\",\n" +
                "\t\t\"comment\": null,\n" +
                "\t\t\"check_item\": \"binding_risk\"\n" +
                "\t}],\n" +
                "\t\"behavior_check\": [{\n" +
                "\t\t\"result\": \"朋友圈主要活跃在北京地区(居住地)\",\n" +
                "\t\t\"evidence\": \"北京地区通话时间占比为86%\",\n" +
                "\t\t\"score\": 1,\n" +
                "\t\t\"check_point\": \"regular_circle\",\n" +
                "\t\t\"check_point_cn\": \"朋友圈在哪里\"\n" +
                "\t}, {\n" +
                "\t\t\"result\": \"长期使用（24个月以上，包含24）\",\n" +
                "\t\t\"evidence\": \"根据号码[13717675373]运营商提供的认证时间,推算该号码使用109个月\",\n" +
                "\t\t\"score\": 1,\n" +
                "\t\t\"check_point\": \"phone_used_time\",\n" +
                "\t\t\"check_point_cn\": \"号码使用时间\"\n" +
                "\t\n" +
                "\t}],\n" +
                "\t\"friend_circle\": {\n" +
                "\t\t\"summary\": [{\n" +
                "\t\t\t\"key\": \"friend_num_3m\",\n" +
                "\t\t\t\"value\": \"61\"\n" +
                "\t\t},{\n" +
                "\t\t\t\"key\": \"inter_peer_num_6m\",\n" +
                "\t\t\t\"value\": \"24\"\n" +
                "\t\t}],\n" +
                "\t\t\"peer_num_top_list\": [{\n" +
                "\t\t\t\"key\": \"peer_num_top3_3m\",\n" +
                "\t\t\t\"top_item\": [{\n" +
                "\t\t\t\t\"peer_number\": \"13911940520\",\n" +
                "\t\t\t\t\"peer_num_loc\": \"北京\",\n" +
                "\t\t\t\t\"group_name\": \"未知\",\n" +
                "\t\t\t\t\"company_name\": \"未知\",\n" +
                "\t\t\t\t\"call_cnt\": 68,\n" +
                "\t\t\t\t\"call_time\": 3159,\n" +
                "\t\t\t\t\"dial_cnt\": 19,\n" +
                "\t\t\t\t\"dialed_cnt\": 49,\n" +
                "\t\t\t\t\"dial_time\": 1234,\n" +
                "\t\t\t\t\"dialed_time\": 1925\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"peer_number\": \"13801067378\",\n" +
                "\t\t\t\t\"peer_num_loc\": \"北京\",\n" +
                "\t\t\t\t\"group_name\": \"未知\",\n" +
                "\t\t\t\t\"company_name\": \"未知\",\n" +
                "\t\t\t\t\"call_cnt\": 58,\n" +
                "\t\t\t\t\"call_time\": 2577,\n" +
                "\t\t\t\t\"dial_cnt\": 44,\n" +
                "\t\t\t\t\"dialed_cnt\": 14,\n" +
                "\t\t\t\t\"dial_time\": 2129,\n" +
                "\t\t\t\t\"dialed_time\": 448\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"peer_number\": \"17600240205\",\n" +
                "\t\t\t\t\"peer_num_loc\": \"北京\",\n" +
                "\t\t\t\t\"group_name\": \"未知\",\n" +
                "\t\t\t\t\"company_name\": \"未知\",\n" +
                "\t\t\t\t\"call_cnt\": 49,\n" +
                "\t\t\t\t\"call_time\": 2492,\n" +
                "\t\t\t\t\"dial_cnt\": 16,\n" +
                "\t\t\t\t\"dialed_cnt\": 33,\n" +
                "\t\t\t\t\"dial_time\": 1038,\n" +
                "\t\t\t\t\"dialed_time\": 1454\n" +
                "\t\t\t}]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"key\": \"peer_num_top3_6m\",\n" +
                "\t\t\t\"top_item\": [{\n" +
                "\t\t\t\t\"peer_number\": \"13801067378\",\n" +
                "\t\t\t\t\"peer_num_loc\": \"北京\",\n" +
                "\t\t\t\t\"group_name\": \"未知\",\n" +
                "\t\t\t\t\"company_name\": \"未知\",\n" +
                "\t\t\t\t\"call_cnt\": 121,\n" +
                "\t\t\t\t\"call_time\": 6072,\n" +
                "\t\t\t\t\"dial_cnt\": 96,\n" +
                "\t\t\t\t\"dialed_cnt\": 25,\n" +
                "\t\t\t\t\"dial_time\": 5145,\n" +
                "\t\t\t\t\"dialed_time\": 927\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"peer_number\": \"13911940520\",\n" +
                "\t\t\t\t\"peer_num_loc\": \"北京\",\n" +
                "\t\t\t\t\"group_name\": \"未知\",\n" +
                "\t\t\t\t\"company_name\": \"未知\",\n" +
                "\t\t\t\t\"call_cnt\": 108,\n" +
                "\t\t\t\t\"call_time\": 4301,\n" +
                "\t\t\t\t\"dial_cnt\": 27,\n" +
                "\t\t\t\t\"dialed_cnt\": 81,\n" +
                "\t\t\t\t\"dial_time\": 1497,\n" +
                "\t\t\t\t\"dialed_time\": 2804\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"peer_number\": \"01066346827\",\n" +
                "\t\t\t\t\"peer_num_loc\": \"北京\",\n" +
                "\t\t\t\t\"group_name\": \"未知\",\n" +
                "\t\t\t\t\"company_name\": \"未知\",\n" +
                "\t\t\t\t\"call_cnt\": 85,\n" +
                "\t\t\t\t\"call_time\": 21190,\n" +
                "\t\t\t\t\"dial_cnt\": 1,\n" +
                "\t\t\t\t\"dialed_cnt\": 84,\n" +
                "\t\t\t\t\"dial_time\": 42,\n" +
                "\t\t\t\t\"dialed_time\": 21148\n" +
                "\t\t\t}]\n" +
                "\t\t}],\n" +
                "\t\t\"location_top_list\": [{\n" +
                "\t\t\t\"key\": \"location_top3_3m\",\n" +
                "\t\t\t\"top_item\": [{\n" +
                "\t\t\t\t\"location\": \"北京\",\n" +
                "\t\t\t\t\"peer_number_cnt\": 46,\n" +
                "\t\t\t\t\"call_cnt\": 352,\n" +
                "\t\t\t\t\"call_time\": 25161,\n" +
                "\t\t\t\t\"dial_cnt\": 172,\n" +
                "\t\t\t\t\"dialed_cnt\": 180,\n" +
                "\t\t\t\t\"dial_time\": 9965,\n" +
                "\t\t\t\t\"dialed_time\": 15196\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"location\": \"全国\",\n" +
                "\t\t\t\t\"peer_number_cnt\": 11,\n" +
                "\t\t\t\t\"call_cnt\": 22,\n" +
                "\t\t\t\t\"call_time\": 4479,\n" +
                "\t\t\t\t\"dial_cnt\": 22,\n" +
                "\t\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\t\"dial_time\": 4479,\n" +
                "\t\t\t\t\"dialed_time\": 0\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"location\": \"呼和浩特\",\n" +
                "\t\t\t\t\"peer_number_cnt\": 1,\n" +
                "\t\t\t\t\"call_cnt\": 8,\n" +
                "\t\t\t\t\"call_time\": 498,\n" +
                "\t\t\t\t\"dial_cnt\": 5,\n" +
                "\t\t\t\t\"dialed_cnt\": 3,\n" +
                "\t\t\t\t\"dial_time\": 324,\n" +
                "\t\t\t\t\"dialed_time\": 174\n" +
                "\t\t\t}]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"key\": \"location_top3_6m\",\n" +
                "\t\t\t\"top_item\": [{\n" +
                "\t\t\t\t\"location\": \"北京\",\n" +
                "\t\t\t\t\"peer_number_cnt\": 91,\n" +
                "\t\t\t\t\"call_cnt\": 718,\n" +
                "\t\t\t\t\"call_time\": 62266,\n" +
                "\t\t\t\t\"dial_cnt\": 333,\n" +
                "\t\t\t\t\"dialed_cnt\": 385,\n" +
                "\t\t\t\t\"dial_time\": 24665,\n" +
                "\t\t\t\t\"dialed_time\": 37601\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"location\": \"全国\",\n" +
                "\t\t\t\t\"peer_number_cnt\": 21,\n" +
                "\t\t\t\t\"call_cnt\": 53,\n" +
                "\t\t\t\t\"call_time\": 8231,\n" +
                "\t\t\t\t\"dial_cnt\": 53,\n" +
                "\t\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\t\"dial_time\": 8231,\n" +
                "\t\t\t\t\"dialed_time\": 0\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"location\": \"呼和浩特\",\n" +
                "\t\t\t\t\"peer_number_cnt\": 1,\n" +
                "\t\t\t\t\"call_cnt\": 9,\n" +
                "\t\t\t\t\"call_time\": 998,\n" +
                "\t\t\t\t\"dial_cnt\": 6,\n" +
                "\t\t\t\t\"dialed_cnt\": 3,\n" +
                "\t\t\t\t\"dial_time\": 824,\n" +
                "\t\t\t\t\"dialed_time\": 174\n" +
                "\t\t\t}]\n" +
                "\t\t}]\n" +
                "\t},\n" +
                "\t\"cell_behavior\": [{\n" +
                "\t\t\"behavior\": [{\n" +
                "\t\t\t\"sms_cnt\": 85,\n" +
                "\t\t\t\"cell_phone_num\": \"13717675373\",\n" +
                "\t\t\t\"net_flow\": 160203,\n" +
                "\t\t\t\"total_amount\": 9545,\n" +
                "\t\t\t\"cell_mth\": \"2017-11\",\n" +
                "\t\t\t\"cell_loc\": \"北京\",\n" +
                "\t\t\t\"cell_operator_zh\": \"北京移动\",\n" +
                "\t\t\t\"cell_operator\": \"chinamobilebj\",\n" +
                "\t\t\t\"call_cnt\": 98,\n" +
                "\t\t\t\"call_time\": 6817,\n" +
                "\t\t\t\"dial_cnt\": 51,\n" +
                "\t\t\t\"dial_time\": 3165,\n" +
                "\t\t\t\"dialed_cnt\": 47,\n" +
                "\t\t\t\"dialed_time\": 3652,\n" +
                "\t\t\t\"rechange_cnt\": 2,\n" +
                "\t\t\t\"rechange_amount\": 15000\n" +
                "\t\t}, {\n" +
                "\t\t\t\"sms_cnt\": 57,\n" +
                "\t\t\t\"cell_phone_num\": \"13717675373\",\n" +
                "\t\t\t\"net_flow\": 134711,\n" +
                "\t\t\t\"total_amount\": 9378,\n" +
                "\t\t\t\"cell_mth\": \"2017-06\",\n" +
                "\t\t\t\"cell_loc\": \"北京\",\n" +
                "\t\t\t\"cell_operator_zh\": \"北京移动\",\n" +
                "\t\t\t\"cell_operator\": \"chinamobilebj\",\n" +
                "\t\t\t\"call_cnt\": 147,\n" +
                "\t\t\t\"call_time\": 14217,\n" +
                "\t\t\t\"dial_cnt\": 66,\n" +
                "\t\t\t\"dial_time\": 4787,\n" +
                "\t\t\t\"dialed_cnt\": 81,\n" +
                "\t\t\t\"dialed_time\": 9430,\n" +
                "\t\t\t\"rechange_cnt\": 2,\n" +
                "\t\t\t\"rechange_amount\": 12000\n" +
                "\t\t}],\n" +
                "\t\t\"phone_num\": \"13717675373\"\n" +
                "\t}],\n" +
                "\t\"call_contact_detail\": [{\n" +
                "\t\t\"city\": \"北京\",\n" +
                "\t\t\"p_relation\": \"\",\n" +
                "\t\t\"peer_num\": \"13801067378\",\n" +
                "\t\t\"group_name\": \"未知\",\n" +
                "\t\t\"company_name\": \"未知\",\n" +
                "\t\t\"call_cnt_1w\": 6,\n" +
                "\t\t\"call_cnt_1m\": 17,\n" +
                "\t\t\"call_cnt_3m\": 58,\n" +
                "\t\t\"call_cnt_6m\": 121,\n" +
                "\t\t\"call_time_3m\": 2577,\n" +
                "\t\t\"call_time_6m\": 6072,\n" +
                "\t\t\"dial_cnt_3m\": 44,\n" +
                "\t\t\"dial_cnt_6m\": 96,\n" +
                "\t\t\"dial_time_3m\": 2129,\n" +
                "\t\t\"dial_time_6m\": 5145,\n" +
                "\t\t\"dialed_cnt_3m\": 14,\n" +
                "\t\t\"dialed_cnt_6m\": 25,\n" +
                "\t\t\"dialed_time_3m\": 448,\n" +
                "\t\t\"dialed_time_6m\": 927,\n" +
                "\t\t\"call_cnt_morning_3m\": 18,\n" +
                "\t\t\"call_cnt_morning_6m\": 32,\n" +
                "\t\t\"call_cnt_noon_3m\": 4,\n" +
                "\t\t\"call_cnt_noon_6m\": 8,\n" +
                "\t\t\"call_cnt_afternoon_3m\": 12,\n" +
                "\t\t\"call_cnt_afternoon_6m\": 30,\n" +
                "\t\t\"call_cnt_evening_3m\": 24,\n" +
                "\t\t\"call_cnt_evening_6m\": 51,\n" +
                "\t\t\"call_cnt_night_3m\": 0,\n" +
                "\t\t\"call_cnt_night_6m\": 0,\n" +
                "\t\t\"call_cnt_weekday_3m\": 26,\n" +
                "\t\t\"call_cnt_weekday_6m\": 59,\n" +
                "\t\t\"call_cnt_weekend_3m\": 29,\n" +
                "\t\t\"call_cnt_weekend_6m\": 57,\n" +
                "\t\t\"call_cnt_holiday_3m\": 3,\n" +
                "\t\t\"call_cnt_holiday_6m\": 5,\n" +
                "\t\t\"call_if_whole_day_3m\": false,\n" +
                "\t\t\"call_if_whole_day_6m\": false,\n" +
                "\t\t\"trans_start\": \"2017-05-28 20:48:03\",\n" +
                "\t\t\"trans_end\": \"2017-11-20 17:06:36\"\n" +
                "\t}, {\n" +
                "\t\t\"city\": \"北京\",\n" +
                "\t\t\"p_relation\": \"\",\n" +
                "\t\t\"peer_num\": \"18911434875\",\n" +
                "\t\t\"group_name\": \"未知\",\n" +
                "\t\t\"company_name\": \"未知\",\n" +
                "\t\t\"call_cnt_1w\": 0,\n" +
                "\t\t\"call_cnt_1m\": 0,\n" +
                "\t\t\"call_cnt_3m\": 0,\n" +
                "\t\t\"call_cnt_6m\": 1,\n" +
                "\t\t\"call_time_3m\": 0,\n" +
                "\t\t\"call_time_6m\": 5,\n" +
                "\t\t\"dial_cnt_3m\": 0,\n" +
                "\t\t\"dial_cnt_6m\": 0,\n" +
                "\t\t\"dial_time_3m\": 0,\n" +
                "\t\t\"dial_time_6m\": 0,\n" +
                "\t\t\"dialed_cnt_3m\": 0,\n" +
                "\t\t\"dialed_cnt_6m\": 1,\n" +
                "\t\t\"dialed_time_3m\": 0,\n" +
                "\t\t\"dialed_time_6m\": 5,\n" +
                "\t\t\"call_cnt_morning_3m\": 0,\n" +
                "\t\t\"call_cnt_morning_6m\": 0,\n" +
                "\t\t\"call_cnt_noon_3m\": 0,\n" +
                "\t\t\"call_cnt_noon_6m\": 0,\n" +
                "\t\t\"call_cnt_afternoon_3m\": 0,\n" +
                "\t\t\"call_cnt_afternoon_6m\": 0,\n" +
                "\t\t\"call_cnt_evening_3m\": 0,\n" +
                "\t\t\"call_cnt_evening_6m\": 0,\n" +
                "\t\t\"call_cnt_night_3m\": 0,\n" +
                "\t\t\"call_cnt_night_6m\": 1,\n" +
                "\t\t\"call_cnt_weekday_3m\": 0,\n" +
                "\t\t\"call_cnt_weekday_6m\": 0,\n" +
                "\t\t\"call_cnt_weekend_3m\": 0,\n" +
                "\t\t\"call_cnt_weekend_6m\": 1,\n" +
                "\t\t\"call_cnt_holiday_3m\": 0,\n" +
                "\t\t\"call_cnt_holiday_6m\": 0,\n" +
                "\t\t\"call_if_whole_day_3m\": false,\n" +
                "\t\t\"call_if_whole_day_6m\": false,\n" +
                "\t\t\"trans_start\": \"2017-07-01 02:22:03\",\n" +
                "\t\t\"trans_end\": \"2017-07-01 02:22:03\"\n" +
                "\t}],\n" +
                "\t\"sms_contact_detail\": [{\n" +
                "\t\t\"peer_num\": \"8613801067378\",\n" +
                "\t\t\"sms_cnt_1w\": 12,\n" +
                "\t\t\"sms_cnt_1m\": 29,\n" +
                "\t\t\"sms_cnt_3m\": 98,\n" +
                "\t\t\"sms_cnt_6m\": 195,\n" +
                "\t\t\"send_cnt_3m\": 98,\n" +
                "\t\t\"send_cnt_6m\": 195,\n" +
                "\t\t\"receive_cnt_3m\": 0,\n" +
                "\t\t\"receive_cnt_6m\": 0\n" +
                "\t}, {\n" +
                "\t\t\"peer_num\": \"8615160183842\",\n" +
                "\t\t\"sms_cnt_1w\": 0,\n" +
                "\t\t\"sms_cnt_1m\": 1,\n" +
                "\t\t\"sms_cnt_3m\": 1,\n" +
                "\t\t\"sms_cnt_6m\": 1,\n" +
                "\t\t\"send_cnt_3m\": 1,\n" +
                "\t\t\"send_cnt_6m\": 1,\n" +
                "\t\t\"receive_cnt_3m\": 0,\n" +
                "\t\t\"receive_cnt_6m\": 0\n" +
                "\t}],\n" +
                "\t\"contact_region\": [{\n" +
                "\t\t\"key\": \"contact_region_3m\",\n" +
                "\t\t\"desc\": \"联系人手机号码归属地 (近3月联系次数降序)\",\n" +
                "\t\t\"region_list\": [{\n" +
                "\t\t\t\"region_loc\": \"北京\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 46,\n" +
                "\t\t\t\"region_call_cnt\": 352,\n" +
                "\t\t\t\"region_call_time\": 25161,\n" +
                "\t\t\t\"region_dial_cnt\": 172,\n" +
                "\t\t\t\"region_dial_time\": 9965,\n" +
                "\t\t\t\"region_dialed_cnt\": 180,\n" +
                "\t\t\t\"region_dialed_time\": 15196,\n" +
                "\t\t\t\"region_avg_dial_time\": 58,\n" +
                "\t\t\t\"region_avg_dialed_time\": 84,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 0.49,\n" +
                "\t\t\t\"region_dial_time_pct\": 0.4,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 0.51,\n" +
                "\t\t\t\"region_dialed_time_pct\": 0.6\n" +
                "\t\t}, {\n" +
                "\t\t\t\"region_loc\": \"全国\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 11,\n" +
                "\t\t\t\"region_call_cnt\": 22,\n" +
                "\t\t\t\"region_call_time\": 4479,\n" +
                "\t\t\t\"region_dial_cnt\": 22,\n" +
                "\t\t\t\"region_dial_time\": 4479,\n" +
                "\t\t\t\"region_dialed_cnt\": 0,\n" +
                "\t\t\t\"region_dialed_time\": 0,\n" +
                "\t\t\t\"region_avg_dial_time\": 204,\n" +
                "\t\t\t\"region_avg_dialed_time\": 0,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 1,\n" +
                "\t\t\t\"region_dial_time_pct\": 1,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 0,\n" +
                "\t\t\t\"region_dialed_time_pct\": 0\n" +
                "\t\t}, {\n" +
                "\t\t\t\"region_loc\": \"呼和浩特\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 1,\n" +
                "\t\t\t\"region_call_cnt\": 8,\n" +
                "\t\t\t\"region_call_time\": 498,\n" +
                "\t\t\t\"region_dial_cnt\": 5,\n" +
                "\t\t\t\"region_dial_time\": 324,\n" +
                "\t\t\t\"region_dialed_cnt\": 3,\n" +
                "\t\t\t\"region_dialed_time\": 174,\n" +
                "\t\t\t\"region_avg_dial_time\": 65,\n" +
                "\t\t\t\"region_avg_dialed_time\": 58,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 0.63,\n" +
                "\t\t\t\"region_dial_time_pct\": 0.65,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 0.38,\n" +
                "\t\t\t\"region_dialed_time_pct\": 0.35\n" +
                "\t\t}, {\n" +
                "\t\t\t\"region_loc\": \"南京\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 1,\n" +
                "\t\t\t\"region_call_cnt\": 2,\n" +
                "\t\t\t\"region_call_time\": 413,\n" +
                "\t\t\t\"region_dial_cnt\": 1,\n" +
                "\t\t\t\"region_dial_time\": 239,\n" +
                "\t\t\t\"region_dialed_cnt\": 1,\n" +
                "\t\t\t\"region_dialed_time\": 174,\n" +
                "\t\t\t\"region_avg_dial_time\": 239,\n" +
                "\t\t\t\"region_avg_dialed_time\": 174,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 0.5,\n" +
                "\t\t\t\"region_dial_time_pct\": 0.58,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 0.5,\n" +
                "\t\t\t\"region_dialed_time_pct\": 0.42\n" +
                "\t\t}, {\n" +
                "\t\t\t\"region_loc\": \"泰安\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 1,\n" +
                "\t\t\t\"region_call_cnt\": 1,\n" +
                "\t\t\t\"region_call_time\": 59,\n" +
                "\t\t\t\"region_dial_cnt\": 0,\n" +
                "\t\t\t\"region_dial_time\": 0,\n" +
                "\t\t\t\"region_dialed_cnt\": 1,\n" +
                "\t\t\t\"region_dialed_time\": 59,\n" +
                "\t\t\t\"region_avg_dial_time\": 0,\n" +
                "\t\t\t\"region_avg_dialed_time\": 59,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 0,\n" +
                "\t\t\t\"region_dial_time_pct\": 0,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 1,\n" +
                "\t\t\t\"region_dialed_time_pct\": 1\n" +
                "\t\t}, {\n" +
                "\t\t\t\"region_loc\": \"上海\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 1,\n" +
                "\t\t\t\"region_call_cnt\": 1,\n" +
                "\t\t\t\"region_call_time\": 5,\n" +
                "\t\t\t\"region_dial_cnt\": 1,\n" +
                "\t\t\t\"region_dial_time\": 5,\n" +
                "\t\t\t\"region_dialed_cnt\": 0,\n" +
                "\t\t\t\"region_dialed_time\": 0,\n" +
                "\t\t\t\"region_avg_dial_time\": 5,\n" +
                "\t\t\t\"region_avg_dialed_time\": 0,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 1,\n" +
                "\t\t\t\"region_dial_time_pct\": 1,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 0,\n" +
                "\t\t\t\"region_dialed_time_pct\": 0\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"key\": \"contact_region_6m\",\n" +
                "\t\t\"desc\": \"联系人手机号码归属地 (近6月联系次数降序)\",\n" +
                "\t\t\"region_list\": [{\n" +
                "\t\t\t\"region_loc\": \"北京\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 91,\n" +
                "\t\t\t\"region_call_cnt\": 718,\n" +
                "\t\t\t\"region_call_time\": 62266,\n" +
                "\t\t\t\"region_dial_cnt\": 333,\n" +
                "\t\t\t\"region_dial_time\": 24665,\n" +
                "\t\t\t\"region_dialed_cnt\": 385,\n" +
                "\t\t\t\"region_dialed_time\": 37601,\n" +
                "\t\t\t\"region_avg_dial_time\": 74,\n" +
                "\t\t\t\"region_avg_dialed_time\": 98,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 0.46,\n" +
                "\t\t\t\"region_dial_time_pct\": 0.4,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 0.54,\n" +
                "\t\t\t\"region_dialed_time_pct\": 0.6\n" +
                "\t\t},{\n" +
                "\t\t\t\"region_loc\": \"上海\",\n" +
                "\t\t\t\"region_uniq_num_cnt\": 1,\n" +
                "\t\t\t\"region_call_cnt\": 1,\n" +
                "\t\t\t\"region_call_time\": 5,\n" +
                "\t\t\t\"region_dial_cnt\": 1,\n" +
                "\t\t\t\"region_dial_time\": 5,\n" +
                "\t\t\t\"region_dialed_cnt\": 0,\n" +
                "\t\t\t\"region_dialed_time\": 0,\n" +
                "\t\t\t\"region_avg_dial_time\": 5,\n" +
                "\t\t\t\"region_avg_dialed_time\": 0,\n" +
                "\t\t\t\"region_dial_cnt_pct\": 1,\n" +
                "\t\t\t\"region_dial_time_pct\": 1,\n" +
                "\t\t\t\"region_dialed_cnt_pct\": 0,\n" +
                "\t\t\t\"region_dialed_time_pct\": 0\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"call_risk_analysis\": [{\n" +
                "\t\t\"analysis_item\": \"110\",\n" +
                "\t\t\"analysis_desc\": \"110\",\n" +
                "\t\t\"analysis_point\": {\n" +
                "\t\t\t\"call_cnt_1m\": 0,\n" +
                "\t\t\t\"call_cnt_3m\": 0,\n" +
                "\t\t\t\"call_cnt_6m\": 0,\n" +
                "\t\t\t\"avg_call_cnt_3m\": 0,\n" +
                "\t\t\t\"avg_call_cnt_6m\": 0,\n" +
                "\t\t\t\"call_time_1m\": 0,\n" +
                "\t\t\t\"call_time_3m\": 0,\n" +
                "\t\t\t\"call_time_6m\": 0,\n" +
                "\t\t\t\"avg_call_time_3m\": 0,\n" +
                "\t\t\t\"avg_call_time_6m\": 0\n" +
                "\t\t}\n" +
                "\t}, {\n" +
                "\t\t\"analysis_item\": \"agency\",\n" +
                "\t\t\"analysis_desc\": \"中介\",\n" +
                "\t\t\"analysis_point\": {\n" +
                "\t\t\t\"call_cnt_1m\": 0,\n" +
                "\t\t\t\"call_cnt_3m\": 0,\n" +
                "\t\t\t\"call_cnt_6m\": 0,\n" +
                "\t\t\t\"avg_call_cnt_3m\": 0,\n" +
                "\t\t\t\"avg_call_cnt_6m\": 0,\n" +
                "\t\t\t\"call_time_1m\": 0,\n" +
                "\t\t\t\"call_time_3m\": 0,\n" +
                "\t\t\t\"call_time_6m\": 0,\n" +
                "\t\t\t\"avg_call_time_3m\": 0,\n" +
                "\t\t\t\"avg_call_time_6m\": 0\n" +
                "\t\t}\n" +
                "\t},{\n" +
                "\t\t\"analysis_item\": \"court\",\n" +
                "\t\t\"analysis_desc\": \"法院\",\n" +
                "\t\t\"analysis_point\": {\n" +
                "\t\t\t\"call_cnt_1m\": 0,\n" +
                "\t\t\t\"call_cnt_3m\": 0,\n" +
                "\t\t\t\"call_cnt_6m\": 0,\n" +
                "\t\t\t\"avg_call_cnt_3m\": 0,\n" +
                "\t\t\t\"avg_call_cnt_6m\": 0,\n" +
                "\t\t\t\"call_time_1m\": 0,\n" +
                "\t\t\t\"call_time_3m\": 0,\n" +
                "\t\t\t\"call_time_6m\": 0,\n" +
                "\t\t\t\"avg_call_time_3m\": 0,\n" +
                "\t\t\t\"avg_call_time_6m\": 0\n" +
                "\t\t}\n" +
                "\t}],\n" +
                "\t\"main_service\": [{\n" +
                "\t\t\"service_num\": \"95528\",\n" +
                "\t\t\"group_name\": \"银行\",\n" +
                "\t\t\"company_name\": \"浦东发展银行\",\n" +
                "\t\t\"total_service_cnt\": 1,\n" +
                "\t\t\"service_details\": [{\n" +
                "\t\t\t\"interact_mth\": \"2017-06\",\n" +
                "\t\t\t\"interact_cnt\": 1,\n" +
                "\t\t\t\"interact_time\": 141,\n" +
                "\t\t\t\"dial_cnt\": 1,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 141,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"service_num\": \"95511\",\n" +
                "\t\t\"group_name\": \"银行\",\n" +
                "\t\t\"company_name\": \"平安银行\",\n" +
                "\t\t\"total_service_cnt\": 5,\n" +
                "\t\t\"service_details\": [{\n" +
                "\t\t\t\"interact_mth\": \"2017-11\",\n" +
                "\t\t\t\"interact_cnt\": 1,\n" +
                "\t\t\t\"interact_time\": 91,\n" +
                "\t\t\t\"dial_cnt\": 1,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 91,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}, {\n" +
                "\t\t\t\"interact_mth\": \"2017-10\",\n" +
                "\t\t\t\"interact_cnt\": 2,\n" +
                "\t\t\t\"interact_time\": 179,\n" +
                "\t\t\t\"dial_cnt\": 2,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 179,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}, {\n" +
                "\t\t\t\"interact_mth\": \"2017-08\",\n" +
                "\t\t\t\"interact_cnt\": 1,\n" +
                "\t\t\t\"interact_time\": 141,\n" +
                "\t\t\t\"dial_cnt\": 1,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 141,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}, {\n" +
                "\t\t\t\"interact_mth\": \"2017-07\",\n" +
                "\t\t\t\"interact_cnt\": 1,\n" +
                "\t\t\t\"interact_time\": 307,\n" +
                "\t\t\t\"dial_cnt\": 1,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 307,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"service_num\": \"10086\",\n" +
                "\t\t\"group_name\": \"通信服务机构\",\n" +
                "\t\t\"company_name\": \"中国移动客服热线\",\n" +
                "\t\t\"total_service_cnt\": 9,\n" +
                "\t\t\"service_details\": [{\n" +
                "\t\t\t\"interact_mth\": \"2017-11\",\n" +
                "\t\t\t\"interact_cnt\": 1,\n" +
                "\t\t\t\"interact_time\": 48,\n" +
                "\t\t\t\"dial_cnt\": 1,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 48,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}, {\n" +
                "\t\t\t\"interact_mth\": \"2017-10\",\n" +
                "\t\t\t\"interact_cnt\": 3,\n" +
                "\t\t\t\"interact_time\": 213,\n" +
                "\t\t\t\"dial_cnt\": 3,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 213,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}, {\n" +
                "\t\t\t\"interact_mth\": \"2017-07\",\n" +
                "\t\t\t\"interact_cnt\": 5,\n" +
                "\t\t\t\"interact_time\": 368,\n" +
                "\t\t\t\"dial_cnt\": 5,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 368,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"service_num\": \"95188\",\n" +
                "\t\t\"group_name\": \"第三方支付\",\n" +
                "\t\t\"company_name\": \"支付宝客服热线\",\n" +
                "\t\t\"total_service_cnt\": 1,\n" +
                "\t\t\"service_details\": [{\n" +
                "\t\t\t\"interact_mth\": \"2017-10\",\n" +
                "\t\t\t\"interact_cnt\": 1,\n" +
                "\t\t\t\"interact_time\": 339,\n" +
                "\t\t\t\"dial_cnt\": 1,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 339,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"service_num\": \"95580\",\n" +
                "\t\t\"group_name\": \"银行\",\n" +
                "\t\t\"company_name\": \"邮政储蓄银行\",\n" +
                "\t\t\"total_service_cnt\": 2,\n" +
                "\t\t\"service_details\": [{\n" +
                "\t\t\t\"interact_mth\": \"2017-07\",\n" +
                "\t\t\t\"interact_cnt\": 2,\n" +
                "\t\t\t\"interact_time\": 296,\n" +
                "\t\t\t\"dial_cnt\": 2,\n" +
                "\t\t\t\"dialed_cnt\": 0,\n" +
                "\t\t\t\"dial_time\": 296,\n" +
                "\t\t\t\"dialed_time\": 0\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"call_service_analysis\": [{\n" +
                "\t\t\"analysis_item\": \"bank\",\n" +
                "\t\t\"analysis_desc\": \"银行\",\n" +
                "\t\t\"analysis_point\": {\n" +
                "\t\t\t\"call_cnt_1m\": 2,\n" +
                "\t\t\t\"call_cnt_3m\": 4,\n" +
                "\t\t\t\"call_cnt_6m\": 12,\n" +
                "\t\t\t\"avg_call_cnt_3m\": 1.33,\n" +
                "\t\t\t\"avg_call_cnt_6m\": 2,\n" +
                "\t\t\t\"call_time_1m\": 293,\n" +
                "\t\t\t\"call_time_3m\": 472,\n" +
                "\t\t\t\"call_time_6m\": 2071,\n" +
                "\t\t\t\"avg_call_time_3m\": 157,\n" +
                "\t\t\t\"avg_call_time_6m\": 345\n" +
                "\t\t}\n" +
                "\t}, {\n" +
                "\t\t\"analysis_item\": \"carrier\",\n" +
                "\t\t\"analysis_desc\": \"通信服务机构\",\n" +
                "\t\t\"analysis_point\": {\n" +
                "\t\t\t\"call_cnt_1m\": 1,\n" +
                "\t\t\t\"call_cnt_3m\": 4,\n" +
                "\t\t\t\"call_cnt_6m\": 9,\n" +
                "\t\t\t\"avg_call_cnt_3m\": 1.33,\n" +
                "\t\t\t\"avg_call_cnt_6m\": 1.5,\n" +
                "\t\t\t\"call_time_1m\": 48,\n" +
                "\t\t\t\"call_time_3m\": 261,\n" +
                "\t\t\t\"call_time_6m\": 629,\n" +
                "\t\t\t\"avg_call_time_3m\": 87,\n" +
                "\t\t\t\"avg_call_time_6m\": 105\n" +
                "\t\t}\n" +
                "\t}],\n" +
                "\t\"active_degree\": [{\n" +
                "\t\t\"item\": {\n" +
                "\t\t\t\"item_1m\": \"27\",\n" +
                "\t\t\t\"item_3m\": \"80\",\n" +
                "\t\t\t\"item_6m\": \"163\",\n" +
                "\t\t\t\"avg_item_3m\": \"26.67\",\n" +
                "\t\t\t\"avg_item_6m\": \"27.17\"\n" +
                "\t\t},\n" +
                "\t\t\"app_point\": \"call_day\",\n" +
                "\t\t\"app_point_zh\": \"通话活跃天数\"\n" +
                "\t}, {\n" +
                "\t\t\"item\": {\n" +
                "\t\t\t\"item_1m\": \"1\",\n" +
                "\t\t\t\"item_3m\": \"3\",\n" +
                "\t\t\t\"item_6m\": \"6\",\n" +
                "\t\t\t\"avg_item_3m\": null,\n" +
                "\t\t\t\"avg_item_6m\": null\n" +
                "\t\t},\n" +
                "\t\t\"app_point\": \"live_month_cnt\",\n" +
                "\t\t\"app_point_zh\": \"本机号码归属地使用月数\"\n" +
                "\t}],\n" +
                "\t\"trip_info\": [{\n" +
                "\t\t\"trip_dest\": \"张家口\",\n" +
                "\t\t\"trip_start_time\": \"2017-10-02 06:39:25\",\n" +
                "\t\t\"trip_end_time\": \"2017-10-02 10:10:52\",\n" +
                "\t\t\"trip_leave\": \"北京\",\n" +
                "\t\t\"trip_type\": \"节假日\"\n" +
                "\t},  {\n" +
                "\t\t\"trip_dest\": \"张家口\",\n" +
                "\t\t\"trip_start_time\": \"2017-10-06 10:54:12\",\n" +
                "\t\t\"trip_end_time\": \"2017-10-06 14:11:24\",\n" +
                "\t\t\"trip_leave\": \"集宁\",\n" +
                "\t\t\"trip_type\": \"节假日\"\n" +
                "\t}]\n" +
                "}";
        return a;
    }
    /**
     * 魔杖的数据
     * @return
     */
    public static String getWandInfo(){
//        String a="{\"update_date\":\"2018-05-11\",\"person_info\":{\"mobile\":\"1580134****\",\"carrier\":\"中国移动\",\"name\":\"赵**\",\"age\":31,\"gender\":\"女\",\"company\":\"久亿恒远（北京）科技有限公司\",\"idcard\":\"13092519870713****\",\"idcard_location\":\"河北省/沧州市/盐山县\",\"mobile_location\":\"北京/北京\",\"company_type\":\"私企\"},\"verification_info\":{\"has_carrier_data\":true,\"has_fund_data\":true,\"has_onlinebank_data\":false,\"idcard_match_fund\":true,\"name_match_fund\":true},\"register_info\":{\"org_count\":3,\"org_types\":[\"CASH_LOAN\"]},\"queried_detail\":{\"org_count\":3,\"queried_infos\":[{\"date\":\"2018-05-11\",\"org_type\":\"CASH_LOAN\",\"is_self\":false},{\"date\":\"2018-03-13\",\"org_type\":\"CASH_LOAN\",\"is_self\":false},{\"date\":\"2018-01-17\",\"org_type\":\"CASH_LOAN\",\"is_self\":false},{\"date\":\"2017-11-17\",\"org_type\":\"CASH_LOAN\",\"is_self\":false},{\"date\":\"2017-11-09\",\"org_type\":\"CASH_LOAN\",\"is_self\":false}],\"queried_analyze\":[{\"org_type\":\"CASH_LOAN\",\"loan_cnt_15d\":1,\"loan_cnt_30d\":1,\"loan_cnt_90d\":2,\"loan_cnt_180d\":3}]},\"black_info_detail\":{\"match_score\":80,\"black_types\":[],\"direct_contact_count\":63,\"direct_black_count\":0,\"indirect_black_count\":4,\"introduce_black_count\":1,\"introduce_black_ratio\":158,\"mobile_name_in_blacklist\":false,\"idcard_name_in_blacklist\":false,\"direct_intimate_contact_count\":7,\"direct_intimate_black_count\":0,\"indirect_intimate_black_count\":0,\"introduce_intimate_black_count\":0,\"introduce_intimate_black_ratio\":0},\"gray_info_detail\":{\"gray_types\":[],\"mobile_name_in_gray\":false,\"idcard_name_in_gray\":false},\"suspicious_mobile\":{\"other_names\":[{\"name\":\"李**\",\"latest_used_time\":\"2017-08-07 14:07:33\"},{\"name\":\"韩*\",\"latest_used_time\":\"2017-07-17 17:55:44\"},{\"name\":\"杨**\",\"latest_used_time\":\"2017-07-17 17:36:02\"},{\"name\":\"藏**\",\"latest_used_time\":\"2017-07-12 18:37:27\"},{\"name\":\"臧**\",\"latest_used_time\":\"2017-07-12 18:12:12\"},{\"name\":\"孙**\",\"latest_used_time\":\"2017-07-12 10:16:16\"},{\"name\":\"张*\",\"latest_used_time\":\"2017-07-12 10:03:30\"}],\"other_idcards\":[{\"idcard\":\"51013019630405****\",\"latest_used_time\":\"2017-08-07 14:07:33\"},{\"idcard\":\"51102819751007****\",\"latest_used_time\":\"2017-07-17 17:55:44\"},{\"idcard\":\"41078119770926****\",\"latest_used_time\":\"2017-07-17 17:36:02\"},{\"idcard\":\"53220119710826****\",\"latest_used_time\":\"2017-07-12 18:37:27\"},{\"idcard\":\"11022219930521****\",\"latest_used_time\":\"2017-07-12 10:16:16\"},{\"idcard\":\"41010219900319****\",\"latest_used_time\":\"2017-07-12 10:03:30\"}],\"information_sources\":[{\"org_type\":\"CASH_LOAN\",\"latest_used_time\":\"2018-03-13 18:52:42\"},{\"org_type\":\"CASH_LOAN\",\"latest_used_time\":\"2017-11-17 14:20:08\"},{\"org_type\":\"CASH_LOAN\",\"latest_used_time\":\"2017-11-09 14:07:46\"}]},\"suspicious_idcard\":{\"other_names\":[],\"other_mobiles\":[{\"mobile\":\"1580134****\",\"carrier\":\"中国移动\",\"mobile_location\":\"北京/北京\",\"latest_used_time\":\"2018-05-10 10:30:04\"}],\"information_sources\":[{\"org_type\":\"CASH_LOAN\",\"latest_used_time\":\"2018-03-13 18:52:42\"},{\"org_type\":\"CASH_LOAN\",\"latest_used_time\":\"2017-11-17 14:20:08\"},{\"org_type\":\"CASH_LOAN\",\"latest_used_time\":\"2017-11-09 14:07:46\"}]},\"mobile_infos\":[],\"fund_infos\":[{\"fund_basic\":{\"balance\":\"1000~2000\",\"update_date\":\"2018-05-08\",\"open_location\":\"北京\",\"account_status\":\"正常\",\"monthly_income\":\"1000~2000\",\"last_pay_date\":\"2018-04-01\"},\"fund_statistics\":{\"total_months\":12,\"total_companies\":1,\"continuous_months\":12,\"repay_times\":0}}],\"debit_card_info\":{},\"credit_card_info\":{}}";
        String a="";
        return a;
    }
}
