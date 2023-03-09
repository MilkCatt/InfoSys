package week5.factory;

// a factory helps us to instantiate object using a different class
public class ShapeFactory extends AbstractFactory{
    @Override
    Product getProduct(String s) {
        // compareToIgnoreCase returns an int which is the number of diff characters in a string
        if (s.compareToIgnoreCase("Circle")==0) return new Circle();
        else if (s.compareToIgnoreCase("Rectangle")==0) return new Rectangle();
        else if (s.compareToIgnoreCase("Triangle")==0) return new Triangle();
        return null;
    }
}