package com.yu.human;

import com.yu.car.Car;

/**
 * Created by Administrator on 2019/7/11.
 */
public abstract class HumanWithCar implements Human {
    //这里用protect最好,只让子类可以拿到


    protected Car car;

    public HumanWithCar(Car car) {
        this.car = car;
    }

    public abstract void goHome();
}
