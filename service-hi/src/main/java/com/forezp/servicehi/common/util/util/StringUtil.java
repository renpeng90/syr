package com.forezp.servicehi.common.util.util;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StringUtil {
    private Logger logger = LoggerFactory.getLogger(getClass());
//    private final static Logger logger = LoggerFactory.getLogger(StringUtil.class);
//private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public static final String STRING_1 = "";
    public static final String STRING_2 = null;
    public static final String STRING_3 = "123456";


    /**
     * 判断字符串为空
     */
    public static void  getString(){
        System.out.println("string为空判断=====================================");
        boolean A1=!StringUtils.isEmpty(STRING_1);
        boolean A2=!StringUtils.isEmpty(STRING_2);
        boolean A3=!StringUtils.isEmpty(STRING_3);
        System.out.println("string为空判断,StringUtils.isEmpty,A1={"+A1+"},A2={"+A2+"}");
        boolean B1=StringUtils.isNotBlank(STRING_1);
        boolean B2=StringUtils.isNotBlank(STRING_2);
        boolean B3=StringUtils.isNotBlank(STRING_3);
        System.out.println("string为空判断,StringUtils.isNotBlank,B1={"+B1+"},B2={"+B1+"}");
//        logger.info("string为空判断,StringUtils.isNotBlank,B1={},B2={}",B1,B2);
        boolean C1=StringUtils.isBlank(STRING_1);
        boolean C2=StringUtils.isBlank(STRING_2);
        boolean C3=StringUtils.isBlank(STRING_3);
        System.out.println("string为空判断,StringUtils.isBlank,C1={"+C1+"},C2={"+C1+"}");
//        logger.info("string为空判断,StringUtils.isBlank,C1={},C2={}",C1,C2);
//        !Strings.isNullOrEmpty(STRING_1);
        System.out.println("string为空判断=====================================");
//        logger.info("string为空判断=====================================");
    }

    /**
     * split的使用
     * @param str
     * @return
     */
    private String transferDateFormat(String str) {
        String newStr = null;
        if (str.contains("-") && str.contains(" ")) {
            String[] arr1 = str.split(" ");
            String[] arr2 = arr1[0].split("-");
            newStr = arr2[0] + "/" + arr2[1] + "/" + arr2[2];
        } else if (str.contains("-")) {
            String[] arr1 = str.split("-");
            newStr = arr1[0] + "/" + arr1[1] + "/" + arr1[2];
        } else if (str.length() == 8) {
            String year = str.substring(0,4);
            String month = str.substring(4,6);
            String day = str.substring(6,str.length());
            newStr = year + "/" + month + "/" + day;
        }
        return newStr;
    }

}
