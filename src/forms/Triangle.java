package forms;

/**
 * @author Ronja Brandt on 2018-09-04
 */
public class Triangle {
    private double height;
    private double base;
    private double hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getHeight() {
        return height;
    }

    public double area(){
        double area = (base*height)/2;
        return area;
    }

    public double perimeter(){
        double perimeter = base + height + hypotenuse ;
        return perimeter;
    }

}
