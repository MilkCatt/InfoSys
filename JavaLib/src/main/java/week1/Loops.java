package week1;

public class Loops {
    public static void main(String[] args) {

        System.out.println("\n===if else statements===");

        // if/else/else if (boolean expression) {script;}

        int simon_weight = 55;
        String advice ="";
        if (simon_weight <= 75) {
            advice = "eat";}
        else if (simon_weight <= 100) {
            advice = "eat less";}
        else {
            advice = "stop eating";}
        System.out.println(advice);

        System.out.println("\n===for loop===");

        // for(int var = start; var <= end; var ++)
        // for(initial action; cont. condition; action after iteration)
        // Generally, for(variable assignment; boolean involving variable; change variable)

        for(int i=1; i<=4; i++){
            System.out.println("Count is: "+i);
        }

        // Difference between ++i and i++
        int a = 0;
        int b = 0;
        System.out.println(++a + " " + a);  // pre-increment
        System.out.println(b++ + " " + a);  // post-increment


    }
}
