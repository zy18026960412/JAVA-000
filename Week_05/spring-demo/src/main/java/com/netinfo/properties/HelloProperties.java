package com.netinfo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.*;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/19 11:32
 */
@ConfigurationProperties(prefix = HelloProperties.HELLO_FORMAT_PREFIX)
public class HelloProperties {

    public static final String HELLO_FORMAT_PREFIX="zhangyang.hello";

    private Map<String,Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

}
