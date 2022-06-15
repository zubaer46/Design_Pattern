package Decorator_Pattern;

public class Mocha extends Condiment_Decorator{

    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }


    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription()+",Mocha";
    }
}
