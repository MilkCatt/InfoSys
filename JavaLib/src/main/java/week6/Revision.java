package week6;

import java.math.BigDecimal;

public class Revision {
    public static void main(String[] args) {
        // Equals vs ==
        BigDecimal b1 = new BigDecimal("1.23");
        BigDecimal b2 = new BigDecimal("1.23");
        BigDecimal b3 = b1;
        System.out.println("b1 == b2: " + Boolean.toString(b1==b2));
        System.out.println("b1.equals(b2): " + Boolean.toString(b1.equals(b2)));
        System.out.println("b1 == b3: " + Boolean.toString(b1==b3));

        String s1 = "pikachu";
        String s2 = "pikachu";
        String s3 = new String("pikachu");
        System.out.println("s1 == s2: " + Boolean.toString(s1==s2));
        System.out.println("s1.equals(s3): " + Boolean.toString(s1.equals(s3)));
        System.out.println("s1 == s2: " + Boolean.toString(s1==s3));

        //
    }
}
