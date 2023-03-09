// PACKAGE
    // package keyword: which package this variable belongs to. Package.SubPackage.

package week1;

// CLASS
    // public: access modifier. Allows other classes from anywhere to access Variable
    // class [Keyword]: define a class in java

import java.math.BigDecimal;
import java.util.Arrays;

public class Variables {

    // METHOD
        // public: used again to make the method public
        // static: indicate class attributes/methods (as opposed to instance attribute)
            // recall: class attribute is the same across all objects within the class, hence static
        // void: means that the method returns none
        // main(): name of the method
        // String: datatype
        // args: variable name

    public static void main(String[] args) {

        // VARIABLES
            // semicolon;  to terminate a statement
                // NOTE: free space DOES NOT MATTER in Java
            // There are only 8 primitive datatypes in Java
                // boolean, byte, char, short, int, long, float, double

        System.out.println("===Intro===");
        int a;  // declaring variable
        a = 1;  // assigning value to variable
        int b = 2; // declaring and assigning in 1 statement

        // PRINTING

        System.out.println(a);
        System.out.println(a+b);    // math operation
        System.out.println(a+" "+b);    // concatenation with String
        System.out.println(a+' '+b);    // ASCII code adding (' ' has ASCII code 32)

        // BOOLEANS

        System.out.println("\n===Boolean===");
        boolean x = true;
        boolean y = false;
        System.out.println(x && y); // and operator
        System.out.println(x || y); // or operator

        // DOUBLE

        System.out.println("\n===Double===");
        double j = 0.2;
        double k = 0.3;
        double l = k-j;
        System.out.println(l == 0.1);  // you get 0.09 recursive!! Floating point error
        System.out.println(l);

        // BigDecimal: resolving floating point error

        System.out.println("\n===BigDecimal===");
        BigDecimal jj = new BigDecimal( "0.2"); // new is a request for memory!
        BigDecimal kk = new BigDecimal( "0.3");
        BigDecimal ll = kk.subtract(jj);    // math operations only for primitive datatypes!
        System.out.println(ll);
        System.out.println(ll.equals(new BigDecimal("0.1")));   // once again, not primitive

        // ARRAYS

            // c references a collection of data (array)
        System.out.println("\n===Arrays===");
        int[] c;    // <datatype of each element> [] <array name>
        c = new int[3]; // allocating memory for 3 integers. new = request for memory
        c[0]=5;    // assigning values into array - similar to python
        c[1]=6;
        c[2]=7;
        System.out.println("0th value:" + c[0]);
        System.out.println("1st value:" + c[1]);
        System.out.println("2nd value:" + c[2]);

        int[] d = {5,6,7};  //instantiating and assigning in 1 line

        // c and d are only memory locations!
        System.out.println(c);  // memory location
        System.out.println(d);  // memory location
        System.out.println(c == d); // False
        System.out.println(Arrays.equals(c,d));

        // STRINGS

        System.out.println("\n===Strings===");
        String s = "Hello World"; // behaves the same as a python string
        System.out.println(s);
        System.out.println( s.charAt(0));   // string indexing
        System.out.println(s.substring(6,s.length()));  // string slicing

        System.out.println(s.indexOf("Wor"));
        System.out.println(s.indexOf("X")); // return -1 if not found

        int sl = s.length();    // obtaining the length of the string
        System.out.println(sl);

        char z = 'z';   // Single quotation mark, single character
        char[] carr = {'a','b','c'}; // char array
        String f = new String(carr);    // converting a char array into a string
        System.out.println(f);

    }
}
