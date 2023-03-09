package week3;

abstract public class AbstractGeometricObject {
    private String color = "White";
    private static int numberOfObjects = 0;
    // Private methods and attributes are hidden from the subclass. They cannot be overridden.

    abstract public double getArea();   // abstract method must be implemented by subclass
    // no {} / body defined

    AbstractGeometricObject() {
        System.out.println("\nGeometric Obj no arg constructor");
    }

    AbstractGeometricObject(String color){
        this.color = color;
        System.out.println("\nGeometric Obj WITH arg constructor");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // special method to string
    public String toString(){
        return "This is a geometric object";
    }
}
