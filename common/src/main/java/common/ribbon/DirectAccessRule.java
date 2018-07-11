package common.ribbon;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.ClientConfigEnabledRoundRobinRule;
import com.netflix.loadbalancer.Server;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * Created by WangGang on 2017/3/16.
 */
public class DirectAccessRule extends ClientConfigEnabledRoundRobinRule {
    @Autowired
    private Environment env;

    @Override
    public Server choose(Object key) {
        String clientName = ((BaseLoadBalancer) super.getLoadBalancer()).getClientConfig().getClientName();
        String host = env.getProperty(clientName + ".ribbon.server");
        if (StringUtils.isNotEmpty(host)) {
            String hostAndPort[] = host.split(":");
            return new Server(hostAndPort[0], Integer.valueOf(hostAndPort[1]));
        } else {
            throw new IllegalArgumentException(clientName + " should config access server for DirectAccessRule");
        }
    }
}
