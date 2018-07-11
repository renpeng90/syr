package common.oss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by WangGang on 2017/3/9.
 */

public class OssClientHolder {
    private static Map<String, OSSClient> clients = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private OssProperties ossProperties;

    public OssClientHolder(OssProperties ossProperties) {
        this.ossProperties = ossProperties;
    }

    public void init() {
        if (!ossProperties.isLazy()) {
            Map<String, OssInstanceProperties> instances = ossProperties.getInstances();
            for (String instanceKey : instances.keySet()) {
                this.newOssClient(instanceKey);
            }
        }
    }

    public OSSClient getOssClient(String instanceKey) {
        OSSClient client = clients.get(instanceKey);
        if (client == null) {
            client = newOssClient(instanceKey);
        }
        return client;
    }

    private OSSClient newOssClient(String instanceKey) throws OSSException {
        if (ossProperties.getInstances().containsKey(instanceKey)) {
            OssInstanceProperties instance = ossProperties.getInstances().get(instanceKey);
            OSSClient client = new OSSClient(instance.getEndpoint(), instance.getAccessKey(), instance.getAccessSecret());
            clients.put(instanceKey, client);
            return client;
        } else {
            logger.error("no oss instance with key: {}", instanceKey);
            throw new OSSException("no oss instance with key: " + instanceKey);
        }
    }

    public void shutdown() {
        logger.info("shutting down oss clients...");
        for (OSSClient client : clients.values()) {
            client.shutdown();
        }
        logger.info("all oss clients shut down.");
    }
}
