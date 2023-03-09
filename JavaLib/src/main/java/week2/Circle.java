package week2;

public class Circle {
    // these are basically attributes. They are known as Datafields
    private double radius = 1.0;    // data field called radius is created for the object
    static int numberOfCircles = 0; // this is a class attribute, not an object attribute

    Circle() {  // constructor, must have the same name as the class. No return type
        System.out.println("\nNo arg constructor is invoked");
        radius = 1.0;
        numberOfCircles +=1;

    }

    Circle(double newRadius){   // constructor with argument
        System.out.println("\n Constructor with argument");
        radius = newRadius;
        numberOfCircles +=1;
    }

    double getArea() {  // note that we DO NOT place static as this is an OBJECT variable
        return Math.PI * Math.pow(radius,2);
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double newRadius ){
        if(newRadius >=0 ){
            radius = newRadius;
        }
        else {
            System.out.println("Radius cannot be negative");
            radius = 1;
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        // note about circle objects:

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(Circle.numberOfCircles);

        // c1 here does not store a circle object. It stores a reference to a circle object.
        // if we do c1 = c2, they will point to the same object.
    }
}

// VISIBILITY:
    // public: visible to any class in any package
    // default: visible to any class in the same package
    // private: visible only to the declaring class