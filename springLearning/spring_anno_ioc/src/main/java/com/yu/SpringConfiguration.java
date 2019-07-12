package com.yu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/7/12.
 */
@Configuration
@ComponentScan("com.yu")
@ComponentScans({@ComponentScan()})
public class SpringConfiguration {

    @Bean({"b33","b22"})
    public Bean1 bean2(){
        return new Bean1();
    }
}
