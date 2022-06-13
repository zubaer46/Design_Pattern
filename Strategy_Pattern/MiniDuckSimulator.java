package com.yousuf;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard =new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model=new modelDuck();
        model.performFly();
        model.setFlyingBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
        mallard.display();
    }
}
