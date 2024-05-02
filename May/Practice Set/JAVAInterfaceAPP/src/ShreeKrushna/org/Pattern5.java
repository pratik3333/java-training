package ShreeKrushna.org;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean f=true;
		char ch='A';
		for(int i=1; i<=9; i++)
		{
			ch='A';
			for(int j=1; j<=17; j++)
			{
				if(f==true)
				{
					if((j>=10-i) && (j<=8+i))
					{
						System.out.print(ch++);
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
