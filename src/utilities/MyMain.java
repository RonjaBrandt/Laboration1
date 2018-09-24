package utilities;

import forms.Cirkel;
import forms.Rectangle;
import forms.Triangle;

import java.util.Scanner;

/**
 * @author Ronja Brandt on 2018-09-04
 */
public class MyMain {

    public static void main(String[] args) {
        boolean restartProgram = true;
        Scanner sc = new Scanner(System.in);
        while (restartProgram ==true) {
            System.out.print("Vilken form vill du beräkna? (C)irkel, (T)riangel eller (R)ektangel: ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("C")){
                System.out.print("Skriv in Cirkelns radie : ");
                double radie = sc.nextDouble();
                sc.nextLine();
                Cirkel c = new Cirkel(radie);
                System.out.printf("Cirkelns area med radien " + c.getRadie() + " är " + c.area() + " och omkretsen är "
                        + c.perimeter());
            } else if (choice.equalsIgnoreCase("T")){
                System.out.printf("Skriv in Triangelns höjd: ");
                double height = sc.nextDouble();
                sc.nextLine();
                System.out.printf("Skriv in Triangelns bas: ");
                double base = sc.nextDouble();
                sc.nextLine();
                Triangle t = new Triangle(height,base);
                System.out.printf("Triangelns area med höjden " + t.getHeight() +" och basen "+ t.getBase() +" är "
                        + t.area() + " och omkretsen är " + t.perimeter());
            } else if (choice.equalsIgnoreCase("R")){
                System.out.printf("Skriv in Rektangelns längd: ");
                double length = sc.nextDouble();
                sc.nextLine();
                System.out.printf("Skriv in Rektangelns bredd: ");
                double width = sc.nextDouble();
                sc.nextLine();
                Rectangle r = new Rectangle(length,width);
                System.out.printf("Rektangels area med längden " + r.getLength() +" och bredden "+ r.getWidth()+ " är "
                        + r.area() + " och omkretsen är " + r.perimeter());
            }
            System.out.println(" ");
            System.out.printf("Vill du göra en ny beräkning? (y/n): ");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("y")){
                System.out.println(" ");
            } else if(answer.equalsIgnoreCase("n")){
                System.out.println("Programmet avslutas.");
                restartProgram=false;}

        }
    }
}
