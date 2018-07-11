package common.oss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WangGang on 2017/3/9.
 */
@Configuration
@EnableConfigurationProperties(OssProperties.class)
@ConditionalOnProperty(value = "oss.enabled", matchIfMissing = true)
public class OssConfiguration {

    @Bean(initMethod = "init", destroyMethod = "shutdown")
    @Autowired
    OssClientHolder ossClientHolder(OssProperties ossProperties) {
        return new OssClientHolder(ossProperties);
    }
}
