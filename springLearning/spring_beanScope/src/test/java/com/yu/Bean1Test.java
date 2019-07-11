package com.yu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/7/11.
 */
public class Bean1Test {

    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        Bean1 bean1_2 = context.getBean("bean1", Bean1.class);
        Bean1 bean1_3 = context.getBean("bean1", Bean1.class);
        System.out.println(bean1);
        System.out.println(bean1_2);
        System.out.println(bean1_3);

//==============================单例bean依赖一个多例bean使依赖的真正成为多例
        Bean1_1 bean1_1 = context.getBean("bean1_1", Bean1_1.class);
        Bean1_1 bean1_1_2 = context.getBean("bean1_1", Bean1_1.class);
        Bean1_1 bean1_1_3 = context.getBean("bean1_1", Bean1_1.class);
        System.out.println(bean1_1_2);
        System.out.println(bean1_1_3);
        //如上可以看到获取的依赖的bean是同一个，但是调用方法时依赖的多例的bean都不同
        bean1_1.printBean2();
        bean1_1.printBean2();
        bean1_1.printBean2();
        bean1_1.printBean2();
        bean1_1.printBean2();


    }

}