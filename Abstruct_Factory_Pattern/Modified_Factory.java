package Abstruct_Factory_Pattern;

public class Modified_Factory implements Abstract_Factory{
    @Override
    public Product getProduct(String type_of_product) {
        if(type_of_product.equalsIgnoreCase("M_A"))
            return new Modified_Product_A();
        else if(type_of_product.equalsIgnoreCase("M_B"))
            return new Modified_product_B();
        return null;
    }
}
