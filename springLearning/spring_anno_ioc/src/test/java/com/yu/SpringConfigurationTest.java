package com.yu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2019/7/12.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringConfigurationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void t1(){
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Bean1 bean1 = context.getBean("b1", Bean1.class);
        Bean1 bean2 = context.getBean("b22", Bean1.class);
        Bean1 bean3 = context.getBean("b33", Bean1.class);
        System.out.println(bean1);
        System.out.println(bean3);
        System.out.println(bean2);
    }
}