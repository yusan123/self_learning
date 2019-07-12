package com.yu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/7/13.
 */
public class TestBeanTest {

    @Test
    public void t(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("context init ok!");
        //TestBean testBean = context.getBean("testBean", TestBean.class);
        try {
            Thread.sleep(4000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestBean testBean2 = context.getBean("testBean2", TestBean.class);
    }
}