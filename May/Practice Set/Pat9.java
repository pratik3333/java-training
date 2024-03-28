


public class Pat9
{
	public static void main(String args[])
	{
		boolean f=true;
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
                //if(f==true)
				//{
									
				  if(j<=2+i && j>=4-i && i<=4 && f==true)
				   {
					 System.out.print("*");
					 f=false;
				   }
				  
				    
					else if(j<=10-i && j>=i-4 && i>=4 && f==true)
				      { 
					   System.out.print("*");
					   f=false;
					  }
					  
					 
					

			//	}
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