package com.yu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/12.
 */
@Component
@Scope("singleton")
public  class TestBean {

    @Autowired
    private AnotherBean anotherBean;

    //protected abstract AnotherBean anotherBean();

    public void printAnotherBean(){
        System.out.println(anotherBean);
    }
    @Override
    public String toString() {
        return "TestBean{" +
                "anotherBean=" + anotherBean +
                '}';
    }
}
