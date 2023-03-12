package PSet2A;

public class Palindrome {
    public static boolean isPalindrome (char[] S) {
    int p1 = 0;
    int p2 = S.length -1;
    return isPalindrome_recursive(p1,p2,S);
    }
    public static boolean isPalindrome_recursive(int p1,int p2, char[] S){
        if (p1<p2){
            if (S[p1] == S[p2]) {
                return isPalindrome_recursive(p1+1,p2-1,S);
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }
}
