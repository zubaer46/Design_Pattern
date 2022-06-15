package Abstruct_Factory_Pattern;

public class Modified_Product_A implements Product{
    @Override
    public void produce() {
        System.out.println("This is Product (A) which is modified...");
    }
}
