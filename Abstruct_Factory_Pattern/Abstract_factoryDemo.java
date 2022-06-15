package Abstruct_Factory_Pattern;

public class Abstract_factoryDemo {
    public static void main(String[] args) {
     Abstract_Factory F=Get_Factory.getFactory(false);
     Product p1=F.getProduct("A");
     p1.produce();
        Product p2=F.getProduct("B");
        p2.produce();
        Abstract_Factory FM=Get_Factory.getFactory(true);
        Product p3=FM.getProduct("M_A");
        p3.produce();
        Product p4=FM.getProduct("M_B");
        p4.produce();
    }
}
