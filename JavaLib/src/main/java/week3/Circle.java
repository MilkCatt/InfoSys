package week3;

public class Circle extends GeometricObject{    // extends from GeometricObject. this is Inheritance
    private double radius = 0.0;
    private static int numberOfObjects = 0; // This is a new static attribute that does not inherit from parent class.
    // Private methods and attributes are hidden from the subclass


    Circle() {  // constructor, must have the same name as the class. No return type
        super(); // This is performed regardless of whether or not we specify this.
        System.out.println("\nCircle No arg constructor");
        radius = 1.0;
    }

    Circle(double newRadius, String color){   // constructor with argument
        super(color);   // in this case, we must explicitly invoke the super() constructor!
        System.out.println("\nCircle Constructor with argument");
        radius = newRadius;
    }

    Circle(double newRadius){   // constructor with argument
        System.out.println("\nCircle Constructor with argument");
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Note: you cannot override a private method/attribute
    @Override   // This is a decorator to ensure that we did override something from parent class. Optional.
    public String toString(){
        return "This is a circle with radius " + radius;
    }
}
