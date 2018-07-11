package com.jiuyi.alps.nka.util;

/**
 * 字段名转换工具类.
 *
 * @author zhuningning
 * @date 2017/12/25
 */
public class FieldNameConversionUtil {

    public static String fieldNameToColumnName(String fieldName) {
        StringBuilder columnName = new StringBuilder("");
        for (Character c : fieldName.toCharArray()) {
            if (Character.isUpperCase(c)) {
                columnName.append("_").append((c + "").toLowerCase());
            } else {
                columnName.append(c);
            }
        }

        return columnName.toString();
    }

    public static void main(String[] args) {
        System.out.println(fieldNameToColumnName("identNo"));
    }
}
