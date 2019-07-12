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
@Lazy //该配置类扫描所有bean都为懒加载
public class SpringConfig {

    @Bean
    //@Lazy
    public TestBean testBean2(){
        return new TestBean();
    }

}
