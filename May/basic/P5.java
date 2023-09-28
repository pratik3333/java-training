

class P5
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1; i<=4; i++)
		{
			for(j=1; j<=4; j++)
			{
				if(j<=5-i)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}