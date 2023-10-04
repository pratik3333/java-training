import java.util.*;

public class JaggedArrayWithFibonacciSeries
{
	public static void main(String x[])
	{
		int p=0,q=1,sum=0,i,j,k=0;
		
		Scanner sc = new Scanner(System.in); 
		
		int a[]=new int[13];
		
		
		
		for(i=0; i<a.length; i++)
		{
			sum = p+q;
			p=q;
			q=sum;
			a[i]=sum;
			
		}
		
		System.out.println();
		
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		int n[][]= new int[4][];
		n[0]=new int[4];
		n[1]=new int[2];
		n[2]=new int[4];
		n[3]=new int[3];
		
		
		for(i=0; i<n.length; i++)
		{
			for(j=0; j<n[i].length; j++)
			{
				n[i][j]=a[k];
				k++;
			}
		}
		
		System.out.printf("\nDisplay Jagged Array\n");
		for(i=0; i<n.length; i++)
		{
			for(j=0;j<n[i].length;j++)
			{
				System.out.printf("%d\t",n[i][j]);
			}
			System.out.println();
		}
	}
}