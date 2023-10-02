import java.util.*;

public class MissingElement
{
	public static void main(String x[])
	{
		int i,j;
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter five values in array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.printf("Missing Elements are: ");
		for(i=0; i<a.length-1; i++)
		{
			for(j=a[i]; j<a[i+1]-1;)
			{
				System.out.printf("%d\t",++j);
			}
		}
		
	}
	
}