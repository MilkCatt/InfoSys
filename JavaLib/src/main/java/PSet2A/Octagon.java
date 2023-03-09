package PSet2A;

import java.util.Comparator;

public class Octagon implements Comparable<Octagon>{
    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public int compareTo(Octagon o){
        if (this.getSide() > o.getSide()) return 1;
        else if (this.getSide() < o.getSide()) return -1;
        else return 0;
    }
}

class OctagonComparator implements Comparator<Octagon> {
    public int compare (Octagon o1, Octagon o2){
        if (o1.getSide() > o2.getSide()) return 1;
        else if (o1.getSide() < o2.getSide()) return -1;
        else return 0;
    }
}
