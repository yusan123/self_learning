package com.yu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/7/11.
 */
public class beansTest {


    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Beans beans = context.getBean("beans", Beans.class);
    }
}