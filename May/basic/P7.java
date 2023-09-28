

class P7
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1; i<=4; i++)
		{
			for(j=1; j<=4; j++)
			{
				if(j<=i)
				{
					if((i+j)%2==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
			}
			System.out.println();
		}
	}
}

//1
//01
//101
//0101