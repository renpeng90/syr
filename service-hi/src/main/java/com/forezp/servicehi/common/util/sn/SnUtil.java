package com.forezp.servicehi.common.util.sn;

import java.util.UUID;

/**
 * @author zhangyibo
 */
public class SnUtil {

    private static final int DEFAULT_MAX_LENGTH = 32;

    private static String[] CHARS = new String[]{"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};


    public static String generate() {
        return generate("");
    }

    public static String generate(String mark) {
        return generate(mark, DEFAULT_MAX_LENGTH);
    }

    public static String generate(String mark, int maxLength) {
        long mills = System.currentTimeMillis();
        String shortUUID = generateShortUUID();
        long tId = Thread.currentThread().getId();
        String sn = mark + String.valueOf(mills) + shortUUID + String.valueOf(tId);
        if (sn.length() > maxLength) {
            sn = sn.substring(0, maxLength);
        }
        return sn;
    }

    /**
     * 压缩8位的uuid 会有重复 但是几率较低
     */
    private static String generateShortUUID() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        final int uuidLength = 8;
        for (int i = 0; i < uuidLength; i++) {
            //将32位uuid分为8组
            String str = uuid.substring(i * 4, i * 4 + 4);
            //4位UUID转10进制
            int x = Integer.parseInt(str, 16);
            //与CHARS长度取模 得出下标
            shortBuffer.append(CHARS[x % 62]);
        }
        return shortBuffer.toString();

    }
}
