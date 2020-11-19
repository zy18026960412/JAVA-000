package com.netinfo.config;

import com.netinfo.properties.HelloProperties;
import com.netinfo.service.HelloFormatTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/19 11:46
 */
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(HelloProperties helloProperties){
        return new HelloFormatTemplate(helloProperties);
    }
}
