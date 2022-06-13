package com.yousuf;

public class modelDuck extends Duck{
    public modelDuck(){
        flyingBehavior= new FlyNoWay();
        quackingBehavior=new Quack();
    }
    @Override
    public void display() {
        System.out.println("i am a model duck");
    }
}
