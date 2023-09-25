import java.util.*;
public class SearchArrayApp
{
    public static void main(String x[]) {
        Scanner xyz= new Scanner(System.in);
        int a[] = new int[5];
        boolean flag=false;
     System.out.println("Enter the values in array\n");
        for(int i=0; i<a.length; i++);
        {
            a[i]=xyz.nextInt();
        }
     System.out.println("Display the array values");
        for(int i=0; i<a.length; i++);
        {
            System.out.printf("%d\t",a[i]);
        }
     System.out.println("enter the value for search");
     int svalue=xyz.nextInt();
     for(int i=0; i<a.length; i++)
     {
        if(a[i]==svalue)
        {
            flag=true;
            break;
        }
     }
      if(flag)
      {
        System.out.println("Element found");
      }
      else{
        System.out.println("Element not found");
      }

    }
}
