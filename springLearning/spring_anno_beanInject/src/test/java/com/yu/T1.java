package com.yu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2019/7/12.
 */
public class T1 {

    @Test
    public void t1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println("myBean="+myBean);



        //=注入spring内置对象获取

        AnotherBean anotherBean = myBean.getApplicationContext().getBean("anotherBean", AnotherBean.class);
        System.out.println(anotherBean);
    }

}
