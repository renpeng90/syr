package common.oss;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by WangGang on 2017/3/9.
 */
@ConfigurationProperties("oss")
public class OssProperties {
    private boolean enabled;
    private boolean lazy;
    private Map<String, OssInstanceProperties> instances;

    public OssProperties() {
        this.enabled = true;
        this.lazy = false;
        this.instances = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public Map<String, OssInstanceProperties> getInstances() {
        return instances;
    }

    public void setInstances(Map<String, OssInstanceProperties> instances) {
        this.instances = instances;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }
}
