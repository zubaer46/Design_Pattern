package Adapter_Pattern;

public class Bird_Adapter implements ToyDuck{

    Bird bird;
    public Bird_Adapter(Bird bird){
        this.bird=bird;
    }
    @Override
    public void squeak() {
        bird.makeSound();
    }

    @Override
    public void flyWithRocket() {

    }
}
