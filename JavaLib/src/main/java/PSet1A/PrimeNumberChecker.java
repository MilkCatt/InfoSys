package PSet1A;

public class PrimeNumberChecker {
    public static int isPrime(int num){
        int half = Math.floorDiv(num,2);
        if (num == 3){
            return 1;
        }
        for (int i=2;i<=half;i++){
            if (num%i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(7));
        System.out.println(isPrime(14));
        System.out.println(isPrime(23));
        System.out.println(isPrime(99));
    }
}
