
class P9
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1; i<=6; i++)
		{
			for(j=1; j<=11; j++)
			{
				if((j<=12-i) && (j>=7-i))
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

//      ******
//    ******
//   ******
//  ******
// ******
//******


 
