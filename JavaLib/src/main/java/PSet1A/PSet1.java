package PSet1A;

import java.util.ArrayList;
import java.util.Arrays;

public class PSet1 {
    public static boolean isAllCharacterUnique(String sIn) {
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < sIn.length(); i++) {
            String c = String.valueOf(sIn.charAt(i));
            if (arr.contains(c)){
                return false;
            }
            arr.add(c);
        }
        return true;
    }

    public static boolean isPermutation(String sIn1, String sIn2) {
        char[] c1 = sIn1.toCharArray();
        char[] c2 = sIn2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    public static void main (String[] args) {

        System.out.println(isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        System.out.println(isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));
        System.out.println(isPermutation("@ab", "a@b"));
        System.out.println(isPermutation("abcd", "bcdA"));

    }
}
