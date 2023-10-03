import java.util.*;

public class InsertElementAtSpecificIndex
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter The Size of Array");
		int size = sc.nextInt();
		int a[]=new int[size];
		int i;
		
		System.out.println("Please Enter the Array Values");
		for(i=0; i<a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array Values");
		for(i=0; i<a.length-1; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.printf("\nEnter on Which position you want to add element\n");
		int pos;
		pos=sc.nextInt();
		
		int flag=0;
		System.out.printf("\nPlease Enter Value\n");
		int value=sc.nextInt();
		
		for(i=a.length-2; i>=0; i--)
		{
			if(pos<a.length-2)
			{
				a[i+1]=a[i];
			   if(a[i]==pos)
			     {
				   a[i]=value;
				   flag=1;
				   break;
			     }
			}
		}
		
		if(flag==1)
		{
			for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		}
		else
		{
			System.out.printf("Your Position is out of Array\n");
		}
	}
}