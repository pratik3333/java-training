

class P6
{
	public static void main(String x[])
	{
		int i,j,k=1;
		for(i=1; i<=4; i++)
		{
			for(j=1; j<=4; j++)
			{
				if(j<=i)
				{
					System.out.print(k + " ");
					k++;
				}
			}
			System.out.println();
		}
	}
}

//1
//2 3
//4 5 6
//7 8 9 10