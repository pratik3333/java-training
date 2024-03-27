
public class Pat7
{
	public static void main(String args[])
	{
		int k=4;
		int n=2;
		for(int i=1; i<=4; i++)
		{
			
			for(int j=1; j<=7; j++)
			{
				
				
					
					
					//System.out.print("1");
						                   
               if(j<=3+i && j>=5-i)
				{

				   if(j<=4)
					{
						k=j;
						
						System.out.print(k + " ");
						++k;
						
					}
                     else
					 {
						 n=j;
						 System.out.print(n + " ");
					 }	
				n++;
				
				}
				else
				{
					System.out.print("  ");
				}  					 
				

				
		}
			System.out.println();
		}
	}
}