package week4;


public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println( myCompute(4,2));
        System.out.println( myCompute(4,0));
    }

    public static int myCompute(int i, int j){
        try{
            int y = i/j;
            int[] x = new int[3];
            System.out.println(x[4]);
            return y;
        }
        catch (ArithmeticException ex){
            System.out.println("you divided by 0");
            return 0;
        }
        catch (Exception ex){
            System.out.println("you got" + ex);
            return 0;
        }
        // Finally executes if the error is caught OR if there is no errorRD
        // It is executed before the other lines
        finally {
            System.out.println("Clean Up");
        }
    }
}
