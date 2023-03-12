package PSet2A;

import java.util.ArrayList;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed



    Permutation(final String str){
        in = str;
        // additional initialization if needed

    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively
        permute_recursive(in.toCharArray(), 0, in.length(), a);
    }

    public void permute_recursive(char[] s, int start, int end, ArrayList<String> a) {
        if(start==end) {
            a.add(new String(s));
        }
        else {
            for(int i=start; i < end; i++) {
                char temp = s[start];
                s[start] = s[i];
                s[i] = temp;
                permute_recursive(s, start+1, end, a);
                char temp2 = s[i];
                s[i] = s[start];
                s[start] = temp2;
            }
        }
    }

    public ArrayList<String> getA(){
        return a;
    }
}

