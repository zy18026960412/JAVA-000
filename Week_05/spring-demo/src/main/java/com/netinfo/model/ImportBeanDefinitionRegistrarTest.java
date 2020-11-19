package com.netinfo.model;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/18 15:04
 */
public class ImportBeanDefinitionRegistrarTest implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        //指定bean定义信息（包括bean的类型、作用域...）
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person4.class);

        //注册一个bean指定bean名字（id）
        registry.registerBeanDefinition("person4",rootBeanDefinition);
    }
}
