package PSet1A;

public class MyRectangle2D {

    // ATTRIBUTES

    double x;
    double y;
    double width;
    double height;

    // SETTERS AND GETTERS

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // CONSTRUCTORS

    MyRectangle2D(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // METHODS

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2*width+2*height;
    }

    public boolean contains(double x, double y){
        double top = this.y+height/2 , bottom = this.y-height/2;
        double right = this.x+width/2 , left = this.x-width/2;
        if(bottom < y && y < top
        && left < x && x < right){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean contains(MyRectangle2D r){
        double top = y+height/2 , bottom = y-height/2;
        double right = x+width/2 , left = x-width/2;
        double r_top = r.y+r.height/2 , r_bottom = r.y-height/2;
        double r_right = r.x+r.width/2 , r_left = r.x-r.width/2;
        if(top-r_top > 0
                && r_bottom-bottom > 0
                && right - r_right > 0
                && r_left - left > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlaps(MyRectangle2D r){
        if(this.contains(r.x+0.5*r.width,r.y+0.5*r.height) ||
                this.contains(r.x-0.5*r.width,r.y-0.5*r.height) ||
                this.contains(r.x-0.5*r.width,r.y+0.5*r.height) ||
                this.contains(r.x+0.5*r.width,r.y-0.5*r.height)){
                return true;
            }
        return false;
    }

    public boolean overlaps2(MyRectangle2D r){
        if(this.contains(r.x+0.5*r.width,r.y+0.5*r.height)){
            if(this.contains(r.x-0.5*r.width,r.y-0.5*r.height) == false){
                return true;
            }
        }
        else if(this.contains(r.x-0.5*r.width,r.y+0.5*r.height)){
            if(this.contains(r.x+0.5*r.width,r.y-0.5*r.height) == false){
                return true;
            }
        }
        return false;
    }

    public boolean overlaps1(MyRectangle2D r){
        double top = y+height/2 , bottom = y-height/2;
        double right = x+width/2 , left = x-width/2;
        double r_top = r.y+r.height/2 , r_bottom = r.y-height/2;
        double r_right = r.x+r.width/2 , r_left = r.x-r.width/2;
        if(right <= r_left || left >= r_right){
            return false;
        }
        else if (top <= r_bottom || bottom >= r_top) {
            return false;
        }
        else if (this.getArea() == 0 || r.getArea() == 0){
            return false;
        }
        else if (this.contains(r)){
            return true;
        }
        else{
            return true;
        }
    }
}
