package week5.visitor;

public class IntlPostage implements Visitor{
    // total attribute
    private double total = 0;
    @Override
    public void visit(Book b) {
        total += b.getWeight() * 15;
    }
    @Override
    public void visit(Cookware cw) {
        total += cw.getVolume() * 1.8;
    }
    @Override
    public void visit(Clothing c) {
        total += c.getSize() * 1.5;
    }
    @Override
    public void visit(Supplement s) {
        total += s.getVolume() * 0.7;
    }
    public double getTotal() {
        return total;
    }
}
