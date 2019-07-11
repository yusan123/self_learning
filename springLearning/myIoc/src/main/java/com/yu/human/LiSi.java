package com.yu.human;

import com.yu.car.Car;

/**
 * Created by Administrator on 2019/7/11.
 */
public class LiSi extends HumanWithCar {
    public LiSi(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.turnLeft();
        car.stop();
    }
}
