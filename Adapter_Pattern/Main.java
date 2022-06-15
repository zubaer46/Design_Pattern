package Adapter_Pattern;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        ToyDuck toyDuck=new PlasticToyDuck();

        ToyDuck birdAdapter= new Bird_Adapter(sparrow);

        Bird R_Bird=new Toy_Adapter(toyDuck);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        System.out.println("BirdAdapter....");
        birdAdapter.squeak();

        System.out.println("R_Bird...");
        R_Bird.fly();

    }
}
