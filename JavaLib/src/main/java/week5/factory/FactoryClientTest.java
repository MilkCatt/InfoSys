package week5.factory;

public class FactoryClientTest {
    public static void main(String[] args) {
        // Create factory object
        ShapeFactory sf = new ShapeFactory();
        String inp = "Circle";
        // Create objects based on request
        Product p = sf.getProduct(inp);
        Product p1 = sf.getProduct("Rectangle");

        // Without factory implementation
//
//        Product p = null;
//        if (inp.compareToIgnoreCase("Circle")==0) {
//            p = new Circle();
//        }
//
//        else if (inp.compareToIgnoreCase("Rectangle")==0) {
//            p = new Rectangle();
//        }
//
//        else if (inp.compareToIgnoreCase("Triangle")==0) {
//            p = new Triangle();
//        }
//
        System.out.println( (Object) p);
        System.out.println( (Object) p1);

    }
}
