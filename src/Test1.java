import javax.swing.*;
import java.util.*;
import java.text.*;

public class Test1{
    //Data Members
    public static final int INVALID_DIMENSION = -1;
    private double radius;
    // Constructor
    public Test1( double radius){
        setRadius(radius);
    }
    // Mutators
    private void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            radius = INVALID_DIMENSION;
        }
    }
    //Accessors
    public double getCircumference(){
        double Circumference = 2 * Math.PI * radius;
        if(radius ==INVALID_DIMENSION){
        return INVALID_DIMENSION;
    } else{
          return Circumference;
        }
    }
    public double getArea(){
        double Area = Math.PI * radius * radius;
        if(radius == INVALID_DIMENSION){
            return INVALID_DIMENSION;
        }else{
            return Area;
        }
    }
    public double getRadius(){
        return radius;
    }
    public static void main(String[] args){
        double radius, Circumference, Area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        radius = scanner.nextDouble();
        if(radius>0){System.out.println(radius);}else{System.out.println("error message");}
        Test1 circle = new Test1(radius);
        Circumference = circle.getCircumference();
        if (Circumference == circle.INVALID_DIMENSION){
            System.out.println(" Circumference = invalid Radius");
        }else{
            System.out.println(" Circumference = " + Circumference);
        }
       // Circumference = circle.getCircumference();
        Area = circle.getArea();
        System.out.println("radius        " + radius +"\n"+
                           //"Circumference "+ Circumference+ "\n"+
                           "Area          " + Area);
    }
}
