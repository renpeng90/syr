package com.forezp.servicehi.common.util.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {
    /***
     * MD5加密 生成32位md5码
     * @param inStr 待加密字符串
     * @return 返回32位md5码
     * @throws
     */
    public static String md5Encode(String inStr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return md5Encode(inStr.getBytes("UTF-8"));
    }

    /***
     * MD5加密 生成32位md5码
     * @param byteArray 待加密字节数组
     * @return 返回32位md5码
     * @throws
     */
    public static String md5Encode(byte[] byteArray) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
}
