package week1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(1);

        forLoop(arr);
        forEach(arr);
        whileLoop(arr);
    }

    public static void forLoop(List<Integer> list) {
        System.out.println("\nFor Loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void forEach(List<Integer> list) {
        System.out.println("\nFor Each");
        for (Integer item: list) {
            System.out.println(item);
        }
    }

    public static void  whileLoop(List<Integer> list){
        System.out.println("\n while loop");
        Iterator<Integer> iter = list.iterator();   // iterator
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
