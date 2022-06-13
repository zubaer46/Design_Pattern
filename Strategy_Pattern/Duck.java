package com.yousuf;

public abstract class Duck {
    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;
    //public Duck(){}
    public abstract void display();
    public void performFly(){
        flyingBehavior.fly();
    }
    public void performQuack(){
        quackingBehavior.quack();
    }
    public void swim(){
        System.out.println("All duck can swim");
    }

    public void setFlyingBehavior(FlyingBehavior fb) {
        this.flyingBehavior = fb;
    }

    public void setQuackingBehavior(QuackingBehavior qb) {
        this.quackingBehavior = qb;
    }
}
