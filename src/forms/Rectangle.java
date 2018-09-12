package forms;

/**
 * @author Ronja Brandt on 2018-09-04
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        double area = width * length;
        return area;
    }

    public double perimeter() {
        double perimeter = (width*2) + (length*2);
        return perimeter;
    }
}
