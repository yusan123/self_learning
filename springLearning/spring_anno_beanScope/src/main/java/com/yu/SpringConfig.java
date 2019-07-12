package com.yu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Administrator on 2019/7/12.
 */
@Configuration
@ComponentScan("com.yu")
public class SpringConfig {

    //@Bean
    public TestBean testBean(){
        return new TestBean();
    }
}
