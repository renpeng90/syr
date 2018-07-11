package com.forezp.servicehi.common.util.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 数据处理工具类.
 * @author zhuningning
 * @date 2017/11/24
 */
public class DataUtil {

    private static final Pattern NUMERIC_PATTERN = Pattern.compile("^[0-9]+(.[0-9]+)?$");

    /**
     * 判断字符串是否为数字,包括整数和小数.
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Matcher isNum = NUMERIC_PATTERN.matcher(str);
        return isNum.matches();
    }
}
