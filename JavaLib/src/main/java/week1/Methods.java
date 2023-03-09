package week1;

public class Methods {

    // static --> class method. If not, then you must create a method object
    // access_keyword static_keyword function_name(parameter)

    public static void main (String [] args){
        // This main method has to take in an array of strings which is a bunch of user arguments to pass into the program
        System.out.println("\n===print from main method===");
        printMsg();
        printMsg2(2);
        int msg1 = method1(3);
        System.out.println("retrieved value " + msg1 + " from method1");
        // calling the method established later

        // Method m = new Method;

    }
    static int method1(int a){
        // for this method, we want to return an int, so we use int instead of void
        int y = 2 * a;
        return y;
    }
    public static void printMsg2(int a) {
        // This method takes in an integer, which is specified as in input argument in the parenthesis
        System.out.println("message: " + a);
    }
    public static void printMsg(){
        // The parenthesis here are empty as this method does not take in any arguments
        System.out.println("static message");
    }
}
