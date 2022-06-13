package com.yousuf;

public class MuteQuack implements QuackingBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}