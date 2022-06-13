package com.yousuf;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackingBehavior=new Quack();
        flyingBehavior=new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck..");
    }
}
