package Factory_pattern;

public class ShapeFactory {
    public Shape getShape(String shapeType)
    {
        if(shapeType==null)
            return null;
        if(shapeType.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("square"))
        {
            return new Square();
        }


        return null;
    }
}
