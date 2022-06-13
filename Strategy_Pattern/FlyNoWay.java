package com.yousuf;

public class FlyNoWay implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
