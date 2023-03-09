package week5.visitor;

import java.util.ArrayList;
public class VisitorExample {
    public static void main(String[] args) {
        Book b = new Book(2);
        Cookware cw = new Cookware(20);
        Clothing c = new Clothing(2);

        // Notice how we are no longer required to use object and downcast
        // Essentially, you can separate out logic from the items themselves.
        // The items only need to implement Visitable
        // The logic is held by the Concrete Visitor class (Postage in this case)
        ArrayList<Visitable> arr = new ArrayList<>();
        arr.add(b);
        arr.add(cw);
        arr.add(c);
        Postage p = new Postage();
        IntlPostage ip = new IntlPostage();

        // Visit every item
        for (Visitable v: arr) {
            v.accept(p);
            // Note, we cannot do p.visit(v) as there is no visitable object
            v.accept(ip);
        }
        System.out.println(p.getTotal());
        System.out.println(ip.getTotal());
    }
}
