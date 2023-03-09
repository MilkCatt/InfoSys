package PSet1A;

class Triangle {
    //ATTRIBUTES
    double side1;
    double side2;
    double side3;

    //CONSTRUCTORS
    Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    //METHODS
    double getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() { //Implemented using Heron's formula
        double sp = (side1 + side2 + side3) / 2;
        return Math.sqrt(sp * (sp - side1) * (sp - side2) * (sp - side3));
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public static void main(String[] args) {
        Triangle myTri = new Triangle();
        //myTri.setColor("red");
        //myTri.setFilled(true);
        System.out.println(myTri);
        //System.out.println(myTri.isFilled());

        Triangle myTri2 = new Triangle(2.0, 4.0, 5.5);
        System.out.println(myTri2);
        System.out.println("area : " + myTri2.getArea() + " perimeter: " + myTri2.getPerimeter());

    }
}
