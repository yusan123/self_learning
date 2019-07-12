package com.yu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/12.
 */
@Component
@Scope("singleton")
public abstract class TestBean2 {


    @Lookup
    protected abstract AnotherBean anotherBean();

    public void printAnotherBean(){
        System.out.println(anotherBean());
    }

}
