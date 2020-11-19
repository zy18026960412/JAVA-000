package com.netinfo;

import com.netinfo.config.MyAnnotationConfiguration;
import com.netinfo.model.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/18 14:19
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAnnotationConfiguration.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName:beanDefinitionNames){
            System.out.println(beanName);
        }

        //通过@Bean的方式添加到IOC容器中，在IOC容器中如果没有指定名字，就是方法名
        //Person person = applicationContext.getBean("person1",Person.class);

        //通过@Component注解添加java对象到IOC容器中，没有指定名字，默认类小写
        //Person1 person = applicationContext.getBean("person1",Person1.class);

        //通过@Import注解添加到IOC容器中，在IOC容器中bean名称是该类的全类名
        //Person2 person = applicationContext.getBean("com.netinfo.model.Person2",Person2.class);

        //通过ImportSelector接口以及@Import注解添加到IOC容器中，在IOC容器中bean名称是该类的全类名
        //Person3 person = applicationContext.getBean("com.netinfo.model.Person3",Person3.class);

        //通过ImportBeanDefinitionRegistrar接口以及@Import注解到IOC容器中
        //Person4 person = applicationContext.getBean("person4",Person4.class);

        //通过FactoryBean接口添加到IOC容器
        //Person5 person =applicationContext.getBean("factoryBeanTest",Person5.class);

        /*person.setName("张三");
        person.setSex("男");
        person.process();*/
    }
}
