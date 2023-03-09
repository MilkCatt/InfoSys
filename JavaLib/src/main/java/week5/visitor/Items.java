package week5.visitor;

public class Items {
}
class Book implements Visitable{
    private double weight;
    public Book(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
class Cookware implements Visitable{
    private double volume;
    public Cookware(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
class Clothing implements Visitable{
    private int size;
    public Clothing(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
class Supplement implements Visitable{
    private double volume;
    public Supplement(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
