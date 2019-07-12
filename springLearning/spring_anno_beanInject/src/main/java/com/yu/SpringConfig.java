package com.yu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/7/12.
 */
@Configuration
@ComponentScan("com.yu")
public class SpringConfig {

    @Bean
    public List<String> stringList(){
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("aaaa");
        stringArrayList.add("bbbb");
        return stringArrayList;
    }
    @Bean
    @Order(11)
    public String string1(){
        return "cc";
    }
    @Bean
    @Order(3)
    public String string2(){
        return "dd";
    }



    @Bean
    public Map<String,Integer> integerMap(){
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("a",1);
        stringIntegerHashMap.put("b",2);
        return stringIntegerHashMap;
    }

    //方法名作为key，返回值作为value 作为value是Integer的map返回
    @Bean("int1")
    public Integer integer1(){
        return 3;
    }
    @Bean("int2")
    public Integer integer2(){
        return 4;
    }

}
