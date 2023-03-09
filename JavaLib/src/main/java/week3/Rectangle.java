package week3;

public class Rectangle extends GeometricObject {
    private static int numberOfObjects = 0;
    Rectangle() { numberOfObjects +=1;}

    public static int getNumberOfObjects() {return numberOfObjects;}

    // Method Overloading: same method, different parameters

    public String overlaps (Rectangle r){
        return "Overlaps with Rectangle object";
    }

    public String overlaps (Circle r){
        return "Overlaps with Circle object";
    }
}
