package week2;

public class ScopeOfVariable {
    private int x = 0; // x is accessible anywhere inside this class
    private static int y  = 1;

    public static void main(String[] args){
        int a = 3;
        shakeHands(a);
    }

    public static void shakeHands(int n){
        // n can only be recognised in this code block
        for (int i =0; i<n; i++){   // n can only be used inside this for block
            System.out.println("Shake");
        }
        System.out.println(n);
        // System.out.println(x);  // static method cannot acces object attribute
        System.out.println(y);
    }
}
