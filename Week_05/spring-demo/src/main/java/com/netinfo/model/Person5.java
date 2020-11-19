package com.netinfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/18 14:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person5  {

    private String name;

    private String sex;


    public void process(){
        System.out.println("我的名字是:"+name+"，性别为:"+sex);
    }



}
