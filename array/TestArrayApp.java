import java.util.*;

public class TestArrayApp {
    public static void main(String x[])
    {
        int a[] = new int[] {10,20,30,40,50};
        int b[];
        b=a;
        b[1]=100;
        System.out.println("Display the Array values: ");
        for(int i=0; i<a.length; i++)
        {
            System.out.printf("%d\t", a[i]);
        }

    }
    
}

