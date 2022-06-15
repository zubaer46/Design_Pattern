package Decorator_Pattern;

public class CoffeeShop
{
    public static void main(String[] args) {
        Beverage beverage=new Mocha(new Espresso());
        System.out.println(beverage.getDescription() +" $ "+beverage.cost());

        Beverage beverage1=new HouseBlend();
        beverage1=new Mocha(new Sugar(beverage1));
        System.out.println(beverage1.getDescription() +" $ "+beverage1.cost());


    }
}
