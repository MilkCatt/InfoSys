package PSet1A;

import java.util.*;

public class IteratingExamples {

    public static int Act2Iterator(List<Integer> integers) {
        int sum = 0;

        Iterator<Integer> iter = integers.iterator();

        while (iter.hasNext()){
            sum += iter.next();
        }

        return sum;
    }

    public static int Act2ForEach(List<Integer> integers) {
        int sum = 0;

        for (Integer item: integers){
            sum += item;
        }

        return sum;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println( IteratingExamples.Act2Iterator(arr) );
        System.out.println( Act2ForEach(arr));

    }
}
