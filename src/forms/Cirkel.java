package forms;

/**
 * @author Ronja Brandt on 2018-09-04
 */
public class Cirkel {

    private final double pi = 3.14;
    private double radie;

    public Cirkel(double radie){
        this.radie = radie;
    }

    public double getRadie() {
        return radie;
    }

    public void setRadie(double radie) {
        this.radie = radie;
    }

    public double area() {
        double area = radie * pi;
        return area;
    }

    public double perimeter() {
        double perimeter =  2*pi*radie;
        return perimeter;
    }
}
