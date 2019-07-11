package com.yu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/7/11.
 */
public class Bean1Test {

    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        Bean1 bean12 = context.getBean("bean12", Bean1.class);
        Bean1 bean13 = context.getBean("bean13", Bean1.class);
        Bean1 bean14 = context.getBean("bean14", Bean1.class);
        Bean1 bean15 = context.getBean("bean15", Bean1.class);
        System.out.println(bean1);
        System.out.println(bean12);
        System.out.println(bean13);
        System.out.println(bean14);
        System.out.println(bean15);
        Bean2 bean2 = context.getBean("bean2", Bean2.class);
        Bean3 bean3 = context.getBean("bean3", Bean3.class);
    }
}