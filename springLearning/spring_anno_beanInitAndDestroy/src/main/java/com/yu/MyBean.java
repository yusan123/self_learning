package com.yu;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2019/7/13.
 */
//@Component
public class MyBean implements InitializingBean,DisposableBean{
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }
    

    public void afterPropertiesSet() throws Exception {
        System.out.println("bean init");

    }
    @PostConstruct
    public void onInit(){
        System.out.println("use @PostConstruct在构造方法后执行");
    }

    @PreDestroy
    public void onDestroy(){
        System.out.println("use @PreDestroy 在销毁方法前执行");
    }


    public void onInit1(){
        System.out.println("使用@Bean绑定初始化前执行方法");
    }


    public void onDestroy1(){
        System.out.println("使用@Bean绑定销毁前执行方法");
    }
}
