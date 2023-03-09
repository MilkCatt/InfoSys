package week3.modifier1;

public class SortingAlgorithm {
    public String sort(){
        String result = sortAlgorithm();
        return result;
    }
    String sortAlgorithm(){ // default modifier
        return "Bubble Sort";
    }
    protected String protmethod(){
        return "Protected Method";
    }
}
