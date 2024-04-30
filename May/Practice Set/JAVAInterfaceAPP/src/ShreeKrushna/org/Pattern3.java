package ShreeKrushna.org;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean f=true;
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=11; j++)
			{
				if(f==true)
				{
				if((j>=7-i) && (j<=5+i))
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
