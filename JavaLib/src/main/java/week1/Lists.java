package week1;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args){
        // by default, Java Arrays have a fixed length and datatype
        // to counteract this, we can use ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        // When we instantiate an ArrayList, we cannot use primitive datatypes. We must instead use
            // Objects, or Wrappers (the object versions of primitive datatypes)

        // add/insert
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add(0,"Java");  // method overloading, same method can take multiple inputs
        System.out.println(arr);

        // access/get
        System.out.println( arr.get(0));

        // set
        arr.set(0, "Python");
        System.out.println(arr);

        // search
        System.out.println(arr.indexOf("A"));

        // remove
        arr.remove("Python");
        // arr.remove((String) "A");
        System.out.println(arr);
        arr.remove(2);  // but what if the items in the array are integers?
        System.out.println(arr);

    }

}
