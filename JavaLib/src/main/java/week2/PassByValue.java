package week2;

import java.util.LinkedList;
import java.util.List;

public class PassByValue {
    public static void main(String[] args){
        LinkedList<Integer> arr = new LinkedList<>();
        addOne(arr);    // pass the identity
        addOne(arr);
        System.out.println(arr);

        int x = 10;
        addOneAlso(x);  // pass the value
        System.out.println(x);
    }

    public static void addOne(List<Integer> list) {
        list.add(1);
    }

    public static void addOneAlso(int n) {
        n += 1;
    }
}
