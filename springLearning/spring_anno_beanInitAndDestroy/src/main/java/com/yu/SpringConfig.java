package com.yu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Created by Administrator on 2019/7/13.
 */
@Configuration
@ComponentScan("com.yu")
@Lazy
public class SpringConfig {

    @Bean(initMethod = "onInit1",destroyMethod = "onDestroy1")
    public MyBean myBean(){
        return new MyBean();
    }
}
