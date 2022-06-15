package Adapter_Pattern;

class PlasticToyDuck implements ToyDuck
{
    public void squeak()
    {
        System.out.println("Squeak");
    }

    @Override
    public void flyWithRocket() {
        System.out.println("I am flying with Rocket");
    }
}
