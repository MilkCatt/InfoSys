package week1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String c = "Hello";
        System.out.println(c);
        //int c = 4;
        System.out.println(c);
        double x = divide(14,7);
        System.out.println(x);
    }
    public static double divide(int a, int b){
        return a/b;
    }
    public static Double sumList(ArrayList<Double> doubleArrayList){
        double sum = 0;
        for (Double item:doubleArrayList){
            sum += item;
        }
        return sum;
    }
}
