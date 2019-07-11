package com.yu;

/**
 * Created by Administrator on 2019/7/11.
 */
public abstract class Bean1_1 {

    /**
     * 自己本身是单例Bean1_1
     * 但是希望每次获取的Bean2是多例
     *
     * 1、定义成员抽象方法创建Bean2，并将Bean2在spring中定义为多例
     * 2、在其他方法中通过抽象方法创建的Bean2就是多例的
     *
     */

    protected abstract Bean2 createBean2();


    public void printBean2(){
        System.out.println(createBean2());
    }
}
