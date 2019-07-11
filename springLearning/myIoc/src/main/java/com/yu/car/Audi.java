package com.yu.car;

/**
 * Created by Administrator on 2019/7/11.
 */
public class Audi implements Car {
    public void start() {
        System.out.println("Audi start");
    }

    public void turnLeft() {
        System.out.println("Audi turn left");
    }

    public void turnRight() {
        System.out.println("Audi turn right");
    }

    public void stop() {
        System.out.println("Audi stop");
    }
}
