package week3.modifier2;

import week3.modifier1.SortingAlgorithm;

public class BetterSortingAlgo extends SortingAlgorithm {
    public static void main(String[] Args){
        BetterSortingAlgo x = new BetterSortingAlgo();
        System.out.println(x.sort());   // can access sort, public method which calls default method
        System.out.println(x.protmethod()); // can also access protected method
    }
    // We can override protected methods in another package.
    // REFER TO SLIDES FOR A TABLE ON KEYWORDS
    // protected basically allows all subclass instances to access the method
    // Note we are also unable to override the modifier from public --> private when overriding
    @Override
    protected String protmethod() {
        return "Merge Sort";
    }
}
