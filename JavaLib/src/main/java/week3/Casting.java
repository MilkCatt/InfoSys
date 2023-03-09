package week3;

public class Casting {
    public static void main(String[] args){
        // declared type is GeometricObject
        // actual type is Circle
        // This is upcasting (subclass to superclass). Implicit
        GeometricObject g = new Circle();

        // Down casting (superclass to subclass). Must be explicit
        Circle c = (Circle) g;
        System.out.println("\n\n");
        System.out.println( c == g);
        System.out.println(c.getRadius());
        System.out.println(((Circle) g).getRadius());   // downcast g to circle

        // instanceof
        System.out.println(c instanceof Circle);
        System.out.println(c instanceof GeometricObject);
        GeometricObject g2 = new GeometricObject();
        System.out.println(g2 instanceof Circle);
        System.out.println(g2 instanceof GeometricObject);
    }
}
