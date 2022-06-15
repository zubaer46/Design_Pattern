package Abstruct_Factory_Pattern;

public class Modified_product_B implements Product{
    @Override
    public void produce() {
        System.out.println("This is Product (B) which is modified...");
    }
}

