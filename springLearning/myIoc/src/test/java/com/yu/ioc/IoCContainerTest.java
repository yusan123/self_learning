package com.yu.ioc;

import com.yu.car.Audi;
import com.yu.car.Buick;
import com.yu.human.Human;
import com.yu.human.LiSi;
import com.yu.human.ZhangSan;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2019/7/11.
 */
public class IoCContainerTest {

    private IoCContainer ioCContainer = new IoCContainer();

    @Before
    public void init(){
        ioCContainer.createBean(Audi.class,"audi");
        ioCContainer.createBean(Buick.class,"buick");
        ioCContainer.createBean(ZhangSan.class,"zhangSan","audi");
        ioCContainer.createBean(LiSi.class,"liSi","buick");
    }

    @Test
    public void t1(){
        Human zhangSan = (Human) ioCContainer.getBean("zhangSan");
        Human liSi = (Human) ioCContainer.getBean("liSi");
        zhangSan.goHome();
        liSi.goHome();
    }
}