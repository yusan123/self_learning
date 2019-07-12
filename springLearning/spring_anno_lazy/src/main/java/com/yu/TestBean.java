package com.yu;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/13.
 *
 * 不加@lazy bean会在context初始化的同时完成初始化，而不是再被使用的时候初始化
 */
@Component
@Lazy
public class TestBean {
    public TestBean() {
        System.out.println("testBean init ok");
    }
}
