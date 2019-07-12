package com.yu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2019/7/12.
 */
public class TestBeanTest {

    @Test
    public void t1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        for (int i = 0; i < 10; i++) {
            TestBean testBean = context.getBean("testBean", TestBean.class);
            testBean.printAnotherBean();
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < 10; i++) {
            TestBean2 testBean = context.getBean("testBean2", TestBean2.class);
            testBean.printAnotherBean();
        }
    }

}