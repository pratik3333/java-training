
import java.util.*;

/**
 * Rectangle
 */
class Rectangle {

    private int length;
    private int width;
    int area;

    public void setArea(int length, int width)
    {
        this.length=length;
        this.width=width;
    }

    public void showArea()
    {
        area=length*width;
        System.out.print("Area of rectangle is " + area);
    }
    
}

public class RectangleApp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle re=new Rectangle();

        int length;
        int width;
        System.out.println("Enter length and width");
        length=sc.nextInt();
        width=sc.nextInt();

        re.setArea(length, width);
        re.showArea();

    }
}
