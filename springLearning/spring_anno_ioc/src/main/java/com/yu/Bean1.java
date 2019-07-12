package com.yu;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/12.
 */
@Component("b1")
public class Bean1 {
    public Bean1() {
        System.out.println("Bean1被创建了一个实例");
    }
}
