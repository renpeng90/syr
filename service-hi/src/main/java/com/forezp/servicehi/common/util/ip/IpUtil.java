package com.forezp.servicehi.common.util.ip;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by WangGang on 2017/11/18.
 */
public class IpUtil {

    public static String getIpAddr(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个IP值，第一个为真实IP。
            int index = ip.indexOf(',');
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public static long ipToLong(String ipString) {
        long result = 0;
        java.util.StringTokenizer token = new java.util.StringTokenizer(ipString, ".");
        result += Long.parseLong(token.nextToken()) << 24;
        result += Long.parseLong(token.nextToken()) << 16;
        result += Long.parseLong(token.nextToken()) << 8;
        result += Long.parseLong(token.nextToken());
        return result;
    }

    public static String longToIp(long ipLong) {
        StringBuilder sb = new StringBuilder();
        sb.append(ipLong >>> 24);
        sb.append(".");
        sb.append(String.valueOf((ipLong & 0x00FFFFFF) >>> 16));
        sb.append(".");
        sb.append(String.valueOf((ipLong & 0x0000FFFF) >>> 8));
        sb.append(".");
        sb.append(String.valueOf(ipLong & 0x000000FF));
        return sb.toString();
    }

    public static void main(String args[]){
        System.out.println(IpUtil.ipToLong("255.255.254.255"));
        System.out.println(IpUtil.longToIp(4294967039L));
    }
}
