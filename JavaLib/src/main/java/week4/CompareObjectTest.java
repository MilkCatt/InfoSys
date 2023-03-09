package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// Java provides the in-built Comparable interface

public class CompareObjectTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        c1.setRadius(10.0);
        c2.setRadius(5.0);
        c3.setRadius(30.0);

        Circle[] cArr = { c1, c2, c3 };

        System.out.println( "Unsorted: " + Arrays.toString(cArr));
        Arrays.sort(cArr);  // sort the Circle array. Single arg for comparable
        System.out.println( "Sorted: " + Arrays.toString(cArr));

        Rectangle r1 = new Rectangle();
        r1.setHeight(0.5);
        r1.setWidth(3.0);
        GeometricObject[] gArr = { c1,c2,c3,r1 };
        // Convert array to arraylist
        ArrayList<GeometricObject> gArrList = new ArrayList<>( Arrays.asList(gArr) );

        System.out.println();
        System.out.println("Unsorted: " + gArrList);
        Collections.sort(gArrList, new GeometricObjectComparator() );  // sort the geometric array
        // This is using the Comparator object!
        System.out.println("Sorted: " + gArrList);
    }

}


// COMPARATOR INTERFACE - for alternative ordering
// you need to create a new class to implement this interface
// In this case, we create it such that we can compare different Geometric Objects
// This is for comparing objects of different classes
class GeometricObjectComparator implements Comparator<GeometricObject> {
    @Override
    public int compare(GeometricObject g1, GeometricObject g2) {
        if (g1.getArea() > g2.getArea()) return 1;
        else if (g1.getArea() < g2.getArea()) return -1;
        else return 0;
    }
}

abstract class GeometricObject {
    abstract public double getArea();
}

// COMPARABLE INTERFACE
class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius = 0.0; // encapsulation

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    // This is us Overriding the compareTo method from the Comparable Interface!
    @Override
    public int compareTo(Circle c) {        // compareTo(Datatype varname)
        if (this.getArea() > c.getArea()) return 1;
        else if (this.getArea() < c.getArea()) return -1;
        else return 0;
    }

    @Override // implementation of getArea() for Circle
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override // implementation of toString() for Circle so we can see the area
    public String toString() { // Override Geometric Object toString() method
        return "Circle with area: " + getArea();
    }
}

class Rectangle extends GeometricObject {
    private double width = 0.0;  // encapsulation
    private double height = 0.0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public String toString() { // Override Geometric Object toString() method
        return "Rectangle with area: " + getArea();
    }
}