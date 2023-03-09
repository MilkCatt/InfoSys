package PSet1A;

import java.util.ArrayList;

public class Fibonacci {
    public static String fibonacci(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        if (n == 1) {
            arr.add(0);
        }
        else {
            arr.add(0);
            arr.add(1);
            for (int i=2; i<n; i++){
                arr.add(arr.get(i-2) + arr.get((i-1)));
            }
        }
        String s = arr.toString();
        int len = s.length();
        return s.substring(1,len-1).replace(" ", "");
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}

