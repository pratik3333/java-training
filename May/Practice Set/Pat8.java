

public class Pat8
{
	public static void main(String args[])
	{
		boolean f=true;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=11; j++)
			{
				if(f==true)
				{
					if(j<=6+i && j>=i)
				{
					System.out.print("*");
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