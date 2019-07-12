package com.yu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/7/12.
 */
@Component
public class MyBean {

    //@Autowired
    private AnotherBean anotherBean;

    @Autowired
    //@Qualifier("stringList")
    private List<String> stringList;

    @Autowired
    private List<Integer> integerList;

    @Autowired
    private Map<String,Integer> stringIntegerMap;

    @Autowired
    private ApplicationContext applicationContext;

    public List<String> getStringList() {
        return stringList;
    }

    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "anotherBean=" + anotherBean +
                ", stringList=" + stringList +
                ", integerList=" + integerList +
                ", stringIntegerMap=" + stringIntegerMap +
                ", applicationContext=" + applicationContext +
                ", string='" + string + '\'' +
                '}';
    }

    @Value("aaaaaaa")
    private String string;

    //构造器注入
    //@Autowired
    public MyBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }


    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    //Setter注入
    @Autowired
    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

}
