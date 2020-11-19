package com.netinfo.model;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/18 15:15
 */
public class FactoryBeanTest implements FactoryBean<Person5> {

    @Override
    public Person5 getObject() throws Exception {
        Person5 person5 =  new Person5();
        return person5;
    }

    @Override
    public Class<?> getObjectType() {
        return Person5.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
