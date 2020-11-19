package com.netinfo.service;

import com.alibaba.fastjson.JSON;
import com.netinfo.properties.HelloProperties;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/19 11:35
 */
public class HelloFormatTemplate {

    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties){
        this.helloProperties = helloProperties;
    }


    public <T> String doFormat(){
        return JSON.toJSONString(helloProperties.getInfo());
    }
}
