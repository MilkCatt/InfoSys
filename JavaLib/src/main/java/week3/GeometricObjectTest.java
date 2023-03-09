package week3;

import java.util.ArrayList;

public class GeometricObjectTest {
    public static void main(String[] args){
        Circle c1 = new Circle();
        // Note: the Geometric object constructor is called first, then the circle no arg constructor
            // This means we actually run super() first
        System.out.println("\n\n\n");

        // In this example, we are explicitly calling the super() class.
        Circle c2 = new Circle(6,"Red");
        System.out.println("\n\n\n");

        // for all further embedded subclasses, all the super() classes of it are invoked!
        // EVERY SINGLE CLASS in java inherits from java.lang (ancestor of all java classes)

        Rectangle r = new Rectangle();
        GeometricObject g = new GeometricObject();
        // The default no arg constructor
        // We are able to use the attributes as set in GeometricObject
        // Subclasses inherits all accessible data fields and methods apart from constructor
        System.out.println(c1.getColor());
        System.out.println(r.getColor());
        // Printing the objects (by default prints memory address)
        System.out.println(c1.toString());  // .toString is invoked!
        System.out.println(r);
        System.out.println(g);
        // Testing method overloading -> static polymorphism
        System.out.println(r.overlaps(r));
        System.out.println(r.overlaps(c1));
        // Testing overridden methods -> dynamic polymorphism
        ArrayList<GeometricObject> arr = new ArrayList<>();

        arr.add(c1);
        arr.add(r);
        arr.add(g);

        System.out.println("\n");
        for (GeometricObject tmp:arr)  {
            System.out.println(tmp.toString());
        }
        // note that rectangle does not have a .toString() method
    }
}
