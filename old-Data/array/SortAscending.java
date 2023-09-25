import java.util.*;
public class SortAscending
{
    public static void main(String x[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to strore: ");
        n=sc.nextInt();
        int[] Array=new int[10];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++)
        {
            Array[i]=sc.nextInt();
        }

        for(int i=0; i<Array.length;i++)
        {
            for(int j=i+1; j<Array.length; j++)
            {
                if (Array[i]>Array[j]) {
                   int temp=Array[i];
                    Array[i]=Array[j];
                    Array[j]=temp;
                    
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < Array.length; i++) {     
            System.out.printf(Array[i] + " ");    
        }   

    }
}