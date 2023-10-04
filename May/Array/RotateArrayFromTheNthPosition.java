import java.util.*;

public class RotateArrayFromTheNthPosition
{
	public static void main(String x[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter Array Values");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.printf("\nDisplay Array Values\n");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.printf("\nEnter from which position you want to rotate your array\n");
        int ro = sc.nextInt();
        
        int d[]=new int [size];
         
		int k=0;
        for(i=ro; i<a.length; i++)
		{
			d[k]=a[i];
			k++;
		}
        
        for(i=0; i<ro; i++)
		{
			d[k]=a[i];
			k++;
		}

         System.out.println();
        for(i=0; i<d.length; i++)
		{
			System.out.printf("%d\t",d[i]);
		}			
	}
}