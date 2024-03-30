
import java.util.*;

public class Transpose
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		
		System.out.println("Enter values in array");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j] + " ");
				b[i][j]=a[j][i];
			}
			System.out.println();
		}
		
		
		System.out.println("Display transpose of matrix");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}