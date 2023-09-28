

class P8
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1; i<=4; i++)
		{
			for(j=1; j<=7; j++)
			{
				if(j>=5-i && j<=i+3)
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