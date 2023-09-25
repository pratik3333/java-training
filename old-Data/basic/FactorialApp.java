import java.util.*;

import java.util.*;
public class FactorialApp{
    public static void main(String x[])
    {
        int no,f=1;
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the number\n");
        no=xyz.nextInt();
        for(int i=1; i<=no; i++)
        {
            f=f*i;

        }
        System.out.printf("The factorial number is %d\n", f);

    }
}