

public class Pat15
{
	public static void main(String args[])
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if((j<=5-i && i<=4) || (j<=i-3 && i>4))
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}