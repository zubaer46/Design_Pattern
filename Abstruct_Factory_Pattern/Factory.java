package Abstruct_Factory_Pattern;

public class Factory implements Abstract_Factory{
    @Override
    public Product getProduct(String type_of_product) {
        if(type_of_product.equalsIgnoreCase("A"))
            return new Product_A();
        else if(type_of_product.equalsIgnoreCase("B"))
            return new Product_B();
        return null;
    }
}
