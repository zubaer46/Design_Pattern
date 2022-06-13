package com.yousuf;

public class Quack implements QuackingBehavior{
    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
