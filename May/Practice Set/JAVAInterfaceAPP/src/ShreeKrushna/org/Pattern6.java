package ShreeKrushna.org;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<=9;i++)
		{
			char ch='A';
			for(int j=1; j<=9; j++)
			{
				
				if(j<=i)
				{
					System.out.print(ch++ + " ");
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
