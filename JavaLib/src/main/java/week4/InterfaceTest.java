package week4;

import java.util.Arrays;

// Analogy: iPhone does not have an is-a iPad
// In this case we can use interfaces

public class InterfaceTest {
    public static void main(String[] args) {
        BoxA a = new BoxA();
        BoxB b = new BoxB();

        a.commandOnClick();
        b.commandOnClick();
        b.drag();

        setComponentColor(a);
        setComponentColor(b);

        System.out.println();
        System.out.println("Box A: " + a.getColor());
        System.out.println("Box B: " + b.getColor());

        int[] x = {5,3,4,-6,88,1};
        System.out.println(x);
        System.out.println(Arrays.toString(x) );
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

    }

    public static void setComponentColor(PageComponent p) {
        // you can treat an interface like a datatype!
        // PageComponent Box B is an instance of Draggable (implements Draggable)
        String col = "Grey";
        if (p instanceof Draggable) {
            col = "Blue";
        }
        p.setColor(col);
    }

}

interface abc{
    void abcde();
}

class PageComponent {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// BoxA implement Clickable. BoxA have to define commandOnClick()
// These objects inherit from PageComponent and Implement Clickable, Draggable.
// you EXTEND from an ABSTRACT CLASS
// you IMPLEMENT an INTERFACE
class BoxA extends PageComponent implements Clickable {
    @Override
    // by default, all of these methods are abstract public
    public void commandOnClick() {
        System.out.println("BoxA is clicked");
    }
}

class BoxB extends PageComponent implements Clickable, Draggable {
    @Override
    public void commandOnClick() {
        System.out.println("BoxB is clicked. Go to page X");
    }

    @Override
    public void drag() {
        System.out.println("BoxB is dragged");
    }
}

// Interfaces containing abstract methods
interface Clickable {
    int k = 0;
    void commandOnClick(); // implicitly, it is public abstract void commandOnClick()
}

interface Draggable {
    void drag();
}