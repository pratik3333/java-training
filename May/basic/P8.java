

class P8
{
	public static void main(String x[])
	{
		int i,j,k,n;
		for(i=1; i<=4; i++)
		{
			k=i;
			n=2;
			for(j=1; j<=7; j++)
			{
				if(j>=5-i && j<=4)
				{
					System.out.print(k);
					k--;
				}
				else if(j<=i+3 && j>=4)
				{
					System.out.print(n);
					n++;
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