package com.yu;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/7/12.
 */

public class SpringConfigurationTest {

    @Test
    public void t1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Bean1 bean1 = context.getBean("b1", Bean1.class);
        Bean1 bean2 = context.getBean("b22", Bean1.class);
        Bean1 bean3 = context.getBean("b33", Bean1.class);
        System.out.println(bean1);
        System.out.println(bean3);
        System.out.println(bean2);
    }
}