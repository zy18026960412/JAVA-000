package com.netinfo.config;

import com.netinfo.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/18 14:13
 */
@Configuration
@ComponentScan(basePackages = {"com.netinfo.model"})
@Import({Person2.class,ImportSelectorTest.class,ImportBeanDefinitionRegistrarTest.class})
public class MyAnnotationConfiguration {

    @Bean
    public Person person1(){
        return new Person();
    }

    @Bean
    public FactoryBeanTest factoryBeanTest(){
        return new FactoryBeanTest();
    }

}
