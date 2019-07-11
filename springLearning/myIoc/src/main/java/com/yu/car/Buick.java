package com.yu.car;

/**
 * Created by Administrator on 2019/7/11.
 */
public class Buick implements Car {
    public void start() {
        System.out.println("Buick start");
    }

    public void turnLeft() {
        System.out.println("Buick turn left");
    }

    public void turnRight() {
        System.out.println("Buick turn right");
    }

    public void stop() {
        System.out.println("Buick stop");
    }
}
