package Factory_pattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape s1=shapeFactory.getShape("Rectangle");
        s1.draw();
        Shape s2=shapeFactory.getShape("square");
        s2.draw();
    }
}
