

public class Pat2
{
	public static void main(String args[])
	{
		boolean f=true;
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=11; j++)
			{
				if(f==true)
				{
				 if(j<=5+i && j>=7-i)
					{
					System.out.print(i);
					f=false;
					}
				else
				{
					System.out.print(" ");
				
				}
				}
				else
				{
					System.out.print(" ");
					f=true;
					
				}
				
				
			}
			System.out.println();
		}
	}
}