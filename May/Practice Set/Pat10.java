
public class Pat10
{
	public static void main(String args[])
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(j<=i && j<=4 && i<=4 || j<=8-i && j<=4 && i>4)
				{
					System.out.print("*");
				}
				else if(j>=8-i && i<=4 ||j>=i && i>=4 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}