package Adapter_Pattern;

public class Toy_Adapter implements Bird{
    ToyDuck toyDuck;
    Toy_Adapter(ToyDuck toyDuck){
        this.toyDuck=toyDuck;
    }
    @Override
    public void fly() {
        toyDuck.flyWithRocket();
    }

    @Override
    public void makeSound() {

    }
}
