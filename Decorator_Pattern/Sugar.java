package Decorator_Pattern;

public class Sugar extends Condiment_Decorator {
    Beverage beverage;
    public Sugar(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",sugar";
    }
}
