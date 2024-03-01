
import java.util.*;

/**
 * Circle
 */
 class Circle {

    private double radius;
    private double area;
    double pi=3.14;

    
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    void showArea()
    {
        area=pi*radius*radius;

        System.out.println("The area of circle is "+ area);
    }
}

public class CircleApp {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle cr=new Circle();

        double radius;
        System.out.println("Enter the radius");
        radius=sc.nextDouble();

        cr.setRadius(radius);
        cr.showArea();

    }
}
