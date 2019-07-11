package com.yu.human;

import com.yu.car.Car;

/**
 * Created by Administrator on 2019/7/11.
 */
public class ZhangSan extends HumanWithCar {
    public ZhangSan(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
