package ShreeKrushna.org;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(j<=i)
				{
					System.out.print(k++ +" ");
				}
			}
			System.out.println();
		}
	}

}
