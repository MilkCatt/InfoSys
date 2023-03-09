package week3;

public class GeometricObject {
    private String color = "White";
    private static int numberOfObjects = 0;
    // Private methods and attributes are hidden from the subclass. They cannot be overridden.

    GeometricObject() {
        System.out.println("\nGeometric Obj no arg constructor");
    }

    GeometricObject(String color){
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
