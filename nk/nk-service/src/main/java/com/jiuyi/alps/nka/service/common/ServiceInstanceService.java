package com.jiuyi.alps.nka.service.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 * @author zhangyibo
 */
@Component
public class ServiceInstanceService {
    private static final Logger LOG = LoggerFactory.getLogger(ServiceInstanceService.class);

    @Value("${server.port}")
    private String serverPort;

    public int getServiceIndex(List<String> servers) {
        if (servers == null || servers.size() == 0) {
            throw new RuntimeException("getServiceIndex：服务列表为空");
        }
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            int i = 0;
            for (String server : servers) {
                LOG.info("server = {}", server);
                String[] ipAndPort = server.split(":");
                if (ip.equals(ipAndPort[0]) && serverPort.equals(ipAndPort[1])) {
                    return i;
                }
                i++;
            }
        } catch (UnknownHostException e) {
            LOG.error("getServiceIndex：获取本机IP异常", e);
        }
        return -1;
    }

    public int getServiceCount(List<String> servers) {
        return servers.size();
    }

}
