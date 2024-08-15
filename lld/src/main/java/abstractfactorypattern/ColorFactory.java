package abstractfactorypattern;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color.equalsIgnoreCase("Red"))
            return new Red();
        else if(color.equalsIgnoreCase("Green"))
            return new Green();
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
