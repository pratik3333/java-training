
public class Pat16
{
	public static void main(String args[])
	{
		boolean p=true;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				
				if(p==true)
				{
					 if(j<=4+i && j>=6-i)
				       {
					     System.out.print("*");
						 p=false;
				       }
				     else
				       {
					      System.out.print(" ");
				       }
				}
				else
				{
					System.out.print(" ");
					p=true;
				}
			}
			System.out.println();
		}
	}
}